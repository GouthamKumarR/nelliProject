<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Nellai - ${title}</title>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="${css}/myApp.css" rel="stylesheet">

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

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script>
	window.menu = '${title}';
	
	window.contextRoot = '${contextRoot}'
	
</script>
</head>

<body>

	<div class="wrapper">

		<!-- Navigation -->
		<div class="colored-header">
			<!-- Navigation Menu -->
			<nav id="menu-1" class="mega-menu">
				<!-- menu list items container -->
				<section class="menu-list-items">
					<div class="container">
						<div class="row">
							<div class="col-lg-12 col-md-12">
								<!-- menu logo -->
								<!-- menu links -->
								<ul class="menu-links" style="margin-left: 10%;">
									<li><a href="${contextRoot}/home">Nellai Today </a></li>

								</ul>

							</div>
						</div>
					</div>
				</section>
			</nav>
		</div>

		<!-- Page Content -->

		<div class="content">

			<div class="container">

				<c:if test="${not empty message}">
					<div class="row">
						<div class="col-xs-12 col-md-offset-2 col-md-8">
							<div class="alert alert-danger fade in">${message}</div>
						</div>
					</div>
				</c:if>

				<c:if test="${not empty logout}">
					<div class="row">
						<div class="col-xs-12 col-md-offset-2 col-md-8">
							<div class="alert alert-success">${logout}</div>
						</div>
					</div>
				</c:if>

				<div class="row" style="padding-bottom: 26%;">

					<div class="col-md-offset-3 col-md-6">

						<div class="panel panel-primary">

							<div class="panel-heading">
								<h4>Login</h4>
							</div>

							<div class="panel-body">
								<form action="${contextRoot}/login" method="POST"
									class="form-horizontal" id="loginForm">
									<div class="form-group">
										<label for="username" class="col-md-4 control-label">Email:
										</label>
										<div class="col-md-8">
											<input type="text" name="username" id="username"
												class="form-control" />
										</div>
									</div>
									<div class="form-group">
										<label for="password" class="col-md-4 control-label">Password:
										</label>
										<div class="col-md-8">
											<input type="password" name="password" id="password"
												class="form-control" />
										</div>
									</div>
									<div class="form-group">
										<div class="col-md-offset-4 col-md-8">
											<input type="hidden" name="${_csrf.parameterName}"
												value="${_csrf.token}" /> <input type="submit" value="Login"
												class="btn btn-primary" />
										</div>
									</div>
								</form>

							</div>


						</div>

					</div>

				</div>

			</div>


		</div>


		<!-- Footer comes here -->
		<%@include file="./shared/footer.jsp"%>


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

	</div>

</body>

</html>