<%-- 
    Document   : logout
    Created on : May 7, 2016, 3:56:22 AM
    Author     : PARASP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
         <% 
                                                                                                              if(session.getAttribute("Username")!=null) {
                                                                                                            request.getSession().invalidate();

                                                                                                            response.sendRedirect("admin_login.jsp");
                                                                                                              }
        %>
      
    </body>
</html>
