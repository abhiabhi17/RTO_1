<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 style="color: red">${msg}</h1>
	<form:form action="genRegNoPost" modelAttribute="regNo" method="POST"
		id="registerForm">
	<table width=50% border=2>
		<tr>
	<td>Name</td>
			<td>${Vowner.fname}</td>
		<tr>
		<tr>
			<td>Last Name</td>
			<td>${Vowner.lname}</td>
		</tr>
		<tr>
			<td>Email Id::</td>
			<td>${Vowner.email}</td>
		</tr>
		<!-- <tr>
			<td>Dob </td>
			<td>{Vowner.dob}</td>
		</tr> -->
		<tr>
			<td>SSN No</td>
			<td>${Vowner.ssn}</td>
		</tr>
		<tr>
			<td>house No</td>
			<td>${listForAdd.hno}</td>
		</tr>
		<tr>
			<td>Street No</td>
			<td>${listForAdd.streetno}</td>
		</tr>
		<tr>
			<td>City Name</td>
			<td>${listForAdd.city}</td>
		</tr>
		<tr>
			<td>Vehicle Type</td>
			<td>${listForVehicle.type}</td>
		</tr>
		<tr>
			<td>Vehicle Company</td>
			<td>${listForVehicle.vcompanyname}</td>
		</tr>
		<tr>
			<td>Vehicle Model Year</td>
			<td>${listForVehicle.year}</td>
		</tr>
		<tr>
			<td>Vehicle Type</td>
			<td>${listForVehicle.type}</td>
		</tr>
		<tr>
			<td>Vehicle Reg No::</td>
			<td>${listForReg.regNo}</td>
		</tr>
		<tr>
			<td>Vehicle Reg No::</td>
			<td>${listForReg.regCenter}</td>
		</tr>
		<tr>
			<td>Vehicle Reg No::</td>
			<td>${listForReg.regDate}</td>
		</tr>
	</table>

<tr>
			<td><input type="button" value="previous"></td>
				<td><input type="submit" value="submit"></td>
		
		</tr>
		</form:form>
</body>
</html>