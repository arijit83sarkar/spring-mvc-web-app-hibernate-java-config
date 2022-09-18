<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home - Spring MVC CRUD Web Application</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.css" />
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
	integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"
	integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+"
	crossorigin="anonymous"></script>

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
}

.header {
	padding: 2px;
	text-align: center;
	background: #1abc9c;
	color: white;
	font-size: 18px;
}

.content {
	padding: 2px;
}
</style>
</head>
<body>
	<div class="header">
		<h2>Spring MVC CRUD Web Application</h2>
		<p>Welcome to Spring MVC CRUD Web Application with Hibernate</p>
	</div>

	<div class="container-md themed-container" id="containers">
		<h3>Employee</h3>
		<c:if test="${not empty employees}">
			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Name</th>
						<th scope="col">Gender</th>
						<th scope="col">Phone</th>
						<th scope="col">Job Title</th>
						<th scope="col">Country</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${employees}" var="employee"
						varStatus="loopCounter">
						<tr>
							<th scope="row">${loopCounter.count}</th>
							<td><c:out value="${employee.firstName}" />&nbsp<c:out
									value="${employee.lastName}" /></td>
							<td><c:out value="${employee.gender}" /></td>
							<td><c:out value="${employee.phoneNumber}" /></td>
							<td><c:out value="${employee.jobTitle}" /></td>
							<td><c:out value="${employee.country}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>