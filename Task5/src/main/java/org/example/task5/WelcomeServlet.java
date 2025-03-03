package org.example.task5;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession();
//        if(session.getAttribute("user") == null) {
//            res.sendRedirect(req.getContextPath() + "/login.jhtml");
//        }
//        else{
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp");
            rd.forward(req,res);
        //}

    }
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("logout")) {
            HttpSession session = req.getSession();
            session.setAttribute("isLoggedIn", "false");
            res.sendRedirect(req.getContextPath() + "/login.jhtml");
        }
        if (action.equals("edit")) {
            res.sendRedirect(req.getContextPath() + "/loginedit.jhtml");
        }

    }
}
