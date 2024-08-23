package com.servlet;

import java.io.IOException;

import com.conn.DBconnector;
import com.dao.StudentDAO;
import com.entity.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/registerstudent")
public class RegisterServlet extends jakarta.servlet.http.HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		String qualification = req.getParameter("qualification");
		String email = req.getParameter("email");
//		System.out.println(name);
		Student student = new Student(name, dob, address, qualification, email);
//		System.out.print(student);
		StudentDAO dao = new StudentDAO(DBconnector.getCon());

		boolean f = dao.addStudent(student);
		HttpSession session = req.getSession();

		if (f) {
			session.setAttribute("succmsg", "Student added successfully");
			res.sendRedirect("Add_student.jsp");
//			System.out.println("Student added successfully");
		} else {
			session.setAttribute("errmsg", "Something Went Wrong!!!");
			res.sendRedirect("Add_student.jsp");
//			System.out.println("Error in server");
		}

	}

}
