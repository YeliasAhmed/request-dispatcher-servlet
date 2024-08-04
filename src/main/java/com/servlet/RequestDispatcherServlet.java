package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RequestDispatcherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        RequestDispatcher requestDispatcher;

        if ("yeliasahmed89@gmail.com".equals(email) && "12345".equals(password)) {

            requestDispatcher = req.getRequestDispatcher("/servlet2");
            requestDispatcher.forward(req, resp);

        } else {

            requestDispatcher = req.getRequestDispatcher("/request-dispatcher.html");
            requestDispatcher.include(req, resp);
            out.println("<center><h2>Invalid email or password. Please try again.</h2><center>");
        }

    }
}
