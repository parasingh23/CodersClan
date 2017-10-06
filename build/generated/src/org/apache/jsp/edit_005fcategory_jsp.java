package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Edit Category</title>\n");
      out.write("       <!-- for-mobile-apps -->\n");
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
      out.write("\n");
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
      out.write("\t\t\t\t\t    <h1><a class=\"navbar-brand\" href=\"admin_home.jsp\"><i class=\"glyphicon glyphicon-education\" aria-hidden=\"true\"></i><span>Coders</span>Clan</a></h1>\n");
      out.write("\t\t\t\t\t");

            if(session.getAttribute("Username")!=null){
         String username1=session.getAttribute("Username").toString();
            
          
      out.write("\n");
      out.write("                                            <h1 style=\"color:white;padding-left:800px;\">Welcome ");
      out.print(username1);
      out.write("</h1>\n");
      out.write("                                             <h1 style=\"padding-left:900px;\"><a href=\"admin_logout.jsp\" class=\"btn btn-danger\">Logout</a></h1>\n");
      out.write("                                         ");
}
      out.write("   \n");
      out.write("                                        </div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- header -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\" style=\"padding-top:30px;\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\"></div>\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("        <form action=\"add_question_response.jsp\" method=\"post\" role=\"form\">\n");
      out.write("     <div style=\"border:groove;padding:30px;\">\n");
      out.write("         <div style=\"text-align:center;color:red;\"><h2>Edit Category</h2></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("       \n");
      out.write("         ");
 
      
        String category_name=request.getParameter("category_name"); 
        String category_description=request.getParameter("category_description");
            String photo=request.getParameter("photo");
                
                
       
      out.write("         \n");
      out.write("       \n");
      out.write("         <div class=\"form-group\">  \n");
      out.write("       <label class=\"control-label\">Category Name</label>\n");
      out.write("              <input type=\"text\" value=\"");
      out.print(category_name);
      out.write("\" name=\"category_name\" class=\"form-control\" readonly />\n");
      out.write("         </div>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("         <label class=\"control-label\">Category Description</label>\n");
      out.write("         <textarea cols=\"21\" rows=\"10\" name=\"category_description\" class=\"form-control\" >");
      out.print(category_description);
      out.write("</textarea></div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("               <img  style=\"width:50%;height:50%;margin:auto;\" src=\"");
      out.print(photo);
      out.write("\" class=\"form-control\"/> \n");
      out.write("        </div>\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("        \n");
      out.write("               <h1 style=\"padding-left:180px;\"> <a href=\"edit_category_photo.jsp?category_name=");
      out.print(category_name);
      out.write("\" class=\"btn btn-warning\" class=\"form-control\"/>Change Photo</a></h1>\n");
      out.write("           </div>\n");
      out.write("         <div class=\"form-group\"> \n");
      out.write("        <input type=\"submit\" value=\"EDIT\" class=\"form-control btn btn-primary\"  /></div>\n");
      out.write("               \n");
      out.write("          \n");
      out.write(" \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        </form>  \n");
      out.write("</div>\n");
      out.write("                  <div class=\"col-lg-6\"></div>\n");
      out.write("       </div>\n");
      out.write("                   \n");
      out.write("   \n");
      out.write("    \n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        </body>\n");
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
