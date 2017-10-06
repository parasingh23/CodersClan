<%-- 
    Document   : user_profile1
    Created on : May 5, 2016, 6:15:59 PM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<title>Profile</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Resume Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<!-- fonts -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Acme' rel='stylesheet' type='text/css'><!-- //fonts -->

	<!-- start-smoth-scrolling -->
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
	<!-- start-smoth-scrolling -->

<!-- skills -->
<script src="js/pie-chart.js" type="text/javascript"></script>
 <script type="text/javascript">

        $(document).ready(function () {
            $('#demo-pie-1').pieChart({
                barColor: '#10A7AF',
                trackColor: '#fff',
                lineCap: 'round',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });

            $('#demo-pie-2').pieChart({
                barColor: '#10A7AF',
                trackColor: '#fff',
                lineCap: 'butt',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });

            $('#demo-pie-3').pieChart({
                barColor: '#10A7AF',
                trackColor: '#fff',
                lineCap: 'square',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });
			
			$('#demo-pie-4').pieChart({
                barColor: '#10A7AF',
                trackColor: '#fff',
                lineCap: 'square',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });
        });
    </script>
<!-- skills -->
<script type="text/javascript" src="js/numscroller-1.0.js"></script>

</head>
<body>
<!-- header -->
<div class="header" style="padding-bottom:0px;padding-top:0px;">
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
						<ul class="nav navbar-nav" style="padding-left:450px;">
							
							
                                                                                                       <li><a class="hvr-overline-from-center button2" href="all_users.jsp">Users</a></li>
                                                                                                       <li><a class="hvr-overline-from-center button2" href="all_categories.jsp">Categories</a></li>
                                                                                                       <li><a class="hvr-overline-from-center button2" href="all_questions.jsp">Questions</a></li>
                                                                                                       <li><a class="hvr-overline-from-center button2" href="add_question.jsp">Ask Question</a></li>
							 <% 
                                                                                                              if(session.getAttribute("username")!=null) {
                                                                                                             String sessionusername=(String)session.getAttribute("username");
           
        %>
	 <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><%=sessionusername%><span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li><a href="edit_profile.jsp">Edit Profile</a></li>
            <li><a href="change_user_password.jsp">Change Password</a></li>
         
            <li><a href="view_my_question.jsp">My Questions</a></li>
            <li><a href="logout.jsp">Logout</a></li>
        </ul>
             <%}
                                                                                                              else{%>
                                                                                                
             
           <a class=" btn btn-primary" href="user_sign_up.jsp" style="border:solid;margin-top:14px;padding-left:30px;padding-right:30px;">Signup</a>
             <a class=" btn btn-warning" href="user_login.jsp" style=" border:solid;margin-top:14px;padding-left:30px;padding-right:30px;">Login</a>
        
                                                                                                       <%}%>
						</ul>
						
					</div><!-- /navbar-collapse -->
					
					
				</nav>
			</div>
		</div>
</div>
<!-- header -->
<div style="background-image:url(pic2.jpg);padding-top:20px;padding-bottom:20px;background-size:100%;background-repeat:no-repeat;" >
	<div  >
      	 <%
      
      String username=request.getParameter("username");
    
      Class.forName("com.mysql.jdbc.Driver");
          Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
          Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
          ResultSet rs = stmt.executeQuery("select * from users where username='"+username+"'");
           if(rs.next()) {   
          
               String username1=rs.getString("username");
               String photo=rs.getString("photo");
               String email=rs.getString("email");
               String point=rs.getString("points");
               String phone=rs.getString("phonenumber");
      %>
		<div class="col-md-8 header-left"  >
			<div class="col-sm-5 pro-pic">
				<img class="img-responsive img circle" width="250"height="150" src="<%=photo%> "/>
			</div>
			<div class="col-sm-5 pro-text" >
                            <h1><%=username%></h1>
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="col-md-4 header-right ">
			<ul class="list-left">
				<li>Email:</li> 
                                                           <li>Points:</li> 
				<li>Phone no:</li>
				
			</ul>
                    
                             <ul class="list-right">
                        <li><%=email%> </li>
				<li><%=point%></li>
				<li><%=phone%></li>
                    </ul>
                     <%}%>
                     
                    <% 
    Statement stmt10 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs10 = stmt10.executeQuery("select * from users ORDER BY points DESC");
         int num=1;  
         System.out.println(request.getParameter("username"));
        while(rs10.next())
        {
            if(request.getParameter("username").equals(rs10.getString("username")))
            {
               break; 
            
                    
            }
            
            num++;
        }
%> 
                     
                     <ul class="list-left">
				<li>Rank:</li> 
                     </ul>

<ul class="list-right">
				
				<li>#<%=num%></li>
			</ul>
                     
                    <%
     
           if(session.getAttribute("username")!=null)
           {
      Class.forName("com.mysql.jdbc.Driver");
          Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
          ResultSet rs2 = stmt2.executeQuery("Select * from hit_count where hit_username='"+username+"' ");
          
          int hitsCount=0;
          
          if(rs2.next())
          {
             
                 hitsCount =rs2.getInt("hit_counter");
              
              hitsCount+=1;   
              
               rs2.moveToCurrentRow();
               rs2.updateInt("hit_counter",  hitsCount);
               rs2.updateRow();
    }
      else{
  
       rs2.moveToInsertRow();
       rs2.updateInt("hit_counter",0);
       rs2.updateString("hit_username",username);
       rs2.insertRow();
 
          
          
          }
  
%>
                    <ul class="list-left">
                        <li>Profile views: </li>
                    </ul>
			<ul class="list-right">
				
				<li><%=hitsCount%></li>
			</ul>
                        <%
           }
           else{
 
               
           }  
               
%>
			<div class="clearfix"></div>
		</div>
		<div class="clearfix"></div>
	</div>
</div>


<!-- about -->
<!-- education -->
<div class="employment">
	<div class="container">
		<h3 class="tittle ">Questions Asked</h3>
		<%

Class.forName("com.mysql.jdbc.Driver");
   
    Statement stmt3= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs3= stmt3.executeQuery("select * from question where username='"+username+"'");
         if(rs3.next())
         {
               
             Class.forName("com.mysql.jdbc.Driver");
                 Statement stmt4 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                 ResultSet rs4= stmt4.executeQuery("select * from question where username='"+username+"'");
               
               while(rs4.next())
               {
             String title=rs4.getString("title");  
             String user=rs4.getString("username");  
             int question_id=rs4.getInt("question_id");  
  
%>

<a href="view_question_detail.jsp?title=<%=title%>&question_id=<%=question_id%>&username=<%=username%>"><h1><%=title%></h1><br></a>

<%}
         }
         else{
    %>
  
    <h3>No Questions added</h3>
        
   <%}%>
		
		
		<div class="clearfix"></div>
	</div>
</div>
<!-- education -->
<!-- num scroller -->
<div class="num-scroller">
	<div class="container" style="text-align:center;">
            
            <%
            Class.forName("com.mysql.jdbc.Driver");
            
             Statement stmt11= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs11 = stmt11.executeQuery("select * from question where username='"+username+"'");
                int count2=0;
                while(rs11.next()){
                count2++;
                } 
               
                Statement stmt6= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs6 = stmt6.executeQuery("select * from answers where ans_username='"+username+"'");
              
               int count1=0;
             while(rs6.next()){
                 
            count1++;
                 
             }
               
            %>
            
		<h3 class="tittle ">Milestones Achieved</h3>
		
		<div class="col-md-3 capabil-grid text-center" style="padding-left:300px;text-align:center;">			
			<div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='<%=count1%>'  data-delay='.5' data-increment="1"><%=count1%></div>
			<p style="padding-left:30px;text-align:center;"> Total Answers</p>
		</div>
		<div class="col-md-3 capabil-grid text-center" style="padding-left:400px;">			
			<div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='<%=count2%>'  data-delay='.5' data-increment="1"><%=count2%></div>
                        <p style="padding-left:30px;text-align:center;"> <span style="text-align:center;"> Total</span> Questions</p>
		</div>
		<div class="clearfix"></div>
                
	</div>
</div>
<!-- //num scroller -->
<!-- portfolio -->
<div class="portfolio">
	<div class="container">
		<h3 class="tittle ">Questions Answered</h3>
			<%

Class.forName("com.mysql.jdbc.Driver");
   
    Statement stmt5= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs5= stmt5.executeQuery("select * from answers where ans_username='"+username+"'");
if(rs5.next()){
    
Statement stmt8= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs8= stmt8.executeQuery("select * from answers where ans_username='"+username+"'");
    while(rs8.next()){
        String answer=rs8.getString("answers");
         int ans_question_id=rs8.getInt("ans_question_id");
         
         Class.forName("com.mysql.jdbc.Driver");
             Statement stmt7 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs7 = stmt7.executeQuery("select * from question where question_id='"+ans_question_id+"' ");
               rs7.next();
              
     String title=rs7.getString("title");
     String username1=rs7.getString("username");
     
%>

<a href="view_question_detail.jsp?title=<%=title%>&question_id=<%=ans_question_id%>&username=<%=username1%>"><h2><%=title%></h2></a>
<h3><%=answer%></h3>
<hr />
<%}
}
else{%>
<h2>No Answers</h2>
<%}%>
	</div>
</div>
<!-- //portfolio -->



<!-- contact -->

<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->

	<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
	<!-- smooth scrolling -->
	<script type="text/javascript">
		$(document).ready(function() {
		/*
			var defaults = {
			containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			};
		*/								
		$().UItoTop({ easingType: 'easeOutQuart' });
		});
	</script>
	<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->

</body>
</html>
