package servletjsp.app09a.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author gyao
 * @create date 2019-05-03 1:41 PM
 **/
@WebFilter(filterName = "ImageProtetorFilter", urlPatterns = {
        "*.png", "*.jpg", "*.gif" })
public class ImageProtectorFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig)
            throws ServletException {
    }

    @Override
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("ImageProtectorFilter");
        HttpServletRequest httpServletRequest =
                (HttpServletRequest) request;
        String referrer = httpServletRequest.getHeader("referer");
        System.out.println("referrer:" + referrer);
        if (referrer != null) {
            filterChain.doFilter(request, response);
        } else {
            throw new ServletException("Image not available");
        }
    }
}
