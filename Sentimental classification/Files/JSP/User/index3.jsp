<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link href="<%=request.getContextPath()%>/Files/CSS/main.css" rel="stylesheet" type="text/css" />

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
p{
 color: white;
 font-size:300%;
 
}
blockquote {
color: #e33e00;
font-style: italic;
font-family: GeoSlb712XBdBT;
padding:20px;
padding-left: 15px;
border-left: 3px solid #F63;


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
</style>
</head>


<body background="<%=request.getContextPath()%>/Files/Images/bg1.jpg">

<div id="navigation">
		<a href="<%=request.getContextPath()%>/Files/JSP/User/index2.jsp">Home</a>
		<a href="#">About</a>
		<a href="<%=request.getContextPath()%>/Files/JSP/User/changepass.jsp">Change passowrd</a>
		<a href="<%=request.getContextPath()%>/index.jsp">Logout</a>
	</div>
<div class="container">
<nav class="menu animated flipInX">

		<ul class="ul">
      
 
  
<%-- <div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/upload_file.jsp" target="myIframe">
				<h3>Upload_Data</h3>
				
			</a>
</div> --%>



<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/preprocess_select.jsp" method="get" target="myIframe">
				<h3>Preprocess Data</h3>
				
			</a>
</div>




<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/sentiment_select.jsp" method="get" target="myIframe">
				<h3>Sentiment Process</h3>
				
			</a>
</div>
      
<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/result_select.jsp" method="get" target="myIframe">
				<h3>Detected Sentimet</h3>
				
			</a>
</div>


 <div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/result_select1.jsp" method="get" target="myIframe">
				<h3>Result</h3>
				
			</a>
</div> 


      
		</ul>
	</nav>
</div>

<div style=" position: fixed;
    bottom: 0;
    width: 100%;">
	<aside class="pquote">
    <blockquote>
        <p>"Processed data is information, Processed information is knowledge, Processed knowledge is wisdom"</p>
    </blockquote>
</aside>
</div>

 <div style="position:absolute;top:150px;left:300px;display:block">
	<iframe align="middle"  style="margin-left:50%;" 
	frameborder="0" scrolling="auto" name="myIframe" height="500px" width="720px"></iframe>
</div>


	
</body>
</html>