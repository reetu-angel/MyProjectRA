# MyProjectRA
Customer Details saving for hotel
==========================================================
Login
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  	body {
  	background-color: #F0FFFF ;
  	border: solid; 	
	
	}
	
	.submit{
		position: relative;
		text-align: center;
		left: 50%;
	}
  </style>
</head>
<body>
	<center>
		<h2>
			LOGIN
		</h2>	
	</center>
	<form action="LoginServlet" method="post">
		<table align="center">
			<tbody>
				<tr>
					<td>
						<label for="user">User Name:</label>
					</td>
					<td>
						<input type="text" name="user" id="user">
					</td>
				</tr>
				<tr>
					<td>
						<label for="pwd">Password:</label>
					</td>
					<td>
						<input type="password" name="pwd" id="pwd">
					</td>
				</tr>
			</tbody>
		</table>
		
		<input type="submit" value="Submit" class="submit" >
	</form>
</body>
</html>
