package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class user_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");

      
      String username=request.getParameter("username");
    
      Class.forName("com.mysql.jdbc.Driver");
          Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
          Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
          ResultSet rs = stmt.executeQuery("select * from users where username='"+username+"'");
           if(rs.next()) {   
          
               String username1=rs.getString("username");
               String photo=rs.getString("photo");
               String email=rs.getString("email");
               String point=rs.getString("points");
           
      
      out.write("\n");
      out.write("      \n");
      out.write("      <div><img width=\"150\"height=\"150\" src=\"");
      out.print(photo);
      out.write("\"</div>  \n");
      out.write("      <div>");
      out.print(username);
      out.write("<br>\n");
      out.write("          ");
      out.print(point);
      out.write("points<br>\n");
      out.write("          ");
      out.print(email);
      out.write("<br>\n");
      out.write("      </div>\n");
      out.write("      ");
}
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      ");

     
           if(session.getAttribute("username")!=null)
           {
      Class.forName("com.mysql.jdbc.Driver");
          Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
          ResultSet rs2 = stmt2.executeQuery("Select * from hit_count where hit_username='"+username+"' ");
          
          int hitsCount=0;
          
          if(rs2.next())
          {
             
                 hitsCount =rs2.getInt("hit_counter");
              
              hitsCount+=1;   
              
               rs2.moveToCurrentRow();
               rs2.updateInt("hit_counter",  hitsCount);
               rs2.updateRow();
    }
      else{
  
       rs2.moveToInsertRow();
       rs2.updateInt("hit_counter",0);
       rs2.updateString("hit_username",username);
       rs2.insertRow();
 
          
          
          }
  

      out.write("\n");
      out.write("      \n");
      out.write("<div>");
      out.print(hitsCount);
      out.write("profile views</div> \n");

           }
           else{
 
               
           }  
               

      out.write("\n");
      out.write("\n");
      out.write("<h1>Questions</h1><br>\n");


Class.forName("com.mysql.jdbc.Driver");
   
    Statement stmt3= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs3= stmt3.executeQuery("select * from question where username='"+username+"'");
         if(rs3.next())
         {
               
             Class.forName("com.mysql.jdbc.Driver");
                 Statement stmt4 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                 ResultSet rs4= stmt4.executeQuery("select * from question where username='"+username+"'");
               
               while(rs4.next())
               {
             String title=rs4.getString("title");  
             String user=rs4.getString("username");  
             int question_id=rs4.getInt("question_id");  
  

      out.write("\n");
      out.write("\n");
      out.write("<a href=\"view_question_detail.jsp?title=");
      out.print(title);
      out.write("&question_id=");
      out.print(question_id);
      out.write("&username=");
      out.print(username);
      out.write('"');
      out.write('>');
      out.print(title);
      out.write("<br></a>\n");
      out.write("\n");
}
         }
         else{
    
      out.write("\n");
      out.write("  \n");
      out.write("    <h2>No Questions added</h2>\n");
      out.write("        \n");
      out.write("   ");
}
      out.write('\n');


Class.forName("com.mysql.jdbc.Driver");
   
    Statement stmt5= bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs5= stmt5.executeQuery("select * from answers where ans_username='"+username+"'");

    while(rs5.next()){
        String answer=rs5.getString("answers");
         int ans_question_id=rs5.getInt("ans_question_id");
         
         Class.forName("com.mysql.jdbc.Driver");
             Statement stmt6 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs6 = stmt6.executeQuery("select * from question where question_id='"+ans_question_id+"' ");
               rs6.next();
              
     String title=rs6.getString("title");          

      out.write("\n");
      out.write("\n");
      out.write("<a href=\"view_question_detail.jsp?title=");
      out.print(title);
      out.write("&question_id=");
      out.print(ans_question_id);
      out.write("&username=");
      out.print(username);
      out.write('"');
      out.write('>');
      out.print(title);
      out.write("</a>\n");
      out.write("<h3>");
      out.print(answer);
      out.write("</h3>\n");
      out.write("\n");
}
      out.write('\n');
      out.write('\n');
 
    Statement stmt10 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs10 = stmt10.executeQuery("select * from users ORDER BY points DESC");
         int num=0;  
         System.out.println(request.getParameter("username"));
        while(rs10.next())
        {
            if(request.getParameter("username")==rs10.getString("username"))
            {
                break;
            }
System.out.println(num);
System.out.println(rs.getString("username"));
            num++;
        }

      out.write('\n');
      out.print(num);
      out.write(" rank\n");
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
