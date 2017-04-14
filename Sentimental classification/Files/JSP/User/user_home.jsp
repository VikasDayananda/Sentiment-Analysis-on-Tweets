<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link href="<%=request.getContextPath()%>/Files/CSS/menu.css" rel="stylesheet" type="text/css" />
<%String uname=request.getParameter("name");
System.out.println("=============home========"+uname);
%>
<style>
html{
background: url(Files/Images/bg1.jpg) no-repeat center center fixed; 
 overflow-y: hidden ! important;
        overflow-x: hidden ! important;
        background-color: #f8f8f8;
         background-size: 100% 100%;
        background-repeat: no-repeat;
    background-position: center;
}
</style>
</head>





<div class="container">
<nav class="menu animated flipInX">

		<ul class="ul">
      
<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/upload_file.jsp" target="myIframe">
				<h3>Upload_Data</h3>
				
			</a>
</div>



<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/preprocess_select.jsp" method="get" target="myIframe">
				<h3>Preprocessing Data</h3>
				
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

<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/changepass.jsp?name=<%=uname%>" method="get" target="myIframe">
				<h3>Change Password</h3>
				
			</a>
</div>
      
<div class ="link">      
			<a class ="a" href="<%=request.getContextPath()%>/index.jsp">
				<h3>Logout</h3>
				
			</a>
</div>
      

      
		</ul>
	</nav>
</div>



<div style="position:absolute;top:150px;left:300px;">
	<iframe align="middle"  style="margin-left: 60px;" 
	frameborder="0" scrolling="auto" name="myIframe" height="470px" width="650px"></iframe>
</div>
	
</body>
</html>