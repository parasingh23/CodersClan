
<%@page import="java.sql.*"%>
<%

String username=session.getAttribute("username").toString();
String comment=request.getParameter("comment");
String ans_id=request.getParameter("answer_id");


Class.forName("com.mysql.jdbc.Driver");
    Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
    Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from comments");
    
    rs.next();
    rs.moveToInsertRow();
    rs.updateString("comment",comment);
    rs.updateString("answer_id",ans_id);
    rs.updateString("com_username",username);
    rs.insertRow();
 
    Statement stmt1 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs1 = stmt1.executeQuery("select * from comments where answer_id="+ans_id+"");
   
%>


                 <h3> Earlier Comments </h3>

   <%
    while(rs1.next()){
        String comment1=rs1.getString("comment");
        String com_username=rs1.getString("com_username");
        String date=rs1.getString("date");
     date = date.substring(0,date.length()-1);
%>
        <span><%=comment1%></span>
            
                 <span style="float:right;">   <%=date%></span>
                 <a href="user_profile1.jsp?username=<%=com_username%>" style="float:right;"><span>-</span><%=com_username%></a>

                 <hr>
     
   

<%
    }
 %>