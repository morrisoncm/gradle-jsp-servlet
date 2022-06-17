package com.demo.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(name = "HelloServlet", urlPatterns = { "helloworld" }, loadOnStartup = 1)
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String destination = "index.jsp";
		RequestDispatcher dispatcher = req.getRequestDispatcher(destination);
		dispatcher.forward(req, resp);

	}
}