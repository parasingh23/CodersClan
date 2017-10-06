package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class forget_005fpassword_005fresponse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html> s\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Forget Password</title>\n");
      out.write("        <meta name=\"keywords\" content=\"Tutelage Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("    <a href=\"../../MailDemo/src/mail.jar\"></a>\n");
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
      out.write("\n");
      out.write("        <div class=\"container\" style=\"padding-top:20px; padding-right:100px;\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-4\"></div>\n");
      out.write("          <div class=\"col-lg-5\">\n");
      out.write("     ");

     String username=request.getParameter("username");
     
     Class.forName("com.mysql.jdbc.Driver");
         Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
         Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         ResultSet rs = stmt.executeQuery("select * from users where username='"+username+"' ");
         
         if(rs.next())  {
           
       String security_question=rs.getString("security_question");      
       String security_answer=rs.getString("security_answer");      
       String photo=rs.getString("photo");
      
       String email=rs.getString("email");      
     
     
      out.write("\n");
      out.write("    \n");
      out.write("     <form  action=\"recover_password.jsp\" method=\"post\"  role=\"form\" >\n");
      out.write("       <div class=\"form-group\" style=\"border:groove;padding:10px;\">\n");
      out.write("         <div class=\"form-group\" style=\"text-align:center;\"><img width=\"75\" height=\"75\" src=\"");
      out.print(photo);
      out.write("\" class=\"img-circle\" /> </div>\n");
      out.write("         \n");
      out.write("         <div class=\"form-group-lg\" style=\"text-align:center;\">\n");
      out.write("             <h3>");
      out.print(username);
      out.write("</h3>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("         \n");
      out.write("         <div class=\"form-group\" style=\"padding-top:20px;\"><h4>  ");
      out.print(security_question);
      out.write("</h4></div>  \n");
      out.write("            <div class=\"form-group \" >\n");
      out.write("             <label class=\"control-label\">Security Answer</label> \n");
      out.write("             <input class=\"form-control\" type=\"text\" value=\"\" name=\"security_answer\" required>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"form-group\">  \n");
      out.write("             <label class=\"control-label\">Email </label> \n");
      out.write("  <input  class=\"form-control\" type=\"email\" value=\"\" name=\"email\">\n");
      out.write("         </div>      \n");
      out.write("  <div class=\"form-group\">  \n");
      out.write("         <input class=\"form-control btn btn-info\" type=\"submit\" value=\"Continue\" >\n");
      out.write("  </div>\n");
      out.write("     </form>\n");
      out.write("    \n");
      out.write("   ");
   }  
      out.write("  \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-4\"></div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("          \n");
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
