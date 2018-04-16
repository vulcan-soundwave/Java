package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _403_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');

  response.setHeader("WWW-Authenticate", "Basic realm=\"Tomcat Manager Application\"");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("  <title>403 Access Denied</title>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("    <!--\r\n");
      out.write("    BODY {font-family:Tahoma,Arial,sans-serif;color:black;background-color:white;font-size:12px;}\r\n");
      out.write("    H1 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:22px;}\r\n");
      out.write("    PRE, TT {border: 1px dotted #525D76}\r\n");
      out.write("    A {color : black;}A.name {color : black;}\r\n");
      out.write("    -->\r\n");
      out.write("  </style>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body>\r\n");
      out.write("   <h1>403 Access Denied</h1>\r\n");
      out.write("   <p>\r\n");
      out.write("    You are not authorized to view this page.\r\n");
      out.write("   </p>\r\n");
      out.write("   <p>\r\n");
      out.write("    If you have already configured the Manager application to allow access and\r\n");
      out.write("    you have used your browsers back button, used a saved book-mark or similar\r\n");
      out.write("    then you may have triggered the cross-site request forgery (CSRF) protection\r\n");
      out.write("    that has been enabled for the HTML interface of the Manager application. You\r\n");
      out.write("    will need to reset this protection by returning to the \r\n");
      out.write("    <a href=\"");
      out.print(request.getContextPath());
      out.write("/html\">main Manager page</a>. Once you\r\n");
      out.write("    return to this page, you will be able to continue using the Manager\r\n");
      out.write("    appliction's HTML interface normally. If you continue to see this access\r\n");
      out.write("    denied message, check that you have the necessary permissions to access this\r\n");
      out.write("    application.\r\n");
      out.write("   </p>\r\n");
      out.write("   <p>\r\n");
      out.write("    If you have not changed\r\n");
      out.write("    any configuration files, please examine the file\r\n");
      out.write("    <tt>conf/tomcat-users.xml</tt> in your installation. That\r\n");
      out.write("    file must contain the credentials to let you use this webapp.\r\n");
      out.write("   </p>\r\n");
      out.write("   <p>\r\n");
      out.write("    For example, to add the <tt>manager-gui</tt> role to a user named\r\n");
      out.write("    <tt>tomcat</tt> with a password of <tt>s3cret</tt>, add the following to the\r\n");
      out.write("    config file listed above.\r\n");
      out.write("   </p>\r\n");
      out.write("<pre>\r\n");
      out.write("&lt;role rolename=\"manager-gui\"/&gt;\r\n");
      out.write("&lt;user username=\"tomcat\" password=\"s3cret\" roles=\"manager-gui\"/&gt;\r\n");
      out.write("</pre>\r\n");
      out.write("   <p>\r\n");
      out.write("    Note that for Tomcat 7 onwards, the roles required to use the manager\r\n");
      out.write("    application were changed from the single <tt>manager</tt> role to the\r\n");
      out.write("    following four roles. You will need to assign the role(s) required for\r\n");
      out.write("    the functionality you wish to access.\r\n");
      out.write("   </p>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><tt>manager-gui</tt> - allows access to the HTML GUI and the status\r\n");
      out.write("          pages</li>\r\n");
      out.write("      <li><tt>manager-script</tt> - allows access to the text interface and the\r\n");
      out.write("          status pages</li>\r\n");
      out.write("      <li><tt>manager-jmx</tt> - allows access to the JMX proxy and the status\r\n");
      out.write("          pages</li>\r\n");
      out.write("      <li><tt>manager-status</tt> - allows access to the status pages only</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("   <p>\r\n");
      out.write("    The HTML interface is protected against CSRF but the text and JMX interfaces\r\n");
      out.write("    are not. To maintain the CSRF protection:\r\n");
      out.write("   </p>\r\n");
      out.write("   <ul>\r\n");
      out.write("    <li>Users with the <tt>manager-gui</tt> role should not be granted either\r\n");
      out.write("        the <tt>manager-script</tt> or <tt>manager-jmx</tt> roles.</li>\r\n");
      out.write("    <li>If the text or jmx interfaces are accessed through a browser (e.g. for\r\n");
      out.write("        testing since these interfaces are intended for tools not humans) then\r\n");
      out.write("        the browser must be closed afterwards to terminate the session.</li>\r\n");
      out.write("   </ul>\r\n");
      out.write("   <p>\r\n");
      out.write("    For more information - please see the\r\n");
      out.write("    <a href=\"/docs/manager-howto.html\">Manager App HOW-TO</a>.\r\n");
      out.write("   </p>\r\n");
      out.write(" </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
