package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class co_005fadmin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Co-Admin Login</title>\n");
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
      out.write("<div class=\"header\"style=\"padding-bottom:20px;\">\n");
      out.write("\t\t<div class=\"container\">\n");
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
      out.write("                                            <h1><a class=\"navbar-brand\" href=\"#\"><i class=\"glyphicon glyphicon-education\" aria-hidden=\"true\"></i><span>Coders</span>Clan</a></h1>\n");
      out.write("    <h1 style=\" paddin:30px;padding-left:900px;color:white;padding-top:10px;\">Co-Admin Login</h1>\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("                \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div style=\"background:url(pic8.jpg) no-repeat;background-size:cover;height:100vh;\">\n");
      out.write(" <div class=\"container\" style=\"padding-top:100px;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3\"></div>\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("<div style=\"border:groove;padding:20px;background-color:white;\">\n");
      out.write("        <form action=\"co_admin_response.jsp\" method=\"get\" >\n");
      out.write("                \n");
      out.write("                  <div class=\"form-group\" style=\"text-align:center;\">\n");
      out.write("                      <label class=\"control-label\">Username</label> \n");
      out.write("           <input type=\"text\" value=\"\" name=\"username\" required class=\"form-control\" />\n");
      out.write("                  </div>\n");
      out.write("            <div class=\"form-group\" style=\"text-align:center;\">\n");
      out.write("                     <label class=\"control-label\">Password</label>\n");
      out.write("            \n");
      out.write("                     <input type=\"password\" value=\"\" name=\"password\" required class=\"form-control\" /></div>\n");
      out.write("               \n");
      out.write("            <div class=\"form-group\"> <input type=\"submit\" value=\"Login\" class=\"form-control btn btn-success\" /> </div>\n");
      out.write("           \n");
      out.write("            <div>\n");
      out.write("        ");

            if(request.getParameter("msg")!=null)
            {
                
      out.write("\n");
      out.write("                \n");
      out.write("                <h5 style=\"color:red;text-align:center;\">");
      out.print(request.getParameter("msg"));
      out.write("</h5>\n");
      out.write("                ");

            }
            
      out.write("\n");
      out.write("            </div> \n");
      out.write("              </form>\n");
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("                <div class=\"col-lg-6\"></div>\n");
      out.write(" </div></div>\n");
      out.write("</div>\n");
      out.write("            \n");
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
