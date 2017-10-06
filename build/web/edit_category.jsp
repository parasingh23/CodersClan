<%-- 
    Document   : edit_category
    Created on : Apr 11, 2016, 12:54:08 AM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Category</title>
       <!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Tutelage Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="glyph.css" rel="stylesheet" type="text/css"/>
        <link href="button.css" rel="stylesheet" type="text/css"/>
       
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<script src="js/modernizr.custom.js"></script>
<!-- fonts -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Alegreya:400,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- //fonts -->
	</head>
<body>

<div class="header"style="padding-bottom:20px;">
		<div class="container">
			<div class="header-nav">
				<nav class="navbar navbar-default">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
					    <h1><a class="navbar-brand" href="admin_home.jsp"><i class="glyphicon glyphicon-education" aria-hidden="true"></i><span>Coders</span>Clan</a></h1>
					<%
            if(session.getAttribute("Username")!=null){
         String username1=session.getAttribute("Username").toString();
            
          %>
                                            <h1 style="color:white;padding-left:800px;">Welcome <%=username1%></h1>
                                             <h1 style="padding-left:900px;"><a href="admin_logout.jsp" class="btn btn-danger">Logout</a></h1>
                                         <%}%>   
                                        </div>
		</div>
</div>
</div>
<!-- header -->
        
        
        <div class="container" style="padding-top:30px;">
       <div class="row">
                <div class="col-lg-3"></div>
                <div class="col-lg-6">
        <form action="edit_category_response.jsp" method="post" role="form">
     <div style="border:groove;padding:30px;">
         <div style="text-align:center;color:red;"><h2>Edit Category</h2></div>


        
        
       
       
         <% 
      
        String category_name=request.getParameter("category_name"); 
        String category_description=request.getParameter("category_description");
            String photo=request.getParameter("photo");
                
                
       %>         
       
         <div class="form-group">  
       <label class="control-label">Category Name</label>
              <input type="text" value="<%=category_name%>" name="category_name" class="form-control" readonly />
         </div>
         <div class="form-group">
         <label class="control-label">Category Description</label>
         <textarea cols="21" rows="10" name="category_description" class="form-control" ><%=category_description%></textarea></div>
        <div class="form-group">
               <img  style="width:50%;height:50%;margin:auto;" src="<%=photo%>" class="form-control"/> 
        </div>
           <div class="form-group">
        
               <h1 style="padding-left:180px;"> <a href="edit_category_photo.jsp?category_name=<%=category_name%>" class="btn btn-warning" class="form-control"/>Change Photo</a></h1>
           </div>
         <div class="form-group"> 
        <input type="submit" value="EDIT" class="form-control btn btn-primary"  /></div>
         <div>      
          <%String msg=request.getParameter("msg");
        if(msg!=null){
        %>
        <h5 style="color:red;text-align:center;"><b><%=msg%></b></h5>
        
        <%
        }
        
        %>    
         </div>
        
        </div>
        </form>
        
</div>
                  <div class="col-lg-6"></div>
       </div>
                   
   
    
   </div>


        </body>
</html>
