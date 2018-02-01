<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div id="page-wrapper" class="gray-bg dashbard-1">
	<div class="content-main">

		<!--banner-->
		<div class="banner">
			<h2>
				<a href="index.php">Home</a> <i class="fa fa-angle-right"></i> <span>Create
					Client</span>
			</h2>
		</div>
		<!--//banner-->
		<!--faq-->

		<div class="validation-system">

			<div class="validation-form">
				<!---->

				<sf:form method="POST" action="${contextRoot}/admin/addclient"
					modelAttribute="client">
					<input type="hidden" name="clientid" value="">
					<div class="clearfix"></div>
					<div class="col-md-12 form-group2 group-mail">
						<label class="control-label">City</label>
						<sf:select path="citiesId" items="${listCity}"
							itemLabel="cityName" itemValue="id" class="form-control" />

						<div class="text-right">
							<br />
							<sf:hidden path="id" />
						</div>
					</div>

					<div class="clearfix"></div>
					<div class="col-md-12 form-group2 group-mail">
						<label class="control-label">Category</label>
						<sf:select path="catId" items="${listCategory}" itemLabel="name"
							itemValue="id" class="form-control" />

						<div class="text-right">
							<br />
							<sf:hidden path="id" />
							<%-- <sf:hidden path="imageURL"/> 
									<sf:hidden path="description"/>
									<sf:hidden path="active"/>	 --%>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="col-md-12 form-group1 group-mail">
						<label class="control-label">Client Name</label>
						<sf:input class="form-control1" type="text" path="name"
							name="name" placeholder="Client Name"></sf:input>
					</div>
					<div class="clearfix"></div>
					<div class="col-md-12 form-group1 group-mail">
						<label class="control-label">Client Mobile</label>
						<sf:input class="form-control1" type="text" path="mobile"
							name="mobile" placeholder="Client Mobile"></sf:input>
					</div>

					<div class="clearfix"></div>
					<div class="col-md-12 form-group1 ">
						<label class="control-label">Client Site Link<span>*</span></label>
						<sf:input class="form-control1" type="text" path="webSite"
							name="webSite" placeholder="Client Web Site"></sf:input>
					</div>
					<div class="clearfix"></div>
					<div class="col-md-12 form-group1 ">
						<label class="control-label">Client Address</label>
						<sf:textarea rows="15" class="form-control1" type="text"
							path="address" name="address" placeholder="Client Address"></sf:textarea>
					</div>
					<div class="clearfix"></div>
					<div class="col-md-12 form-group1 ">
						<label class="control-label">Client Details</label>
						<sf:textarea rows="15" name="details" path="details"
							placeholder="Client Details Content" required=""></sf:textarea>
					</div>
					<div class="clearfix"></div>

					<!--  	<div class="col-md-12 form-group ">
              <label class="control-label">Client Image</label>
              <input type="file" name="cimage">
              <p class="help-block"> select image for Client Logo</p>
            </div> -->
					<div class="clearfix"></div>
					<div class="clearfix"></div>

					<div class="col-md-12 form-group right">
						<button type="submit" name="submit" class="btn btn-primary">Add
							Client</button>
						<button type="reset" class="btn btn-default">Reset</button>
					</div>
					<div class="clearfix"></div>
				</sf:form>

				<!---->
			</div>

		</div>

		<!--//faq-->
		<!---->
	</div>
	<div class="clearfix"></div>
</div>

<!---->
<!--scrolling js-->
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!--//scrolling js-->
</body>
</html>

