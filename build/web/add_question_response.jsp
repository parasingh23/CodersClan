<%@page import="java.sql.*"%>
<%
    try{
   String username=session.getAttribute("username").toString();
  
   String category_name=request.getParameter("category_name"); 
   
   String title=request.getParameter("title"); 
  
   String description=request.getParameter("description"); 
  
   String content=request.getParameter("content"); 
   
   String keywords=request.getParameter("keywords"); 
   

  
 
            Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from question" );
            
            
        
            rs.next();
       
            rs.moveToInsertRow();
            rs.updateString("category_name", category_name);
            rs.updateString("title",title);
            rs.updateString("description",description);
            rs.updateString("content",content);
            rs.updateString("keywords", keywords);
            rs.updateString("username",username);
          
            rs.insertRow();
            
             Statement stmt1 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs1 = stmt1.executeQuery("select * from users where username='"+username+"'" );
            rs1.next();
           int point=rs1.getInt("points");
            
            point=point+10;
            
            
            
            rs1.moveToCurrentRow();
           rs1.updateInt("points",point);
           rs1.updateRow();
            
          
            
            response.sendRedirect("add_question.jsp?msg=Question added");
           
           
            
            }
      
            
       
            
     
    
    catch(Exception e){
    
    e.printStackTrace();
    
    }

%>