package org.apache.jsp.WEB_002dINF.jsp.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<title>Admin Panel</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/layout.css\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/ie.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("<script src=\"../js/jquery-1.5.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/hideshow.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/jquery.tablesorter.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.equalHeight.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\".tablesorter\").tablesorter();\r\n");
      out.write("\t});\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t//When page loads...\r\n");
      out.write("\t\t$(\".tab_content\").hide(); //Hide all content\r\n");
      out.write("\t\t$(\"ul.tabs li:first\").addClass(\"active\").show(); //Activate first tab\r\n");
      out.write("\t\t$(\".tab_content:first\").show(); //Show first tab content\r\n");
      out.write("\r\n");
      out.write("\t\t//On Click Event\r\n");
      out.write("\t\t$(\"ul.tabs li\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"ul.tabs li\").removeClass(\"active\"); //Remove any \"active\" class\r\n");
      out.write("\t\t\t$(this).addClass(\"active\"); //Add \"active\" class to selected tab\r\n");
      out.write("\t\t\t$(\".tab_content\").hide(); //Hide all tab content\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar activeTab = $(this).find(\"a\").attr(\"href\"); //Find the href attribute value to identify the active tab + content\r\n");
      out.write("\t\t\t$(activeTab).fadeIn(); //Fade in the active ID content\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('.column').equalHeight();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<h1 class=\"site_title\">\r\n");
      out.write("\t\t\t<a href=\"WEB-INF/jsp/index.html\">Arcosapt</a>\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t<h2 class=\"section_title\">Dashboard</h2>\r\n");
      out.write("\t\t<div class=\"btn_view_site\">\r\n");
      out.write("\t\t\t<a href=\"#\">View Site</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end of header bar -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"secondary_bar\">\r\n");
      out.write("\t\t<div class=\"user\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tJohn Doe (<a href=\"#\">3 Messages</a>)\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<!-- <a class=\"logout_user\" href=\"#\" title=\"Logout\">Logout</a> -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"breadcrumbs_container\">\r\n");
      out.write("\t\t\t<div class=\"breadcrumbs\">\r\n");
      out.write("\t\t\t\t<a href=\"index.html\">Website Admin</a>\r\n");
      out.write("\t\t\t\t<div class=\"breadcrumb_divider\"></div>\r\n");
      out.write("\t\t\t\t<a class=\"current\">Dashboard</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end of secondary bar -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"sidebar\" class=\"column\">\r\n");
      out.write("\t\t<form class=\"quick_search\">\r\n");
      out.write("\t\t\t<input type=\"text\" value=\"Quick Search\"\r\n");
      out.write("\t\t\t\tonFocus=\"if(!this._haschanged){this.value=''};this._haschanged=true;\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<hr />\r\n");
      out.write("\t\t<h3>Content</h3>\r\n");
      out.write("\t\t<ul class=\"toggle\">\r\n");
      out.write("\t\t\t<li class=\"icn_new_article\"><a href=\"#\">New Article</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_edit_article\"><a href=\"#\">Edit Articles</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_categories\"><a href=\"#\">Categories</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_tags\"><a href=\"#\">Tags</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<h3>Users</h3>\r\n");
      out.write("\t\t<ul class=\"toggle\">\r\n");
      out.write("\t\t\t<li class=\"icn_add_user\"><a href=\"#\">Add New User</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_view_users\"><a href=\"#\">View Users</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_profile\"><a href=\"#\">Your Profile</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<h3>Media</h3>\r\n");
      out.write("\t\t<ul class=\"toggle\">\r\n");
      out.write("\t\t\t<li class=\"icn_folder\"><a href=\"#\">File Manager</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_photo\"><a href=\"#\">Gallery</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_audio\"><a href=\"#\">Audio</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_video\"><a href=\"#\">Video</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<h3>Admin</h3>\r\n");
      out.write("\t\t<ul class=\"toggle\">\r\n");
      out.write("\t\t\t<li class=\"icn_settings\"><a href=\"#\">Options</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_security\"><a href=\"#\">Security</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"icn_jump_back\"><a href=\"#\">Logout</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<hr />\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<strong>Copyright &copy; 2011 Website Admin</strong>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tTheme by <a href=\"http://www.medialoot.com\">MediaLoot</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- end of sidebar -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"main\" class=\"column\"></div>\r\n");
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
