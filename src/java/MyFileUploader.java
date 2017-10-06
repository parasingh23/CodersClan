
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class MyFileUploader extends HttpServlet 
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
           
            Part part1= request.getPart("fn");
            String absolutepath=request.getServletContext().getRealPath("/myuploads");
            String filename=vmm2.FileUploader.savefileonserver(part1,absolutepath);
 
            String r= request.getParameter("rn");
            out.println("Rollno "+r);
            out.println("<h1>File Uploaded "+ filename+"</h1>");
            
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception ex)
        {
           ex.printStackTrace();
        }
    }  
}
