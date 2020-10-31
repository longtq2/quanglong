package com.vn.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.Dao.NhanVienDao;
import com.vn.Dao.NhanVienDaoImpl;
import com.vn.entities.NhanVien;



/**
 * Servlet implementation class AboutController
 */
@WebServlet("/about")
public class AboutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NhanVienDao nhanVienDao = new NhanVienDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		List<NhanVien> list =new ArrayList<NhanVien>();
		list = nhanVienDao.getAll();
		request.setAttribute("name", list);
		request.getRequestDispatcher("about.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
