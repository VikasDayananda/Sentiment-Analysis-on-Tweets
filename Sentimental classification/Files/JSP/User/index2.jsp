<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web application for sentimental process</title>
<link href="<%=request.getContextPath()%>/Files/CSS/main.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/Files/CSS/main2.css" rel="stylesheet" type="text/css" />

<link href="<%=request.getContextPath()%>/Files/CSS/menu.css" rel="stylesheet" type="text/css" />
<%String uname=request.getParameter("name");
System.out.println("=============home========"+uname);
%>
<style>
quote{
   
   
    position: fixed;
    bottom: 0;
    width: 100%;
} 

mydiv {
    position:fixed;
    display:block
    top: 50%;
    left: 50%;
    width:30em;
    height:18em;
    margin-top: -9em; /*set to a negative number 1/2 of your height*/
    margin-left: -15em; /*set to a negative number 1/2 of your width*/
    border: 1px solid #ccc;
    background-color: #f3f3f3;
}
blockquote {
color: #e33e00;
font-style: italic;
font-family: GeoSlb712XBdBT;
padding:20px;
padding-left: 15px;
border-left: 3px solid #F63;


}

h1 {
    color: white;
}
p{
 color: white;
 font-size:200%;
 align:middle;
}
</style>
</head>


<body background="<%=request.getContextPath()%>/Files/Images/bg1.jpg">
<div id="navigation">
		<a href="<%=request.getContextPath()%>/Files/JSP/User/index2.jsp">Home</a>
		<a href="#">About</a>
		<a href="<%=request.getContextPath()%>/Files/JSP/User/changepass.jsp">Change passowrd</a>
		<a href="<%=request.getContextPath()%>/index.jsp">Logout</a>
	</div>
<h1 style="position:relative;left:15px;top:50px">Welcome user!</h1>

<p style="position:relative;left:300px;top:100px;">You can perform sentimental process on the tweets either you upload or dynamically from twitter</p>
<p style="position:relative;left:650px;top:100px;">Click below to upload the excel data file</p>
<p style="position:relative;left:580px;top:200px;">Click below to Retrieve tweets from twitter using Hadoop</p>
<p style="position:relative;left:635px;top:300px;"><i>Ready?</i>Click below to Begin the Sentiment process</p>
<div id="main2">
    <div class="container" style="position:absolute;left:800px;top:100px;">
        
        <section class="press">
          
            <button><a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/upload_file.jsp" method="get" target="myIframe">
				Upload tweets</button>
           
        </section>
    </div>
    <div id="main2">
    <div class="container" style="position:absolute;left:820px;top:250px;">
        
        <section class="press">
          
            <button><a class="a" href="http://localhost:8080/TweetsFetch/" target="_blank" method="get" >
				Get tweets</button>
           
        </section>
    </div>
</div><!-- #main -->
<div id="main3">
    <div class="container" style="position:absolute;left:840px;top:400px;">
        
        <section class="press">
          
            <button><a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/index3.jsp" method="get">
				Begin</button>
           
        </section>
    </div>
</div>
<div style=" position: fixed;
    bottom: 0;
    width: 100%;">
	<aside class="pquote">
    <blockquote>
        <p><b><em>"You can have data without information, but you cannot have information without data"</em></b></p>
    </blockquote>
</aside>
</div>
<div id="mydiv">
	<iframe align="middle"  style="margin-left:auto;margin-right:auto;" 
	frameborder="0" scrolling="auto" name="myIframe" height="470px" width="650px"></iframe></div>

</div>
</ul>
</nav>

</body>
</html>