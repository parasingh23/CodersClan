<%@page import="java.sql.*"%>

<%
    
    String username=session.getAttribute("username").toString();
   String ans_id=request.getParameter("dislike_ans");
      String like_count_value=request.getParameter("dislike_count_value");
int dislike_count=Integer.parseInt(like_count_value);
dislike_count=dislike_count+1;   
   Class.forName("com.mysql.jdbc.Driver");
       Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
       Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
       ResultSet rs = stmt.executeQuery("select * from dislike_table where dislike_ans="+ans_id+" and dislike_username='"+username+"' ");
      
       if(rs.next()){
        
         
%>

alreadydisliked
<%
       }  
       else{
rs.moveToInsertRow();
rs.updateString("dislike_ans", ans_id);
rs.updateString("dislike_username",username);
rs.insertRow();

Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs2 = stmt2.executeQuery("select count(*) As rowcount from dislike_table where dislike_ans=" + ans_id + "");
    rs2.next();
    int count = rs2.getInt("rowcount");

    System.out.println(count);

    if (count !=10) {

    } else {
        Statement stmt3 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs3 = stmt3.executeQuery("select * from answers where answer_id=" + ans_id + "");

        rs3.next();
        String username1 = rs3.getString("ans_username");

        Class.forName("com.mysql.jdbc.Driver");
        Statement stmt5 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs5 = stmt5.executeQuery("select * from users where username='" + username1 + "'");
        rs5.next();
        int point = rs5.getInt("points");
        System.out.println(point);
        int point1 = point-10;
        System.out.println(point1);
        rs5.moveToCurrentRow();
        System.out.println(point1);
        rs5.updateInt("points", point1);
        System.out.println(point1);
        rs5.updateRow();
        System.out.println(point1);

    }
%>
        
<%=dislike_count%>

       <%
       }
       %>
       
      
