<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<jsp:include page="header.jsp">
	<jsp:param value="a" name="a" />
</jsp:include>
<title>Welcome to Administration</title>
</head>


<body>
	<br>
	<br>
	<br>
	<br>
	<div class="container">
	<form:form class="form-horizontal" role="form" commandName="blockDetails"
			action="../block/${block.id}" method="post">

			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Title: </label>
				<div class="col-sm-7">
					<form:input type="text" cssClass="form-control" path="title"
						id="title" autocomplete="on" value="${blockDetails.title}" />
				</div>
				<div class="col-sm-3">
					<form:errors path="name" cssClass="error" />
				</div>
			</div>

			<div class="form-group">
				<label for="username" class="col-sm-2 control-label">Description:</label>
				<div class="col-sm-7">
					<input type="text" id="description" name="description"
						value="${blockDetails.description}" autocomplete="on" readOnly />
				</div>
				<div class="col-sm-3">
					<form:errors path="description" cssClass="error" />
				</div>
			</div>
			
			
			<div class="form-group">
				<label for="description" class="col-sm-2 control-label">Description:</label>
				<div class="col-sm-7">
					<input type="text" id="description" name="description"
						value="${blockDetails.description}" autocomplete="on" readOnly />
				</div>
				<div class="col-sm-3">
					<form:errors path="description" cssClass="error" />
				</div>
			</div>
			
			
			<div class="form-group">
				<label for="startDate" class="col-sm-2 control-label">StartDate:</label>
				<div class="col-sm-7">
					<input type="text" id="startDate" name="startDate"
						value="${blockDetails.startDate}" autocomplete="on" readOnly />
				</div>
				<div class="col-sm-3">
					<form:errors path="startDate" cssClass="error" />
				</div>
			</div>
			
			
			
			<div class="form-group">
				<label for="endDate" class="col-sm-2 control-label">EndDate:</label>
				<div class="col-sm-7">
					<input type="text" id="endDate" name="endDate"
						value="${blockDetails.endDate}" autocomplete="on" readOnly />
				</div>
				<div class="col-sm-3">
					<form:errors path="endDate" cssClass="error" />
				</div>
			</div>
			
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">Update</button>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
				<a href="delete?id=${faculty.id}">
					<button type="button" class="btn btn-primary">Delete</button>
				</a>
				</div>
			</div>


		</form:form>

		

		<footer>
			<p>&copy; Sakai Portal 2014</p>
		</footer>
	</div>
</body>
</html>