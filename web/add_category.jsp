<%-- 
    Document   : add_category
    Created on : Apr 8, 2016, 11:26:10 AM
    Author     : PARASP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category</title>
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
    
     <div style="border:groove;padding:30px;">
         <div style="text-align:center;color:red;"><h2>Add Category</h2></div>

        <form action="./MultiFileUploader" method="post" enctype="multipart/form-data">
            <div class="form-group">
                 <label class="control-label">Category Name</label>
                    <input type="text" name="category_name" required class="form-control"/>
            </div>
            <div class="form-group"> <label class="control-label">Category Description</label>
                    <textarea name="category_description" cols="21" rows="10" class="form-control"></textarea>
            </div>
            
            <div class="form-group"> <label class="control-label">Select file</label>
                   <input type="file" name="photo" required class="form-control" accept="image/*"/>
            </div>
                
            <div class="form-group"><input type="submit" value="ADD" class="form-control btn btn-primary"/>
            </div>  
            
<div class="form-group">
        <%
        String msg=request.getParameter("msg");
        if(msg!=null)
        {
            %>
            
            <h3 style="text-align:center;color:green;"><%=msg%></h3>
            <%
        }
        %>
</div>
        </form>  
</div>
                  <div class="col-lg-6"></div>
       </div>
                   
   
    
   </div>
</div>
    </body>
</html>
