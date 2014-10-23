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
	
	
	
	<div class="container">
	<jsp:include page="menu.jsp">
				<jsp:param value="a" name="a" />
			</jsp:include>
			<div class="panel panel-primary margin_top_20"></div>
	<div class="panel panel-primary">
		<div class="panel-heading">Registered Faculties</div>
		<div class="panel-body">
			<table class="table table-hover">
				<thead>
					<tr>
						<td>Block ID</td>
						<td>Block Title</td>						
						<td>Block StartDate</td>
						<td>Block EndDate</td>
						<td>Edit</td>
						<td>View Sections</td>
					</tr>
				</thead>
				<c:forEach var="block" items="${blocks}">
					<tbody>
						<tr>
							
							<td>${block.blockId}&nbsp;</td>
							<td>${block.title}&nbsp;</td>
							<td>${block.startDate}&nbsp;</td>
							<td>${block.endDate}&nbsp;</td>
							<td><a href="./${block.blockId}">edit</a></td>
							<td><a href="../section/?block_id=${block.blockId}">View Sections</a></td>
						</tr>
					</tbody>

				</c:forEach>
			</table>
			<a href="./add">
			<button type="button" class="btn btn-success">Add Block</button>
		</a>
		</div>
	</div>
</div>
	
</body>
</html>