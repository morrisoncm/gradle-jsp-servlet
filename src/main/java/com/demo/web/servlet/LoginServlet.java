package com.demo.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.web.service.CustomerService;
import com.demo.web.service.impl.CustomerServiceImpl;

@SuppressWarnings("serial")
@WebServlet(name = "LoginServlet", urlPatterns = { "login" }, loadOnStartup = 1)
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().print("Hello, World!");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		CustomerService customerService = new CustomerServiceImpl();

		request.setAttribute("customer", customerService.getCustomer(username, password));
		request.getRequestDispatcher("login.html").forward(request, response);
	}
}