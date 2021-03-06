package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "MainServlet", urlPatterns = "")

public class MainHttpServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(MainHttpServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        logger.info("MainServlet");
        resp.getWriter().printf("<h1>MainServlet</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("MainServlet");

        resp.getWriter().printf("<h1>MainServlet</h1>");
    }
}
