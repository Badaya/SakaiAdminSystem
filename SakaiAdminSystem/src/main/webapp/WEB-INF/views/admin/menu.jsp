<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<div class="masthead">
	<h3 class="text-muted margin_top_10">
	</h3>

	<div class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="<c:url value="/admin/" />">HOME</a></li>
				<li class="dropdown"><a href="<c:url value="/admin/block/" />">Block</a></li>
				<li class="dropdown"><a href="<c:url value="/admin/courses/" />">Course</a></li>
				<li class="dropdown"><a href="<c:url value="/admin/faculties/" />">Faculty</a></li>
				<li class="dropdown"><a href="<c:url value="/admin/student/" />">Student</a></li>
				
			</ul>

			<ul class="nav navbar-nav navbar-right">
			<sec:authorize access="isAnonymous()">
                    <li class="dropdown"><a href="<c:url value="/register/" />">REGISTER
						<b class="glyphicon glyphicon-play"></b>
				</a></li>   
            </sec:authorize>
				
			</ul>
			
			<ul class="nav navbar-nav navbar-right">
			<sec:authorize access="isAnonymous()">
                    <li class="dropdown"><a href="<c:url value="/login" />">LOGIN <b class="glyphicon glyphicon-play"></b></a></li>    
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                    <li class="dropdown"><a href="<c:url value="/j_spring_security_logout" />" >LOGOUT <b class="glyphicon glyphicon-play"></b></a></li>    
            </sec:authorize>
              
			
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</div>
