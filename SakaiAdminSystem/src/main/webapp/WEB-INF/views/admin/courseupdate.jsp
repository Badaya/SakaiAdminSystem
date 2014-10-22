<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<jsp:include page="header.jsp">
	<jsp:param value="a" name="a" />
</jsp:include>
<title>Admin Home</title>
</head>

<body>

	<div class="container">

		<jsp:include page="menu.jsp">
			<jsp:param value="a" name="a" />
		</jsp:include>


		<div class="panel panel-primary margin_top_20">
			<div class="panel-heading">Update Course </div>
			<div class="panel-body">
				<form:form class="form-horizontal" role="form" commandName="course"
					action="./add" method="post">

					<div class="form-group">
						<label class="col-sm-2 control-label">Id: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="id"
								autocomplete="on" value="${course.id}" readonly="true" />
						</div>
						<div class="col-sm-3">
							<form:errors path="id" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Title: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="title"
								placeholder="title" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="title" cssClass="error" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">Course Code:</label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="subjectCode"
								placeholder="course code" />
						</div>
						<div class="col-sm-3">
							<form:errors path="subjectCode" cssClass="error" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">Description:</label>
						<div class="col-sm-7">
							<form:input type="description" cssClass="form-control"
								path="description" placeholder="description" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="description" cssClass="error" />
						</div>
					</div>


					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-success">Update</button>
						</div>
					</div>


				</form:form>
			</div>
		</div>



	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>