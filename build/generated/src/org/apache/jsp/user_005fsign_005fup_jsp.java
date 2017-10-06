package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fsign_005fup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Sign Up</title>\n");
      out.write("<!-- for-mobile-apps -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
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
      out.write("                                                    <li><a class=\"hvr-overline-from-center button2\" href=\"all_users.jsp\">Users</a></li>\n");
      out.write("                                                                                                       <li><a class=\"hvr-overline-from-center button2\" href=\"all_questions.jsp\">Questions</a></li>\n");
      out.write("                                                                                                       <li><a class=\"hvr-overline-from-center button2\" href=\"all_categories.jsp\">Categories</a></li>\n");
      out.write("                                                                                                       <li><a class=\"hvr-overline-from-center button2\" href=\"add_question.jsp\">Ask Question</a></li>\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div style=\"padding-top:25px;\"> <a class=\"btn-lg btn-warning\" href=\"user_login.jsp\" style=\"padding-left:30px;padding-right:30px;\">Login</a></div>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div><!-- /navbar-collapse -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- header -->\n");
      out.write("        \n");
      out.write("\n");
      out.write("<div style=\"background:url(pic8.jpg) no-repeat ;\">\n");
      out.write("          \n");
      out.write("           \n");
      out.write("            <div class=\"container\" style=\"padding-top:20px;\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3\"></div>\n");
      out.write("            <div class=\"col-lg-5\">\n");
      out.write("                \n");
      out.write("        <form action=\"./MultiFileUploader5\" method=\"post\" enctype=\"multipart/form-data\" role=\"form\" style=\"background-color:white;border:groove;padding:30px 30px 30px 30px;width:600px;\">\n");
      out.write("            <div class=\"form-group\" style=\"text-align: center;font-size:30px;font-family:Tahoma;\">\n");
      out.write("                <label>Sign Up</label>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"h1\" style=\"margin-bottom:20px;\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("              <div class=\"form-group inner-addon left-addon\">\n");
      out.write("              <label class=\"control-label \">Username</label>\n");
      out.write("             \n");
      out.write("              <input type=\"text\" value=\"\" name=\"username\" required  placeholder=\"Usernname\" class=\"form-control\"/>\n");
      out.write("               <i class=\" form-control-feedback glyphicon glyphicon-user\"></i>\n");
      out.write("              \n");
      out.write("              </div>\n");
      out.write("            <div style=\"margin-top:20px;\">\n");
      out.write("             ");
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
      out.write("         </div>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group inner-addon left-addon\">\n");
      out.write("                <label class=\"control-label\">Password</label> \n");
      out.write("                <input type=\"password\" value=\"\" name=\"password\" required class=\"form-control\" placeholder=\"Password\"/>\n");
      out.write("                <i class=\" form-control-feedback glyphicon glyphicon-lock\"></i>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group inner-addon left-addon\">\n");
      out.write("                <label class=\"control-label \">Email</label>\n");
      out.write("                <input type=\"email\" value=\"\" name=\"email\" required  placeholder=\"xyz@mail.com\" class=\"form-control\"/>\n");
      out.write("                <i class=\" form-control-feedback glyphicon glyphicon-envelope\"></i>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"form-group inner-addon left-addon\">\n");
      out.write("                 <label class=\"control-label\">Phone Number</label> \n");
      out.write("                 <input type=\"tel\" value=\"\" name=\"phonenumber\" maxlength=\"10\"  placeholder=\"eg.9999999999\" required  class=\"form-control\" onkeydown=\"return ( event.ctrlKey || event.altKey \n");
      out.write("                    || (47<event.keyCode && event.keyCode<58 && event.shiftKey===false) \n");
      out.write("                    || (95<event.keyCode && event.keyCode<106)\n");
      out.write("                    || (event.keyCode===8) || (event.keyCode===9) \n");
      out.write("                    || (event.keyCode>34 && event.keyCode<40) \n");
      out.write("                    || (event.keyCode===46) )\"/> \n");
      out.write("            <i class=\" form-control-feedback glyphicon glyphicon-phone\"></i>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                <div class=\"form-group inner-addon left-addon\">\n");
      out.write("                 <label class=\"control-label\">Birthday</label>\n");
      out.write("                 <input type=\"date\"  name=\"birthday\"  required class=\"form-control\"/>\n");
      out.write("                \n");
      out.write("                <i class=\" form-control-feedback glyphicon glyphicon-calendar\"></i>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write(" \n");
      out.write("            <div class=\"form-group  inner-addon left-addon\">  \n");
      out.write("                 <label class=\"control-label\">Photo</label> \n");
      out.write("                 \n");
      out.write("                 <input type=\"file\"  name=\"photo\" class=\"form-control\"  accept=\"image/*\" required/>\n");
      out.write("                 <i class=\"  form-control-feedback control-label glyphicon glyphicon-camera\"></i>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label\">Security Question</label> \n");
      out.write("                <select name=\"security_question\" class=\"form-control\">\n");
      out.write("                <option>What is your pet name?</option>\n");
      out.write("                <option>What is your favourite sport?</option>\n");
      out.write("                <option>Who is your favourite actor?</option>\n");
      out.write("                <option>Who is your best friend?</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <div class=\"form-group\">   \n");
      out.write("                <label class=\"control-label\">Security Answer</label> \n");
      out.write("                 <input type=\"text\" value=\"\" name=\"security_answer\" required class=\"form-control\" /> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\" style=\"text-align:center;\">\n");
      out.write("               <input type=\"submit\" value=\"Sign Up\" class=\"btn btn-success btn-lg\" id=\"submitbutton\" />\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\" style=\"text-align:right;\">\n");
      out.write("                <label class=\"control-label\">Already a member ?</label>\n");
      out.write("                <a href=\"user_login.jsp\" class=\"btn btn-default\">Go and login</a>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("               \n");
      out.write("            </div> \n");
      out.write("             \n");
      out.write("            </div>  \n");
      out.write("                <div class=\"col-lg-6\"></div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("</div>    \n");
      out.write("          \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
