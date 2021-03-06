<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div class="navbar navbar-inverse navbar-default" role="navigation">
		<div class="container">
		    <jsp:include page="menu.jsp">
				<jsp:param value="a" name="a" />
			</jsp:include>
			<div class="panel panel-primary margin_top_20">
			<a class="navbar-brand" href="<c:url value=" /index.jsp"/>">Home</a>
			<label class="navbar-brand"><strong>Adding Section</strong></label></div>
		</div>
	</div>
	<div class="container">
		<form:form class="form-horizontal" role="form" commandName="section"
			action="./add" method="post">
			
			
			<div class="form-group">
						<label class="col-sm-2 control-label">Block: </label>
						<div class="col-sm-7">
							<form:input type="text" path="block.blockId" value="${block.blockId}"
								autocomplete="off" readonly="true"/>
						</div>
						<div class="col-sm-3">
							<form:errors path="block.blockId" cssClass="error" />
						</div>
			</div>
			
			<div class="form-group">
						<label class="col-sm-2 control-label">Faculty:</label>
						<div class="col-sm-7">
							<form:select path="faculty">
								<form:options items="${faculties}" itemLabel="name"
									itemValue="id" />
							</form:select>
						</div>
						<div class="col-sm-3">
							<form:errors path="faculty" cssClass="error" />
						</div>
				</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label">Course:</label>
						<div class="col-sm-7">
							<form:select path="course">
								<form:options items="${courses}" itemLabel="title" itemValue="id" />
							</form:select>
						</div>
						<div class="col-sm-3">
							<form:errors path="course" cssClass="error" />
						</div>
					</div>
					
		<div class="form-group">
						<label class="col-sm-2 control-label">Total Seats: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="numberOfStudents"
								placeholder="total seat" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="numberOfStudents" cssClass="error" />
						</div>
					</div>			
					

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">Save</button>
				</div>
			</div>
		</form:form>
		<footer>
			<p>&copy; Sakai Portal 2014</p>
		</footer>
	</div>
</body>