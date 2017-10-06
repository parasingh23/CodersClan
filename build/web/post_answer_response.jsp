<%@page import="java.sql.*"%>

<%
String username=session.getAttribute("username").toString();
String ans_question_id=request.getParameter("question_id");
String answer=request.getParameter("answer");


Class.forName("com.mysql.jdbc.Driver");
    Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
    Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from answers");
    rs.next();
    
    rs.moveToInsertRow();
    
    
    rs.updateString("answers",answer);
    rs.updateString("ans_username",username);
    rs.updateString("ans_question_id", ans_question_id);
    rs.updateInt("vote",0);
    rs.insertRow();
    
     Class.forName("com.mysql.jdbc.Driver");
    Statement stmt10= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                     ResultSet rs10 = stmt10.executeQuery("select * from users where username='"+username+"'");
               
                if(rs10.next()){
               int point=rs10.getInt("points");

 point=point+20;
rs10.moveToCurrentRow();
rs10.updateInt("points",point);
rs10.updateRow();

                }             
                    
                    

    
   Statement stmt1 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs1 = stmt1.executeQuery("select * from answers where ans_question_id="+ans_question_id+"");
    %>
    
    <h1>Answers</h1>

   <%
    while(rs1.next()){ 
        
        String answer1=rs1.getString("answers");
        answer1 = answer1.replaceAll("~!@", "\n");
        
        String ans_username=rs1.getString("ans_username");
        String date=rs1.getString("date1");
        date = date.substring(0,date.length()-5);
        String answer_id=rs1.getString("answer_id");
        int vote1=rs1.getInt("vote");
        
           Class.forName("com.mysql.jdbc.Driver");
              Statement stmt8 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
              ResultSet rs8 = stmt8.executeQuery("select count(*) As rowcount from like_table where ans_id="+answer_id+"");
            if(rs8.next()){
           int count3= rs8.getInt("rowcount");
           
            
                  
                  
          Class.forName("com.mysql.jdbc.Driver");
              Statement stmt9 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
              ResultSet rs9 = stmt9.executeQuery("select count(*) As rowcount from dislike_table where dislike_ans="+answer_id+"");
            if(rs9.next()){
           int count4= rs9.getInt("rowcount");
           vote1=count3-count4; 
            }
                       
            }
           
            rs1.moveToCurrentRow();
            rs1.updateInt("vote", vote1);
            rs1.updateRow();
            
            
        
        
        
%>
         <b>  <%=vote1%> votes  </b>
         <div >  <pre><xmp style="white-space: pre-wrap">  <%=answer1%> </xmp></pre> </div>
             <div class="answer_detail" >
                 
                  
                 <a href="user_profile1.jsp?username=<%=ans_username%>"><span>-</span><%=ans_username%></a>
    <h6><%=date%></h6>
    
    
             </div>


  <div id="like" class="inner-addon left-addon">
        <%
        Class.forName("com.mysql.jdbc.Driver");
           
            Statement stmt4 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs4 = stmt4.executeQuery("select count(*) As rowcount from like_table where ans_id="+answer_id+"");
            if(rs4.next()){
           int count= rs4.getInt("rowcount");   
            
        %>
        
        
        <h3 id="like_count<%=answer_id%>" style="padding-left:35px;"><%=count%></h3>
        <input type="text" id="like_count_value" hidden value="<%=count%>" />
        <%}%>
        <button type="button" class="btn btn-primary btn-lg btn3d" style="width:80px;height:30px;padding-left:30px;padding-bottom:30px;"  id="<%=answer_id%>" onclick="count(this)"><span class="glyphicon glyphicon-thumbs-up" style="top:0px"></span>Like</button>
       
    
   
    </div>
    
    
    
    <div id="dislike" class="inner-addon left-addon">
        <%
        Class.forName("com.mysql.jdbc.Driver");
           
            Statement stmt5 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs5 = stmt5.executeQuery("select count(*) As rowcount from dislike_table where dislike_ans="+answer_id+"");
            if(rs5.next()){
           int count= rs5.getInt("rowcount");   
            
        %>
        
        
        
        <h3 id="dislike_count<%=answer_id%>" style="padding-left:35px;"><%=count%></h3>
        <input type="text" id="dislike_count_value" hidden value="<%=count%>" />
        <%}%>
         <button type="button" class="btn btn-danger btn-lg btn3d" style="width:90px;height:30px;padding-left:30px;padding-bottom:30px;"  id="<%=answer_id%>" onclick="count2(this)"><span class="glyphicon glyphicon-thumbs-down" style="top:0px"></span>Dislike</button>

 
   
    </div>
    
    
    
    <div id="commentsec<%=answer_id%>">
                 <h3 style="padding-top:10px;padding-bottom:20px;"> Earlier Comments </h3>
                 
               <%
               
                Statement stmt3 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
              ResultSet rs3 = stmt3.executeQuery("select * from comments where answer_id="+answer_id+"");
              
             while(rs3.next()){
                 
             String comment1=rs3.getString("comment");
             String com_username=rs3.getString("com_username");
             String date1=rs3.getString("date");
             date1 = date.substring(0,date.length()-5);
            
             %>

             <span><%=comment1%></span>
            
                 <span style="float:right;">   <%=date1%></span>
                 <a href="user_profile1.jsp?username=<%=com_username%>" style="float:right;"><span>-</span><%=com_username%></a>

                 <hr>
            <%}%> 
    </div>        
     <textarea id="comment<%=answer_id%>"></textarea>
             <input type="button" value="Add Comment" id="<%=answer_id%>" onclick="add(this)" />
            
              
             
             <hr>

<%
    }
 %>


    