<%-- 
    Document   : edit_category_photo
    Created on : May 12, 2016, 12:14:17 AM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Photo</title>
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
       
         <form action="./MultiFileUploader2" method="post" enctype="multipart/form-data">
      <div style="border:groove;padding:30px;">
         <div style="text-align:center;color:red;padding-bottom:20px;"><h2>Change Photo</h2></div>

             
            <% 
                
                String category_name=request.getParameter("category_name");
               Class.forName("com.mysql.jdbc.Driver");
            Connection bal =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt =bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           ResultSet rs =stmt.executeQuery("select * from category where category_name='"+category_name+"'");
              if(rs.next()){
                  String photo=rs.getString("photo");
              %>
              
                  <input type="text" name="category_name" value="<%=category_name%>" readonly hidden />
            
               <div class="form-group">
                   <img src="<%=photo%>" style="width:50%;height:50%;margin:auto;" class="form-control">
               </div>
              
              <%
              }
               %>
             
                   
             <div class="form-group">
           
                 <input type="file"  name="photo1" required class="form-control" accept="image/*" /></div>
         
         <div class="form-group">
             <input type="submit" class="form-control btn btn-success" value="Change Photo" > 
         </div>
              </div>
        </form>
        
</div>
                  <div class="col-lg-6"></div>
       </div>
                   
   
    
   </div>
    </body>
</html>
