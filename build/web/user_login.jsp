<%-- 
    Document   : user_login
    Created on : Apr 14, 2016, 12:02:19 PM
    Author     : PARASP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
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
<!-- header -->
<div class="header" >
		<div class="container"  >
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
					    <h1><a class="navbar-brand" href="CodersClan.jsp"><i class="glyphicon glyphicon-education" aria-hidden="true"></i><span>Coders</span>Clan</a></h1>
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse nav-wil" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li><a class="hvr-overline-from-center button2" href="all_users.jsp">Users</a></li>
                                                                                                       <li><a class="hvr-overline-from-center button2" href="all_questions.jsp">Questions</a></li>
                                                                                                       <li><a class="hvr-overline-from-center button2" href="all_categories.jsp">Categories</a></li>
                                                                                                       <li><a class="hvr-overline-from-center button2" href="add_question.jsp">Ask Question</a></li>
							 
														                                                                           <div style="padding-top:25px;"> <a class="btn-lg btn-primary" href="user_sign_up.jsp" style="padding-left:30px;padding-right:30px;">Sign Up</a></div>
                                                                           
						</ul>
						
					</div><!-- /navbar-collapse -->
					
					
				</nav>
			</div>
		</div>
</div>
<!-- header -->


         <div style="background:url(pic15.jpg)no-repeat;background-size:cover;padding:80px;height:100vh;">
        <div class="container" style="padding-top:120px;">
            <div class="row">
                <div class="col-lg-3"></div>
                <div class="col-lg-6">

                    
                         <div  style="background-color:white;padding:30px;border:groove;">
                    <form action="user_login_response.jsp" method="get" role="form"  class="form-horizontal" id="form">
                        <div class="form-group">
                            <label class="control-label" style="font-family:Times Roman;"> Username</label> 
                            <input type="text" value="" name="username" required  placeholder="Username" class="form-control"/> 
                        </div>
                        
                        
                    <div style="margin-top:20px; text-align:center;">
             <%String msg=request.getParameter("msg");
        if(msg!=null){
        %>
        <h5 style="color:darkblue;"><b><%=msg%></b></h5>
        
        <%
        }
        
        %>    
         </div>           
      
                        <div class="form-group">

                            <label class="control-label" style="font-family:Times Roman;">Password</label>
                            <input type="password" value="" name="password" required placeholder="Password" class="form-control" /> 
                        </div>
         
         <div class="form-group">
             <div><a href="forget_password.jsp?">Forgot Password?</a></div>
         </div>
                        <div class="form-group" style="text-align: center;"  >

                            <input type="submit" value="Login" class="btn btn-success btn-lg" />  
                        </div>            

                    </form> 

                </div>
                </div>
             <div class="col-lg-6"></div>
           </div>
        </div>
         </div>
         
    </body>
</html>
