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
public class MultiFileUploader4 extends HttpServlet 
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
           
            Part part1= request.getPart("photo3");
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
            
            
                 String sub_category_name= request.getParameter("sub_category_name");
                 String photo=request.getParameter("photo3");
                 
            
                 Class.forName("com.mysql.jdbc.Driver");
            Connection bal =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt =bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           ResultSet rs =stmt.executeQuery("select * from sub_category where sub_category_name='"+sub_category_name+"'");
               
                    if(rs.next())
         {
             
             rs.updateString("photo",relativepath);
                    
             rs.updateRow();
             
             response.sendRedirect("view_sub_category.jsp?msg=Changes Done");
             
            }
                else
                {
                    
                    
                                 response.sendRedirect("view_sub_category.jsp?msg=Try Again");


                    
                        
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
