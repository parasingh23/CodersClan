package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_005fsub_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Edit Sub-Category</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <form action=\"edit_sub_category_response.jsp \" method=\"GET\">\n");
      out.write("      <table cellpadding=\"15\" cellspacing=\"10\"  >\n");
      out.write("         ");
 
      
        String sub_category_name=request.getParameter("sub_category_name"); 
        String category=request.getParameter("category");
        String description=request.getParameter("description");
            String photo=request.getParameter("photo");
                
                
       
      out.write("         \n");
      out.write("       \n");
      out.write("           <tr>\n");
      out.write("               <td>Sub-Category Name</td>\n");
      out.write("               <td><input type=\"text\" value=\"");
      out.print(sub_category_name);
      out.write("\" name=\"sub_category_name\" readonly /></td></tr> \n");
      out.write("           <tr><td>Category</td>\n");
      out.write("               \n");
      out.write("               <td> <select name=\"category\">\n");
      out.write("                       <option>");
      out.print(category);
      out.write("</option>      \n");
      out.write("                      \n");
      out.write("               ");
 
            try
            {
                
         
        Class.forName("com.mysql.jdbc.Driver");
        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from sub_category");
         
            while(rs.next())
          
            {
                String dcategory= rs.getString("category");
                if(!category.equals(dcategory))
                {
              
      out.write("\n");
      out.write("                 \n");
      out.write("                <option>");
      out.print(dcategory);
      out.write("</option>                \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                     \n");
      out.write("     ");

                }
                }
             }
              catch(Exception e){
                      
                      e.printStackTrace();
                      } 
             
                
      out.write("\n");
      out.write("             \n");
      out.write("                   </select> </td></tr>\n");
      out.write("      \n");
      out.write("              <tr><td>Sub-Category Description</td>\n");
      out.write("               <td><textarea cols=\"21\" rows=\"10\" name=\"description\" >");
      out.print(description);
      out.write("</textarea></td></tr>\n");
      out.write("           <tr> <td></td>\n");
      out.write("               <td><input type=\"submit\" value=\"EDIT\"  /></td></tr>\n");
      out.write("              <tr><td>Photo</td>\n");
      out.write("               <td><img  width=\"100\" height=\"100\" src=\"");
      out.print(photo);
      out.write("\"/> </td></tr>\n");
      out.write("           <tr> <td></td>\n");
      out.write("               <td><a href=\"edit_sub_category_photo.jsp?sub_category_name=");
      out.print(sub_category_name);
      out.write("\">Change Photo</a></td></tr>\n");
      out.write("                \n");
      out.write("          \n");
      out.write("               \n");
      out.write("          \n");
      out.write(" \n");
      out.write("        </table> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </form>\n");
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
