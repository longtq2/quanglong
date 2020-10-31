package com.vn.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.Dao.ProductDAO;
import com.vn.Dao.ProductDAOImpl;
import com.vn.entities.Product;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ProductDAO dao = new ProductDAOImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// FAKE
		List<Product> products = dao.findAll();
		request.setAttribute("list", products);
		
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

}
