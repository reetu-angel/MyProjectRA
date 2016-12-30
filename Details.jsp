<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#indatepicker , #outdatepicker" ).datepicker();
  } );
  </script>
  <script type="text/javascript">
  	function EnterDetails(val) {
  		var element = document.getElementById("IdValue");
  		var lab = document.getElementById("label");
  		if(val == 'Please select'){
  			element.style.display = 'none';	
  			lab.style.display = 'none';	
  		}
  		else{

  			element.style.display = 'block';	
  			lab.style.display = 'block';	
  			//element.value = val;
  			element.width = '150px';
  		}
		
	}
  </script>
  
  <style type="text/css">
  	body {
  	background-color: #F0FFFF ;
  	
	
	}
		
	.submit,.reset,.save,.print{
		position: relative;
		margin-top: 10%;
	}
  </style>
</head>
<body>
	<form action="DetailsServlet" method="post">
		<table>
		<tbody>
			<tr>
				<td>
					<label for="fname">First Name:</label>
				</td>
				<td>
					<input type="text" name="fname" id="fname">
				</td>				
			</tr>
			<tr>
				<td>
					<label for="lname">Last Name:</label>
				</td>
				<td>
					<input type="text" name="lname" id="lname">
				</td>				
			</tr>
			<tr>
				<td>
					<label for="age">Age:</label>
				</td>
				<td>
					<input type="text" name="age" id="age">
				</td>				
			</tr>
			<tr>
				<td>
					<label for="indatepicker">In Date:</label>
				</td>
				<td>
					<input type="text"  id="indatepicker" name="indatepicker">
				</td>				
			</tr>
			<tr>
				<td>
					<label for="outdatepicker">Out Date:</label>
				</td>
				<td>
					<input type="text"  id="outdatepicker" name="outdatepicker">
				</td>				
			</tr>
			<tr>
				<td>
					<label for="inTime">In Time:</label>
				</td>
				<td>
					<input type="text"  id="inTime" name="inTime">
				</td>				
			</tr>
			<tr>
				<td>
					<label for="outTime">Out Time:</label>
				</td>
				<td>
					<input type="text"  id="outTime" name="outTime">
				</td>				
			</tr>
			<tr>
				<td>
					<label for="idproof">Id Proof:</label>
				</td>
				<td>
					<select name="idproof" id="idproof" onchange='EnterDetails(this.value);'> 
						<option value="Please select" >Please select</option>
						<option value="Pan Card" >PAN Card</option>
						<option value="Aadhaar Card">Aadhaar Card</option>
						<option value="Passport">Passport</option>
						<option value="Voter ID">Voter ID</option>	
					</select>
				</td>				
			</tr>
			<tr>
				<td>
					<label for="IdValue" style="display:none;" id="label">ID Number</label>
				</td>
				<td>
					<input type="text" name="IdValue" id="IdValue" style="display:none;">
				</td>				
			</tr>
		</tbody>
	</table>
	<input type="submit" value="Submit" class="submit">
	<input type="reset" value="Cancel" class="reset">
	
	</form>
</body>
</html>