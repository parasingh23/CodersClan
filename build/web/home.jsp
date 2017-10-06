<%-- 
    Document   : home
    Created on : Apr 19, 2016, 3:31:31 PM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        
        <script>
            var XML;
            
         function view(obj){
             
             var category_name=obj.id;
           
          XML=new XMLHttpRequest();
          
          XML.open("GET","view_question_home.jsp?category_name="+category_name,true);
          XML.onreadystatechange=view1;
          XML.send();
          
             
         }
           
    
    function view1(){
            if(XML.readyState===4 && XML.status===200)
         {
        document.getElementById("question").innerHTML=XML.responseText;
        }
    }
            
        </script>
       
    </head>
    <body>
        <a href="all_users.jsp">Users</a>    
        
        <h1 class="jumbotron" style="text-align:center">Select Category</h1>
        <div class="container">
        
        <%
        
        Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category ");
               
        while(rs.next()){
        
        String category_name=rs.getString("category_name");
        String photo=rs.getString("photo");
      
        
     %>
     
        
     <div id="<%=category_name%>" onclick= "view(this) " class="category12" style="float:left; width:32%; text-align: center; margin-right: 10px;">
     <img style="width:100%; height:300px;" src="<%=photo%>" /> 
    <h3 ><%=category_name%> </h3>
     
     </div>
     
        
    
     <%
  }
     %>
        
        
        </div>
        
        
        
     <div id="question" style="margin:10px 100px;border:solid; padding:0px 50px; border-color:green;">
         <h2 style="text-align: center">Questions</h2>
         
     </div>
     
    </body>
</html>
