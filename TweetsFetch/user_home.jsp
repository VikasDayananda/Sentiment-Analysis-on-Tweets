<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link href="<%=request.getContextPath()%>/Files/CSS/menu.css" rel="stylesheet" type="text/css" />

</head>


<body background="<%=request.getContextPath()%>/Files/Images/back.jpg">

<IMG SRC="<%=request.getContextPath()%>/Files/Images/title1.png" width=100% height="13%" style="position: absolute;top: -0.5px;left: 5px;" BORDER="0" ALT="">

<div class="container">
<nav class="menu animated flipInX">

		<ul class="ul">
      
 
  



<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Preprocessingdata" method="get" target="myIframe">
				<h3>Preprocessing_Data</h3>
				
			</a>
</div>




<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Sentimentprocess" method="get" target="myIframe">
				<h3>Sentiment_Process</h3>
				
			</a>
</div>
      
<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/detectedsentiment.jsp" method="get" target="myIframe">
				<h3>Result</h3>
				
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