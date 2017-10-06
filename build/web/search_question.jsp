<%-- 
    Document   : search_question
    Created on : May 11, 2016, 1:09:05 AM
    Author     : PARASP
--%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
         <%@ include file="header.jsp" %>
    </head>
    <body>
             <h1 style="text-align:center;color:red;">Results</h1>
             
        <%
        
        
           String title=request.getParameter("title");
           title.toLowerCase();
           Class.forName("com.mysql.jdbc.Driver");
               Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
               Statement stmt7 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
               ResultSet rs7 = stmt7.executeQuery("select * from question where title LIKE'%"+title+"%'"+"OR keywords like'%"+title+"%'");
           if(rs7.next()){
                   
           Class.forName("com.mysql.jdbc.Driver");
               Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
               ResultSet rs = stmt.executeQuery("select * from question where title LIKE'%"+title+"%'"+"OR keywords like'%"+title+"%'");
        
               while(rs.next()){
                   
                String title1=rs.getString("title");  
           String keywords=rs.getString("keywords");
            String question_id=rs.getString("question_id");
            String description=rs.getString("description");
           String username=rs.getString("username");

            
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = stmt2.executeQuery("select count(*) As rowcount from answers where ans_question_id="+question_id+"");
          if(rs2.next()){
            int answer=rs2.getInt("rowcount");
             
         %>
          
         <div style="margin-top:30px;">
         <div style="border:groove;border-color:red;width:70px;height:50px;text-align:center;margin:auto;float:left;"><%=answer%> <br> answers</div>
 <div style="padding-bottom:30px;"><a href="view_question_detail.jsp?title=<%=title1%>&question_id=<%=question_id%>&username=<%=username%>
               " style="font-size:20px;padding-left:50px;"><%=title1%></a></div>
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
           }
               else{
                   
                
                        %>

                         <h2 style="text-align:center;margin-top:50px;">No result found</h2>
               
               <%}
               %>
               
         </div>
               
               
               
            
    </body>
</html>
