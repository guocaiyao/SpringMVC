package servletjsp.app16b.servlet;

import servletjsp.app16b.controller.InputProductController;
import servletjsp.app16b.controller.SaveProductController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gyao
 * @create date 2019-05-06 11:36 AM
 **/
public class DispatcherServlet extends HttpServlet {
    private static final long serialVersionUID = 748495L;

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {
        process(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {
        process(request, response);
    }

    private void process(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException, ServletException {

        String uri = request.getRequestURI();
        /*
         * uri is in this form: /contextName/resourceName,
         * for example: /app10a/product_input.
         * However, in the event of a default context, the
         * context name is empty, and uri has this form
         * /resourceName, e.g.: /product_input
         */
        int lastIndex = uri.lastIndexOf("/");
        String action = uri.substring(lastIndex + 1);

        String dispatchUrl = null;
        if (action.equals("product_input.action")) {
            InputProductController controller = new InputProductController();
            dispatchUrl = controller.handleRequest(request, response);
        } else if (action.equals("product_save.action")) {
            SaveProductController controller = new SaveProductController();
            dispatchUrl = controller.handleRequest(request, response);
        }

        if (dispatchUrl != null) {
            RequestDispatcher rd =
                    request.getRequestDispatcher(dispatchUrl);
            rd.forward(request, response);
        }
    }
}
