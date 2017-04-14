package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.user.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.util.*;

public final class detectedsentiment1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
public int convert(String str) 
{ 
	int conv=0; 
	if(str==null) 
	{ 
		str="0"; 
	} 
	else if((str.trim()).equals("null")) 
	{ 
		str="0"; 
	} 
	else if(str.equals("")) 
	{ 
		str="0"; 
	} 
	try
	{ 
		conv=Integer.parseInt(str); 
	} 
	catch(Exception e) 
	{ 
	} 
	return conv; 
	} 

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");

System.out.println("Its came inside jsp page>>>>>>>>>>>"); 


String id1=request.getParameter("nmark");
System.out.println("negativereview :"+id1); 

String id2=request.getParameter("neumrk");
System.out.println("nuetralreview :"+id2); 

String id3=request.getParameter("pmark");
System.out.println("positivemark :"+id3); 



      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/menu.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Res/CSS/style1.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/pagination.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"cyan\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <div style=\"position: absolute;top: 5px;left:70px;\">\r\n");
      out.write("<p><b><h3><font color=\"red\">Detected Positive ,Negative and Neural Count for Dynamic Tweets</font></h3></b></p>\r\n");
      out.write("\r\n");
      out.write(" -->\r\n");

if(Utility.parse(request.getParameter("no"))==1)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:100px;left:0px\">\r\n");
      out.write("\t<p><font color=\"green\"><h2>Detected Positive ,Negative and Neural Count for Dynamic Tweets</h2></font></p>\r\n");
      out.write("<center>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<table  style=\"width: 200px ; color: black; font-weight: bold;\";>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Positive Count of Tweets:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id3 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Negative Count of Tweets: </td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id1 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>nuetral Count of Tweets:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id2 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div></center>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
}



      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
