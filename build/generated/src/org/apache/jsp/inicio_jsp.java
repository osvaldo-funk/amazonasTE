package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("       <meta name=\"description\" content=\"\"/>\n");
      out.write("       <meta name=\"distribution\" content=\"global\"/>\n");
      out.write("        <title>Amazonas Travel Experience</title>\n");
      out.write("        <link rel=\"shorcut icon\" href=\"img/icono_opacidad.ico\"/>\n");
      out.write("        <link href=\"css/cabecera.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/banner.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/menu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/imageninicio.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Quicksand\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.waypoints.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!--<script src=\"js/header.js\" type=\"text/javascript\"></script>-->\n");
      out.write("        <script src=\"js/menu.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/cambioimagen.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header class=\"header\">\n");
      out.write("            \n");
      out.write("        <div class=\"cabecera\">\n");
      out.write("            <input type=\"checkbox\" id=\"menuicon\">\n");
      out.write("            <script src=\"js/cambioimagen.js\" type=\"text/javascript\"></script>\n");
      out.write("            <div class=\"logocontenedor\">\n");
      out.write("                <center>\n");
      out.write("                    <a href=\"inicio.jsp\"><img src=\"img/icono opacidad.png\" alt=\"\"/></a>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <center>\n");
      out.write("                \n");
      out.write("                <div class=\"redes\">\n");
      out.write("                <a href=\"http://twitter.com\" target=\"_blank\"><img class=\"twitter\" src=\"img/twitterwhite.png\" alt=\"\"/></a>\n");
      out.write("                <a href=\"http://hotmail.com\" target=\"_blank\"><img class=\"correo\" src=\"img/correoblanco.png\" alt=\"\"/></a>\n");
      out.write("                <a href=\"https://www.facebook.com/Amazonaste/?ref=br_rs\" target=\"_blank\"><img class=\"facebook\" src=\"img/facebook.png\" alt=\"\"/></a>\n");
      out.write("                <a href=\"http://instagram.com\" target=\"_blank\"><img class=\"instagram\" src=\"img/instagramwhite.png\" alt=\"\"/></a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <label class=\"menubtn\" for=\"menuicon\"><img name=\"menu\" src=\"img/menuwhite.png\" width=\"25px\" height=\"20px\"> </label>  \n");
      out.write("            </center>\n");
      out.write("            <nav class=\"menu\">\n");
      out.write("                <a href=\"\" style=\"color: rgb(255, 172, 60);\">Inicio</a>\n");
      out.write("                <a href=\"\">Promociones</a>\n");
      out.write("                <a href=\"\">Experiencias</a>\n");
      out.write("                <a href=\"\">Nosotros</a></b>\n");
      out.write("                <a href=\"\">Contacto</a>\n");
      out.write("            </nav>\n");
      out.write("      </div>\n");
      out.write("        </header>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("            <main>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                \n");
      out.write("                <section id=\"titulo\">\n");
      out.write("                    <hr>\n");
      out.write("                    <center>\n");
      out.write("                    <img class=\"animated fadeIn\" style=\"width: 60px; height: 60px;\" id=\"imagen\" src=\"img/icono opacidad.png\" alt=\"\"/>\n");
      out.write("                    <h1><span style=\"color: rgb(120, 27, 27);\">amazonas</span> TRAVEL EXPERIENCE</h1>\n");
      out.write("                    <br>\n");
      out.write("                    <hr>\n");
      out.write("                    </center>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("            </main>\n");
      out.write("   <!-- <center>\n");
      out.write("        <div class=\"contenedorvideo\">\n");
      out.write("        <section class=\"video\">\n");
      out.write("         \n");
      out.write("             <center>\n");
      out.write("                 <video width=\"100%\" controls autoplay=\"autoplay\" muted>\n");
      out.write("                    <source src=\"videos/08 Estrellas del Bicentenario CHIAPAS  ®TELEVISA 3 mins. HD 1080p.mp4\" type=\"video/mp4\">\n");
      out.write("                    Your browser does not support the <code>video</code> tag.\n");
      out.write("           </video>\n");
      out.write("             </center>-->\n");
      out.write("   <!--<div class=\"imagenes\">\n");
      out.write("       <img src=\"img/puerto-chiapas-mexico.jpg\" alt=\"\"/>\n");
      out.write("   </div>-->\n");
      out.write("   <div class=\"imagenes\">\n");
      out.write("       <a href=\"\" target=\"_blank\" id=\"link\"><img src=\"\" id=\"imagen2\"></a>\n");
      out.write("    </div>\n");
      out.write("   <div class=\"paquete1\">\n");
      out.write("       <center>\n");
      out.write("           <b><h>Viaje a Chiapas</h></b>\n");
      out.write("       </center>\n");
      out.write("       \n");
      out.write("   </div>   \n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <div class=\"viajes\">\n");
      out.write("            <section id=\"bienvenidos\">\n");
      out.write("                <h2>Bienvenidos a la aventura</h2>\n");
      out.write("            </section>\n");
      out.write("            <section id=\"blog\">\n");
      out.write("                <h3>Lo ultimo en nuestros viajes</h3>\n");
      out.write("               <div class=\"contenedor\">     \n");
      out.write("            <article>\n");
      out.write("                <h4>Viajes a Europa</h4>\n");
      out.write("                <a href=\"#\"><img class=\"animated fadeIn\" src=\"img/europa.jpg\" alt=\"\"/></a>\n");
      out.write("            </article>\n");
      out.write("            <article>\n");
      out.write("                <h4>Viajes a Brasil</h4>\n");
      out.write("                <a href=\"#\"><img src=\"img/curiosidades-sobre-brasil-01-696x464.jpg\" alt=\"\"/></a>\n");
      out.write("            </article>\n");
      out.write("            <article>\n");
      out.write("                <h4>Viajes a China</h4>\n");
      out.write("                <img src=\"img/china.jpg\" alt=\"\"/>\n");
      out.write("            </article>\n");
      out.write("               </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("    </body>\n");
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
