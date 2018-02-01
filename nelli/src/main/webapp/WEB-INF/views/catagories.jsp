<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>Nellai Today - ${title}</title>
</head>
<body>

	<div class="page-header-area">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="header-page">
						<h1>Categories</h1>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="main-content-area clearfix">
		<!-- Featured Listing  -->
		<section class="custom-padding gray">
		<div class="container">
			<ul class="category-list-style">
				<c:forEach items="${categories}" var="category">

					<!-- Category -->
					<li class="col-lg-3 col-md-3 col-sm-6 col-xs-12"><a
						href="${contextRoot}/view/${category.id}/category">${category.name}</a>
					</li>

				</c:forEach>

			</ul>

		</div>
		</section>




	</div>
</body>
</html>

