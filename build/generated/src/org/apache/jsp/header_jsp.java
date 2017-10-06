package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!-- header -->\n");
      out.write("<div class=\"header\" >\n");
      out.write("\t\t<div class=\"container\"  >\n");
      out.write("\t\t\t<div class=\"header-nav\">\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t    <h1><a class=\"navbar-brand\" href=\"CodersClan.jsp\"><i class=\"glyphicon glyphicon-education\" aria-hidden=\"true\"></i><span>Coders</span>Clan</a></h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse nav-wil\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("      </li>\n");
      out.write("                                                  \n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-overline-from-center button2 active\" href=\"about.html\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-overline-from-center button2\" href=\"all_users.jsp\">Users</a></li>\n");
      out.write("                                                                                        \t<li><a class=\"hvr-overline-from-center button2\" href=\"contact.html\">Contact</a></li>\n");
      out.write("                                                                                                <li><a class=\"hvr-overline-from-center button2\" href=\"add_question.jsp\">Ask Question</a></li>\n");
      out.write("                                                 ");
 
                                                                                                              if(session.getAttribute("username")!=null) {
                                                                                                             String sessionusername=(String)session.getAttribute("username");
           
        
      out.write("\n");
      out.write("\t <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
      out.print(sessionusername);
      out.write("<span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"edit_profile.jsp\">Edit Profile</a></li>\n");
      out.write("            <li><a href=\"change_user_password.jsp\">Change Password</a></li>\n");
      out.write("         \n");
      out.write("            <li><a href=\"view_my_question.jsp\">My Questions</a></li>\n");
      out.write("            <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("             ");
}
                                                                                                              else{
                                                                                                
             response.sendRedirect("user_login.jsp?msg=Please Login First");
              
                                                                                                       }
      out.write("\n");
      out.write("                                                \n");
      out.write("                                                </ul>\n");
      out.write("\t\t\t\t\t</div><!-- /navbar-collapse -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- header -->");
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
