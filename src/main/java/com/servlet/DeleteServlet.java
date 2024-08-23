package com.servlet;

import java.io.IOException;

import com.conn.DBconnector;
import com.dao.StudentDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		System.out.println(id);
		StudentDAO dao = new StudentDAO(DBconnector.getCon());
		boolean f = dao.deleteStudent(id);

		HttpSession session = req.getSession();

		if (f) {
			session.setAttribute("succmsg", "Student Deleted successfully");
			res.sendRedirect("index.jsp");

		} else {
			session.setAttribute("errmsg", "Something Went Wrong On Server!!!");
			res.sendRedirect("index.jsp");
		}

	}

}
