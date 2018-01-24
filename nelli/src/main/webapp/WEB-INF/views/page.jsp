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
      <link rel="stylesheet" href="${css}/style.css">
      <link rel="stylesheet" href="${css}/myApp.css">
      <!-- =-=-=-=-=-=-= Font Awesome =-=-=-=-=-=-= -->
      <link rel="stylesheet" href="${css}/font-awesome.css" type="text/css">
      <!-- =-=-=-=-=-=-= Flat Icon =-=-=-=-=-=-= -->
      <link href="${css}/flaticon.css" rel="stylesheet">
      <!-- =-=-=-=-=-=-= Et Line Fonts =-=-=-=-=-=-= -->
      <link rel="stylesheet" href="${css}/et-line-fonts.css" type="text/css">
      <!-- =-=-=-=-=-=-= Menu Drop Down =-=-=-=-=-=-= -->
      <link rel="stylesheet" href="${css}/forest-menu.css" type="text/css">
      <!-- =-=-=-=-=-=-= Animation =-=-=-=-=-=-= -->
      <link rel="stylesheet" href="${css}/animate.min.css" type="text/css">
      <!-- =-=-=-=-=-=-= Select Options =-=-=-=-=-=-= -->
      <link href="${css}/select2.min.css" rel="stylesheet" />
      <!-- =-=-=-=-=-=-= noUiSlider =-=-=-=-=-=-= -->
      <link href="${css}/nouislider.min.css" rel="stylesheet">
      <!-- =-=-=-=-=-=-= Listing Slider =-=-=-=-=-=-= -->
      <link href="${css}/slider.css" rel="stylesheet">
      <!-- =-=-=-=-=-=-= Owl carousel =-=-=-=-=-=-= -->
      <link rel="stylesheet" type="text/css" href="${css}/owl.carousel.css">
      <link rel="stylesheet" type="text/css" href="${css}/owl.theme.css">
      <!-- =-=-=-=-=-=-= Check boxes =-=-=-=-=-=-= -->
      <link href="${css}/minimal.css" rel="stylesheet">
      <!-- =-=-=-=-=-=-= Responsive Media =-=-=-=-=-=-= -->
      <link href="${css}/responsive-media.css" rel="stylesheet">
      <!-- =-=-=-=-=-=-= Template Color =-=-=-=-=-=-= -->
      <link rel="stylesheet" id="color" href="${css}/colors/defualt.css">
      <!-- =-=-=-=-=-=-= For Style Switcher =-=-=-=-=-=-= -->
      <link rel="stylesheet" id="theme-color" type="text/css" href="#" />
      <!-- JavaScripts -->
      <script src="${js}/modernizr.js"></script>

    

   </head>
   <body>
    
      
    <!-- Navigation Menu Start -->
      <%@include file="./shared/header.jsp"%>
      <!-- Navigation Menu End -->
      
      <!-- =-=-=-=-=-=-= Main Code =-=-=-=-=-=-= -->
       
        <!-- Loading the home content -->
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>
			
			 <!-- Loading the home content -->
			<c:if test="${userClickAboutus == true }">
				<%@include file="about.jsp"%>
			</c:if>
			
			 <!-- Loading the home content -->
			<c:if test="${userClickContactus == true }">
				<%@include file="contact.jsp"%>
			</c:if>
			
			 <!-- Loading the home content -->
			<c:if test="${userClickCategories == true }">
				<%@include file="catagories.jsp"%>
			</c:if>
			
			
			<c:if test="${userClickSingleCategory == true }">
				<%@include file="singleCategory.jsp"%>
			</c:if>
			
			<c:if test="${userClickClientDetails == true }">
				<%@include file="client.jsp"%>
			</c:if>
			
			
			
			
         <!-- =-=-=-=-=-=-= FOOTER =-=-=-=-=-=-= -->
         <%@include file="./shared/footer.jsp"%>
         
         <!-- =-=-=-=-=-=-= FOOTER END =-=-=-=-=-=-= -->
      </div>
     
      <!-- =-=-=-=-=-=-= JQUERY =-=-=-=-=-=-= -->
      <script src="${js}/jquery.min.js"></script>
      <!-- Bootstrap Core Css  -->
      <script src="${js}/bootstrap.min.js"></script>
      <!-- Jquery Easing -->
      <script src="${js}/easing.js"></script>
      <!-- Menu Hover  -->
      <script src="${js}/forest-megamenu.js"></script>
      <!-- Jquery Appear Plugin -->
      <script src="${js}/jquery.appear.min.js"></script>
      <!-- Numbers Animation   -->
      <script src="${js}/jquery.countTo.js"></script>
      <!-- Jquery Smooth Scroll  -->
      <script src="${js}/jquery.smoothscroll.js"></script>
      <!-- Jquery Select Options  -->
      <script src="${js}/select2.min.js"></script>
      <!-- noUiSlider -->
      <script src="${js}/nouislider.all.min.js"></script>
      <!-- Carousel Slider  -->
      <script src="${js}/carousel.min.js"></script>
      <script src="${js}/slide.js"></script>
      <!-- Image Loaded  -->
      <script src="${js}/imagesloaded.js"></script>
      <script src="${js}/isotope.min.js"></script>
      <!-- CheckBoxes  -->
      <script src="${js}/icheck.min.js"></script>
      <!-- Jquery Migration  -->
      <script src="${js}/jquery-migrate.min.js"></script>
      <!-- Sticky Bar  -->
      <script src="${js}/theia-sticky-sidebar.js"></script>
      <!-- Style Switcher -->
      <script src="${js}/color-switcher.js"></script>
      <!-- Template Core JS -->
      <script src="${js}/custom.js"></script>
       <script src="${js}/myApp.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

   </body>
</html>




