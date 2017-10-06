<%-- 
    Document   : view_question_detail
    Created on : Apr 19, 2016, 5:47:21 PM
    Author     : PARASP
--%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Questions</title>
        <link href="glyph.css" rel="stylesheet" type="text/css"/>
        <%@include file="header.jsp" %>           
        <link href="3dButtons.css" rel="stylesheet" type="text/css"/>

        <script>
            var XML;
            function post(obj)
            {
                var username1 = document.getElementById("username1").value;
                var id = obj.id;
                var answer = document.getElementById("answer").value;

                answer = answer.trim();
            
answer= answer.replace("\n","~!@");
            
                if (answer === "")
                {
                    alert("answer cannot be empty");
                }

                else
                {
                    document.getElementById("answer").value = "";

                    if (username1 != "nousername")
                    {
                        var points = document.getElementById("points").value;


                        if (points < 50)
                        {
                            alert("Points should be equal or greater than 50");
                        }
                        else {
                            XML = new XMLHttpRequest();

                            XML.open("GET", "post_answer_response.jsp?answer=" + answer + "&question_id=" + id, true);
                            XML.onreadystatechange = post1;
                            XML.send();
                        }
                    }
                    else {

                        alert("Please Login First");
                    }
                }
            }




            function post1() {

                if (XML.readyState === 4 && XML.status === 200)
                {

                    document.getElementById("content").innerHTML = XML.responseText;
                }
            }


            var ans_id1;
            function add(obj)

            {
                var username2 = document.getElementById("username1").value;
                var ans_id = obj.id;
                ans_id1 = obj.id;


                var comment = document.getElementById("comment" + ans_id).value;
                comment = comment.trim();


                if (comment === "")
                {
                    alert("comment cannot be empty");

                }
                else {
                    document.getElementById("comment" + ans_id).value = "";
                    if (username2 !== "nousername")
                    {

                        XML = new XMLHttpRequest();

                        XML.open("POST", "add_comment_response.jsp?comment=" + comment + "&answer_id=" + ans_id, true);
                        XML.onreadystatechange = add1;
                        XML.send();
                    }

                    else {

                        alert("Please Login First");
                    }
                }
            }

            function add1() {

                if (XML.readyState === 4 && XML.status === 200)
                {
                    document.getElementById("commentsec" + ans_id1).innerHTML = XML.responseText;
                }
            }



            function count(obj)
            {

                var username3 = document.getElementById("username1").value;
                var like_count = document.getElementById("like_count" + obj.id).innerHTML;

                var answer_id_1 = obj.id;
                ans_id1 = answer_id_1;
                if (username3 !== "nousername")
                {
                    XML = new XMLHttpRequest();

                    XML.open("GET", "like_response.jsp?answer_id=" + answer_id_1 + "&like_count_value=" + like_count + "", true);
                    XML.onreadystatechange = count1;
                    XML.send();
                }

                else {

                    alert("Please Login First");
                }
            }
            function count1() {
                if (XML.readyState === 4 && XML.status === 200)
                {
                    var res = XML.responseText;
                    res = res.trim();
                    if (res == "alreadyliked")
                    {

                        alert(" Already liked by you");


                    }
                    else
                    {

                        document.getElementById("like_count" + ans_id1).innerHTML = res;
                    }
                }
            }




            function count2(obj)
            {

                var username4 = document.getElementById("username1").value;
                var dislike_count = document.getElementById("dislike_count" + obj.id).innerHTML;

                var answer_id_2 = obj.id;
                ans_id2 = answer_id_2;
                if (username4 !== "nousername")
                {
                    XML = new XMLHttpRequest();

                    XML.open("GET", "dislike_response.jsp?dislike_ans=" + answer_id_2 + "&dislike_count_value=" + dislike_count + "", true);
                    XML.onreadystatechange = count4;
                    XML.send();
                }

                else {

                    alert("Please Login First");
                }
            }
            function count4() {
                if (XML.readyState === 4 && XML.status === 200)
                {
                    var res = XML.responseText;
                    res = res.trim();
                    if (res == "alreadydisliked")
                    {
                        alert(" Already disliked by you");

                    }
                    else
                    {

                        document.getElementById("dislike_count" + ans_id2).innerHTML = res;
                    }
                }
            }






        </script>










        <style>
            .answer_detail
            {
                text-align: right;
            }
            #content
            {
                padding: 20px 50px;
                margin-top: 200px;
            }
            .post_answer

            {
                background-color: #e0e0e0;
                padding: 50px;
                border-radius: 2%;
                margin: 0 100px;
            }
            .post_answer textarea
            {
                width:100%;
                height:200px;
            }
            .post_answer input
            {
                padding: 10px 20px;
                background-color: #245580;
                color:#fff;
                border:none;
            }
            .post_answer input:hover
            {
                background-color:#245269;
            }
        </style>
    </head>
    <body>



        <%
            if (session.getAttribute("username") != null) {
                String username1 = session.getAttribute("username").toString();
        %>
        <input type="text" id="username1" value="<%=username1%>" hidden  />

        <%
        } else {
        %>
        <input type="text" id="username1" value="nousername" hidden />

        <%}%>

        <div class="container-fluid">

            <%
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
                    date = date.substring(0, date.length() - 5);
                    String category = rs.getString("category_name");

            %>

            <div style="width:100%;height:100%;">


                <div style="">
                    <div style="color:mediumblue;padding-left:20px;padding-top:20px;padding-bottom:10px;"><h3><b><%=title%></b></h3> </div>
                    <div style="color:mediumspringgreen;padding-left:20px;padding-bottom:10px;"> <h1 ><%=category%></h1> </div>
                    <div style="background-color:lavenderblush;padding-bottom:10px;padding:15px;margin-bottom: 10px;"> <p><%=description%></p></div>
                    <div style="background-color:whitesmoke;padding:20px;" ><xmp><%=content%></xmp></div>
                            <%
                                StringTokenizer keyword = new StringTokenizer(keywords, " ");

                                while (keyword.hasMoreTokens()) {

                            String key = keyword.nextToken();%>

                    <label style=";padding:10px;background: #99ff99;margin-top:10px;"><%=key%></label>

                    <%}%>    
                </div>

                <%
                    String username = request.getParameter("username");
                    Statement stmt1 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs1 = stmt1.executeQuery("select * from users where username='" + username + "'");

                    if (rs1.next()) {
                        String photo = rs1.getString("photo");
                %>


                <div style="width:20%;height:20%;float:right;text-align:center;">

                    <h4 style="padding-bottom:5px;">asked by</h4>   
                    <a href="user_profile1.jsp?username=<%=username%>" ><%=username%></a><br>
                    <img  src="<%=photo%>" WIDTH="100" height="100"  />
                    <h4 style="padding-top:20px;"><%=date%></h4>

                </div>

            </div>

            <%
                    }
                }
            %>



            <div id="content">
                <h1>Answers</h1>
                <hr  />




                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement stmt2 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs2 = stmt2.executeQuery("select * from answers where ans_question_id =" + question_id + " ORDER BY vote DESC ");

                    while (rs2.next()) {

                        String answers = rs2.getString("answers");
                        answers = answers.replaceAll("~!@", "\n");
                        String ans_username = rs2.getString("ans_username");
                        String date = rs2.getString("date1");
                        date = date.substring(0, date.length() - 5);
                        String answer_id = rs2.getString("answer_id");
                        int vote = rs2.getInt("vote");

                        Class.forName("com.mysql.jdbc.Driver");
                        Statement stmt8 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs8 = stmt8.executeQuery("select count(*) As rowcount from like_table where ans_id=" + answer_id + "");
                        if (rs8.next()) {
                            int count3 = rs8.getInt("rowcount");

                            Class.forName("com.mysql.jdbc.Driver");
                            Statement stmt9 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            ResultSet rs9 = stmt9.executeQuery("select count(*) As rowcount from dislike_table where dislike_ans=" + answer_id + "");
                            if (rs9.next()) {
                                int count4 = rs9.getInt("rowcount");
                                vote = count3 - count4;
                            }

                        }

                        rs2.moveToCurrentRow();
                        rs2.updateInt("vote", vote);
                        rs2.updateRow();


                %>

                <div style=" padding: 10px 20px; ">
                    <%                      Class.forName("com.mysql.jdbc.Driver");

                        Statement stmt7 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs7 = stmt7.executeQuery("select * from answers where answer_id=" + answer_id + "");
                        if (rs7.next()) {
                            int vote1 = rs7.getInt("vote");

                            if (vote1 >= 10) {


                    %>   

                    <img src="tick1.png">


                    <%                    }
                        } else {

                        }


                    %>

                    <b>  <%=vote%> votes  </b>
                    <div ><pre> <xmp style="white-space: pre-wrap;">  <%=answers%>  </xmp> </pre></div>
                    <div class="answer_detail" >


                        <a href="user_profile1.jsp?username=<%=ans_username%>"><span>-</span><%=ans_username%></a>
                        <h6><%=date%></h6>


                    </div>
                </div>
                <div id="like" class="inner-addon left-addon">
                    <%
                        Class.forName("com.mysql.jdbc.Driver");

                        Statement stmt4 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs4 = stmt4.executeQuery("select count(*) As rowcount from like_table where ans_id=" + answer_id + "");
                        if (rs4.next()) {
                            int count = rs4.getInt("rowcount");


                    %>


                    <h3 id="like_count<%=answer_id%>" style="padding-left:35px;"><%=count%></h3>
                    <input type="text" id="like_count_value" hidden value="<%=count%>" />
                    <%}%>
                    <button type="button" class="btn btn-primary btn-lg btn3d" style="width:80px;height:30px;padding-left:30px;padding-bottom:30px;"  id="<%=answer_id%>" onclick="count(this)"><span class="glyphicon glyphicon-thumbs-up" style="top:0px"></span>Like</button>



                </div>



                <div id="dislike" class="inner-addon left-addon">
                    <%
                        Class.forName("com.mysql.jdbc.Driver");

                        Statement stmt5 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs5 = stmt5.executeQuery("select count(*) As rowcount from dislike_table where dislike_ans=" + answer_id + "");
                        if (rs5.next()) {
                            int count = rs5.getInt("rowcount");

                    %>



                    <h3 id="dislike_count<%=answer_id%>" style="padding-left:35px;"><%=count%></h3>
                    <input type="text" id="dislike_count_value" hidden value="<%=count%>" />
                    <%}%>
                    <button type="button" class="btn btn-danger btn-lg btn3d" style="width:90px;height:30px;padding-left:30px;padding-bottom:30px;"  id="<%=answer_id%>" onclick="count2(this)"><span class="glyphicon glyphicon-thumbs-down" style="top:0px"></span>Dislike</button>



                </div>




                <div id="commentsec<%=answer_id%>">
                    <h3 style="padding-top:10px;padding-bottom:20px;"> Earlier Comments </h3>

                    <%

                        Statement stmt3 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs3 = stmt3.executeQuery("select * from comments where answer_id=" + answer_id + "");

                        while (rs3.next()) {

                            String comment1 = rs3.getString("comment");
                            String com_username = rs3.getString("com_username");
                            String date1 = rs3.getString("date");
                            date1 = date1.substring(0, date1.length() - 5);

                    %>


                    <span><%=comment1%></span>

                    <span style="float:right;">   <%=date1%></span>
                    <a href="user_profile1.jsp?username=<%=com_username%>" style="float:right;"><span>-</span><%=com_username%></a>

                    <hr>
                    <%}%> 
                </div>             
                <div> 
                    <textarea id="comment<%=answer_id%>"  ></textarea>
                    <input type="button" value="Add Comment" id="<%=answer_id%>" style="position: relative; top: -15px;" onclick="add(this)" />
                </div>



                <%

                    }

                %>           

            </div>

            <div class="post_answer">

                <%                    if (session.getAttribute("username") != null) {
                        String username5 = session.getAttribute("username").toString();
                        Class.forName("com.mysql.jdbc.Driver");

                        Statement stmt6 = bal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs6 = stmt6.executeQuery("select * from users where username='" + username5 + "'");

                        rs6.next();
                        String point = rs6.getString("points");


                %>

                <input type="text" value="<%=point%>" hidden id="points" />
                <%}%>
                <h3> Your answer</h3> 
                <textarea  id="answer" > </textarea>
                <input type="button" value="Post" id="<%=question_id%>" onclick="post(this)" />

            </div>
        </div>








    </body>
</html>
