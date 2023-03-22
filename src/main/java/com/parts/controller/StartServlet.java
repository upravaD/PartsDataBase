package com.parts.controller;

import com.parts.utilities.JSPPath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StartServlet", value = "/start")
public class StartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Перенаправление запроса на страницу index.jsp через сервер
        getServletContext()
                .getRequestDispatcher(JSPPath.INDEX.getPath())
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Аннулирование данных
        //Quest.getInstance().invalidateQuest();
        req.getSession(true).invalidate();
        // Перенаправление запроса на страницу index.jsp через сервер
        getServletContext()
                .getRequestDispatcher(JSPPath.INDEX.getPath())
                .forward(req, resp);
    }
}
