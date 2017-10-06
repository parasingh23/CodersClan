<%-- 
    Document   : admin_login
    Created on : Apr 5, 2016, 9:15:52 PM
    Author     : Vmm-55
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Login</title>
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
                                            <h1><a class="navbar-brand" href="#"><i class="glyphicon glyphicon-education" aria-hidden="true"></i><span>Coders</span>Clan</a></h1>
    <h1 style=" paddin:30px;padding-left:900px;color:white;padding-top:10px;">Admin Login</h1>			
					</div>
							
                        </div>
		</div>
</div>
    
    
                

</div>
<div style="background:url(pic8.jpg) no-repeat;background-size:cover;height:100vh;">
 <div class="container" style="padding-top:100px;">
            <div class="row">
            <div class="col-lg-3"></div>
            <div class="col-lg-6">
<div style="border:groove;padding:20px;background-color:white;">
        <form action="admin_response.jsp" method="get" >
                
                  <div class="form-group" style="text-align:center;">
                      <label class="control-label">Username</label> 
           <input type="text" value="" name="username" required class="form-control" />
                  </div>
            <div class="form-group" style="text-align:center;">
                     <label class="control-label">Password</label>
            
                     <input type="password" value="" name="password" required class="form-control" /></div>
               
            <div class="form-group"> <input type="submit" value="Login" class="form-control btn btn-success" /> </div>
           
            <div>
        <%
            if(request.getParameter("msg")!=null)
            {
                %>
                
                <h5 style="color:red;text-align:center;"><%=request.getParameter("msg")%></h5>
                <%
            }
            %>
            </div> 
              </form>
</div>
      </div>
                <div class="col-lg-6"></div>
 </div></div>
</div>
            
    </body>
</html>
