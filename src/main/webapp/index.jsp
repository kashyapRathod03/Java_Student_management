<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDAO"%>
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@page import="java.sql.*"%>
<%@page import="com.conn.DBconnector"%>
<%@page import="com.entity.Student"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<%@include file="all-css.jsp"%>
</head>

<body class="bg-light">

	<%@include file="Navbar.jsp"%>

	<div class="conatiner p-3">
		<div class="card">
			<div class="card-body">
				<p class="text-center fs-1">All Student Details</p>
				
				 <c:if test="${not empty succmsg}">
                            <p class="text-center text-success">${succmsg}</p>
                            <c:remove var="succmsg" />
                        </c:if>
                        
                        <c:if test="${not empty errmsg}">
                            <p class="text-center text-danger">${errmsg}</p>
                            <c:remove var="errmsg" />
                        </c:if>
				
				
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Fullname</th>
							<th scope="col">DOB</th>
							<th scope="col">Address</th>
							<th scope="col">Qualification</th>
							<th scope="col">Email</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<%
							StudentDAO dao = new StudentDAO(DBconnector.getCon());
							List<Student> list = dao.getAllstudents();
							for(Student s: list){
						%>
						<tr>
							<th scope="row"><%= s.getFullname() %></th>
							<td><%= s.getEmail() %></td>
							<td><%= s.getAddress() %></td>
							<td><%= s.getDob() %></td>
							<td><%= s.getQualification() %></td>
							<td><a href="Edit_student.jsp?id=<%= s.getId() %>"
								class="btn btn-sm btn-primary">Edit</a> 
								<a href="delete?id=<%= s.getId() %>"
								class="btn btn-sm btn-danger ms-1">Delete</a></td>
						</tr>
						<% 
							}
						%>
					</tbody>
				</table>
				
			</div>
		</div>
	</div>

</body>
</html>