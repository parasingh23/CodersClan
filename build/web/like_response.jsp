<%@page import="java.sql.*"%>

<%

    String username = session.getAttribute("username").toString();
    String ans_id = request.getParameter("answer_id");
    String like_count_value = request.getParameter("like_count_value");
    int like_count = Integer.parseInt(like_count_value);
    like_count = like_count + 1;
    Class.forName("com.mysql.jdbc.Driver");
    Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
    Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from like_table where ans_id=" + ans_id + " and like_username='" + username + "' ");

    if (rs.next()) {


%>

alreadyliked
<%} else {
    rs.moveToInsertRow();
    rs.updateString("ans_id", ans_id);
    rs.updateString("like_username", username);
    rs.insertRow();

  Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs2 = stmt2.executeQuery("select count(*) As rowcount from like_table where ans_id=" + ans_id + "");
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
        int point1 = point + 30;
        System.out.println(point1);
        rs5.moveToCurrentRow();
        System.out.println(point1);
        rs5.updateInt("points", point1);
        System.out.println(point1);
        rs5.updateRow();
        System.out.println(point1);

    }
%>
<%=like_count%>
<%
    }%>



<%

  


%>
