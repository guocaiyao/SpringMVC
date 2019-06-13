package servletjsp.app01a;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author gyao
 * @create date 2019-04-29 5:15 PM
 **/
@WebServlet(name = "MyFirstServlet", urlPatterns = {"/servletjsp/app01a/my"})
public class Myservlet implements Servlet {
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig)
            throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public String getServletInfo() {
        return "My Servlet";
    }

    @Override
    public void service(ServletRequest request,
                        ServletResponse response) throws ServletException,
            IOException {
        String servletName = servletConfig.getServletName();
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<html><head></head>"
                + "<body>Hello from " + servletName
                + "</body></html>");
    }

    @Override
    public void destroy() {
    }
}
