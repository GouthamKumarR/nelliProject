<link href="${css}/myApp.css" rel="stylesheet">
	<!-- Breadcrumb -->
<div class="page-header-area">
         <div class="container">
            <div class="row">
               <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                  <div class="header-page">
                     <h1>Category</h1>
                  </div>
               </div>
            </div>
         </div>
      </div>
	<div class="row">
	
		<!-- Display the product image -->
		 <div class="col-xs-12 col-sm-6 midlePage" >
		
			<div class="thumbnail">
							
				<img src="${images}/${category.imageURL}" class="img img-responsive"/>
						
			</div>
		
		</div> 
	
		
		<!-- Display the product description -->	
		<div class="col-xs-12 col-sm-6 midlePage" >
		
			<h3>${category.name}</h3>
			<hr/>
			
			<p>${category.description}</p>
			<hr/>
			<a href="${contextRoot}/categories" class="btn btn-warning">
				View All Categories</a>
		</div>
	</div>
	
	 <div class="row is-table-row endPage">
	 	<h1> Client List</h1>
				<c:forEach items="${clients}" var="client">
					<div class="col-sm-4 insideEnd" >
						<div class="thumbnail">
							<img src="${images}/${client.imgUrl}"
								alt="${client.name}" class="image">
						</div>

						<div class="caption">
							<%-- <h4 class="pull-right">&#8377; ${client.unitPrice}</h4> --%>
							<h3>${client.name}</h3>
							<p>${client.details}</p>

							<p>
								<a href="${contextRoot}/show/${client.id}/details" class="btn btn-primary pull-right" role="button"> View </a>
							</p>

						</div>

					</div>
				</c:forEach>

				<div class="col-sm-4 col-lg-4 col-md-4">
					<h4>Checkout more products!</h4>
					<hr />
					<a class="btn btn-primary" href="${contextRoot}/categories">More
						Categories</a>
				</div>

			</div> 

