<%-- 
    Document   : add_question
    Created on : Apr 17, 2016, 7:36:02 AM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add Question</title>
        <%@include file="header1.jsp" %>
	</head>
<body>
    
       
   <div class="container" style="padding-top:30px;">
       <div class="row">
                <div class="col-lg-3"></div>
                <div class="col-lg-6">
        <form action="add_question_response.jsp" method="post" role="form">
     <div style="border:groove;padding:30px;">
                    <div style="text-align:center;"><h2>Add Question</h2></div>
              <div class="form-group">
                  <label class="control-label">   Category </label>
                  <select name="category_name" class="form-control">
                
                         <% 
            try{
                
         
        Class.forName("com.mysql.jdbc.Driver");
        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category");
         
            while(rs.next())
          
            {
                String category_name=rs.getString("category_name");
                %>
                  
                            <option class="form-control"><%=category_name%></option>
                    
     <%
            } }
              catch(Exception e){
                      
                      e.printStackTrace();
                      } 
            
                %>
                
                  
                      </select>
              </div>
         <div class="form-group">
             <label class="control-label"> Title </label>
             <input type="text" value="" name="title" required class="form-control" />
         </div>
         <div class="form-group">
             <label class="control-label"> Description</label>
             <textarea name="description" col="23" rows="10" class="form-control"></textarea>
         </div>
                <div class="form-group">
                    <label class="control-label">  Content </label>
             <textarea name="content" col="23" rows="10" class="form-control" ></textarea>
                </div>
                
                <div class="form-group">
                    
                    <label class="control-label">  Keywords </label>
                    <input type="text" value="" name="keywords" required class="form-control" />
                </div>
                <div class="form-group">
                    
            <input type="submit" value="Add Question"  class="form-control btn btn-warning">
                </div>
         
                <div class="form-group"><%
            String msg=request.getParameter("msg");
    if(msg!=null)
    {
    %>
    <h3 style="color:dodgerblue;text-align:center;"><%=msg%></h3>
    <%
    }
    %>
                </div>
         
         
     </div>
    </form>
                </div>
                  <div class="col-lg-6"></div>
       </div>
                   
   
    
   </div>
    </body>
</html>
