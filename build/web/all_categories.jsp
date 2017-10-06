<%-- 
    Document   : all_categories
    Created on : May 10, 2016, 9:11:23 PM
    Author     : PARASP
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>All Categories</title>

    <%@include file="header.jsp" %>

        <script>
            function view(obj){
               
           var category_name=obj.id;
                
             window.location="category_questions.jsp?category_name="+category_name;   
                
            }
            
            
        </script>
</head>
<body>

<div class="facilities" style="text-align:center;background-color:white;">
<div class="container">
    <h3 class="title" style="padding-right:120px;color:crimson;font-size:30px;padding-bottom:30px;"><b>All Categories</b></h3>
                <%
        
        Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category ");
           
        while(rs.next())
        {
        
        String category_name=rs.getString("category_name");
        String photo=rs.getString("photo");
      String description=rs.getString("category_description");
     
     %>
     
                        
     <div class=" view ih-item square effect6 from_top_and_bottom category12" style="height:300px; cursor:pointer" ><a id="<%=category_name%>" onclick="view(this)">
        <div class="img"><img style="width:100%; height:300px;" src="<%=photo%>" alt="img"></div>
        <div class="info">
          <h3><%=category_name%></h3>
          <p><%=description%></p>
        </div></a></div>

               
                
                <%}%>
                
                
                
               
</div>
</div>
    </body>
</html>
