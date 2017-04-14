package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.user.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class detectedsentiment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/menu.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
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
      out.write("<center>\r\n");

String topic=request.getParameter("resultprcs");

HashMap<Integer, ArrayList<String>> sentimentdetected=new HashMap<Integer, ArrayList<String>>();
sentimentdetected=AdminDAO.getdetectedsentiment(topic);

System.out.println("Sentiment Dectected==========="+sentimentdetected);





      out.write("\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 5px;left:200px;\">\r\n");
      out.write("<p><b><h3><font color=\"red\">Detected Sentiment Details</font></h3></b></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"CSSTableGenerator\" style=\"width:580px;height:150px;\">\r\n");
      out.write("<table class=\"pretty-table\" border=\"1\" id=\"user\">\r\n");
      out.write("  \r\n");
      out.write("    <th scope=\"col\">No</th>\r\n");
      out.write("    <th scope=\"col\">Topic</th>\r\n");
      out.write("    <th scope=\"col\">TweetID</th>\r\n");
      out.write("    <th scope=\"col\">Tweet_text</th>\r\n");
      out.write("     <th scope=\"col\">Detected_Sentiment</th>\r\n");

if(sentimentdetected.size()>0)
                        	  	{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t\t \r\n");
      out.write("                       \r\n");
      out.write("                        \t\t  ");

                              	   int i=1;
                                 for(Map.Entry m4:sentimentdetected.entrySet())  
                                 {
                               	  m4.getKey();
                               	  String values = m4.getValue().toString();

                               	  String first=values.replace("[", "").replace("]", "");
                               	 String a[]=first.split("~~");
                               	 
                               	 
                               	System.out.println("arary1 is >>>>>>>>>>>>>>>>>>"+a[0]);
                               	System.out.println("arary2 is >>>>>>>>>>>>>>>>>>"+a[1]);
                               	System.out.println("arary3 is >>>>>>>>>>>>>>>>>>"+a[2]);
                               	System.out.println("arary4 is >>>>>>>>>>>>>>>>>>"+a[3]);
                               	System.out.println("arary5 is >>>>>>>>>>>>>>>>>>"+a[4]);
                               	   
      out.write("\r\n");
      out.write("                               \t  \r\n");
      out.write("                        \t   <tr>\r\n");
      out.write("                            <td>");
      out.print(a[0].trim());
      out.write("</td>\r\n");
      out.write("                                <td >");
      out.print(a[1].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[2].trim());
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[3].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[4].trim());
      out.write("</td>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t \r\n");
      out.write("                      \r\n");
      out.write("                        \t  \r\n");
      out.write("                        \t  ");
}
                                 
                                
                                 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t </table>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t<div id=\"pageNavPosition\" style=\"position:relative;top:250px;left:200px\"></div>\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('user',5); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(1);\r\n");
      out.write("    //--></script> \r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
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
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
