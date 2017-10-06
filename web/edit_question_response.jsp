<%@page import="java.sql.*"%>
<%
String category_name=request.getParameter("category_name");
String title=request.getParameter("title");
String description=request.getParameter("description");
String content=request.getParameter("content");
String keywords=request.getParameter("keywords");
String question_id=request.getParameter("question_id");
System.out.println(title);
System.out.println(question_id);
System.out.println(category_name);
Class.forName("com.mysql.jdbc.Driver");
    Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
    Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from question where question_id='"+question_id+"' ");
               
if(rs.next()){

rs.updateString("category_name",category_name );
rs.updateString("title",title);
rs.updateString("description",description );
rs.updateString("content",content);
rs.updateString("keywords",keywords);
rs.updateRow();
response.sendRedirect("view_my_question.jsp?msg=Changes Done");

}

%>