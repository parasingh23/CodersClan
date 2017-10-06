<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
        <script>
            function go1(){
                
             var newpassword=document.getElementById("id3").value;
             var confirmpassword=document.getElementById("id4").value;
if(newpassword===confirmpassword)
{
    
 return true;
    
}
else{
   
     return false;
    
}
                
            }
            </script>
            <%@include file="header1.jsp" %>
	</head>
<body>
        
         <div class="container" style="padding-top:100px;">
            <div class="row">
            <div class="col-lg-3"></div>
            <div class="col-lg-6">
        <% String sessionusername1=(String)session.getAttribute("username");%>
        
        
            <form action="change_user_password_response.jsp" method="get" id="form"> 
               
                <div style="padding:20px;border:groove;">
                <div class="form-group">
                    
                <label class="control-label"> Username </label> 
                <input type="text" value="<%=sessionusername1%>" class="form-control" readonly />
                   
                </div>
                    
                <div class="form-group">
                     <label class="control-label"> Old password </label>
                    <input type="password"  value="" name="password" class="form-control" />
                    </div>
                
                <div style="color:red;margin:10px 0px 0px 10px">
        <%
        String msg=request.getParameter("msg");
        if(msg!=null)
        {
            %>
            
            <h3><%=msg%></h3>
            <%
        }
        %>
        </div>
               
                
                <div class="form-group">
                <label class="control-label"> New password</label>
                    <input type="password" name="newpassword" required id="id3" class="form-control" />
                </div>
                
                <div class="form-group">
                <label class="control-label"> Confirm password</label>
                <input type="password"  value="" name="confirmpassword" required id="id4" class="form-control"/>
                </div>
                
                <div class="form-group">
                    <input type="submit" value="Change password"  required onclick="return go1()"  class="form-control btn btn-success"/> 
                </div>
</form>
            </div>
            </div>
                <div class="col-lg-6"></div>
            </div>
                
        
           
                
                
        
        
    </body>
    
    
</html>
