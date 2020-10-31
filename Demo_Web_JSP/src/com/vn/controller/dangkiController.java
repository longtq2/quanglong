package com.vn.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.Dao.LoginDao;
import com.vn.Dao.LoginDaoImpl;

/**
 * Servlet implementation class dangkiController
 */
@WebServlet("/dangkiController")
public class dangkiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static LoginDao loginDao = new LoginDaoImpl();

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			String url = "login.jsp";
			String username_err = "";
			String password_err = "";
			
			if(username.equals("")|| password.equals("")) {
				username_err += "vui lòng nhập lại username!";
				password_err += "vui lòng nhập lại password!";
			}else {
				if(loginDao.checkUsername(username) == true) {
					
				}
			}
			
			if(username_err.length() > 0) {
				request.setAttribute("username_err", username_err);
				request.setAttribute("username", username);
			}
			if(password_err.length() > 0) {
				request.setAttribute("password_err", password_err);
			}
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
//			List<User> list =new ArrayList<User>();
//			list = loginDao.getAll();
//			for (User user : list) {
//				String username1 = user.getUsername();
//				String password1 = user.getPassword();
//				if (username1.equals(username) && password1.equals(password)) {
//					response.sendRedirect("index.jsp");
//				} else {
//					response.sendRedirect("login?err=1");
//				}
//			}
		}

}
