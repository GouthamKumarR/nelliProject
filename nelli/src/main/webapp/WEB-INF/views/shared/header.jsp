<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
	<script>
		window.userRole = '${userModel.role}';
	</script>
<!-- =-=-=-=-=-=-= Preloader =-=-=-=-=-=-= -->
<!-- <div id="loader-wrapper">
	<div id="loader"></div>
	<div class="loader-section section-left"></div>
	<div class="loader-section section-right"></div>
</div> -->
<!-- =-=-=-=-=-=-= Color Switcher =-=-=-=-=-=-= -->

<div class="colored-header">
	<!-- Navigation Menu -->
	<nav id="menu-1" class="mega-menu">
		<!-- menu list items container -->
		<section class="menu-list-items">
			<div class="container">
				<div class="row">
					<div class="col-lg-12 col-md-12">
						<!-- menu logo -->
						<ul class="menu-logo">
							<li><a href="#"><img src="${images}/logo_orange.png"
									alt="logo"> </a></li>
						</ul>
						&nbsp;
						<!-- menu links -->
						<ul class="menu-links" style="margin-left: 10%;">
							<li><a href="${contextRoot}/home">Home </a></li>
							<li><a href="${contextRoot}/about">About Us </a></li>
							<li><a href="${contextRoot}/categories">Categories </a></li>
							<li><a href="${contextRoot}/contact">Contact Us </a></li>

							<security:authorize access="hasAuthority('ADMIN')">
								<li><a href="${contextRoot}/admin/dashboard">Dashboard
								</a></li>
							</security:authorize>
						</ul>

						<ul class="nav navbar-nav navbar-right">
							
							<security:authorize access="isAuthenticated()">
								<li class="dropdown" id="userModel"><a
									class="btn btn-default dropdown-toggle"
									href="javascript:void(0)" id="dropdownMenu1"
									data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="true"> ${userModel.fullName} <span
										class="caret"></span>
								</a>
									<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
										<li id="logout"><a href="${contextRoot}/perform-logout">Logout</a>
										</li>
									</ul></li>
							</security:authorize>
						</ul>

					</div>
				</div>
			</div>
		</section>
	</nav>
</div>