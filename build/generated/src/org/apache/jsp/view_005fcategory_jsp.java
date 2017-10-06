package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class view_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>View Category</title>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <table cellpadding=\"15\" cellspacing=\"10\" border=\"5\" >\n");
      out.write("          <tr>\n");
      out.write("          \n");
      out.write("            <th>Photo</th>\n");
      out.write("            <th>Category Name</th>\n");
      out.write("            <th>Category Description</th> \n");
      out.write("            <th></th>\n");
      out.write("            <th></th>\n");
      out.write("            \n");
      out.write("            </tr>\n");
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
      out.write("             <td> <img  width=\"100\" height=\"100\" src=\"");
      out.print(photo);
      out.write("\"/></td>\n");
      out.write("             <td> ");
      out.print(category_name);
      out.write("</td>\n");
      out.write("             <td> ");
      out.print(category_description);
      out.write("</td>\n");
      out.write("             \n");
      out.write("             <td> <a href=\"edit_category.jsp?category_name=");
      out.print(category_name);
      out.write("&category_description=");
      out.print(category_description);
      out.write("&photo=");
      out.print(photo);
      out.write("\">EDIT</a></td>\n");
      out.write("             <td> <a href=\"delete_category.jsp?category_name=");
      out.print(category_name);
      out.write("\">DELETE</a></td>\n");
      out.write("           \n");
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
      out.write("    \n");
      out.write("       </table>\n");
      out.write("        \n");
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
