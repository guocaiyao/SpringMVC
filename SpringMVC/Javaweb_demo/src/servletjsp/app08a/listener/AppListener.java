package servletjsp.app08a.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gyao
 * @create date 2019-05-02 11:33 PM
 **/
@WebListener
public class AppListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();

        Map<String, String> countries =
                new HashMap<String, String>();
        countries.put("ca", "Canada");
        countries.put("us", "United States");
        servletContext.setAttribute("countries", countries);
    }
}
