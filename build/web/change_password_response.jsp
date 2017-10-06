<%@page import="java.sql.*"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change_password_response</title>
    </head>
    <body>
        <%
               String username=session.getAttribute("Username").toString();
               String oldpassword=request.getParameter("oldpassword");
               String newpassword=request.getParameter("newpassword");
               String confirmpassword=request.getParameter("confirmpassword");
         
            Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           ResultSet rs = stmt.executeQuery("select * from admin where Username='"+username+"' and Password='"+oldpassword+"'");
           
         if(rs.next())
         {
             rs.updateString("Password",newpassword);
             rs.updateRow();
             response.sendRedirect("admin_login.jsp?msg=Password changed");
            }
                else
                {
                        response.sendRedirect("change_password.jsp?msg=Username or Password didn't match");
                        }
        
            
      
           %>   
           </body>
</html>
