<%@page import="java.sql.*"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change_password_response</title>
    </head>
    <body>
        <%
               String username=session.getAttribute("username").toString();
               String oldpassword=request.getParameter("oldpassword");
               String newpassword=request.getParameter("newpassword");
               String confirmpassword=request.getParameter("confirmpassword");
         
            Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           ResultSet rs = stmt.executeQuery("select * from co_admin where username='"+username+"' and password='"+oldpassword+"'");
           
         if(rs.next())
         {
             rs.updateString("password",newpassword);
             rs.updateRow();
             response.sendRedirect("co_admin_login.jsp?msg=Password changed");
            }
                else
                {
                        response.sendRedirect("changeco_password.jsp?msg=Username or Password didn't match");
                        }
        
            
      
           %>   
           </body>
</html>
