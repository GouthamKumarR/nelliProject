<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
 <div id="page-wrapper" class="gray-bg dashbard-1">
       <div class="content-main">
 
 	<!--banner-->	
		     <div class="banner">
		    	<h2>
				<a href="index.php">Home</a>
				<i class="fa fa-angle-right"></i>
				<span>Create Category</span>
				</h2>
		    </div>
		<!--//banner-->
 	 <!--faq-->
 	
	<div class="validation-system">
 		
 	<div class="validation-form">
 	<!---->
    	    
        <sf:form method="POST" action="${contextRoot}/admin/addcategory" modelAttribute="category" >
         <sf:input class="form-control1" type="hidden"  path="id" name="id" ></sf:input>
            
            <div class="clearfix"> </div>
            <div class="col-md-12 form-group1 group-mail">
              <label class="control-label">Category Name</label>
              <sf:input class="form-control1" type="text" path="name" name="name" placeholder="Category Name" ></sf:input>
            </div>
            <div class="clearfix"> </div>
           
            <div class="col-md-12 form-group1 ">
              <label class="control-label">Category Status <span>*</span></label>
             <%--  <sf:input type="checkbox" name="active" path="active" class="form-group1"></sf:input> --%>
              <sf:checkbox name="active" path="active" class="form-group1" id="active" />
            </div>
            <div class="clearfix"> </div>
           	<div class="clearfix"> </div>
            <div class="col-md-12 form-group1 ">
              <label class="control-label">Category Details</label>
              <sf:textarea rows="15" name="description" path="description" placeholder="Client Details Content" required=""></sf:textarea>
            </div>
                        <div class="clearfix"> </div>
           	
          <!--  	<div class="col-md-12 form-group ">
              <label class="control-label">Category Image</label>
              <input type="file" name="catimage">
              <p class="help-block"> select image for Category Logo</p>
            </div> -->
            <div class="clearfix"> </div>
            <div class="clearfix"> </div>

            <div class="col-md-12 form-group right">
              <button type="submit" name="submit" class="btn btn-primary">Add Category</button>
              <button type="reset" class="btn btn-default">Reset</button>
            </div>
          <div class="clearfix"> </div>
        </sf:form>
    
 	<!---->
 </div>

</div>

