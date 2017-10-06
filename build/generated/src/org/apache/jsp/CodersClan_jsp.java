package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.StringTokenizer;
import java.sql.*;

public final class CodersClan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Coders Clan</title>\n");
      out.write("    ");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Tutelage Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"glyph.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/swipebox.css\">\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Alegreya:400,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
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
      out.write("\t<!-- start-smoth-scrolling -->\n");
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
      out.write("                                            <h1><a class=\"navbar-brand\" href=\"CodersClan.jsp\"><i class=\"glyphicon glyphicon-education\" aria-hidden=\"true\"></i><span>Coders</span>Clan</a></h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse nav-wil\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                                                                       <li><a class=\"hvr-overline-from-center button2\" href=\"all_users.jsp\">Users</a></li>\n");
      out.write("                                                                                                       <li><a class=\"hvr-overline-from-center button2\" href=\"all_questions.jsp\">Questions</a></li>\n");
      out.write("                                                                                                       <li><a class=\"hvr-overline-from-center button2\" href=\"all_categories.jsp\">Categories</a></li>\n");
      out.write("                                                                                                       <li><a class=\"hvr-overline-from-center button2\" href=\"add_question.jsp\">Ask Question</a></li>\n");
      out.write("\t\t\t\t\t\t\t ");
 
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
      out.write("            <li><a href=\"user_profile1.jsp?username=");
      out.print(sessionusername);
      out.write("\">My Profile</a></li>\n");
      out.write("            <li><a href=\"view_my_question.jsp\">My Questions</a></li>\n");
      out.write("            <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("             \n");
      out.write("         <li><input  class=\"form-group inner-addon right-addon\"  style=\"width:150px;height:30px;margin-top: 20px;\" type=\"text\"  placeholder=\"Enter your question...\" value=\"\" id=\"search\">\n");
      out.write("             <i class=\"glyphicon glyphicon-search\" style=\"\" onclick=\"search()\"></i>     </div>                               </li>\n");
      out.write("             ");
}
                                                                                                              else{
      out.write("\n");
      out.write("                                                                                                \n");
      out.write("             \n");
      out.write("         <a class=\" btn btn-primary\" href=\"user_sign_up.jsp\" style=\"border:solid;padding-left:30px;padding-right:30px;\">Signup</a>\n");
      out.write("           <a class=\" btn btn-warning\" href=\"user_login.jsp\" style=\" border:solid;;padding-left:30px;padding-right:30px;\">Login</a>\n");
      out.write("             \n");
      out.write("        <input  class=\"form-group\"  style=\"width:150px;height:30px;margin-top: 20px;\" type=\"text\"  placeholder=\"Enter your question...\" value=\"\" id=\"search\">\n");
      out.write("                                                                <i class=\"glyphicon glyphicon-search\" onclick=\"search()\" style=\"cursor:pointer;\"></i>                                   \n");
      out.write("                                                                                                       ");
}
      out.write("\n");
      out.write("                                                                                                       \n");
      out.write("                                                                   \n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                                             \n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t</div> <!-- /navbar-collapse -->\n");
      out.write("\t\t\t\t\t<!-- search-scripts -->\n");
      out.write("\t\t\t\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\n");
      out.write("\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                        function search(){\n");
      out.write("                                                          \n");
      out.write("                                                        var title=document.getElementById(\"search\").value;    \n");
      out.write("                                                           \n");
      out.write("                                                            window.location=\"search_question.jsp?title=\"+title+\"&keywords=\"+title;\n");
      out.write("                                                            \n");
      out.write("                                                        }\n");
      out.write("                                                        \n");
      out.write("                                                  \n");
      out.write("                                                        \n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t<!-- //search-scripts -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<!-- smooth scrolling -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t/*\n");
      out.write("\t\t\tvar defaults = {\n");
      out.write("\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t};\n");
      out.write("\t\t*/\t\t\t\t\t\t\t\t\n");
      out.write("\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("<!-- //smooth scrolling -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- banner -->\n");
      out.write("<div class=\"banner\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\t\t\t// You can also use \"$(window).load(function() {\"\n");
      out.write("\t\t\t\t\t\t\t\t\t$(function () {\n");
      out.write("\t\t\t\t\t\t\t\t\t // Slideshow 4\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#slider3\").responsiveSlides({\n");
      out.write("\t\t\t\t\t\t\t\t\t\tauto: true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpager: true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tnav: false,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tspeed: 500,\n");
      out.write("\t\t\t\t\t\t\t\t\t\tnamespace: \"callbacks\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbefore: function () {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('.events').append(\"<li>before event fired.</li>\");\n");
      out.write("\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\tafter: function () {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$('.events').append(\"<li>after event fired.</li>\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t</script>\n");
      out.write("\n");
      out.write("\t\t\t<div  id=\"top\" class=\"callbacks_container\">\n");
      out.write("\t\t\t\t<ul class=\"rslides\" id=\"slider3\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Talk is cheap,show us the code</h3>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Learning Online Becomes Easier And Faster</h3>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Make A Huge Difference Start Your Career journey With Us</h3>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-info\">\n");
      out.write("\t\t\t\t\t\t\t<h3>while(!(succeed=try()));</h3>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- //banner -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- our facilities -->\n");
      out.write("<div class=\"facilities\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("                <div style=\"float:right;font-size:25px;\"><a href=\"all_categories.jsp\">All Categories</a></div>\n");
      out.write("\t\t<h3 class=\"tittle\">Categories</h3> \n");
      out.write("\t\t\t<script src=\"js/jquery.swipebox.min.js\"></script> \n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t  var XML;\n");
      out.write("            \n");
      out.write("         function view(obj){\n");
      out.write("             var category_name=obj.id;\n");
      out.write("           \n");
      out.write("             \n");
      out.write("          XML=new XMLHttpRequest();\n");
      out.write("          \n");
      out.write("          XML.open(\"GET\",\"view_question_home.jsp?category_name=\"+category_name,true);\n");
      out.write("          XML.onreadystatechange=view1;\n");
      out.write("          XML.send();\n");
      out.write("          \n");
      out.write("             \n");
      out.write("         }\n");
      out.write("           \n");
      out.write("    \n");
      out.write("    function view1(){\n");
      out.write("            if(XML.readyState===4 && XML.status===200)\n");
      out.write("         {\n");
      out.write("        document.getElementById(\"question\").innerHTML=XML.responseText;\n");
      out.write("        }\n");
      out.write("    }\t\t\n");
      out.write("    \n");
      out.write("    \n");
      out.write("                                                                                                       jQuery(function($) {\n");
      out.write("\t\t\t\t\t\t\t$(\".swipebox\").swipebox();\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("                        \n");
      out.write("                         ");

        
        Class.forName("com.mysql.jdbc.Driver");
            Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
            Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from category ");
            int count1=0;   
        while(rs.next())
        {
        count1++;
        String category_name=rs.getString("category_name");
        String photo=rs.getString("photo");
        String description=rs.getString("category_description");
      if(count1==10)
      {
      
      break;
      }
     
      out.write("\n");
      out.write("                        \n");
      out.write("     <div class=\" view ih-item square effect6 from_top_and_bottom category12\" style=\"height:300px; cursor:pointer\" ><a id=\"");
      out.print(category_name);
      out.write("\" onclick=\"view(this)\">\n");
      out.write("        <div class=\"img\"><img style=\"width:100%; height:300px;\" src=\"");
      out.print(photo);
      out.write("\" alt=\"img\"></div>\n");
      out.write("        <div class=\"info\">\n");
      out.write("          <h3>");
      out.print(category_name);
      out.write("</h3>\n");
      out.write("          <p>");
      out.print(description);
      out.write("</p>\n");
      out.write("        \n");
      out.write("        </div></a></div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                ");
}
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- //our facilities -->\n");
      out.write("<!-- features -->\n");
      out.write("<div class=\"features\">\n");
      out.write("\t<div class=\"container\" id=\"question\">\n");
      out.write("\t <h2 style=\"text-align: center;color:red;font-family: 'Open Sans', sans-serif;\">Questions</h2>\n");
      out.write("         ");

         
         Class.forName("com.mysql.jdbc.Driver");
            Statement stmt1 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs1 = stmt1.executeQuery("select * from question ORDER BY question_id DESC ");
          
            int count=0;
         
            while(rs1.next()){
               
              count++;  
                
            String title=rs1.getString("title");
           String keywords=rs1.getString("keywords");
            String question_id=rs1.getString("question_id");
            String description=rs1.getString("description");
                            
                             
            String username=rs1.getString("username");

            if(count==11){
            break;
            }
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = stmt2.executeQuery("select count(*) As rowcount from answers where ans_question_id="+question_id+"");
          if(rs2.next()){
            int answer=rs2.getInt("rowcount");
             
         
      out.write("\n");
      out.write("         \n");
      out.write("         <div>\n");
      out.write("             \n");
      out.write("             <div style=\"border:groove;border-color:red;width:70px;height:50px;text-align:center;margin:auto;float:left;\">");
      out.print(answer);
      out.write(" <br> answers</div>   \n");
      out.write("             <div style=\"padding-left:50px;padding-bottom:30px;\"> <a href=\"view_question_detail.jsp?title=");
      out.print(title);
      out.write("&question_id=");
      out.print(question_id);
      out.write("&username=");
      out.print(username);
      out.write("\n");
      out.write("                                                                     \" style=\"padding-left:50px;font-size:20px;\">");
      out.print(title);
      out.write("</a></div>\n");
      out.write("                      <div style=\"background-color:whitesmoke;padding:10px;\">");
      out.print(description);
      out.write(" </div>\n");
      out.write("             </div><br>\n");
      out.write("                      \n");
      out.write("                          \n");
      out.write("                      ");
 
                      StringTokenizer keyword = new StringTokenizer(keywords," " );
                           
                             while (keyword.hasMoreTokens()) {  
          
       String key= keyword.nextToken();
      out.write("\n");
      out.write("                      \n");
      out.write("                          <div style=\"padding-top:30px;padding-left:100px;\"> <span style=\"background-color:lightgreen;padding:8px;\">");
      out.print(key);
      out.write("</span></div>\n");
      out.write("                          \n");
      out.write("                              ");
}
      out.write("\n");
      out.write("                      \n");
      out.write("                 <hr />\n");
      out.write("         ");

          
                             }
            }
            
            
      out.write("\n");
      out.write("         \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("         \n");
      out.write("     \n");
      out.write("\t\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("        </div></div>\n");
      out.write("</div>\n");
      out.write("<!-- //features -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
