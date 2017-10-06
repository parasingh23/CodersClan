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
        <title>Delete Category</title>
    </head>
    <body>
        
        
        
        <%
            
            
          try{ 
              String category_name=request.getParameter("category_name");
            Class.forName("com.mysql.jdbc.Driver");

        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category  where category_name='"+category_name+"'");
         if(rs.next())
         {
         
         
         rs.deleteRow();
         
         response.sendRedirect("view_category.jsp?msg= Category_deleted");
         
         
         
         }
          }
          
          catch(Exception e){
          
          
         e.printStackTrace();
          
          
          }
         %>
         
    </body>
</html>
