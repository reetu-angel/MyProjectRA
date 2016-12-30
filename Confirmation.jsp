<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page import="java.util.Date"  %>
<style type="text/css">
  	body {
  	background-color: #F0FFFF ;
  		
	}
  </style>
</head>
<body>
	<%String fname = (String)request.getAttribute("fName");
	  String lname = (String)request.getAttribute("lName");
	  String age = (String)request.getAttribute("age");
	  String inDate = (String)request.getAttribute("inDate");
	  String outDate = (String)request.getAttribute("outDate");
	  String inTime = (String)request.getAttribute("inTime");
	  String outTime = (String)request.getAttribute("outTime");
	  String idProof = (String)request.getAttribute("idProof");
	  String idProofValue = (String)request.getAttribute("idProofValue");%>
	  <center>
	  	<h2>Confirmation</h2>
	  </center>
	  <%= "First Name:" +  fname%><br>
	  <%= "Last Name:" +  lname%><br>
	  <%= "Age:" +  age%><br>
	  <%= "In Date:" +  inDate%><br>
	  <%= "Out Date:" +  outDate%><br>
	  <%= "In Time:" +  inTime%><br>
	  <%= "Out Time:" +  outTime%><br>
	  <%= "ID Proof:" +  idProof%><br>
	  <%= "ID Proof Value:" +  idProofValue%><br>
	  
	  <form action="ConfirmationServlet">
	  	<input type="submit" value="Print" onclick="window.print()" class="print">
		<input type="submit" value="Save" name="save" class="save">
	  </form>

</body>
</html>