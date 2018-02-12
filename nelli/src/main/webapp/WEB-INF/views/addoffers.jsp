<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

 <div id="page-wrapper" class="gray-bg dashbard-1">
       <div class="content-main">
 
 	<!--banner-->	
		     <div class="banner">
		    	<h2>
				<a href="index.php">Home</a>
				<i class="fa fa-angle-right"></i>
				<span>Create Offer</span>
				</h2>
		    </div>
		<!--//banner-->
 	 <!--faq-->
 	
	<div class="validation-system">
 		
 	<div class="validation-form">
 	<!---->
  	    
        <sf:form method="POST" action="${contextRoot}/admin/addoffers" modelAttribute="offers" enctype="multipart/form-data">
        
        <sf:input class="form-control1" type="hidden"  path="id" name="id" ></sf:input>
         <sf:input class="form-control1" type="hidden"  path="offImageUrl" name="offImageUrl" ></sf:input>
            <div class="clearfix"> </div>
           	<div class="col-md-12 form-group2 group-mail">
              <label class="control-label">City</label>
            	<sf:select path="cityId" items="${listCity}"
							itemLabel="cityName" itemValue="id" class="form-control" />

						<div class="text-right">
							<br />
							 <sf:hidden path="id" /> 
						</div>
            </div>
            
             <div class="clearfix"> </div>
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
              <div class="clearfix"> </div>
              <div class="col-md-12 form-group2 group-mail">
              <label class="control-label">Client</label>
            <sf:select path="clientId" items="${listClient}" itemLabel="name"
							itemValue="id" class="form-control" />

						<div class="text-right">
							<br />
							<sf:hidden path="id" />
							<%-- <sf:hidden path="imageURL"/> 
									<sf:hidden path="description"/>
									<sf:hidden path="active"/>	 --%>
						</div>
            </div>
             <div class="clearfix"> </div>
            <div class="col-md-12 form-group1 group-mail">
              <label class="control-label">Offer Starting date</label>
              <sf:input class="form-control1 ng-invalid ng-invalid-required" type="date" name="startDate" path="startDate" placeholder="Offer Starting date" ></sf:input>
            </div>
            <div class="clearfix"> </div>
            <div class="col-md-12 form-group1 group-mail">
              <label class="control-label">Offer ending date</label>
              <sf:input class="form-control1 ng-invalid ng-invalid-required" required="" type="date" name="endDate" path="endDate" placeholder="Offer Ending date"></sf:input>
            </div>

             <div class="clearfix"> </div>
            <div class="col-md-12 form-group1 ">
              <label class="control-label">Offer Site Link<span>*</span></label>
              <sf:input type="text" name="offerLink" path="offerLink" placeholder="Offer Site Link" required=""></sf:input>
            </div>
             <div class="clearfix"> </div>
           	<div class="col-md-12 form-group1 ">
              <label class="control-label">Offer Content Details</label>
              <sf:textarea rows="15" name="content" path="content" placeholder="Your Page Content" required=""></sf:textarea>
            </div>
            <div class="clearfix"> </div>
            <div class="clearfix"> </div>
           
            <div class="clearfix"> </div>
         <div class="col-md-12 form-group ">
              <label class="control-label">Offer Image</label>
               <sf:input type="file" name="file" path="file"></sf:input>
              <p class="help-block"> select image for this page</p>
            </div>
            <div class="clearfix"> </div>
            <div class="clearfix"> </div>

            <div class="col-md-12 form-group right">
              <button type="submit" name="submit" class="btn btn-primary">Submit</button>
              <button type="reset" class="btn btn-default">Reset</button>
            </div>
          <div class="clearfix"> </div>
        </sf:form>
    
 </div>

</div>
