package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import com.util.*;

public final class reviewResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/button.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');

//String id=request.getAttribute("mark").toString();

String id1=request.getParameter("nmark");
System.out.println("negativereview :"+id1); 

String id2=request.getParameter("neumrk");
System.out.println("nuetralreview :"+id2); 

String id3=request.getParameter("pmark");
System.out.println("positivemark :"+id3); 


      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

if(Utility.parse(request.getParameter("no"))==1)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:100px;left:0px\">\r\n");
      out.write("\t<p><font color=\"green\"><h2>This product consist of more positive remarks...you can buy this product</h2></font></p>\r\n");
      out.write("<center>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<table  style=\"width: 200px ; color: black; font-weight: bold;\";>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Negative Review Count: </td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id1 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Neutral Review Count:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id2 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Positive Review Count:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id3 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div></center>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
}



if(Utility.parse(request.getParameter("no"))==2)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:100px;left:0px\">\r\n");
      out.write("\t<p><font color=\"green\"><h2>This product consist of more neutral marks...you may either buy or maynot</h2></font></p>\r\n");
      out.write("\t\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<table  style=\"width: 100px ; color: black; font-weight: bold;\";>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Negative Review Count: </td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id1 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Neutral Review Count: </td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id2 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Positive Review Count:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id3 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div></center>\r\n");
      out.write("</div>\r\n");
}
if(Utility.parse(request.getParameter("no"))==3)
{
      out.write("\r\n");
      out.write("<div class=\"gradientbuttons\" id=\"message\" style=\"position:absolute;top:100px;left:0px\">\r\n");
      out.write("\t<p><font color=\"green\"><h2>This product consist of more negative remarks...if you want you can buy</h2></font></p>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<table  style=\"width: 100px ; color: black; font-weight: bold;\";>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Negative Review Count: </td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id1 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Nuetral Review Count:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id2 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td>Positive Review Count:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>");
      out.print(id3 );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div></center>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
