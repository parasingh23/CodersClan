<%-- 
    Document   : forget_password
    Created on : May 2, 2016, 11:59:08 PM
    Author     : PARASP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forget Username</title>
     
        
    
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Tutelage Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<script src="js/modernizr.custom.js"></script>
<!-- fonts -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Alegreya:400,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<!-- //fonts -->
	<script src="js/bootstrap.js"></script>

    </head>
<body>
<!-- header -->
<div class="header">
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
					    <h1><a class="navbar-brand" href="CodersClan.jsp"><i class="glyphicon glyphicon-education" aria-hidden="true"></i><span>Coders</span>Clan</a></h1>
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse nav-wil" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li><a class="hvr-overline-from-center button2" href="all_users.jsp">Users</a></li>
                                                                                                       <li><a class="hvr-overline-from-center button2" href="all_questions.jsp">Questions</a></li>
                                                                                                       <li><a class="hvr-overline-from-center button2" href="all_categories.jsp">Categories</a></li>
                                                                                                       <li><a class="hvr-overline-from-center button2" href="add_question.jsp">Ask Question</a></li>
							
							
                                                    
                                                   
                                                
                                                </ul>
						
					</div><!-- /navbar-collapse -->
					
					
				</nav>
			</div>
		</div>
</div>
<div class="container" >
        <form action="forgot_username2.jsp" method="post">
            <div class="row">
                <div class="col-sm-4"></div>
                    <div class="col-sm-4">
            <h2 style="color:red;text-align:center;margin-top:30px;"> Enter Your Email</h2>
            <div class="form-group">
                <label class="control-label">Email </label>
                    <input type="text" name="email"class="form-control" />
            </div>
                    <div class="form-group">
            <input type="submit" value="Submit" class="form-control btn btn-primary" />
                    </div>
            <div  >
           <%String msg=request.getParameter("msg");
        if(msg!=null){
        %>
        <h5 style="text-align:center;margin-top:30px;color:red;"><b><%=msg%></b></h5>
        
        <%
        }
        
        %>    
       </div>
            
            
                </div>
                <div class="col-sm-4"></div>
                    </div>
</div>
        </form>
    </body>
</html>
