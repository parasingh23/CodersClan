          <%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>  
<html>
<head>
<title>Change Password</title>


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
        
<script>
            function go(){
                
             var newpassword=document.getElementById("id1").value;
             var confirmpassword=document.getElementById("id2").value;
if(newpassword===confirmpassword)
{
    
 return true;
    
}
else{
   
     return false;
    
}
                
            }
            </script>
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
					    <h1><a class="navbar-brand" href="co_admin_home.jsp"><i class="glyphicon glyphicon-education" aria-hidden="true"></i><span>Coders</span>Clan</a></h1>
					<%
            if(session.getAttribute("username")!=null){
         String username1=session.getAttribute("username").toString();
            
          %>
                                            <h1 style="color:white;padding-left:800px;">Welcome <%=username1%></h1>
                                             <h1 style="padding-left:900px;"><a href="co_admin_logout.jsp" class="btn btn-danger">Logout</a></h1>
                                         <%}%>   
                                        </div>
		</div>
</div>
</div>
<!-- header -->
    
        <% 
            String sessionUsername=(String)session.getAttribute("username");
        %>
      
        <div class="container" style="padding-top:120px;">
            <div class="row">
                <div class="col-lg-3"></div>
                <div class="col-lg-6">
         <div  style="background-color:white;padding:30px;border:groove;text-align:center;">
            <form action="changeco_password_response.jsp" method="get" > 
                <div class="form-group"> <label class="control-label"> Username </label>
                     <input type="text" value="<%=sessionUsername%>" readonly  class="form-control"/>
                </div>
                
                <div class="form-group">
                    
                    <label class="control-label"> Old password </label> <input type="password"  value="" name="oldpassword" class="form-control" />
                 </div>
                
                <div class="form-group">
                <label class="control-label"> New password</label>
                    <input type="password" name="newpassword" id="id1" class="form-control" />
                </div>
                <div class="form-group">
                <label class="control-label"> Confirm password</label>
                <input type="password"  value="" name="confirmpassword" id="id2" class="form-control" />
                </div>
                <div class="form-group">
                <input type="submit" value="Change password" onclick="return go()" class="form-control btn btn-info"/> 
                </div>
                <div
        <%
        String msg=request.getParameter("msg");
        if(msg!=null)
        {
            %>
            
            <h3 style="color:darkblue;"><%=msg%></h3>
            <%
        }
        %>
                </div>
</form>
         </div>
                </div>
             <div class="col-lg-6"></div>
           </div>
        </div>
    </body>
    
    
</html>
