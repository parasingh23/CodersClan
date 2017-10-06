package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class add_005fquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Question</title>\n");
      out.write("        <script>\n");
      out.write("            function points1(){\n");
      out.write("                \n");
      out.write("                document.getElementById(\"points\").style.display=\"block\";\n");
      out.write("                document.getElementById(\"points\").value();\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"add_question_response.jsp\" method=\"post\" role=\"form\">\n");
      out.write("     \n");
      out.write("            \n");
      out.write("            <table>\n");
      out.write("         <tr>\n");
      out.write("                <td>Category</td>\n");
      out.write("                <td><select name=\"category_name\">\n");
      out.write("                \n");
      out.write("                         ");
 
            try{
                
         
        Class.forName("com.mysql.jdbc.Driver");
        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category");
         
            while(rs.next())
          
            {
                String category_name=rs.getString("category_name");
                
      out.write("\n");
      out.write("                  \n");
      out.write("                            <option>");
      out.print(category_name);
      out.write("</option>\n");
      out.write("                    \n");
      out.write("     ");

            } }
              catch(Exception e){
                      
                      e.printStackTrace();
                      } 
            
                
      out.write("\n");
      out.write("                \n");
      out.write("                   ");

        String username=session.getAttribute("username").toString();
        
        Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs1 = stmt.executeQuery("select * from  users where username='"+username+"'");
            
           rs1.next();
           int point=rs1.getInt("points");
               
        
        
        
        
      out.write("\n");
      out.write("                    </select> </td></tr>\n");
      out.write("         <tr><td>Title</td>\n");
      out.write("             <td><input type=\"text\" value=\"\" name=\"title\" required /></td></tr>\n");
      out.write("         \n");
      out.write("         <tr><td>Description</td>\n");
      out.write("             <td><textarea name=\"description\" col=\"23\" rows=\"10\"></textarea></td></tr>\n");
      out.write("         <tr><td>Content</td>\n");
      out.write("             <td><textarea name=\"content\" col=\"23\" rows=\"10\"></textarea></td></tr>\n");
      out.write("         <tr><td>Keywords</td>\n");
      out.write("             <td><input type=\"text\" value=\"\" name=\"keywords\" required /></td></tr>\n");
      out.write("         <tr><td></td>\n");
      out.write("             <td><input type=\"submit\" value=\"Add Question\"></td></tr>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div id=\"points\" style=\"display:none;\" onsubmit=\"\">");
      out.print(point);
      out.write("</div>\n");
      out.write("       </table>\n");
      out.write("    </form>\n");
      out.write("                   \n");
      out.write("    ");

            String msg=request.getParameter("msg");
    if(msg!=null)
    {
    
      out.write("\n");
      out.write("    <h3>");
      out.print(msg);
      out.write("</h3>\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
