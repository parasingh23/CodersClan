<%-- 
    Document   : user_sign_up
    Created on : Apr 13, 2016, 10:25:01 PM
    Author     : PARASP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Sign Up</title>
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
<script>
    $("#mydate").validate();
</script>
<script>
    function check(val)
    {
        if(val.length>10)
        {
            alert("username cannot be greater than 10 digits");
            document.getElementById("user").value="";
        }
        else
        {
            var xml = new XMLHttpRequest();
        xml.onreadystatechange = function (){
            if(xml.readyState==4 && xml.status==200)
            {
                if(xml.responseText.trim()=="Not Valid")
                {
                    alert("not valid");
                    document.getElementById("user").value="";
                }
            }
        };
        xml.open("GET","check_username.jsp?value="+val,true);
        xml.send();
        }
        
        
    }
</script>

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
							 
							
							<div style="padding-top:25px;"> <a class="btn-lg btn-warning" href="user_login.jsp" style="padding-left:30px;padding-right:30px;">Login</a></div>
						</ul>
						
					</div><!-- /navbar-collapse -->
					
					
				</nav>
			</div>
		</div>
</div>
<!-- header -->
        

<div style="background:url(pic8.jpg) no-repeat ;">
          
           
            <div class="container" style="padding-top:20px;" >
            <div class="row">
            <div class="col-lg-3"></div>
            <div class="col-lg-5">
                
        <form action="./MultiFileUploader5" method="post" enctype="multipart/form-data" role="form" style="background-color:white;border:groove;padding:30px 30px 30px 30px;width:600px;">
            <div class="form-group" style="text-align: center;font-size:30px;font-family:Tahoma;">
                <label>Sign Up</label>
            </div>
            <div id="h1" style="margin-bottom:20px;">
                
                
            </div>
                
            
              <div class="form-group inner-addon left-addon">
              <label class="control-label ">Username</label>
             
              <input type="text" value="" name="username" required  placeholder="Usernname" onkeyup="check(this.value)" id="user" class="form-control"/>
               <i class=" form-control-feedback glyphicon glyphicon-user"></i>
              
              </div>
            <div style="margin-top:20px;">
             <%String msg=request.getParameter("msg");
        if(msg!=null){
        %>
        <h5 style="color:red;"><b><%=msg%></b></h5>
        
        <%
        }
        
        %>    
         </div>
               
            
            
            <div class="form-group inner-addon left-addon">
                <label class="control-label">Password</label> 
                <input type="password" value="" name="password" required class="form-control" placeholder="Password"/>
                <i class=" form-control-feedback glyphicon glyphicon-lock"></i>
            </div>
            
            <div class="form-group inner-addon left-addon">
                <label class="control-label ">Email</label>
                <input type="email" value="" name="email" required  placeholder="xyz@mail.com" class="form-control"/>
                <i class=" form-control-feedback glyphicon glyphicon-envelope"></i>
            </div>
           
            <div class="form-group inner-addon left-addon">
                 <label class="control-label">Phone Number</label> 
                 <input type="tel" value="" name="phonenumber" maxlength="10"  placeholder="eg.9999999999" required  class="form-control" onkeydown="return ( event.ctrlKey || event.altKey 
                    || (47<event.keyCode && event.keyCode<58 && event.shiftKey===false) 
                    || (95<event.keyCode && event.keyCode<106)
                    || (event.keyCode===8) || (event.keyCode===9) 
                    || (event.keyCode>34 && event.keyCode<40) 
                    || (event.keyCode===46) )"/> 
            <i class=" form-control-feedback glyphicon glyphicon-phone"></i>
            </div>
            
                <div class="form-group inner-addon left-addon">
                 <label class="control-label">Birthday</label>
                 <input type="date"  name="birthday"  id="mydate"  min="1970-01-01" max="2016-31-12" required class="form-control"/>
                
                <i class=" form-control-feedback glyphicon glyphicon-calendar"></i>
                </div>
            
 
            <div class="form-group  inner-addon left-addon">  
                 <label class="control-label">Photo</label> 
                 
                 <input type="file"  name="photo" class="form-control"  accept="image/*" required/>
                 <i class="  form-control-feedback control-label glyphicon glyphicon-camera"></i>
            </div>
 
 
            <div class="form-group">
                <label class="control-label">Security Question</label> 
                <select name="security_question" class="form-control">
                <option>What is your pet name?</option>
                <option>What is your favourite sport?</option>
                <option>Who is your favourite actor?</option>
                <option>Who is your best friend?</option>
                </select>
            </div>
 
            <div class="form-group">   
                <label class="control-label">Security Answer</label> 
                 <input type="text" value="" name="security_answer" required class="form-control" /> 
            </div>
            
            <div class="form-group" style="text-align:center;">
               <input type="submit" value="Sign Up" class="btn btn-success btn-lg" id="submitbutton" />
              
            </div>
            
            <div class="form-group" style="text-align:right;">
                <label class="control-label">Already a member ?</label>
                <a href="user_login.jsp" class="btn btn-default">Go and login</a>
            </div>
        </form>
               
            </div> 
             
            </div>  
                <div class="col-lg-6"></div>
            </div>
          
</div>    
          
        
        
        
        
    </body>
</html>
