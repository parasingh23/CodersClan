package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            var XML;\n");
      out.write("            \n");
      out.write("         function view(obj){\n");
      out.write("             \n");
      out.write("             var category_name=obj.id;\n");
      out.write("           \n");
      out.write("          XML=new XMLHttpRequest();\n");
      out.write("          \n");
      out.write("          XML.open(\"GET\",\"view_question_home.jsp?category_name=\"+category_name,true);\n");
      out.write("          XML.onreadystatechange=view1;\n");
      out.write("          XML.send();\n");
      out.write("          \n");
      out.write("             \n");
      out.write("         }\n");
      out.write("           \n");
      out.write("    \n");
      out.write("    function view1(){\n");
      out.write("            if(XML.readyState===4 && XML.status===200)\n");
      out.write("         {\n");
      out.write("        document.getElementById(\"question\").innerHTML=XML.responseText;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"all_users.jsp\">Users</a>    \n");
      out.write("        \n");
      out.write("        <h1 class=\"jumbotron\" style=\"text-align:center\">Select Category</h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("        ");

        
        Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category ");
               
        while(rs.next()){
        
        String category_name=rs.getString("category_name");
        String photo=rs.getString("photo");
      
        
     
      out.write("\n");
      out.write("     \n");
      out.write("        \n");
      out.write("     <div id=\"");
      out.print(category_name);
      out.write("\" onclick= \"view(this) \" class=\"category12\" style=\"float:left; width:32%; text-align: center; margin-right: 10px;\">\n");
      out.write("     <img style=\"width:100%; height:300px;\" src=\"");
      out.print(photo);
      out.write("\" /> \n");
      out.write("    <h3 >");
      out.print(category_name);
      out.write(" </h3>\n");
      out.write("     \n");
      out.write("     </div>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("    \n");
      out.write("     ");

  }
     
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     <div id=\"question\" style=\"margin:10px 100px;border:solid; padding:0px 50px; border-color:green;\">\n");
      out.write("         <h2 style=\"text-align: center\">Questions</h2>\n");
      out.write("         \n");
      out.write("     </div>\n");
      out.write("     \n");
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
