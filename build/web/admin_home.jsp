<%-- 
    Document   : admin_home
    Created on : Apr 5, 2016, 10:07:37 PM
    Author     : Vmm-55
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Home</title>
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
        <%
         String username=session.getAttribute("Username").toString();
          %> 

          <div style="background:url(pic8.jpg) no-repeat;background-size:cover;height:100vh;">

      <div class="container" style="padding-top:50px;">
            <div class="row">
                <div class="col-lg-3"></div>
                <div class="col-lg-6">

        <%--<div style="padding-left:190px;padding:20px;border:groove;padding-bottom:30px;background-color:darkgrey;">  --%>
            <div style="background-color:#05969b;padding:20px;border:solid;"> <h1 style="color:white;">Options</h1></div>
            <div style="padding:60px;border:groove;background-color:white;">
            <div style="padding:30px;">  <a href="change_password.jsp?username=<%=username%>" class="btn-lg btn-warning" style="padding-left:70px;padding-right:70px;">Change Password </a> <br> </div>
            <div style="padding:30px;">  <a href="add_category.jsp" class="btn-lg btn-success " style="padding-left:90px;padding-right:90px;" >Add Category</a> <br></div>
            <div style="padding:30px;"><a href="view_category.jsp" class="btn-lg btn-danger " style="padding-left:90px;padding-right:90px;">View Category</a> <br> </div>
            <div style="padding:30px;"><a href="view_co_admin.jsp" class="btn-lg btn-primary " style="padding-left:90px;padding-right:80px;">View Co-Admin</a> <br> </div>
            </div>
    
                </div>
             <div class="col-lg-6"></div>
           </div>

      </div>
          </div>
    </body>
</html>
