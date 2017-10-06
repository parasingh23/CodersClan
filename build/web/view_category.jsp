
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Category</title>
     
        
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
<div class="container-fluid" style="padding-top:30px;">
        <table cellpadding="15" cellspacing="10" border="5" class="table table-responsive" >
         
          
            <th>Photo</th>
            <th>Category Name</th>
            <th colspan="3">Category Description</th> 
            
            
            </tr>
            
       
        
        <% 
            try{
        Class.forName("com.mysql.jdbc.Driver");

        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category ");
         
            while(rs.next()){
            
            String category_name=rs.getString("category_name");
            String category_description=rs.getString("category_description");
            String photo=rs.getString("photo");
            
            
            %>
             <tr>
             
             <td> <img  width="100" height="100" src="<%=photo%>"/></td>
             <td> <%=category_name%></td>
             <td> <%=category_description%></td>
             
             <td> <a href="edit_category.jsp?category_name=<%=category_name%>&category_description=<%=category_description%>&photo=<%=photo%>">EDIT</a></td>
             <td> <a href="delete_category.jsp?category_name=<%=category_name%>">DELETE</a></td>
           
             
            
         </tr>
            <%
            }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        %>
    
       </table>
</div>
    </body>
</html>
