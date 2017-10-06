<%-- 
    Document   : edit_question
    Created on : Apr 18, 2016, 4:36:44 PM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
             <title>Edit Question</title>
             <%@include file="header1.jsp" %>
    </head>
    <body>
        <div class="container" style="padding-top:30px;">
       <div class="row">
                <div class="col-lg-3"></div>
                <div class="col-lg-6">
   <div style="border:groove;padding:30px;">
                    <div style="text-align:center;padding-bottom:20px;color:red;"><h2>Edit Question</h2></div>
      
      <form action="edit_question_response.jsp"  method="post" >
        
        <%
        String category_name=request.getParameter("category_name");
        String question_id=request.getParameter("question_id");
        %>
        
        
      <div class="form-group">
        <select name="category_name" class="form-control">
            <option><%=category_name%></option>
            
       <%
       try{
       Class.forName("com.mysql.jdbc.Driver");
           Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
           ResultSet rs = stmt.executeQuery("select * from category ");
           
              while(rs.next()){
               
               String dcategory_name= rs.getString("category_name");
               
                  if(!category_name.equals(dcategory_name))
                {
              %>
                 
                <option class="form-control"><%=dcategory_name%></option>                
                  
     <%
                }
                }
             }
              catch(Exception e){
                      
                      e.printStackTrace();
                      } 
             
                %>
                
             </select>
      </div>
             <%
             Class.forName("com.mysql.jdbc.Driver");
                 Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
                 Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                 ResultSet rs = stmt.executeQuery("select * from question where question_id="+question_id);
               if(rs.next()){
                 String title=rs.getString("title");
                String content= rs.getString("content");
                String description= rs.getString("description");
               String keywords=rs.getString("keywords");
           
             %>   
        
             <div class="form-group">
                 <label class="control-label">Title</label>
       <input type="text" value="<%=title%>" name="title" class="form-control" />
              <input type="text" value="<%=question_id%>" name="question_id" hidden />
             </div>
          
         <div class="form-group">    
       <textarea name="description"col="23" rows="10" class="form-control"><%=description%></textarea>
         </div>
         <div class="form-group">
       <textarea name="content" col="23" rows="10" class="form-control"><%=content%></textarea>
         </div>
         <div class="form-group">
       <input type="text" value="<%=keywords%>" name="keywords" required  class="form-control"/>
         </div>
            <div class="form-group">   
          <%
            String msg=request.getParameter("msg");
    if(msg!=null)
    {
    %>
    <h3 class="form-control"><%=msg%></h3>
    <%
    }
    %>      
            </div>         
     
         <div class="form-group">
       <input type="submit" value="EDIT" class="form-control btn btn-warning" />
         </div>      
          <%}
          %>     
    </form>  
     </div>
                  <div class="col-lg-6"></div>
       </div>
                   
   
    
   </div>
        </div>
    
    </body>
</html>
