package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Web application for sentimental process</title>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/main.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/main2.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/menu.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
String uname=request.getParameter("name");
System.out.println("=============home========"+uname);

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("quote{\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    position: fixed;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("mydiv {\r\n");
      out.write("    position:fixed;\r\n");
      out.write("    display:block\r\n");
      out.write("    top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    width:30em;\r\n");
      out.write("    height:18em;\r\n");
      out.write("    margin-top: -9em; /*set to a negative number 1/2 of your height*/\r\n");
      out.write("    margin-left: -15em; /*set to a negative number 1/2 of your width*/\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    background-color: #f3f3f3;\r\n");
      out.write("}\r\n");
      out.write("blockquote {\r\n");
      out.write("color: #e33e00;\r\n");
      out.write("font-style: italic;\r\n");
      out.write("font-family: GeoSlb712XBdBT;\r\n");
      out.write("padding:20px;\r\n");
      out.write("padding-left: 15px;\r\n");
      out.write("border-left: 3px solid #F63;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write("p{\r\n");
      out.write(" color: white;\r\n");
      out.write(" font-size:200%;\r\n");
      out.write(" align:middle;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body background=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/bg1.jpg\">\r\n");
      out.write("<div id=\"navigation\">\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/User/index2.jsp\">Home</a>\r\n");
      out.write("\t\t<a href=\"#\">About</a>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/User/changepass.jsp\">Change passowrd</a>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\">Logout</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("<h1 style=\"position:relative;left:15px;top:50px\">Welcome user!</h1>\r\n");
      out.write("\r\n");
      out.write("<p style=\"position:relative;left:300px;top:100px;\">You can perform sentimental process on the tweets either you upload or dynamically from twitter</p>\r\n");
      out.write("<p style=\"position:relative;left:650px;top:100px;\">Click below to upload the excel data file</p>\r\n");
      out.write("<p style=\"position:relative;left:580px;top:200px;\">Click below to Retrieve tweets from twitter using Hadoop</p>\r\n");
      out.write("<p style=\"position:relative;left:635px;top:300px;\"><i>Ready?</i>Click below to Begin the Sentiment process</p>\r\n");
      out.write("<div id=\"main2\">\r\n");
      out.write("    <div class=\"container\" style=\"position:absolute;left:800px;top:100px;\">\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"press\">\r\n");
      out.write("          \r\n");
      out.write("            <button><a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/User/upload_file.jsp\" method=\"get\" target=\"myIframe\">\r\n");
      out.write("\t\t\t\tUpload tweets</button>\r\n");
      out.write("           \r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"main2\">\r\n");
      out.write("    <div class=\"container\" style=\"position:absolute;left:820px;top:250px;\">\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"press\">\r\n");
      out.write("          \r\n");
      out.write("            <button><a class=\"a\" href=\"http://localhost:8080/TweetsFetch/\" target=\"_blank\" method=\"get\" >\r\n");
      out.write("\t\t\t\tGet tweets</button>\r\n");
      out.write("           \r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("</div><!-- #main -->\r\n");
      out.write("<div id=\"main3\">\r\n");
      out.write("    <div class=\"container\" style=\"position:absolute;left:840px;top:400px;\">\r\n");
      out.write("        \r\n");
      out.write("        <section class=\"press\">\r\n");
      out.write("          \r\n");
      out.write("            <button><a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/User/index3.jsp\" method=\"get\">\r\n");
      out.write("\t\t\t\tBegin</button>\r\n");
      out.write("           \r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\" position: fixed;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    width: 100%;\">\r\n");
      out.write("\t<aside class=\"pquote\">\r\n");
      out.write("    <blockquote>\r\n");
      out.write("        <p><b><em>\"You can have data without information, but you cannot have information without data\"</em></b></p>\r\n");
      out.write("    </blockquote>\r\n");
      out.write("</aside>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"mydiv\">\r\n");
      out.write("\t<iframe align=\"middle\"  style=\"margin-left:auto;margin-right:auto;\" \r\n");
      out.write("\tframeborder=\"0\" scrolling=\"auto\" name=\"myIframe\" height=\"470px\" width=\"650px\"></iframe></div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
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
