package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class change_005fuser_005fpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("        <script>\n");
      out.write("            function go1(){\n");
      out.write("                \n");
      out.write("             var newpassword=document.getElementById(\"id3\").value;\n");
      out.write("             var confirmpassword=document.getElementById(\"id4\").value;\n");
      out.write("if(newpassword===confirmpassword)\n");
      out.write("{\n");
      out.write("    \n");
      out.write(" return true;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("else{\n");
      out.write("   \n");
      out.write("     return false;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("           <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Tutelage Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"glyph.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"button.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       \n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("<!-- fonts -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Alegreya:400,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- //fonts -->\n");
      out.write("\t</head>\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("        <ul class=\"dropdown-menu\" style=\"background-color: #00a5c3;color:#000;\">\n");
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
      out.write("\n");
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
      out.write("<!-- header -->\n");
      out.write("        \n");
      out.write("      \n");
      out.write("         <div class=\"container\" style=\"padding-top:100px;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3\"></div>\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("        ");
 String sessionusername1=(String)session.getAttribute("username");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <form action=\"change_user_password_response.jsp\" method=\"get\" id=\"form\"> \n");
      out.write("               \n");
      out.write("                <div style=\"padding:20px;border:groove;\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    \n");
      out.write("                <label class=\"control-label\"> Username </label> \n");
      out.write("                <input type=\"text\" value=\"");
      out.print(sessionusername1);
      out.write("\" class=\"form-control\" readonly />\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                     <label class=\"control-label\"> Old password </label>\n");
      out.write("                    <input type=\"password\"  value=\"\" name=\"password\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                <div style=\"color:red;margin:10px 0px 0px 10px\">\n");
      out.write("        ");

        String msg=request.getParameter("msg");
        if(msg!=null)
        {
            
      out.write("\n");
      out.write("            \n");
      out.write("            <h3>");
      out.print(msg);
      out.write("</h3>\n");
      out.write("            ");

        }
        
      out.write("\n");
      out.write("        </div>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label\"> New password</label>\n");
      out.write("                    <input type=\"password\" name=\"newpassword\" required id=\"id3\" class=\"form-control\" />\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label\"> Confirm password</label>\n");
      out.write("                <input type=\"password\"  value=\"\" name=\"confirmpassword\" required id=\"id4\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"submit\" value=\"Change password\"  required onclick=\"return go1()\"  class=\"form-control btn btn-success\"/> \n");
      out.write("                </div>\n");
      out.write("</form>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"col-lg-6\"></div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("           \n");
      out.write("                \n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
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
