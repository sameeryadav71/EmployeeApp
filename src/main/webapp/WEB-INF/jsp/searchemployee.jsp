<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Search Employee</title>
<body>
<br>
<div align="center">
<h3>Search Employee By Salary</h3>
<br>
	<form method='post'>
		<table>
			<tr>
				<td><b>Employee Salary</b></td>
				<td><input type="number" name='employee_Salary' size="20" required /></td>
			</tr>
			<tr>
				<td>.
				</td>
				<td>
					<button type="submit" name="greaterthan" 
						value="greterthan" onclick="search1">></button>
					<button type="submit" name="lessthan"
						value="lessthan" onclick="search"><</button>
				</td>
			</tr>
		</table>
		<b><c:out value="${danger}"></c:out></b>
	</form>
<h4>Employee Data</h4>
<table border="1">

    <thead>
      <tr>
        <th><b>Employee Name</b></th>
        <th><b>Employee EmailId</b></th>
        <th><b>Employee Salary</b></th>
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
<button type="submit"><a href="employee">Back</a></button>
</div>
</body>