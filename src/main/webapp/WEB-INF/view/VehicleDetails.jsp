<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red;
}
</style>
<script src="http://code.jquery.com/jquery-1.8.3.min.js"
	type="text/javascript"></script>

<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.10.0/jquery.validate.js"
	type="text/javascript"></script>
<script type="text/javascript">
$(function() {
	$('form[id="registerForm"]').validate({
		rules : {
			type : 'required',
			year : 'required',
			vcompanyname : 'required'
		},
		messages : {
			type : 'please enter students name',
			year : 'please enter street no',
			vcompanyname : 'please Enter a city name',
			
		},
		submitHandler : function(form) {
			form.submit();
		}
	});
});
</script>
</head>
<body>
	<h1 style="color: red">Vehicle Details registration</h1>
	<form:form action="vRegistrationdetails"
		modelAttribute="VehicleDetailsModel" method="POST" id="registerForm">
		<table>

			<tr>
				<th>VehicleType</th>
				<td><form:select path="type" items="${typeList}" /></td>
			</tr>
			<tr>
				<th>Year Of vehicle</th>
				<td><form:input path="year" /></td>
			</tr>
			<tr>
				<th>Vehicle Company Name</th>
				<td><form:input path="vcompanyname" /></td>
			</tr>
			<tr>
				<td><input type="button" value="previous"></td>
				<td><input type="submit" value="next"></td>
				<td>${owner.vid}</td>
			</tr>
		</table>
		<%-- <a href="vehicleReg?vehicleOwn=${VehicleDetailsModel.vehicleOwn}">Previous</a> --%>
		<a href="<c:url value="/test?vehicleOwn=${VehicleDetailsModel.vehicleOwn}" />" >Previous</a>
		
	</form:form>

</body>
</html>