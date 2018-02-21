
	<!-- Breadcrumb -->
<div class="page-header-area">
         <div class="container">
            <div class="row">
               <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                  <div class="header-page">
                     <h1>Clients</h1>
                  </div>
               </div>
            </div>
         </div>
      </div>
	<div class="row">
	
		<!-- Display the product image -->
		 <div class="col-xs-12 col-sm-6 midlePage">
		
			<div class="thumbnail">
							
				<img src="${client.imgUrl}" class="img img-responsive"/>
						
			</div>
		
		</div> 
	
		
		<!-- Display the product description -->	
		<div class="col-xs-12 col-sm-6 midlePage">
		
			<h3>${client.name}</h3>
			<hr/>
			
			<p>${client.details}</p>
			<hr/>
			<h3>Client Address</h3>
			<p>${client.address}</p>
			<hr/>
			<h3>Client Mobile</h3>
			<p>${client.mobile}</p>
			<hr/>
			<h3>Client Site</h3>
			<a href='http://${client.webSite}' target="_blank">${client.webSite}</a>
			<%-- <c:redirect url="${client.webSite}"/>   --%>
			<hr/>
			<a href='${client.imgUrl}' download="myimage" ><button type="button" class="btn btn-default btn-sm">
          <span class="glyphicon glyphicon-download-alt"></span> Download
        </button></a>
			<hr/>
			<%-- <a href="${contextRoot}/categories" class="btn btn-warning">
				View All Categories</a> --%>
		</div>
	</div>
	
	<div class="row is-table-row endPage" >
	<h1> Offers List</h1>
				<c:forEach items="${listOffers}" var="offers">
					<div class="col-sm-4 insideEnd" >
						<div class="thumbnail">
							<a href="${offers.offerLink}"><img src="${offers.imageUrl}"
								alt="${offers.content}" class="image"></a>
						</div>

						<div class="caption">
							<p>${offers.content}</p>
							<%-- <p>${offers.catName}</p>
							<p>${offers.cityName}</p>
							<p>${offers.clientName}</p> --%>
							<p><!-- href="<c:url value='/test.jsp'/>" -->
							
								<a href='http://${offers.offerLink}' class="btn btn-primary pull-right" target="_blank"> View </a>
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
			
