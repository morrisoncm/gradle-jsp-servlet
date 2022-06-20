package com.demo.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.web.exception.HelloServletException;

@SuppressWarnings("serial")
@WebServlet(name = "HelloServlet", urlPatterns = { "helloworld" }, loadOnStartup = 1)
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			var dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
		} catch (IOException | ServletException ex) {
			throw new HelloServletException("Exception thrown for HelloServlet", ex);
		}
	}
}