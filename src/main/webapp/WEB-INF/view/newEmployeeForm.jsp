<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>New Employee - Spring MVC CRUD Web Application</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.css" />
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"></script>

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
		<div class="row" style="padding: 8px;">
			<div class="col">
				<h3>New Employee</h3>
			</div>
		</div>
		<form:form action="saveEmployee" modelAttribute="employee"
			method="POST">
			<form:hidden path="empId" />
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">First Name</label>
				<div class="col-sm-6">
					<form:input type="text" class="form-control" path="firstName" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Last Name</label>
				<div class="col-sm-6">
					<form:input type="text" class="form-control" path="lastName" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Gender</label>
				<div class="col-sm-6">
					<div class="custom-control custom-radio custom-control-inline">
						<form:radiobutton id="radioMale" path="gender" value="Male"
							class="custom-control-input" />
						<label class="custom-control-label" for="radioMale">Male</label>
					</div>
					<div class="custom-control custom-radio custom-control-inline">
						<form:radiobutton id="radioFemale" path="gender" value="Female"
							class="custom-control-input" />
						<label class="custom-control-label" for="radioFemale">Female</label>
					</div>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Phone</label>
				<div class="col-sm-6">
					<form:input type="text" class="form-control" path="phoneNumber" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Email</label>
				<div class="col-sm-6">
					<form:input type="text" class="form-control" path="email" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Country</label>
				<div class="col-sm-6">
					<form:select path="country" class="form-control">
						<form:options items="${countries}" />
					</form:select>
					<%-- <form:select path="country" class="form-control">
						<form:option value="Canada" label="Canada"></form:option>
						<form:option value="Brazil" label="Brazil"></form:option>
						<form:option value="France" label="France"></form:option>
						<form:option value="Germany" label="Gernamy"></form:option>
						<form:option value="India" label="India"></form:option>
						<form:option value="Japan" label="Japan"></form:option>
					</form:select> --%>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 col-form-label">Job Title</label>
				<div class="col-sm-6">
					<form:input type="text" class="form-control" path="jobTitle" />
				</div>
			</div>
			<input type="submit" value="Submit" class="btn btn-success" />
		</form:form>
	</div>
</body>
</html>