<%-- 
    Document   : user_home
    Created on : Apr 15, 2016, 2:25:56 PM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
      
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
   
         String username=session.getAttribute("username").toString();
          %>
          
          <div class="demo-wrapper css3-bounce-effect">
		<div class="css3-notification">
        <h1>Welcome  <%=username%> </h1>
        </div>
          </div>
        <table>  
    <tr>
        <td><a href="change_user_password.jsp?username=<%=username%>">Change Password </a> </td></tr>
    <tr><td><a href="edit_profile.jsp">Edit Profile</a></td>
    </tr>
    <tr><td><a href="add_question.jsp">Add Question</a></td></tr>
     <tr><td><a href="view_my_question.jsp">View My Question</a></td>
    </tr>
    </body>
</html>


