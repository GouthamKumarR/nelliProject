<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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
                     <h1>Get In Touch</h1>
                  </div>
               </div>
            </div>
         </div>
      </div>

       <div class="main-content-area clearfix">
         <!-- =-=-=-=-=-=-= Latest Ads =-=-=-=-=-=-= -->
         <section class="section-padding ">
            <!-- Main Container -->
            <div class="container">
               <!-- Row -->
               <div class="row">
                  <div class="col-md-12 col-sm-12 col-xs-12 no-padding commentForm">
                     <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
                        <div class="">
                           <h2 >Send a Message</h2>
                           <c:if test="${not empty message}">	
								<div class="row">			
									<div class="col-xs-12 col-md-offset-2 col-md-8">			
										<div class="alert alert-info fade in">${message}</div>				
									</div>
								</div>
						</c:if>
                           <sf:form action="${contextRoot}/contact" method="post" modelAttribute="contact">
                              <div class="row">
                                 <div class="col-lg-6 col-md-6 col-xs-12">
                                    <div class="form-group">
                                    <sf:input type="text" path="name" placeholder="Name" id="name" name="name" class="form-control" ></sf:input>
                                    </div>
                                    <div class="form-group">
                                    <sf:input type="email" path="email" placeholder="Email" id="email" name="email" class="form-control" ></sf:input>
                                    </div>
                                    <div class="form-group">
                                    <sf:input type="text" path="subject"  placeholder="Subject" id="subject" name="subject" class="form-control" ></sf:input>
                                    </div>
                                 </div>
                                 <div class="col-lg-6 col-md-6 col-xs-12">
                                    <div class="form-group">
                                       <sf:textarea cols="12" rows="7" path="message" placeholder="Message..." id="message" name="message" class="form-control" ></sf:textarea>
                                    </div>
                                 </div>
                                 <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <button class="btn btn-theme" type="submit">Send Message</button>
                                 </div>
                              </div>
                           </sf:form>
                        </div>
                     </div>
                     <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                        <div class="contactInfo">
                           <h2>Contact Info</h2>
                           <div class="singleContadds">
                              <i class="fa fa-map-marker"></i>
                              <p>
                                 Manjunath Nagar Rajajinagar Bangalore - 560010.
                              </p>
                           </div>
                           <div class="singleContadds phone">
                              <i class="fa fa-phone"></i>
                              <p>
                                 +91 9632772262 - <span>Office</span>
                              </p>
                              <p>
                                 +91 9632772262 - <span>Mobile</span>
                              </p>
                           </div>
                           <div class="singleContadds">
                              <i class="fa fa-envelope"></i>
                              <a href="mailto:info@nellaipages.com">test@gmail.com</a>
                              
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
               <!-- Row End -->
            </div>
            <!-- Main Container End -->
         </section>
         <!-- =-=-=-=-=-=-= Ads Archives End =-=-=-=-=-=-= -->
        
     
   </body>
</html>

