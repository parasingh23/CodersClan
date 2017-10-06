package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Edit Profile</title>\n");
      out.write("<!-- for-mobile-apps -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Tutelage Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("<!-- fonts -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Alegreya:400,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- //fonts -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- header -->\n");
      out.write("<div class=\"header\">\n");
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
      out.write("\t\t\t\t\t    <h1><a class=\"navbar-brand\" href=\"CodersClan.jsp\"><i class=\"glyphicon glyphicon-education\" aria-hidden=\"true\"></i><span>Coders</span>Clan</a></h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse nav-wil\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-overline-from-center button2 active\" href=\"about.html\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-overline-from-center button2\" href=\"all_users.jsp\">Users</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-overline-from-center button2\" href=\"services.html\">Services</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-overline-from-center button2\" href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<div class=\"search-box\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"sb-search\" class=\"sb-search\">\n");
      out.write("\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" name=\"search\" id=\"search\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"sb-search-submit\" type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"sb-icon-search\"> </span>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- /navbar-collapse -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- search-scripts -->\n");
      out.write("\t\t\t\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\n");
      out.write("\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t<!-- //search-scripts -->\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- header -->\n");
      out.write("        \n");
      out.write("           \n");
      out.write("            ");

         String username=session.getAttribute("username").toString();
                Class.forName("com.mysql.jdbc.Driver");
        Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from users where username='"+username+"'");
            
            if(rs.next()){
            
            String email=rs.getString("email");
            String phonenumber=rs.getString("phonenumber");
            String birthday=rs.getString("birthday");
            String photo=rs.getString("photo");
        
            
        
            
            
      out.write("\n");
      out.write("           <div class=\"about\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("            <form action=\"edit_profile_response.jsp \" method=\"get\" id=\"form\" id=\"form\">\n");
      out.write("\t\t\t\t\t<div class=\"help-info\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"tittle\">Edit Profile</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("            <label class=\"control-label\">Username</label>\n");
      out.write("            <input type=\"text\" value=\"");
      out.print(username);
      out.write("\" name=\"username\" class=\"form-control\" readonly>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label\">Email</label>\n");
      out.write("                <input type=\"email\" value=\"");
      out.print(email);
      out.write("\" name=\"email\" class=\"form-control\" />\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label class=\"control-label\">Phone</label>\n");
      out.write("            <input type=\"tel\" value=\"");
      out.print(phonenumber);
      out.write("\" maxlength=\"10\"name=\"phonenumber\" class=\"form-control\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label\">Birthday</label>\n");
      out.write("            <input type=\"date\" value=");
      out.print(birthday);
      out.write(" name=\"birthday\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label class=\"control-label\">Photo</label>\n");
      out.write("             <img   src=\"");
      out.print(photo);
      out.write("\" name=\"photo\" class=\"form-control\" style=\"width:50%;height:50%;margin:auto;\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <a href=\"edit_profile_photo.jsp\" class=\"form-control btn btn-warning\">Change Photo</a>\n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                        <input type=\"submit\" value=\"EDIT\" class=\"form-control btn btn-primary\"/>\n");
      out.write("            </div>\n");
      out.write("              <div style=\"margin-top:20px;\">\n");
      out.write("             ");
String msg=request.getParameter("msg");
        if(msg!=null){
        
      out.write("\n");
      out.write("        <h5 style=\"color:green;\"><b>");
      out.print(msg);
      out.write("</b></h5>\n");
      out.write("        \n");
      out.write("        ");

        }
        
        
      out.write("    \n");
      out.write("         </div>    \n");
      out.write("                    \n");
      out.write("            ");

            }
            
      out.write("\t\n");
      out.write("        </form>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("           </div>    \n");
      out.write("                \n");
      out.write("            <!-- footer -->\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"footer-grids\">\n");
      out.write("\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t<h3>PERSPICIATIS</h3>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">SUMMER CAMPS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">CELEBRATIONS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">ONLINE EXAMS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">COMPETITIONS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">ACTIVITIES</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t<h3>PRAESENTIUM </h3>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">PRESENTATIONS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">SEMINARS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">PREPARATIONS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">CONDUCTING GAMES</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">OTHER ACTIVITIES</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t<h3>DIGNISSIMOS</h3>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">SUMMER CAMPS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">CELEBRATIONS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">ONLINE EXAMS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">COMPETITIONS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">ACTIVITIES</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t<h3>PRAESENTIUM</h3>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">PRESENTATIONS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">SEMINARS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">PREPARATIONS</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">CONDUCTING GAMES</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">OTHER ACTIVITIES</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<p> &copy; 2015 Tutelage. All Rights Reserved | Design by  <a href=\"http://w3layouts.com/\"> W3layouts</a></p>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- //footer -->\n");
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
