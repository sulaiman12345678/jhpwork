package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/config.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


String mysql_host = "localhost";
String mysql_username = "root";
String mysql_password = "";
String mysql_db = "jsp_final";


      out.write('\n');
      out.write('\n');


Object user_id = session.getAttribute("user_id");
if (user_id == null) {
	response.sendRedirect("login.jsp");
}

Connection connect = null;
Statement statement = null;

try {
	Class.forName("com.mysql.jdbc.Driver");
	connect =  DriverManager.getConnection("jdbc:mysql://" + mysql_host + "/" + mysql_db + "" +"?user=" + mysql_username + "&password=" + mysql_password);
	statement = connect.createStatement();
	ResultSet user_data = statement.executeQuery("SELECT * FROM `users` WHERE `id` = '" + user_id.toString() + "';");
	if (!user_data.next()) {
		session.removeAttribute("user_id");
		response.sendRedirect("login.jsp");
	}
}  catch (Exception e) {
	out.println(e.getMessage());
	e.printStackTrace();
}
try {
	if (statement != null){
		statement.close();
		connect.close();
	}
} catch (SQLException e) {
}


      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>ผู้จัดทำ</title>\n");
      out.write("\t<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"assets/css/offcanvas.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\t<script defer src=\"assets/js/all.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-light\">\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg fixed-top navbar-dark bg-dark\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<a class=\"navbar-brand mb-0 h1\" href=\"#\">JSP Final</a>\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar\">\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav mr-auto\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"home.jsp\"><i class=\"fas fa-home\"></i>&nbsp; หน้าหลัก</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"data.jsp\"><i class=\"fas fa-list\"></i>&nbsp; รายชื่อผู้ใช้</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"map.jsp\"><i class=\"fas fa-map-marked-alt\"></i>&nbsp; แผนที่</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\"><i class=\"fas fa-id-card\"></i>&nbsp; ผู้จัดทำ</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"logout.jsp\"><i class=\"fas fa-sign-out-alt\"></i>&nbsp; ออกจากระบบ</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<main role=\"main\" class=\"container\">\n");
      out.write("\t\t<h2 class=\"pt-1 pb-2\"><i class=\"fas fa-id-card\"></i>&nbsp; ผู้จัดทำ</h2>\n");
      out.write("\t\t<div class=\"card\">\n");
      out.write("\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t<div class=\"row text-center pt-4\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 pb-4\">\n");
      out.write("\t\t\t\t\t\t<img alt=\"ธีรณัฐ มหัทธโนบล\" class=\"rounded-circle shadow\" width=\"140\" height=\"140\" src=\"assets/img/thiranat.jpg\" />\n");
      out.write("\t\t\t\t\t\t<h5 class=\"pt-4 mb-3\">ผู้พัฒนาระบบ</h5>\n");
      out.write("\t\t\t\t\t\t<h2>ธีรณัฐ มหัทธโนบล</h2>\n");
      out.write("\t\t\t\t\t\t<p class=\"text-muted\">รหัสประจำตัวนักศึกษา: 6139010001</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"pt-3\"><a class=\"btn btn-primary\" href=\"https://www.facebook.com/OungOungbabs\" role=\"button\"><i class=\"fab fa-facebook-square\"></i>&nbsp; @Sulaiman</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 pb-4\">\n");
      out.write("\t\t\t\t\t\t<img alt=\"อาสูรา สาเมาะ\" class=\"rounded-circle shadow\" width=\"140\" height=\"140\" src=\"assets/img/asura.jpg\" />\n");
      out.write("\t\t\t\t\t\t<h5 class=\"pt-4 mb-3\">ผู้ช่วยพัฒนาระบบ</h5>\n");
      out.write("\t\t\t\t\t\t<h2>อาสูรา สาเมาะ</h2>\n");
      out.write("\t\t\t\t\t\t<p class=\"text-muted\">รหัสประจำตัวนักศึกษา: 6139010006</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"pt-3\"><a class=\"btn btn-primary\" href=\"https://www.facebook.com/abdurohman.sensoe?ref=bookmarks\" role=\"button\"><i class=\"fab fa-facebook-square\"></i>&nbsp; @Abdulrohman</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 pb-4\">\n");
      out.write("\t\t\t\t\t\t<img alt=\"ธีระ บินกาเซ็ม\" class=\"rounded-circle shadow\" width=\"140\" height=\"140\" src=\"assets/img/teera.jpg\" />\n");
      out.write("\t\t\t\t\t\t<h5 class=\"pt-4 mb-3\">ครูที่ปรึกษา</h5>\n");
      out.write("\t\t\t\t\t\t<h2>ธีระ บินกาเซ็ม</h2>\n");
      out.write("\t\t\t\t\t\t<p class=\"text-muted\">หัวหน้าแผนกวิชา เทคโนโลยีสารสนเทศ</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"pt-3\"><a class=\"btn btn-primary\" href=\"https://www.facebook.com/BillKasem\" role=\"button\"><i class=\"fab fa-facebook-square\"></i>&nbsp; @BillKasem</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</main>\n");
      out.write("\t<p class=\"mt-4 small text-muted text-center\">&copy; 2019 Anak Patani</p>\n");
      out.write("\t<script defer src=\"assets/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("\t<script defer src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
