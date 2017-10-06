<%-- 
    Document   : recover_password
    Created on : May 3, 2016, 1:54:56 AM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recover Password</title>
    </head>
    <body>
        <%
            String security_answer = request.getParameter("security_answer");
            String username = request.getParameter("username");
            String email = request.getParameter("email");

            Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from users where security_answer='" + security_answer + "'and email='" + email + "' ");
            if (rs.next()) {

                String password = rs.getString("password");
                String phonenumber = rs.getString("phonenumber");

                vmm2.SimpleMailDemo obj = new vmm2.SimpleMailDemo(email, "Mail From Coders Clan", "Your password is: " + password);
                vmm2.SMSSender obj1 = new vmm2.SMSSender(phonenumber, "Your password is: " + password, "text");
                Thread t = new Thread(obj1);
                t.start();
                response.sendRedirect("user_login.jsp?msg=Your password has been sent to your mail and phone");
            } else {
                response.sendRedirect("forget_password.jsp?msg=Wrong security answer or email");
        %>


        <%}%>
    </body>
</html>
