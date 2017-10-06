package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class all_005fusers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Users</title>\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Tutelage Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/swipebox.css\">\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("<!-- fonts -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Alegreya:400,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- //fonts -->\n");
      out.write("<link href=\"css/ihover.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<!-- start-smoth-scrolling -->\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("                <script src=\"js/bootstrap.js\"></script>\n");
      out.write("\t<!-- start-smoth-scrolling -->\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
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
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-overline-from-center button2\" href=\"about.html\">About</a></li>\n");
      out.write("                                                                                                       <li><a class=\"hvr-overline-from-center button2\" href=\"all_users.jsp\">Users</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"hvr-overline-from-center button2\" href=\"contact.html\">Contact</a></li>\n");
      out.write("                                                                                                       <li><a class=\"hvr-overline-from-center button2\" href=\"add_question.jsp\">Ask Question</a></li>\n");
      out.write("                                                        ");
 
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
      out.write("\n");
      out.write("                                                                                                \n");
      out.write("             \n");
      out.write("              <div style=\"padding-top:25px;\"> <a class=\"btn-lg btn-warning\" href=\"user_login.jsp\" style=\"padding-left:30px;padding-right:30px;\">Login</a></div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("             \n");
      out.write("                                                                                                       ");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"search-box\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"sb-search\" class=\"sb-search\">\n");
      out.write("\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" name=\"search\" id=\"search\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"sb-search-submit\" type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"sb-icon-search\"> </span>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div><!-- /navbar-collapse -->\n");
      out.write("\t\t\t\t\t<!-- search-scripts -->\n");
      out.write("\t\t\t\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\n");
      out.write("\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t<!-- //search-scripts -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                </nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("           \n");
      out.write("            <h1 class=\"jumbotron\" style=\"background-color:white;text-align:center;color:lawngreen;\"> <b>USERS</b></h1>\n");
      out.write("            <hr />\n");
      out.write("        \n");
      out.write("        ");

        
            Class.forName("com.mysql.jdbc.Driver");
                Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
                Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from users ORDER BY points DESC");
         int num=0;  
         
        while(rs.next()){
       String username=rs.getString("username");
       String photo=rs.getString("photo");
       String email=rs.getString("email");
       String point=rs.getString("points");
        
       num++;
        
      out.write("\n");
      out.write("       \n");
      out.write("               \n");
      out.write("        <div  style=\"font-size:20px; float:left; width:20%;text-align:center;padding-bottom:20px; \"><img width=\"150\" height=\"150\"src=\"");
      out.print(photo);
      out.write("\" class=\"img-circle\"><br>\n");
      out.write("            <div style=\"width:70%; margin: auto\"><h3>#");
      out.print(num);
      out.write("</h3>\n");
      out.write("            <a href=\"user_profile1.jsp?username=");
      out.print(username);
      out.write("\"> ");
      out.print(username);
      out.write("</a><br>\n");
      out.write("            ");
      out.print(point);
      out.write("&nbsp;points<br>\n");
      out.write("            </div>\n");
      out.write("       </div> \n");
      out.write("       \n");
      out.write("       \n");
      out.write("            \n");
      out.write("      \n");
      out.write("        ");

        }
        
        
      out.write("\n");
      out.write("     \n");
      out.write("      \n");
      out.write("      \n");
      out.write("   \n");
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
