
<%@page import="java.sql.*"%>


<table cellpadding="15" cellspacing="10" border="5" >
          <tr>
          
            <th>Photo</th>
            <th>Category</th>
            <th>Sub-Category Name</th>
            <th>Sub-Category Description</th> 
            <th></th>
            <th></th>
            
            </tr>

<% 
                String category=request.getParameter("category_name");
               

                                             
            Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from sub_category where category='"+category+"'");
         
            while(rs.next()){
            
            String description=rs.getString("description");
            String sub_category_name=rs.getString("sub_category_name");
            String photo=rs.getString("photo");
            
            
            %>
             <tr>
             
             <td> <img  width="100" height="100" src="<%=photo%>"/></td>
             <td> <%=category%></td>
             <td><%=sub_category_name%></td>
             <td> <%=description%></td>
             
             <td> <a href="edit_sub_category.jsp?sub_category_name=<%=sub_category_name%>&category=<%=category%>&description=<%=description%>&photo=<%=photo%>">EDIT</a></td>
             <td> <a href="delete_sub_category.jsp?sub_category_name=<%=sub_category_name%>">DELETE</a></td>
           
             
            
         </tr>
            <%
            }
            
        %>
        
                     </table>
