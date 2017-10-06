<%-- 
    Document   : delete_category
    Created on : Apr 11, 2016, 1:57:18 AM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Co-Admin</title>
    </head>
    <body>
        
        
        
        <%
            
            
          try{ 
              String username=request.getParameter("username");
            Class.forName("com.mysql.jdbc.Driver");

        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from co_admin where username='"+username+"'");
         if(rs.next())
         {
         
         
        
         rs.deleteRow();
         
         response.sendRedirect("view_co_admin.jsp?msg= Co-Admin deleted");
         
         
         
         }
          }
          
          catch(Exception e){
          
          
         e.printStackTrace();
          
          
          }
         %>
         
    </body>
</html>
