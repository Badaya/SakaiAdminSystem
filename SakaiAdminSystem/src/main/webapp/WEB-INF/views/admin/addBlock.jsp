<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html >
<html>
<head>
<jsp:include page="header.jsp">
	<jsp:param value="a" name="a" />
</jsp:include>
<title>Welcome to Administration</title>
</head>

<body>
	<div class="navbar navbar-inverse navbar-default" role="navigation">
		<div class="container">
			<a class="navbar-brand" href="<c:url value=" /index.jsp"/>">Home</a>
	<label class="navbar-brand"><strong><spring:message code= "admin.block.Adding"></spring:message>
			
			</strong></label>
		</div>
	</div>
	<div class="container">
		<form:form class="form-horizontal" role="form" commandName="block"
			action="./add" method="post">

			<div class="form-group">
			<label for="title" class="col-sm-2 control-label"><spring:message code= "admin.block.Title">
				</spring:message> </label>
				<div class="col-sm-7">
					<form:input type="text" cssClass="form-control"
						path="title" id="title" placeholder="title"
						autocomplete="off" />
				</div>
				<div class="col-sm-3">
					<form:errors path="title" cssClass="error" />
				</div>
			</div>

			<div class="form-group">
				<label for="description" class="col-sm-2 control-label"><spring:message code= "admin.block.Description">
				</spring:message></label>
				<div class="col-sm-7">
					<form:input type="description" cssClass="form-control" id="description"
						path="description" placeholder="description" autocomplete="off" />
				</div>
				<div class="col-sm-3">
					<form:errors path="description" cssClass="error" />
				</div>
			</div>

					
			
			<div class="form-group">
				<label for="startDate" class="col-sm-2 control-label"><spring:message code= "admin.block.StartDate">
				</spring:message></label>
				<div class="col-sm-7">
					<form:input type="date" cssClass="form-control" id="startDate"
						path="startDate"  placeidholder="start date" />
				</div>
				<div class="col-sm-3">
					<form:errors path="startDate" cssClass="error" />
				</div>
			</div>
			
			
			<div class="form-group">
				<label for="endDate" class="col-sm-2 control-label"><spring:message code= "admin.block.EndDate">
				</spring:message></label>
				<div class="col-sm-7">
					<form:input type="date" cssClass="form-control" id="endDate"
						path="endDate" placeidholder="end date" />
				</div>
				<div class="col-sm-3">
					<form:errors path="endDate" cssClass="error" />
				</div>
			</div>
			
			

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success"><spring:message code= "admin.block.Save">
				</spring:message></button>
				</div>
			</div>
		</form:form>
		

		
		<footer>
			<p>&copy; <spring:message code= "admin.block.SakaiPortal"> </spring:message></p>
		</footer>
	</div>
</body>