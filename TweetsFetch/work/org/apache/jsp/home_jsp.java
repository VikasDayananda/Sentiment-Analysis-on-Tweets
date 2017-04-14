package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Twitter tweets fetch</title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/plugins/metisMenu/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/plugins/timeline.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/home.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"font-awesome-4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js\"></script>\n");
      out.write("     <script>\n");
      out.write(" $(function(){\n");
      out.write("\t $( \"#submit\" ).click(function() {\n");
      out.write("\t\t var formInput=$(this).serialize();\n");
      out.write("\t\t  var search=$('#search').val();\n");
      out.write("\t\t  console.log($('#search').val()); \n");
      out.write("\t\t   $.getJSON('SearchAction.action?search='+search, formInput,function(data) {\n");
      out.write("\t\t\tif(data.searchDetails !=null)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t$.each(data.searchDetails, function(key, val) {\n");
      out.write("\t\t            // Whatever you what to do, eg.\n");
      out.write("\t\t            console.log(key);\n");
      out.write("\t\t            console.log(val.id);\n");
      out.write("\t\t            console.log(val.screenName);\n");
      out.write("\t\t            console.log(val.name);\n");
      out.write("\t\t            console.log(val.createdDate);\n");
      out.write("\t\t            console.log(val.text);\n");
      out.write("\t\t            var row=' <tr> <td style=\"word-break:break-all;\"> '+ val.id +'</td> <td style=\"word-break:break-all;\">'+val.screenName +'</td><td style=\"word-break:break-all;\">'+val.name +'</td> <td style=\"word-break:break-all;\">'+val.createdDate +'</td>  <td style=\"word-break:break-all;\">'+val.text +'</td></tr> ';\n");
      out.write("\t\t            $('#result').append(row);\n");
      out.write("\t\t        });\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t  }); \n");
      out.write("\t\t });\n");
      out.write("\t\n");
      out.write("\t  \n");
      out.write("\t})\n");
      out.write(" </script> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"HiveSaveAction.action\" id=\"searchForm\">\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("                <div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("                    <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"active\" href=\"home.jsp\"><i class=\"\"></i>Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <!--   <li>\n");
      out.write("                            <a class=\"active\" href=\"flume.jsp\"><i class=\"\"></i>Flume</a>\n");
      out.write("                        </li>\n");
      out.write("                         <li>\n");
      out.write("                            <a class=\"active\" href=\"hdfs.jsp\"><i class=\"\"></i>Hive</a>\n");
      out.write("                        </li> -->\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"active\" href=\"clustering.jsp\"><i class=\"\"></i>Fetch tweets</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                    <h3 class=\"page-header\">Search</h3>\n");
      out.write("                    <table>\n");
      out.write("   \t\t\t\t\t <tr>\n");
      out.write("   \t\t\t\t\t <td  colspan=\"1\">\n");
      out.write("   \t\t\t\t\t <label><b>Search Word</b></label>\n");
      out.write("   \t\t\t\t\t </td>\n");
      out.write("   \t\t\t\t\t <td colspan=\"1\">\n");
      out.write("   \t\t\t\t\t <input id=\"search\" name=\"search\" type=\"text\"/>\n");
      out.write("   \t\t\t\t\t </td>\n");
      out.write("   \t\t\t\t\t </tr>\n");
      out.write("\t\t\t\t\t <tr  align=\"center\">\n");
      out.write("\t\t\t\t\t <td  colspan=\"0\">\n");
      out.write("\t\t\t\t\t <input id=\"submit\" type=\"button\" value=\"Submit\"/>\n");
      out.write("\t\t\t\t\t </td>\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t\t <td  colspan=\"0\">\n");
      out.write("\t\t\t\t\t <input id=\"Haddop\" type=\"submit\" value=\"Hadoop Store\"/>\n");
      out.write("\t\t\t\t\t </td>\n");
      out.write("\t\t\t\t\t </tr>\n");
      out.write("  \t\t\t\t    </table>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8s\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                <table id=\"result\" cellspacing=\"20\" width=\"100%\" style=\"border:1px solid rgb(177, 210, 228);\">\n");
      out.write("  <tbody>\n");
      out.write("  <tr style=\"\">\n");
      out.write("    <th width=\"20%\" bgcolor=\"#63E14F\" align=\"left\">Id</th>\n");
      out.write("    <th width=\"20%\" bgcolor=\"#63E14F\" align=\"left\">Screen Name</th>\n");
      out.write("    <th width=\"20%\" bgcolor=\"#63E14F\" align=\"left\">Name</th>\n");
      out.write("    <th width=\"20%\" bgcolor=\"#63E14F\" align=\"left\">Created Date</th>\n");
      out.write("    <th width=\"20%\" bgcolor=\"#63E14F\" align=\"left\">Text</th>\n");
      out.write("  </tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>  \n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("\n");
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
