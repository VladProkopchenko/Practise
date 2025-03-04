package org.example.task6.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        boolean loggedIn = (session != null && session.getAttribute("isLoggedIn") == Boolean.TRUE );

        if (loggedIn) {
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else {
            response.sendRedirect(request.getContextPath() + "/login");
        }
    }
}
