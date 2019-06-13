package servletjsp.app16b.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gyao
 * @create date 2019-05-06 10:26 AM
 **/
public interface Controller {
    String handleRequest(HttpServletRequest request,
                         HttpServletResponse response);
}
