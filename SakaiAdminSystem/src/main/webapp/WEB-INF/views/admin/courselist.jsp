<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html >
<html>
<head>
<jsp:include page="header.jsp">
	<jsp:param value="a" name="a" />
</jsp:include>
<title>Welcome to Administration</title>
</head>
<body>
	
	
	   <div class="container">
	<jsp:include page="menu.jsp">
				<jsp:param value="a" name="a" />
			</jsp:include>
			<div class="panel panel-primary margin_top_20"></div>
	
	<div class="panel panel-primary">
		<div class="panel-heading">List of Courses Available</div>
		<div class="panel-body">
			<table class="table table-hover">
				<thead>
					<tr>
						<td>Course ID</td>
						<td>Course Title</td>
						<td>Course Description</td>
						<td>Course Code</td>
						<td>Details</td>

					</tr>
				</thead>
				<c:forEach var="course" items="${courses}">
					<tbody>
						<tr>

							<td>${course.id}</td>
							<td>${course.title}</td>
							<td>${course.description}</td>
							<td>${course.subjectCode}</td>
							<td><a href="./${course.id}">View Details</a></td>
						</tr>
					</tbody>

				</c:forEach>
			</table>
			<a href="./add">
				<button type="button" class="btn btn-success">Add Course</button>
			</a>
		</div>
	</div>
	</div>

</body>