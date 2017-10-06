package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class post_005fanswer_005fresponse_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

String username=session.getAttribute("username").toString();
String ans_question_id=request.getParameter("question_id");
String answer=request.getParameter("answer");


Class.forName("com.mysql.jdbc.Driver");
    Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
    Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from answers");
    rs.next();
    
    rs.moveToInsertRow();
    rs.updateString("answers",answer);
    rs.updateString("ans_username",username);
    rs.updateString("ans_question_id", ans_question_id);
    rs.insertRow();
    

    
   Statement stmt1 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs1 = stmt1.executeQuery("select * from answers where ans_question_id="+ans_question_id+"");
    
      out.write("\n");
      out.write("    \n");
      out.write("    <h1>Answers</h1>\n");
      out.write("    <div>\n");
      out.write("        \n");
      out.write("   ");

    while(rs1.next()){
        String answer1=rs1.getString("answers");
        String ans_username=rs1.getString("ans_username");
        String date=rs1.getString("date1");

      out.write("\n");
      out.write("<div style=\" background-color:lightsalmon;\">");
      out.print(answer1);
      out.write("</div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <h5>answered by:-</h5>\n");
      out.write("    <h3>");
      out.print(ans_username);
      out.write("</h3>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("\n");

    }
    
    

      out.write("\n");
      out.write("\n");
      out.write("    </div>");
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
