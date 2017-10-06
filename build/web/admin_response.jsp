
<%@page import="java.sql.*"%>

<%
    String username=request.getParameter("username");
String password=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
            
           Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           ResultSet rs = stmt.executeQuery("select * from admin where Username='"+username+"' and Password='"+password+"'");
           
       
               
           
           
            if(rs.next()){
           session.setAttribute("Username",username);
           response.sendRedirect("admin_home.jsp?username="+username);
           
           }
           else{
           
           response.sendRedirect("admin_login.jsp?msg=Username or password you have entered didn't match");
           
           
           }











%>


