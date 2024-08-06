package com.AtWebServletSendRedirect;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class RegisterFormUsingAtWebServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        RequestDispatcher requestDispatcher;

        if ("yeliasahmed89@gmail.com".equals(email) && "12345".equals(password)) {
            resp.sendRedirect("success");
        } else {
            requestDispatcher = req.getRequestDispatcher("/request-dispatcher.html");
            requestDispatcher.include(req, resp);
            out.println("<center><h2>Invalid email or password. Please try again.</h2><center>");
        }
    }
}
