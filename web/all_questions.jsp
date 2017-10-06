<%-- 
    Document   : all_questions
    Created on : May 10, 2016, 11:30:02 PM
    Author     : PARASP
--%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Questions</title>
        <%@ include file="header.jsp" %>
    </head>
    <body>
        <div class="features">
	<div class="container" id="question">
	 <h2 style="text-align: center;color:red;font-family: 'Open Sans', sans-serif;">Questions</h2>
         <%
         
         Class.forName("com.mysql.jdbc.Driver");
         Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt1 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs1 = stmt1.executeQuery("select * from question ORDER BY question_id DESC ");
          
           
         
            while(rs1.next()){
               
               
                
            String title=rs1.getString("title");
           String keywords=rs1.getString("keywords");
            String question_id=rs1.getString("question_id");
            String description=rs1.getString("description");
           String username=rs1.getString("username");

            
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = stmt2.executeQuery("select count(*) As rowcount from answers where ans_question_id="+question_id+"");
          if(rs2.next()){
            int answer=rs2.getInt("rowcount");
             
         %>
         
         <div style="border:groove;border-color:red;width:70px;height:50px;text-align:center;margin:auto;float:left;"><%=answer%> <br> answers</div>
 <div style="padding-bottom:30px;"><a href="view_question_detail.jsp?title=<%=title%>&question_id=<%=question_id%>&username=<%=username%>
               " style="font-size:20px;padding-left:50px;"><%=title%></a></div>
       <p style="background-color:whitesmoke;"><%=description%></p>
       
        <% 
                      StringTokenizer keyword = new StringTokenizer(keywords," " );
                           
                             while (keyword.hasMoreTokens()) {  
          
       String key= keyword.nextToken();%>
                      
                          <div style="padding-top:30px;padding-left:100px;"> <span style="background-color:lightgreen;padding:8px;"><%=key%></span></div>
                          
       
                              <%}%>
                     
       <HR />
         <%
          
                             }
            }
            
            %>
         
	</div>
</div>
        
        
        
        
        
        
        
      
    </body>
</html>
