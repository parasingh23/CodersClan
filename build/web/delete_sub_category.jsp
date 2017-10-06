<%-- 
    Document   : delete_sub_category
    Created on : Apr 12, 2016, 11:50:42 PM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Sub-Category</title>
    </head>
    <body>
       <%
            
            
          try{ 
              String sub_category_name=request.getParameter("sub_category_name");
            Class.forName("com.mysql.jdbc.Driver");

        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from sub_category  where sub_category_name='"+sub_category_name+"'");
         if(rs.next())
         {
         
         
         rs.deleteRow();
         
         response.sendRedirect("view_sub_category.jsp?msg= Sub-Category deleted");
         
         
         
         }
          }
          
          catch(Exception e){
          
          
         e.printStackTrace();
          
          
          }
         %>
         
    </body>
</html>
