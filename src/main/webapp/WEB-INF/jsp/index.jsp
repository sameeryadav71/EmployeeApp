<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login</h1>
    <div class="container unauthenticated">
        <form method='post'>
		<table>
			<tr>
				<td>.
				</td>
				<td>
					<button type="submit" name="loginbyfacebook" 
						value="loginbyfacebook" onclick="search1">By facebook</button>
					<button type="submit" name="loginbygithub"
						value="loginbygithub" onclick="search">By Github</button>
				</td>
			</tr>
		</table>
		<b><c:out value="${danger}"></c:out></b>
	</form>
    </div>
</body>
</html>