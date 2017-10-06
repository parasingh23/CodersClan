<%-- 
    Document   : view_my_question
    Created on : Apr 18, 2016, 10:46:35 AM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Questions</title>
         <%@include file="header1.jsp" %>
    <body>
            <div class="container" style="padding-top:30px;">
                <h1 style="color:red;text-align:center;">My Questions</h1>
       <%
       String username=session.getAttribute("username").toString();
       Class.forName("com.mysql.jdbc.Driver");
        
        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt1= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs1 = stmt1.executeQuery("select * from question where username='"+username+"'");
               if(rs1.next()){
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from question where username='"+username+"'");
          
       while(rs.next())
  {
       String title=rs.getString("title");
       String description=rs.getString("description");
       String category_name=rs.getString("category_name");
       String question_id=rs.getString("question_id");
  
       %>
       <div style="padding:50px;">
           <a href="edit_question.jsp?category_name=<%=category_name%>&question_id=<%=question_id%>"><h2><%=title%></h2></a>
       <p style="font-size:20px;"><%=description%></p>
       <hr />
       </div>
       
       <%
       
}
               }
               else{
       %>
       <h3>No Question yet</h3>
       <%}%>
            </div>
    </body>
</html>
