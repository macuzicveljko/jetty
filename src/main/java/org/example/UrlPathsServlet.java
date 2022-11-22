package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/hello/*")
public class UrlPathsServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String requestUrl = request.getRequestURI();
        String name = requestUrl.substring("/hello/".length());

        PrintWriter out = response.getWriter();
        out.println("<h1>Hello " + name + "</h1>");
        out.println("<p>Nice to meet you!</p>");
    }
}
