package com.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
import com.service.MailerService;

@WebServlet("/SaveUserServlet")
public class SaveUserServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserDao userDao = new UserDao();

		UserBean user = new UserBean();
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setRole("USER");
		userDao.addUser(user);// UserBean =>

		MailerService mailerService = new MailerService();
		mailerService.sendWelcomeMail(user);
		
		response.sendRedirect("Login.jsp");
	}
}
