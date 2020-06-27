package com.springboot.springbootweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author tianq
 */
@WebFilter(filterName = "FirstFilter",urlPatterns = "/firstFilter")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("into first filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("out first filter");
    }

    @Override
    public void destroy() {

    }
}
