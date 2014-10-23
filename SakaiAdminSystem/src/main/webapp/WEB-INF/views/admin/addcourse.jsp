<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html >
<html>
<head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<jsp:include page="header.jsp">
	<jsp:param value="a" name="a" />
</jsp:include>
<title><spring:message code="admin.course.head"></spring:message></title>
</head>

<body>

<script type="text/javascript">
        $(document).ready(function() {
        	$('#category').change(function()
//             $('#manufacturer').keyup(function() 
            		{
            	doAjaxPost();
            });
        });     

   function doAjaxPost() {           
    var baseurl = $('#baseurl').val();
    $.ajax({
     type : "post", 
     url : baseurl + "ajaxRequest", 
     data : 'category=' + $('#category').val() ,
     success : function(response) {
    	 alert(response);
       	 var select= '<select id=category name=category>';
         var option = '';
         
          $.each(response, function(index, value) {
        	  
              option += '<option value='+value+'>' + value + '</option>';
          });
         
          select = select+option+'</select>';
         
         $('#subcategory').html(select);
    	 
			
      
     },
     error : function(e) {
      alert('Error: ' + e); 
     }
    });
   }
  </script>




	<div class="navbar navbar-inverse navbar-default" role="navigation">
		<div class="container">
			<jsp:include page="menu.jsp">
				<jsp:param value="a" name="a" />
			</jsp:include>
			<div class="panel panel-primary margin_top_20">
			<label class="navbar-brand"><strong>Adding Course</strong></label>
			</div>
		</div>
	</div>
	<div class="container">
		<form:form class="form-horizontal" role="form" commandName="course"
			action="./add" method="post">

			<div class="form-group">
				<label for="title" class="col-sm-2 control-label"><spring:message
						code="admin.course.title">
					</spring:message> </label>
				<div class="col-sm-7">
					<form:input type="text" cssClass="form-control" path="title"
						id="title" placeholder="title" autocomplete="off" />
				</div>
				<div class="col-sm-3">
					<form:errors path="title" cssClass="error" />
				</div>
			</div>

			<div class="form-group">
				<label for="description" class="col-sm-2 control-label"><spring:message
						code="admin.course.Description">
					</spring:message></label>
				<div class="col-sm-7">
					<form:input type="description" cssClass="form-control"
						id="description" path="description" placeholder="description"
						autocomplete="off" />
				</div>
				<div class="col-sm-3">
					<form:errors path="description" cssClass="error" />
				</div>
			</div>

			<div class="form-group">
				<label for="name" class="col-sm-2 control-label"><spring:message
						code="admin.course.CourseCode">
					</spring:message></label>
				<div class="col-sm-7">
					<form:input type="text" cssClass="form-control" id="subjectCode"
						path="subjectCode" placeholder="course code" />
				</div>
				<div class="col-sm-3">
					<form:errors path="subjectCode" cssClass="error" />
				</div>
			</div>


			<div class="form-group">
				<label for="category" class="col-sm-2 control-label"><spring:message
						code="admin.course.CourseCategory">
					</spring:message></label>
				<div class="col-sm-7">

					<form:select path="category" cssClass="form-control" id="category">
					<form:option value="">--Select--</form:option>
						<form:option value="vedic science">vedic science</form:option>
						<form:option value="Compro">Compro</form:option>
						<form:option value="MBA">MBA</form:option>

					</form:select>
				</div>

				<div class="col-sm-3">
					<form:errors path="category" cssClass="error" />
				</div>

			</div>


			<div class="form-group">
				<label for="subcategory" class="col-sm-2 control-label"><spring:message
						code="admin.course.subCategory">
					</spring:message></label>
				<div class="col-sm-7">

					<form:select path="subcategory" id ="subcategory">
						<form:option value="">select</form:option>
					</form:select>					
				</div>
				</div>
				
		



			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">
						<spring:message code="admin.course.save">
						</spring:message>
					</button>
				</div>
			</div>
		</form:form>

		<c:url value="/admin/" var="baseurl"></c:url>
		<input id="baseurl" type="hidden" value="${baseurl}">


		<footer>
			<p>
				&copy;
				<spring:message code="admin.course.sakaiPortal"></spring:message>
			</p>
		</footer>
	</div>
</body>