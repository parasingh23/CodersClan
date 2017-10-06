<%-- 
    Document   : user_profile
    Created on : Apr 30, 2016, 1:01:31 AM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Profile</title>
    </head>
    <body>
      <%
      
      String username=request.getParameter("username");
    
      Class.forName("com.mysql.jdbc.Driver");
          Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
          Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
          ResultSet rs = stmt.executeQuery("select * from users where username='"+username+"'");
           if(rs.next()) {   
          
               String username1=rs.getString("username");
               String photo=rs.getString("photo");
               String email=rs.getString("email");
               String point=rs.getString("points");
           
      %>
      
      <div><img width="150"height="150" src="<%=photo%>"</div>  
      <div><%=username%><br>
          <%=point%>points<br>
          <%=email%><br>
      </div>
      <%}%>
      
      
      
      <%
     
           if(session.getAttribute("username")!=null)
           {
      Class.forName("com.mysql.jdbc.Driver");
          Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
          ResultSet rs2 = stmt2.executeQuery("Select * from hit_count where hit_username='"+username+"' ");
          
          int hitsCount=0;
          
          if(rs2.next())
          {
             
                 hitsCount =rs2.getInt("hit_counter");
              
              hitsCount+=1;   
              
               rs2.moveToCurrentRow();
               rs2.updateInt("hit_counter",  hitsCount);
               rs2.updateRow();
    }
      else{
  
       rs2.moveToInsertRow();
       rs2.updateInt("hit_counter",0);
       rs2.updateString("hit_username",username);
       rs2.insertRow();
 
          
          
          }
  
%>
      
<div><%=hitsCount%>profile views</div> 
<%
           }
           else{
 
               
           }  
               
%>

<h1>Questions</h1><br>
<%

Class.forName("com.mysql.jdbc.Driver");
   
    Statement stmt3= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs3= stmt3.executeQuery("select * from question where username='"+username+"'");
         if(rs3.next())
         {
               
             Class.forName("com.mysql.jdbc.Driver");
                 Statement stmt4 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                 ResultSet rs4= stmt4.executeQuery("select * from question where username='"+username+"'");
               
               while(rs4.next())
               {
             String title=rs4.getString("title");  
             String user=rs4.getString("username");  
             int question_id=rs4.getInt("question_id");  
  
%>

<a href="view_question_detail.jsp?title=<%=title%>&question_id=<%=question_id%>&username=<%=username%>"><%=title%><br></a>

<%}
         }
         else{
    %>
  
    <h2>No Questions added</h2>
        
   <%}%>
<%

Class.forName("com.mysql.jdbc.Driver");
   
    Statement stmt5= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs5= stmt5.executeQuery("select * from answers where ans_username='"+username+"'");

    while(rs5.next()){
        String answer=rs5.getString("answers");
         int ans_question_id=rs5.getInt("ans_question_id");
         
         Class.forName("com.mysql.jdbc.Driver");
             Statement stmt6 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs6 = stmt6.executeQuery("select * from question where question_id='"+ans_question_id+"' ");
               rs6.next();
              
     String title=rs6.getString("title");          
%>

<a href="view_question_detail.jsp?title=<%=title%>&question_id=<%=ans_question_id%>&username=<%=username%>"><%=title%></a>
<h3><%=answer%></h3>

<%}%>

<% 
    Statement stmt10 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs10 = stmt10.executeQuery("select * from users ORDER BY points DESC");
         int num=1;  
         System.out.println(request.getParameter("username"));
        while(rs10.next())
        {
            if(request.getParameter("username").equals(rs10.getString("username")))
            {
               break; 
            
                    
            }
            
            num++;
        }
%>
<%=num%> rank
    </body>
</html>
