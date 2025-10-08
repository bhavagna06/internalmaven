package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
