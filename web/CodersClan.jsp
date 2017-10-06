<%-- 
    Document   : CodersClan
    Created on : May 4, 2016, 6:22:20 PM
    Author     : PARASP
--%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Coders Clan</title>
    <%@include file="header.jsp" %>

</head>
<body>

<!-- banner -->
<div class="banner">
	<div class="container">
		<script src="js/responsiveslides.min.js"></script>
			<script>
									// You can also use "$(window).load(function() {"
									$(function () {
									 // Slideshow 4
									$("#slider3").responsiveSlides({
										auto: true,
										pager: true,
										nav: false,
										speed: 500,
										namespace: "callbacks",
										before: function () {
									$('.events').append("<li>before event fired.</li>");
									},
									after: function () {
										$('.events').append("<li>after event fired.</li>");
										}
										});
										});
								</script>

			<div  id="top" class="callbacks_container">
				<ul class="rslides" id="slider3">
					<li>
						<div class="banner-info">
							<h3>Talk is cheap,show us the code</h3>
						</div>
					</li>
					<li>
						<div class="banner-info">
							<h3>Learning Online Becomes Easier And Faster</h3>
						</div>
					</li>
					<li>
						<div class="banner-info">
							<h3>Make A Huge Difference Start Your Career journey With Us</h3>
						</div>
					</li>
					<li>
						<div class="banner-info">
							<h3>while(!(succeed=try()));</h3>
						</div>
					</li>
				</ul>
			</div>
	</div>
</div>
<!-- //banner -->


<!-- our facilities -->
<div class="facilities">
	<div class="container">
                <div style="float:right;font-size:25px;"><a href="all_categories.jsp">All Categories</a></div>
		<h3 class="tittle">Categories</h3> 
			<script src="js/jquery.swipebox.min.js"></script> 
			<script type="text/javascript">
				  var XML;
            
         function view(obj){
             var category_name=obj.id;
           
             
          XML=new XMLHttpRequest();
          
          XML.open("GET","view_question_home.jsp?category_name="+category_name,true);
          XML.onreadystatechange=view1;
          XML.send();
          
             
         }
           
    
    function view1(){
            if(XML.readyState===4 && XML.status===200)
         {
        document.getElementById("question").innerHTML=XML.responseText;
        }
    }		
    
    
                                                                                                       jQuery(function($) {
							$(".swipebox").swipebox();
						});
			</script>
                        
                         <%
        
        Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category ");
            int count1=0;   
        while(rs.next())
        {
        count1++;
        String category_name=rs.getString("category_name");
        String photo=rs.getString("photo");
        String description=rs.getString("category_description");
      if(count1==10)
      {
      
      break;
      }
     %>
                        
     <div class=" view ih-item square effect6 from_top_and_bottom category12" style="height:300px; cursor:pointer" ><a id="<%=category_name%>" onclick="view(this)">
        <div class="img"><img style="width:100%; height:300px;" src="<%=photo%>" alt="img"></div>
        <div class="info">
          <h3><%=category_name%></h3>
          <p><%=description%></p>
        
        </div></a></div>

               
                
                <%}%>
				
				
				<div class="clearfix"></div>
	</div>
</div>
<!-- //our facilities -->
<!-- features -->
<div class="features">
	<div class="container" id="question">
	 <h2 style="text-align: center;color:red;font-family: 'Open Sans', sans-serif;">Questions</h2>
         <%
         
         Class.forName("com.mysql.jdbc.Driver");
            Statement stmt1 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs1 = stmt1.executeQuery("select * from question ORDER BY question_id DESC ");
          
            int count=0;
         
            while(rs1.next()){
               
              count++;  
                
            String title=rs1.getString("title");
           String keywords=rs1.getString("keywords");
            String question_id=rs1.getString("question_id");
            String description=rs1.getString("description");
                            
                             
            String username=rs1.getString("username");

            if(count==11){
            break;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = stmt2.executeQuery("select count(*) As rowcount from answers where ans_question_id="+question_id+"");
          if(rs2.next()){
            int answer=rs2.getInt("rowcount");
             
         %>
         
         <div>
             
             <div style="border:groove;border-color:red;width:70px;height:50px;text-align:center;margin:auto;float:left;"><%=answer%> <br> answers</div>   
             <div style="padding-left:50px;padding-bottom:30px;"> <a href="view_question_detail.jsp?title=<%=title%>&question_id=<%=question_id%>&username=<%=username%>
                                                                     " style="padding-left:50px;font-size:20px;"><%=title%></a></div>
                      <div style="background-color:whitesmoke;padding:10px;"><%=description%> </div>
             </div><br>
                      
                          
                      <% 
                      StringTokenizer keyword = new StringTokenizer(keywords," " );
                           
                             while (keyword.hasMoreTokens()) {  
          
       String key= keyword.nextToken();%>
                      
                          <div style="padding-top:30px;padding-left:100px;"> <span style="background-color:lightgreen;padding:8px;"><%=key%></span></div>
                          
                              <%}%>
                      
                 <hr />
         <%
          
                             }
            }
            
            %>
         
	</div>
</div>
         
     
	
		<div class="clearfix"></div>
        </div></div>
</div>
<!-- //features -->
<%--<%@ include file="footer.jsp" %>--%>


</body>
</html>

