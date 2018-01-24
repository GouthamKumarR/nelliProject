<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/img" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<html lang="en">
   <head>
    <meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="Online Shopping Website Using Spring MVC and Hibernate">
		<meta name="author" content="Khozema Nullwala">
		<meta name="_csrf" content="${_csrf.token}">
		<meta name="_csrf_header" content="${_csrf.headerName}">
		
      <title>Nellai Today - ${title}</title>
      <!-- =-=-=-=-=-=-= Favicons Icon =-=-=-=-=-=-= -->
      <link rel="icon" href="${images}/favicon.png" type="image/x-icon" />
      
      <!-- =-=-=-=-=-=-= Bootstrap CSS Style =-=-=-=-=-=-= -->
      <link href="${css}/bootstrap.css" rel="stylesheet">
      <!-- =-=-=-=-=-=-= Template CSS Style =-=-=-=-=-=-= -->
      <link rel="stylesheet" href="${css}/css/style.css">
      <!-- =-=-=-=-=-=-= Font Awesome =-=-=-=-=-=-= -->
      <link rel="stylesheet" href="${css}/font-awesome.css" type="text/css">
      <link rel="stylesheet" type="text/css" href="${css}/owl.carousel.css">
      <link rel="stylesheet" type="text/css" href="${css}/owl.theme.css">
      <!-- =-=-=-=-=-=-= Responsive Media =-=-=-=-=-=-= -->
      <link href="${css}/responsive-media.css" rel="stylesheet">
      <!-- JavaScripts -->
      <script src="${js}/modernizr.js"></script>
      
      	<link rel="stylesheet" href="${css}/css/graph.css">
		<script src="${js}/js/jquery.metisMenu.js"></script>
		<script src="${js}/js/jquery.slimscroll.min.js"></script>
		<link href="${css}/css/custom.css" rel="stylesheet">
		<script src="${js}/js/custom.js"></script>
		<script src="${js}/js/screenfull.js"></script>

		 <!----Calender -------->
			<link rel="stylesheet" href="${css}/css/clndr.css" type="text/css" />
			<script src="${js}/js/underscore-min.js" type="text/javascript"></script>
			<script src= "${js}/js/moment-2.2.1.js" type="text/javascript"></script>
			<script src="${js}/js/clndr.js" type="text/javascript"></script>
			<script src="${js}/js/site.js" type="text/javascript"></script>
		<!----End Calender -------->
		
		<script src="js/owl.carousel.js"></script>
		
		<!--scrolling js-->
			<script src="${js}/js/jquery.nicescroll.js"></script>
			<script src="${js}/js/scripts.js"></script>

   </head>
   <body>
    
      
    <!-- Navigation Menu Start -->
        <%@include file="./shared/adminNav.jsp"%>
      <!-- Navigation Menu End -->
      
      <!-- =-=-=-=-=-=-= Main Code =-=-=-=-=-=-= -->
       
        <!-- Loading the home content -->
			<c:if test="${userClickDashboard == true }">
				<%@include file="adminHome.jsp"%>
			</c:if>
			
			<c:if test="${userClickDashboard == true }">
				<%@include file="adminHome.jsp"%>
			</c:if>
			
			
			
			
			
         <!-- =-=-=-=-=-=-= FOOTER =-=-=-=-=-=-= -->
         <%@include file="./shared/footer.jsp"%>
         
         <!-- =-=-=-=-=-=-= FOOTER END =-=-=-=-=-=-= -->
      </div>
     
      <!-- =-=-=-=-=-=-= JQUERY =-=-=-=-=-=-= -->
      <script src="${js}/jquery.min.js"></script>
      <!-- Bootstrap Core Css  -->
      <script src="${js}/bootstrap.min.js"></script>
      <!-- Template Core JS -->
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

   </body>
</html>




