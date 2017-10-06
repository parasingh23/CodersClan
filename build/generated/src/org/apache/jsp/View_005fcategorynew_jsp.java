package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class View_005fcategorynew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table cellpadding=\"15\" cellspacing=\"10\" >\n");
      out.write("<!--           <tr>\n");
      out.write("           <th>\n");
      out.write("            <td>Photo</td>\n");
      out.write("            <th>Category Name</th>\n");
      out.write("            <thCategory Description</th> \n");
      out.write("            <th></th>\n");
      out.write("            <th></th>\n");
      out.write("            </th>\n");
      out.write("            </tr>-->\n");
      out.write("            \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        ");
 
            try{
        Class.forName("com.mysql.jdbc.Driver");

        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category ");
         
            while(rs.next()){
            
            String category_name=rs.getString("category_name");
            String category_description=rs.getString("category_description");
            String photo=rs.getString("photo");
            
            
            
      out.write("\n");
      out.write("             <tr>\n");
      out.write("             \n");
      out.write("             <td> ");
      out.print(photo);
      out.write("</td>\n");
      out.write("             <td> ");
      out.print(category_name);
      out.write("</td>\n");
      out.write("             <td> ");
      out.print(category_description);
      out.write("</td>\n");
      out.write("             \n");
      out.write("             <td> <input type=\"button\" value=\"edit\" onlick=\"edit_category.jsp\"></td>\n");
      out.write("             <td> <input type=\"button\" value=\"delete\" onlick=\"delete_category.jsp\"></td>\n");
      out.write("             \n");
      out.write("            \n");
      out.write("         </tr>\n");
      out.write("            ");

            }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     \n");
      out.write("        \n");
      out.write("       </table>\n");
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
