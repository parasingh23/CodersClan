<%@page import="java.sql.*"%>
<%
    String category_name= request.getParameter("category_name");
            String category_description= request.getParameter("category_description");
                   
            

                 Class.forName("com.mysql.jdbc.Driver");
            Connection bal =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt =bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           ResultSet rs =stmt.executeQuery("select * from category where category_name='"+category_name+"'");
               
                    if(rs.next())
         {
                     
                                        rs.updateString("category_name",category_name);
                                        rs.updateString("category_description",category_description);
                                        
                    
                    rs.updateRow();
                String photo=rs.getString("photo");
                        response.sendRedirect("edit_category.jsp?category_name="+category_name+"&category_description="+category_description+"&photo="+photo+"&msg=Changes Done"); 
             
            }
                    else{
                    
                    response.sendRedirect("edit_category.jsp?msg=Try Again");
                    
                    
                    } 
   
%>