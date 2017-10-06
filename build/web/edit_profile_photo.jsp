<%-- 
    Document   : edit_profile_photo_response
    Created on : Apr 16, 2016, 3:41:07 PM
    Author     : PARASP
--%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<title>Edit Profile</title>
<%@include file="header1.jsp" %>
<body>
        <div class="about">
	<div class="container">
            <div class="row">
                <div class="col-lg-3"></div>
                <div class="col-lg-6">
            <form action="./MultiFileUploader6" method="post" enctype="multipart/form-data" role="form" id="form">
          
            <%
         String username=session.getAttribute("username").toString();
                Class.forName("com.mysql.jdbc.Driver");
        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from users where username='"+username+"'");
            
            if(rs.next()){
            
        
            String photo=rs.getString("photo");
         
            %>
           
            <input type="text" value="<%=username%>" name="username"  hidden/>
            
            
                <div class="help-info">
						<h2 class="tittle">Change Profile Picture</h2>
					</div>
                
                
                <div class="form-group" style="padding-left:170px;">
                    
                    <img   src="<%=photo%>" name="photo" class="form-control" style="width:200px;height:200px;text-align:center;"/> 
                </div>
                
                <div class="form-group">  
            <label class="control-label">Select Photo</label>
                <input type="file" name="photo1" required class="form-control" accept="image/*" />
                </div>
            
                <div class="form-group">
            <input type="submit" value="Change Photo" class="form-control btn btn-success" />
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
