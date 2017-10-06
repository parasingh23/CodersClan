<%-- 
    Document   : edit_profile
    Created on : Apr 16, 2016, 3:00:49 PM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Edit Profile</title>
<%@include file="header1.jsp" %>
<script>
    $("#mydate").validate();
</script>

</head>
<body>
        
           
            <%
         String username=session.getAttribute("username").toString();
                Class.forName("com.mysql.jdbc.Driver");
        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from users where username='"+username+"'");
            
            if(rs.next()){
            
            String email=rs.getString("email");
            String phonenumber=rs.getString("phonenumber");
            String birthday=rs.getString("birthday");
            String photo=rs.getString("photo");
        
            
        
            
            %>
           <div class="about">
	<div class="container">
             <div class="row">
                <div class="col-lg-3"></div>
                <div class="col-lg-6">
            <form action="edit_profile_response.jsp " method="get" id="form" id="form">
					<div class="help-info">
						<h2 class="tittle">Edit Profile</h2>
					</div>
		
						
					<div class="form-group">
            <label class="control-label">Username</label>
            <input type="text" value="<%=username%>" name="username" class="form-control" readonly>
            </div>
            <div class="form-group">
                <label class="control-label">Email</label>
                <input type="email" value="<%=email%>" name="email" required class="form-control" />
            </div>
          
            <div class="form-group">
            <label class="control-label">Phone</label>
            <input type="tel" value="<%=phonenumber%>" maxlength="10"name="phonenumber" required class="form-control" onkeydown="return ( event.ctrlKey || event.altKey 
                    || (47<event.keyCode && event.keyCode<58 && event.shiftKey===false) 
                    || (95<event.keyCode && event.keyCode<106)
                    || (event.keyCode===8) || (event.keyCode===9) 
                    || (event.keyCode>34 && event.keyCode<40) 
                    || (event.keyCode===46) )" />
            </div>
            
            <div class="form-group">
                <label class="control-label">Birthday</label>
            <input type="date" value=<%=birthday%> name="birthday" required id="mydate"  min="1970-01-01" max="2016-31-12" class="form-control"/>
            </div>
            
            <div class="form-group">
            <label class="control-label">Photo</label>
             <img   src="<%=photo%>" name="photo" class="form-control" style="width:50%;height:50%;margin:auto;"/>
            </div>
            
            <div class="form-group">
              <a href="edit_profile_photo.jsp" class="form-control btn btn-warning">Change Photo</a>
            </div>
                            
            <div class="form-group">
                        <input type="submit" value="EDIT" class="form-control btn btn-primary"/>
            </div>
              <div style="margin-top:20px;">
             <%String msg=request.getParameter("msg");
        if(msg!=null){
        %>
        <h5 style="color:green;"><b><%=msg%></b></h5>
            
        <%
        }
        
        %>    
         </div>    
                    
            <%
            }
            %>	
        </form>
						<div class="clearfix"></div>
					
	</div>

                  <div class="col-lg-6"></div>
       </div>
            
           </div>    
           </div>
            
    </body>
</html>
