package servletjsp.app12b.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gyao
 * @create date 2019-05-05 11:31 AM
 **/
@WebServlet(urlPatterns = { "/servlet1" })
public class Servlet1 extends HttpServlet {
    private static final long serialVersionUID = -15560L;

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
            IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/1.jsp");
        dispatcher.forward(request,  response);
    }
}
