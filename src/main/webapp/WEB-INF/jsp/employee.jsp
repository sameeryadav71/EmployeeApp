<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Register Employee</title>
<body>
<br>
<div align="center">
<h3>Employee Registration</h3>
<form action='/employee/add' method='post' >
	<table>
		<tr>
			<td><b>Name</b></td>
			<td><input type='text' name='employee_Name' class='form-control'required /></td>
		</tr>
		<tr>
			<td><b>EmailId</b></td>
			<td><input type="email" name='employee_Email' class='form-control' required /></td>
		</tr>
		<tr>
			<td><b>Salary</b></td>
			<td><input type="number" name='employee_Salary' class='form-control' size="20" required /></td>
		</tr>
			<tr>
				<td></td>
				<td>
					<button type="submit" class="btn btn-primary">Add Employee</button>
				</td>
			</tr>
		</table>
	<b><c:out value="${danger}"></c:out></b>
</form>

<h4>Employee Data</h4>
<table border="1">
	<thead>
		<tr>
			<th><b>Name</b></th>
			<th><b>EmailId</b></th>
			<th><b>Salary</b></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}" var="lou">
			<tr>
				<td><c:out value="${lou.employee_Name}"></c:out></td>
				<td><c:out value="${lou.employee_Email}"></c:out></td>
				<td><c:out value="${lou.employee_Salary}"></c:out></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<br>
<button type="submit"><a href="searchemployee">Next Page</a></button>
</div>
</body>