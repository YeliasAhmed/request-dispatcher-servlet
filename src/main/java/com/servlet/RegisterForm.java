package com.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterForm extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String course = req.getParameter("course");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Name: "+name+"<h1>");
        out.println("<h1>Email: "+email+"<h1>");
        out.println("<h1>Password: "+password+"<h1>");
        out.println("<h1>Course: "+course+"<h1>");
    }
}
