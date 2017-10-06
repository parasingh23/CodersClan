<%@page import="java.sql.*"%>
<%
    
    String email = request.getParameter("email");
    Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from users where email='"+email+"'");
            if (rs.next()) {

                String username = rs.getString("username");
                String phonenumber = rs.getString("phonenumber");

                vmm2.SimpleMailDemo obj = new vmm2.SimpleMailDemo(email, "Mail From Coders Clan", "Your username is: " + username);
                vmm2.SMSSender obj1 = new vmm2.SMSSender(phonenumber, "Your username is: " + username, "text");
                Thread t = new Thread(obj1);
                t.start();
                response.sendRedirect("user_login.jsp?msg=Your username has been sent to your mail and phone");
            } else {
                response.sendRedirect("forgot_username.jsp?msg=Wrong email");
            }
    
    %>