<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<nav class="navbar-default navbar-static-top" role="navigation">
             <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
               <h1> <a class="navbar-brand" href="index.html">ADMIN.</a></h1>         
			   </div>
			 <div class=" border-bottom">
        	<div class="full-left">
        	  <section class="full-top">
				<button id="toggle"><i class="fa fa-arrows-alt"></i></button>	
			</section>
			<form class=" navbar-left-right">
              <input type="text"  value="Search..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search...';}">
              <input type="submit" value="" class="fa fa-search">
            </form>
            <div class="clearfix"> </div>
           </div>
     
       
            <!-- Brand and toggle get grouped for better mobile display -->
		 
		   <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="drop-men" >
		        <ul class=" nav_1">
		           
		    		<security:authorize access="isAuthenticated()">
					<li class="dropdown">
		              <a href="#" class="dropdown-toggle dropdown-at" data-toggle="dropdown"><span class=" name-caret">Admin<i class="caret"></i></span><img src="${images}/admin.jpg"></a>
		              <ul class="dropdown-menu " role="menu">
		                <li><a href="${contextRoot}/perform-logout"><i class="fa fa-power-off"></i>Logout</a></li>
		              </ul>
		            </li>
		           </security:authorize>
		        </ul>
		     </div><!-- /.navbar-collapse -->
			<div class="clearfix">
       
     </div>

    <div class="navbar-default sidebar" role="navigation">
	    <div class="sidebar-nav navbar-collapse">
		    <ul class="nav" id="side-menu">
			
		        <li>
		            <a href="${contextRoot}/admin/dashboard" class=" hvr-bounce-to-right"><i class="fa fa-dashboard nav_icon "></i><span class="nav-label">Dashboards</span> </a>
		        </li>
		        <li>
		            <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-list nav_icon"></i> <span class="nav-label">Categories</span><span class="fa arrow"></span></a>
		            <ul class="nav nav-second-level">
		                <li><a href="${contextRoot}/admin/addCategory/add" class=" hvr-bounce-to-right"><i class="fa fa-file nav_icon"></i>Create Category</a></li>
		                <li><a href="${contextRoot}/admin/list/categories" class=" hvr-bounce-to-right"><i class="fa fa-list nav_icon"></i>List of Categories</a></li>
		            </ul>
		        </li>
		        <li>
		            <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-users nav_icon"></i> <span class="nav-label">Clients</span><span class="fa arrow"></span></a>
		            <ul class="nav nav-second-level">
		                <li><a href="${contextRoot}/admin/addClient/add" class=" hvr-bounce-to-right"><i class="fa fa-file nav_icon"></i>Create Client</a></li>
		                <li><a href="${contextRoot}/admin/list/clients" class=" hvr-bounce-to-right"><i class="fa fa-list nav_icon"></i>List of Clients</a></li>
		            </ul>
		        </li>

		        <li>
		            <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-file-text-o nav_icon"></i> <span class="nav-label">Offers</span><span class="fa arrow"></span></a>
		            <ul class="nav nav-second-level">
		                <li><a href="${contextRoot}/admin/addOffers/add" class=" hvr-bounce-to-right"><i class="fa fa-file nav_icon"></i>Create Offers</a></li>
		                <li><a href="${contextRoot}/admin/list/offers" class=" hvr-bounce-to-right"><i class="fa fa-list nav_icon"></i>List of Offers</a></li>
		            </ul>
		        </li>
		    </ul>
		</div>
	</div>
</nav>