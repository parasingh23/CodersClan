package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class view_005fquestion_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Questions</title>\n");
      out.write("        <link href=\"style1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"glyph.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script>\n");
      out.write("            var XML;  \n");
      out.write("              function post(obj)\n");
      out.write("            {\n");
      out.write("                var points=document.getElementById(\"points\").value;\n");
      out.write("              var username1=document.getElementById(\"username1\").value;\n");
      out.write("              var id = obj.id;\n");
      out.write("              var answer = document.getElementById(\"answer\").value;\n");
      out.write("                \n");
      out.write("              answer=answer.trim();\n");
      out.write("              \n");
      out.write("                if(answer===\"\")\n");
      out.write("                {\n");
      out.write("                alert(\"field can not be empty\");\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                                    else\n");
      out.write("                                    {\n");
      out.write("                                  document.getElementById(\"answer\").value=\"\";\n");
      out.write("                \n");
      out.write("                                   if(username1!=\"nousername\")\n");
      out.write("                                    {\n");
      out.write("                                        \n");
      out.write("                                        if(points<50)\n");
      out.write("                                        {\n");
      out.write("                                            alert(\"your points are too low to post an answer\");\n");
      out.write("                                        }\n");
      out.write("                                        else{\n");
      out.write("                                   XML = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                                   XML.open(\"GET\",\"post_answer_response.jsp?answer=\"+answer+\"&question_id=\"+id, true);\n");
      out.write("                                   XML.onreadystatechange = post1;\n");
      out.write("                                   XML.send();\n");
      out.write("                               }\n");
      out.write("                                     }\n");
      out.write("                                                      else{\n");
      out.write("             \n");
      out.write("                                                        alert(\"Pleas Login First\");\n");
      out.write("                                                         }\n");
      out.write("                                }\n");
      out.write("            }   \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            function post1() {\n");
      out.write("                \n");
      out.write("                if (XML.readyState === 4 && XML.status === 200)\n");
      out.write("                {\n");
      out.write("                    \n");
      out.write("                    document.getElementById(\"content\").innerHTML =XML.responseText;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            var ans_id1;\n");
      out.write("            function add(obj)\n");
      out.write("\n");
      out.write("            {\n");
      out.write("                var username2=document.getElementById(\"username1\").value;\n");
      out.write("                var ans_id = obj.id;\n");
      out.write("                ans_id1=obj.id;\n");
      out.write("             \n");
      out.write("              \n");
      out.write("                var comment = document.getElementById(\"comment\"+ans_id).value;\n");
      out.write("                    comment=comment.trim();\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                if(comment===\"\")\n");
      out.write("                {\n");
      out.write("                                        alert(\"feild can not be empty\");\n");
      out.write("\n");
      out.write("                }  \n");
      out.write("                                        else{\n");
      out.write("                                       document.getElementById(\"comment\"+ans_id).value=\"\";\n");
      out.write("                                       if(username2!==\"nousername\")\n");
      out.write("                                        {\n");
      out.write("                   \n");
      out.write("                                       XML = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                                      XML.open(\"POST\",\"add_comment_response.jsp?comment=\"+comment+\"&answer_id=\"+ans_id, true);\n");
      out.write("                                      XML.onreadystatechange = add1;\n");
      out.write("                                      XML.send();\n");
      out.write("                                      }\n");
      out.write("            \n");
      out.write("                                                else{\n");
      out.write("            \n");
      out.write("                                               alert(\"Pleas Login First\");  \n");
      out.write("                                                 }\n");
      out.write("                                 }\n");
      out.write("              } \n");
      out.write("          \n");
      out.write("           function add1() {\n");
      out.write("                \n");
      out.write("        if (XML.readyState === 4 && XML.status === 200)\n");
      out.write("                {\n");
      out.write("                  document.getElementById(\"commentsec\"+ans_id1).innerHTML =XML.responseText;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("          \n");
      out.write("            \n");
      out.write("                   function count(obj)\n");
      out.write("           {  \n");
      out.write("               \n");
      out.write("                                                        var username3=document.getElementById(\"username1\").value;\n");
      out.write("                                                        var like_count=document.getElementById(\"like_count\"+obj.id).innerHTML;\n");
      out.write("\n");
      out.write("                                                        var answer_id_1= obj.id;\n");
      out.write("                                                       ans_id1=answer_id_1;\n");
      out.write("              if(username3!==\"nousername\")\n");
      out.write("                {\n");
      out.write("                XML = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                XML.open(\"GET\",\"like_response.jsp?answer_id=\"+answer_id_1+\"&like_count_value=\"+like_count+\"\", true);\n");
      out.write("                XML.onreadystatechange = count1;\n");
      out.write("                XML.send();\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        else{\n");
      out.write("            \n");
      out.write("           alert(\"Pleas Login First\");  \n");
      out.write("        }\n");
      out.write("          } \n");
      out.write("             function count1() {\n");
      out.write("                if (XML.readyState === 4 && XML.status === 200)\n");
      out.write("                {\n");
      out.write("                 var res=XML.responseText;\n");
      out.write("                 res=res.trim();\n");
      out.write("                 if(res==\"alreadyliked\")\n");
      out.write("                 {\n");
      out.write("                     alert(\"you have already liked it\");\n");
      out.write("                     \n");
      out.write("                 }\n");
      out.write("                 else\n");
      out.write("                 {\n");
      out.write("                  \n");
      out.write("                document.getElementById(\"like_count\"+ans_id1).innerHTML =res;\n");
      out.write("                 }    \n");
      out.write("            }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("             function count2(obj)\n");
      out.write("           {  \n");
      out.write("               \n");
      out.write("                                                      var username4=document.getElementById(\"username1\").value;\n");
      out.write("                                                        var dislike_count=document.getElementById(\"dislike_count\"+obj.id).innerHTML;\n");
      out.write("\n");
      out.write("        var answer_id_2= obj.id;\n");
      out.write("             ans_id2=answer_id_2;\n");
      out.write("              if(username4!==\"nousername\")\n");
      out.write("                {\n");
      out.write("                XML = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                XML.open(\"GET\",\"dislike_response.jsp?dislike_ans=\"+answer_id_2+\"&dislike_count_value=\"+dislike_count+\"\", true);\n");
      out.write("                XML.onreadystatechange = count4;\n");
      out.write("                XML.send();\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        else{\n");
      out.write("            \n");
      out.write("           alert(\"Pleas Login First\");  \n");
      out.write("        }\n");
      out.write("          } \n");
      out.write("             function count4() {\n");
      out.write("                if (XML.readyState === 4 && XML.status === 200)\n");
      out.write("                {\n");
      out.write("                 var res=XML.responseText;\n");
      out.write("                 res=res.trim();\n");
      out.write("                 if(res==\"alreadydisliked\")\n");
      out.write("                 {\n");
      out.write("                     alert(\"you have already disliked it\");\n");
      out.write("                     \n");
      out.write("                 }\n");
      out.write("                 else\n");
      out.write("                 {\n");
      out.write("                  \n");
      out.write("                document.getElementById(\"dislike_count\"+ans_id2).innerHTML =res;\n");
      out.write("                 }    \n");
      out.write("            }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .answer_detail\n");
      out.write("            {\n");
      out.write("              text-align: right;\n");
      out.write("            }\n");
      out.write("            #content\n");
      out.write("            {\n");
      out.write("                padding: 20px 50px;\n");
      out.write("                margin-top: 200px;\n");
      out.write("            }\n");
      out.write("            .post_answer\n");
      out.write("            \n");
      out.write("            {\n");
      out.write("                background-color: #e0e0e0;\n");
      out.write("                padding: 50px;\n");
      out.write("                border-radius: 2%;\n");
      out.write("                margin: 0 100px;\n");
      out.write("            }\n");
      out.write("            .post_answer textarea\n");
      out.write("            {\n");
      out.write("                width:100%;\n");
      out.write("                height:200px;\n");
      out.write("            }\n");
      out.write("            .post_answer input\n");
      out.write("            {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #245580;\n");
      out.write("                color:#fff;\n");
      out.write("                border:none;\n");
      out.write("            }\n");
      out.write("             .post_answer input:hover\n");
      out.write("             {\n");
      out.write("                 background-color:#245269;\n");
      out.write("             }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            if(session.getAttribute("username")!=null)
       {
           String username1=session.getAttribute("username").toString();
       
      out.write("\n");
      out.write("       <input type=\"text\" id=\"username1\" value=\"");
      out.print(username1);
      out.write("\" hidden  />\n");
      out.write("       \n");
      out.write("       ");

       } else{
       
      out.write("\n");
      out.write("       <input type=\"text\" id=\"username1\" value=\"nousername\" hidden />\n");
      out.write("       \n");
      out.write("       ");
}
      out.write("\n");
      out.write("      \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        <div style=\"width:80%;height:60%;\">\n");
      out.write("\n");
      out.write("            ");

                String title = request.getParameter("title");
                String question_id = request.getParameter("question_id");

                Class.forName("com.mysql.jdbc.Driver");
                Connection bal = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system");
                Statement stmt = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from question where question_id='" + question_id + "' ");
                if (rs.next()) {

                    String description = rs.getString("description");
                    String content = rs.getString("content");
                    String keywords = rs.getString("keywords");
                    String date = rs.getString("date");
                    String category = rs.getString("category_name");

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <h3>");
      out.print(title);
      out.write("</h3>\n");
      out.write("                <h1 >");
      out.print(category);
      out.write("</h1>\n");
      out.write("                <p style=\"background-color:lightsteelblue;\">");
      out.print(description);
      out.write("</p>\n");
      out.write("                <div width=\"200\" style=\"background-color:lightgray;\">");
      out.print(content);
      out.write("</div>\n");
      out.write("                <span>");
      out.print(keywords);
      out.write("</span>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");

                String username = request.getParameter("username");
                Statement stmt1 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs1 = stmt1.executeQuery("select * from users where username='" + username + "'");

                if (rs1.next()) {
                    String photo = rs1.getString("photo");
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div style=\"width:20%;height:20%;float:right;text-align:center;\">\n");
      out.write("\n");
      out.write("                <h4>asked by:-</h4>   \n");
      out.write("                <h3>");
      out.print(username);
      out.write("</h3>\n");
      out.write("                <img  src=\"");
      out.print(photo);
      out.write("\" WIDTH=\"100\" height=\"100\" />\n");
      out.write("                <h4 >");
      out.print(date);
      out.write("</h4>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("            \n");
      out.write("               <div id=\"content\">\n");
      out.write("               <h1>Answers</h1>\n");
      out.write("                <hr  />\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                \n");
      out.write("             ");

          Class.forName("com.mysql.jdbc.Driver");
              Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
              ResultSet rs2 = stmt2.executeQuery("select * from answers where ans_question_id="+question_id+"");
               
             while(rs2.next()){
                 
                 
                  String answers=rs2.getString("answers");
                  String ans_username=rs2.getString("ans_username");
                  String date=rs2.getString("date1");
                  String answer_id=rs2.getString("answer_id");
                  
                  
           
      out.write("\n");
      out.write("             \n");
      out.write("             <div style=\" padding: 10px 20px; \">\n");
      out.write("              ");

        Class.forName("com.mysql.jdbc.Driver");
           
            Statement stmt7 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs7 = stmt7.executeQuery("select * from like_table where ans_id="+answer_id+"");
                 int count1=0;
             while(rs7.next()){
                 {  
            count1++;
                 }
             
           if(count1>=10){
               
           
        
      out.write("   \n");
      out.write("           \n");
      out.write("        <div><img src=\"tick1.png\"></div>\n");
      out.write("             \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

               
           }
           else{}
             }
        
      out.write("\n");
      out.write("        \n");
      out.write("                 \n");
      out.write("             <h5>");
      out.print(answers);
      out.write("</h5>\n");
      out.write("             <div class=\"answer_detail\" >\n");
      out.write("                 \n");
      out.write("                  \n");
      out.write("    <h5>answered by:-");
      out.print(ans_username);
      out.write("</h5>\n");
      out.write("    <h6>");
      out.print(date);
      out.write("</h6>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("             </div>\n");
      out.write("             </div>\n");
      out.write("    <div id=\"like\" class=\"inner-addon left-addon\">\n");
      out.write("        ");

        Class.forName("com.mysql.jdbc.Driver");
           
            Statement stmt4 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs4 = stmt4.executeQuery("select count(*) As rowcount from like_table where ans_id="+answer_id+"");
            if(rs4.next()){
           int count= rs4.getInt("rowcount");   
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h3 id=\"like_count");
      out.print(answer_id);
      out.write('"');
      out.write('>');
      out.print(count);
      out.write("</h3>\n");
      out.write("        <input type=\"text\" id=\"like_count_value\" hidden value=\"");
      out.print(count);
      out.write("\" />\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <button type=\"button\"  class=\"btn btn-info btn \" style=\"padding-left:  30px;\" id=\"");
      out.print(answer_id);
      out.write("\" onclick=\"count(this)\" />Like</button>\n");
      out.write("    <i class=\"glyphicon glyphicon-thumbs-up\" style=\"top:30px;\" ></i>\n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div id=\"dislike\" class=\"inner-addon left-addon\">\n");
      out.write("        ");

        Class.forName("com.mysql.jdbc.Driver");
           
            Statement stmt5 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs5 = stmt5.executeQuery("select count(*) As rowcount from dislike_table where dislike_ans="+answer_id+"");
            if(rs5.next()){
           int count= rs5.getInt("rowcount");   
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h3 id=\"dislike_count");
      out.print(answer_id);
      out.write('"');
      out.write('>');
      out.print(count);
      out.write("</h3>\n");
      out.write("        <input type=\"text\" id=\"dislike_count_value\" hidden value=\"");
      out.print(count);
      out.write("\" />\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <button type=\"button\"  class=\"btn btn-warning \" style=\"padding-left:  30px;\" id=\"");
      out.print(answer_id);
      out.write("\" onclick=\"count2(this)\" />Dislike</button>\n");
      out.write("    <i class=\"glyphicon glyphicon-thumbs-down\" style=\"top:30px;\" ></i>\n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div id=\"commentsec");
      out.print(answer_id);
      out.write("\">\n");
      out.write("                 <h3> Earlier Comments </h3>\n");
      out.write("                 \n");
      out.write("               ");

               
                Statement stmt3 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
              ResultSet rs3 = stmt3.executeQuery("select * from comments where answer_id="+answer_id+"");
              
             while(rs3.next()){
                 
             String comment1=rs3.getString("comment");
             String com_username=rs3.getString("com_username");
             String date1=rs3.getString("date");
             
            
             
      out.write("\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                 <span>");
      out.print(comment1);
      out.write("</span>\n");
      out.write("            \n");
      out.write("                 <span style=\"float:right;\">   ");
      out.print(date1);
      out.write("</span>\n");
      out.write("                 <a href=\"user_profile.jsp?username=");
      out.print(com_username);
      out.write("\" style=\"float:right;\">");
      out.print(com_username);
      out.write("</a>\n");
      out.write("\n");
      out.write("                 <hr>\n");
      out.write("            ");
}
      out.write(" \n");
      out.write("    </div>             \n");
      out.write("             \n");
      out.write("             <textarea id=\"comment");
      out.print(answer_id);
      out.write("\"></textarea>\n");
      out.write("             <input type=\"button\" value=\"Add Comment\" id=\"");
      out.print(answer_id);
      out.write("\" onclick=\"add(this)\" />\n");
      out.write("            \n");
      out.write("              \n");
      out.write("             \n");
      out.write("             <hr>\n");
      out.write("     ");
}
             
              
      out.write("           \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("            <div class=\"post_answer\">\n");
      out.write("               \n");
      out.write("                ");

                String username5=session.getAttribute("username").toString();
                 Class.forName("com.mysql.jdbc.Driver");
                    
                     Statement stmt6 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                     ResultSet rs6 = stmt6.executeQuery("select * from users where username='"+username5+"'");
               
                rs6.next();
                String point=rs6.getString("points");
                
                
                
      out.write("\n");
      out.write("                <input type=\"number\" value=\"");
      out.print(point);
      out.write("\" hidden id=\"points\">\n");
      out.write("\n");
      out.write("            <h3> Your answer</h3> \n");
      out.write("            <textarea  id=\"answer\" > </textarea>\n");
      out.write("            <input type=\"button\" value=\"Post\" id=\"");
      out.print(question_id);
      out.write("\" onclick=\"post(this)\" />\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("</body>\n");
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
