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
public class MultiFileUploader5 extends HttpServlet 
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
           
            Part part1= request.getPart("photo");
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
            
            
            String username= request.getParameter("username");
            String password= request.getParameter("password");
            String email= request.getParameter("email");
            String phonenumber= request.getParameter("phonenumber");
            String birthday= request.getParameter("birthday");
            String security_question= request.getParameter("security_question");
            String security_answer= request.getParameter("security_answer");
            int point=0;
            
            
                 Class.forName("com.mysql.jdbc.Driver");
            Connection bal =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt =bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           ResultSet rs =stmt.executeQuery("select * from users where username='"+username+"'");
               
                    if(rs.next())
         {
             
             response.sendRedirect("user_sign_up.jsp?msg=Username already exists");
            }
                else
                {
                    rs.moveToInsertRow();
                    rs.updateString("username",username);
                    rs.updateString("password",password);
                    rs.updateString("email",email);
                    rs.updateString("phonenumber",phonenumber);
                    rs.updateString("birthday",birthday);
                    rs.updateString("security_question",security_question);
                    rs.updateString("security_answer",security_answer);
                    rs.updateString("photo",relativepath);
                    rs.updateInt("points",point);
                    rs.insertRow();
                
                      
                
                        response.sendRedirect("user_login.jsp?msg=Signup Successfull");
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
