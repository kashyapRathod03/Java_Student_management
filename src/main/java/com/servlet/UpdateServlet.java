package com.servlet;

import java.io.IOException;

import com.conn.DBconnector;
import com.dao.StudentDAO;
import com.entity.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String qualification = req.getParameter("qualification");
		String email = req.getParameter("email");

		Student student = new Student(id, name, dob, address, qualification, email);
//		System.out.print(student);
		StudentDAO dao = new StudentDAO(DBconnector.getCon());

		boolean f = dao.updateStudent(student);
		HttpSession session = req.getSession();

		if (f) {
			session.setAttribute("succmsg", "Student Updated successfully");
			res.sendRedirect("index.jsp");
//			System.out.println("Student added successfully");
		} else {
			session.setAttribute("errmsg", "Something Went Wrong On Server!!!");
			res.sendRedirect("index.jsp");
//			System.out.println("Error in server");
		}

	}

}
