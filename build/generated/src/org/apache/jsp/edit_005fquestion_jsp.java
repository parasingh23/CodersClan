package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_005fquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <form action=\"edit_question_response.jsp\"  method=\"post\" >\n");
      out.write("        \n");
      out.write("        ");

        String category_name=request.getParameter("category_name");
        String question_id=request.getParameter("question_id");
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <select name=\"category_name\">\n");
      out.write("            <option>");
      out.print(category_name);
      out.write("</option>\n");
      out.write("            \n");
      out.write("       ");

       try{
       Class.forName("com.mysql.jdbc.Driver");
           Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
           Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
           ResultSet rs = stmt.executeQuery("select * from category ");
           
              while(rs.next()){
               
               String dcategory_name= rs.getString("category_name");
               
                  if(!category_name.equals(dcategory_name))
                {
              
      out.write("\n");
      out.write("                 \n");
      out.write("                <option>");
      out.print(dcategory_name);
      out.write("</option>                \n");
      out.write("                  \n");
      out.write("     ");

                }
                }
             }
              catch(Exception e){
                      
                      e.printStackTrace();
                      } 
             
                
      out.write("\n");
      out.write("                \n");
      out.write("             </select>\n");
      out.write("               \n");
      out.write("             ");

             Class.forName("com.mysql.jdbc.Driver");
                 Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
                 Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                 ResultSet rs = stmt.executeQuery("select * from question where question_id="+question_id);
               if(rs.next()){
                 String title=rs.getString("title");
                String content= rs.getString("content");
                String description= rs.getString("description");
               String keywords=rs.getString("keywords");
           
             
      out.write("   \n");
      out.write("               \n");
      out.write("       <input type=\"text\" value=\"");
      out.print(title);
      out.write("\" name=\"title\" />\n");
      out.write("              <input type=\"text\" value=\"");
      out.print(question_id);
      out.write("\" name=\"question_id\" hidden />\n");
      out.write("\n");
      out.write("       <textarea name=\"description\">");
      out.print(description);
      out.write("</textarea>\n");
      out.write("       <textarea name=\"content\">");
      out.print(content);
      out.write("</textarea>\n");
      out.write("       <input type=\"text\" value=\"");
      out.print(keywords);
      out.write("\" name=\"keywords\" />\n");
      out.write("       <input type=\"submit\" value=\"EDIT\" />\n");
      out.write("               \n");
      out.write("          ");
}
          
      out.write("     \n");
      out.write("               \n");
      out.write("          ");

            String msg=request.getParameter("msg");
    if(msg!=null)
    {
    
      out.write("\n");
      out.write("    <h3>");
      out.print(msg);
      out.write("</h3>\n");
      out.write("    ");

    }
    
      out.write("      \n");
      out.write("               \n");
      out.write("     \n");
      out.write("    </form>  \n");
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
