<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Tutelage Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="glyph.css" rel="stylesheet" type="text/css"/>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/swipebox.css">

<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/modernizr.custom.js"></script>

<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Alegreya:400,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link href="css/ihover.css" rel="stylesheet" type="text/css"/>
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
							 <% 
                                                                                                              if(session.getAttribute("username")!=null) {
                                                                                                             String sessionusername=(String)session.getAttribute("username");
           
        %>
	 <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><%=sessionusername%><span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li><a href="edit_profile.jsp">Edit Profile</a></li>
            <li><a href="change_user_password.jsp">Change Password</a></li>
         
            <li><a href="user_profile1.jsp?username=<%=sessionusername%>">My Profile</a></li>
            <li><a href="view_my_question.jsp">My Questions</a></li>
            <li><a href="logout.jsp">Logout</a></li>
        </ul>
             
         <li><input  class="form-group inner-addon right-addon"  style="width:150px;height:30px;margin-top: 20px;" type="text"  placeholder="Enter your question..." value="" id="search">
             <i class="glyphicon glyphicon-search" style="" onclick="search()"></i>     </div>                               </li>
             <%}
                                                                                                              else{%>
                                                                                                
             
         <a class=" btn btn-primary" href="user_sign_up.jsp" style="border:solid;padding-left:30px;padding-right:30px;">Signup</a>
           <a class=" btn btn-warning" href="user_login.jsp" style=" border:solid;;padding-left:30px;padding-right:30px;">Login</a>
             
        <input  class="form-group"  style="width:150px;height:30px;margin-top: 20px;" type="text"  placeholder="Enter your question..." value="" id="search">
                                                                <i class="glyphicon glyphicon-search" onclick="search()" style="cursor:pointer;"></i>                                   
                                                                                                       <%}%>
                                                                                                       
                                                                   
						</ul>
						<div>
								
                                                             
							
						
	
					</div> <!-- /navbar-collapse -->
					<!-- search-scripts -->
					<script src="js/classie.js"></script>
					<script src="js/uisearch.js"></script>
						<script>
							
                                                        function search(){
                                                          
                                                        var title=document.getElementById("search").value;    
                                                           
                                                            window.location="search_question.jsp?title="+title+"&keywords="+title;
                                                            
                                                        }
                                                        
                                                  
                                                        
                                                        
						</script>
					<!-- //search-scripts -->
					
				</nav>
			</div>
		</div>
</div>
<!-- header -->



<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
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
