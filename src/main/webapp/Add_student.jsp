<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
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

    <div class="container p-4">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="card">
                    <div class="card-body">
					<%-- <c:out value="${succmsg }"></c:out> --%>
                        <p class="fs-3 text-center">Add Student</p>

                       <c:if test="${not empty succmsg}">
                            <p class="text-center text-success">${succmsg}</p>
                            <c:remove var="succmsg" />
                        </c:if>
                        
                        <c:if test="${not empty errmsg}">
                            <p class="text-center text-danger">${errmsg}</p>
                            <c:remove var="errmsg" />
                        </c:if>

                        <form action="registerstudent" method="post">
                            <div class="mb-3">
                                <label class="form-label">Full Name</label> 
                                <input type="text" class="form-control" name="name">
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Date of birth</label> 
                                <input type="date" class="form-control" name="dob">
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Address</label> 
                                <input type="text" class="form-control" name="address">
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Qualification</label> 
                                <input type="text" class="form-control" name="qualification">
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Email</label> 
                                <input type="email" class="form-control" name="email">
                            </div>
                            <button type="submit" class="btn btn-primary col-md-12">Submit</button>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
