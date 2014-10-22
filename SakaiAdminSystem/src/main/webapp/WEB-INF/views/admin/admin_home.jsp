
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>	
<!DOCTYPE html >
<html>
<head>
<jsp:include page="header.jsp">
<jsp:param value="a" name="a"/>
</jsp:include>
<title><spring:message code="admin.home.title"></spring:message></title>
</head>
<body>
	<h1 class="text-center login-title"><spring:message code="admin.home.header1"></spring:message></h1>
	<h1 class="text-center login-title"><spring:message code="admin.home.header2"></spring:message></h1>
	<form style="text-align:center" >
	
		<!-- Standard button -->
	                                    

		<a href="./student/">
			<button type="button" class="btn btn-primary"><spring:message code="admin.home.student"></spring:message>
			</button>
		</a>
		
		<a href="./faculties/">
			<button type="button" class="btn btn-success"><spring:message code="admin.home.faculty"></spring:message></button>
		</a>
		
		<a href="./courses/">
			<button type="button" class="btn btn-danger"><spring:message code="admin.home.courses"></spring:message></button>
		</a>
		
		<br/><br/>
		<a href="?lang=en">English</a>
        <a href="?lang=de">German</a>
		
	</form>

</body>
</html>