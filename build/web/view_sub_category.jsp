<%-- 
    Document   : view_sub_category
    Created on : Apr 12, 2016, 4:17:11 PM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Sub-Category</title>
        <script>
         var XML;
         function view(){
             var category_name=document.getElementById("category_name").value;
          XML=new XMLHttpRequest();
          
          XML.open("GET","view_sub_category_response.jsp?category_name="+category_name,true);
          XML.onreadystatechange=view1;
          XML.send();
          
             
         }
           
    
    function view1(){
      if(XML.readyState===4 && XML.status===200)
        {
        document.getElementById("content").innerHTML=XML.responseText;
        }
    }
            
        </script>
    </head>
    <body>
        <form action="view_sub_category_response.jsp" method="get">
            <table>
                <tr><th>Category</th>
                    <td><select onchange="return view()" id="category_name" >
                            <option>select category</option>
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
            
                    
                            <option><%=category_name%></option>
                            
                            
            
                        
                        
     <%
            } }
              catch(Exception e){
                      
                      e.printStackTrace();
                      } 
             
                %>
         
                        </select></td>
                </tr>
        
            </table>
                <div id="content">
               
           </div > 
           
                    
        </form>
         
   
    </body>
</html>
