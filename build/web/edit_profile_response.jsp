<%@page import="java.sql.*"%>
<%
    try{
            String username=request.getParameter("username");
            String email= request.getParameter("email");
            String phonenumber=request.getParameter("phonenumber");
            String birthday=request.getParameter("birthday");
            
            

                 Class.forName("com.mysql.jdbc.Driver");
            Connection bal =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt =bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           ResultSet rs =stmt.executeQuery("select * from users where username='"+username+"'");
               
                    if(rs.next())
         {
                     
                                        rs.updateString("email",email);
                                        rs.updateString("phonenumber",phonenumber);
                                        rs.updateString("birthday",birthday);
                            
                    rs.updateRow();
                
                        response.sendRedirect("edit_profile.jsp?msg=Changes done"); 
             
            }
                    else{
                    
                    response.sendRedirect("edit_profile.jsp?msg=Try Again");
                    
                    
                    } 
    }
    catch(Exception e){
    e.printStackTrace();}
    
%>