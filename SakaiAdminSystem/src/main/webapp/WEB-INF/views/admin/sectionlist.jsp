<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html >
<html>
<head>
<jsp:include page="header.jsp">
<jsp:param value="a" name="a"/>
</jsp:include>
<title>Welcome to Administration</title>
</head>
<body>
	<h1>List of Registered Section</h1>
	
	<div class="container">
	<jsp:include page="menu.jsp">
				<jsp:param value="a" name="a" />
			</jsp:include>
	
	<div class="panel panel-primary margin_top_20">
			<div class="panel-heading">Sections list in
				Block:${block.title}</div>
			<div class="panel-body">
				<table data-toggle="table" class="table table-hover">
					<thead>
						<tr>
							<th>Section ID</th>
							<th>Course</th>
							<th>Faculty</th>
							<th>Total Seats</th>
							<th>Edit</th>
						</tr>
					</thead>
	
		<c:forEach var="section" items="${sections}">
						<tbody>
							<tr>
								<td>${section.id}</td>
								<td>${section.course.title}</td>
								<td>${section.faculty.name}</td>
								<td>${section.numberOfStudents}</td>
								<td><a href="../section/${section.id}">edit</a></td>
							</tr>
						</tbody>
		</c:forEach>
	</table>
	<a href="./add?block_id=${block.blockId}">
			<button type="button" class="btn btn-success">Add Section</button>
		</a>
		</div>
	</div>
	</div>
</body>