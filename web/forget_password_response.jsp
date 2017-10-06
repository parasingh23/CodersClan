<%-- 
    Document   : forget_password_response
    Created on : May 3, 2016, 12:22:29 AM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forget Password</title>
        <meta name="keywords" content="Tutelage Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <a href="../../MailDemo/src/mail.jar"></a>
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


        <div class="container" style="padding-top:20px; padding-right:100px;">
        <div class="row">
        <div class="col-lg-4"></div>
          <div class="col-lg-5">
     <%
     String username=request.getParameter("username");
     
     Class.forName("com.mysql.jdbc.Driver");
         Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
         Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         ResultSet rs = stmt.executeQuery("select * from users where username='"+username+"' ");
         
         if(rs.next())  {
           
       String security_question=rs.getString("security_question");      
       String security_answer=rs.getString("security_answer");      
       String photo=rs.getString("photo");
      
       String email=rs.getString("email");      
     
     %>
    
     <form  action="recover_password.jsp" method="post"  role="form" >
       <div class="form-group" style="border:groove;padding:10px;">
         <div class="form-group" style="text-align:center;"><img width="75" height="75" src="<%=photo%>" class="img-circle" /> </div>
         
         <div class="form-group-lg" style="text-align:center;">
             <h3><%=username%></h3>
         </div>
       </div>
         
         <div class="form-group" style="padding-top:20px;"><h4>  <%=security_question%></h4></div>  
            <div class="form-group " >
             <label class="control-label">Security Answer</label> 
             <input class="form-control" type="text" value="" name="security_answer" required>
         </div>
         <div class="form-group">  
             <label class="control-label">Email </label> 
  <input  class="form-control" type="email" value="" name="email">
         </div>      
  <div class="form-group">  
         <input class="form-control btn btn-info" type="submit" value="Continue" >
  </div>
     </form>
    
   <%   } else{ %>
     
   <h3 style="text-align:center;color:red;">Username doesn't exists</h3>
   
   
   <%}%>
          </div>
          <div class="col-lg-4"></div>
        </div>
        </div>
          
    </body>
</html>
