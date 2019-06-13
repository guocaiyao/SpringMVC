package servletjsp.app01c;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author gyao
 * @create date 2019-04-29 9:30 PM
 **/
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 27126L;

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<html><head></head>"
                + "<body>Welcome servlet</body></html>");
    }
}
