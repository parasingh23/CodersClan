<%-- 
    Document   : all_users
    Created on : Apr 30, 2016, 12:28:59 AM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
       </head>
    <%@ include file="header.jsp" %>
    <body>
             
           
            <h1 class="jumbotron" style="background-color:white;text-align:center;color:lawngreen;"> <b>USERS</b></h1>
            <hr />
        
        <%
        
            Class.forName("com.mysql.jdbc.Driver");
                Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
                Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from users ORDER BY points DESC");
         int num=0;  
         
        while(rs.next()){
       String username=rs.getString("username");
       String photo=rs.getString("photo");
       String email=rs.getString("email");
       String point=rs.getString("points");
        
       num++;
        %>
       
               
        <div  style="font-size:20px; float:left; width:20%;text-align:center;padding-bottom:20px; "><img width="150" height="150"src="<%=photo%>" class="img-circle"><br>
            <div style="width:70%; margin: auto"><h3>#<%=num%></h3>
            <a href="user_profile1.jsp?username=<%=username%>"> <%=username%></a><br>
            <%=point%>&nbsp;points<br>
            </div>
       </div> 
       
       
            
      
        <%
        }
        
        %>
     
      
      
   
    </body>
</html>
