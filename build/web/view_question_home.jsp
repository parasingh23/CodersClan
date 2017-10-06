<%@page import="java.sql.*"%>
<%@page import="java.util.StringTokenizer"%>
<%

         String category_name=request.getParameter("category_name");
           %>
<h2 style="text-align: center;color:red;padding-bottom:20px;"><%=category_name%> Questions</h2>

           
           <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt3 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs3 = stmt3.executeQuery("select * from question where category_name='"+category_name+"'");
           if(rs3.next()){
                                             
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from question where category_name='"+category_name+"'");
         
             int count=0;
            while(rs.next()){
             count++;
            String description=rs.getString("description");
            String question_id=rs.getString("question_id");
            String title=rs.getString("title");
            String username=rs.getString("username");
            String keywords=rs.getString("keywords");
            
            if(count==16){
            break;
            }
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
                     
       <HR>
       <%}}
           }
           else{%>
                      
<h3>No Questions yet</h3>

<%
           }
%>
         
