import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class MultiFileUploader2 extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try 
        {
           
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyFileUploader</title>");            
            out.println("</head>");
            out.println("<body>");
           
            Part part1= request.getPart("photo1");
            Collection<Part> parts= request.getParts();
            String ans="";
           String relativepath=null;
            String absolutepath=request.getServletContext().getRealPath("/myuploads");
               
            for(Part part:parts)
            {
           
              String filename=vmm2.FileUploader.savefileonserver(part,absolutepath);
              if(filename.equals("not-a-file"))
              {
                 ans+="<br>"+"---";
              }
              else
              {
                 ans+= "<br>"+filename;
                 relativepath="./myuploads/"+filename;
              }
            }
            
            
                 String category_name= request.getParameter("category_name");
            
                        String photo=request.getParameter("photo1");

           
                 Class.forName("com.mysql.jdbc.Driver");
            Connection bal =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt =bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           ResultSet rs =stmt.executeQuery("select * from category where category_name='"+category_name+"'");
               
                    if(rs.next())
         {
                 
                    rs.updateString("photo",relativepath);
                    
                    rs.updateRow();
                String category_description=rs.getString("category_description");    
                String photo1=rs.getString("photo");    

                    
response.sendRedirect("edit_category.jsp?category_name="+category_name+"&category_description="+category_description+"&photo="+photo1+"&msg=Changes Done"); 
                          
            }
                    else{
                    
                    response.sendRedirect("edit_category.jsp?msg=Try Again");
                    
                    
                    } 
                    
                        
       
       
            
            
                     
            out.println("</body>");
            out.println("</html>");
      
        }
        catch(Exception ex)
        {
           ex.printStackTrace();
        }
    }  
}
