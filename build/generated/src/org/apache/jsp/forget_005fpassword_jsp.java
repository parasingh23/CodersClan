package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forget_005fpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Forget Password</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script>\n");
      out.write("           var XML; \n");
      out.write("            function check(){\n");
      out.write("                alert(\"a\");\n");
      out.write("                var username=document.getElementById(\"username\").value;\n");
      out.write("                alert(username);\n");
      out.write("                \n");
      out.write("                XML=new XMLHttpRequest();\n");
      out.write("               XML.open(\"GET\",\"forget_password_response.jsp?username=\"+username, true);\n");
      out.write("                XML.onreadystatechange= check1;\n");
      out.write("                XML.send();\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function check1(){\n");
      out.write("                \n");
      out.write("                if(XML.readyState===4 && XML.status===200)\n");
      out.write("                {\n");
      out.write("                    \n");
      out.write("             document.getElementById(\"content\").innerHTML=XML.responseText;       \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"background-color:lightblue;height:40%;\" ><h1>Coders Clan</h1></div>\n");
      out.write("        \n");
      out.write("        <div   height=\"300\" style=\"text-align:center;\">\n");
      out.write("        <h2>Having trouble signing in?</h2>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        <div style=\"text-align:center;\">\n");
      out.write("         <label >Username</label> \n");
      out.write("        \n");
      out.write("        <input type=\"text\"  value=\"\" id=\"username\"  >\n");
      out.write("        <input type=\"button\"  value=\"Continue\" class=\"btn btn-warning\" onclick=\"check()\" />\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"content\" >\n");
      out.write("           ");
String msg=request.getParameter("msg");
        if(msg!=null){
        
      out.write("\n");
      out.write("        <h5 style=\"color:red;\"><b>");
      out.print(msg);
      out.write("</b></h5>\n");
      out.write("        \n");
      out.write("        ");

        }
        
        
      out.write("    \n");
      out.write("       </div>\n");
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
