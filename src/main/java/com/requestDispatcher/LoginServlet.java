package com.requestDispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();
        RequestDispatcher dispatcher;

        if ("abc@gmail.com".equals(email) && "12345".equals(password)) {
            session.setAttribute("userEmail", email);
            resp.sendRedirect("success");
        } else {
            dispatcher = req.getRequestDispatcher("login.html");
            dispatcher.include(req, resp);
            out.println("<center><h4>Invalid email or password. Please try again.</h4><center>");

        }
    }
}
