<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form action="NewUser" method="post">
<table align="center"
 style="background-color: skyblue; margin-left:20px;margin-left: 20px;">
		<tr>
			<td><h3 style="color:black;">Registration page!!!</h3></td>
		</tr>
<tr>
	<td>Name</td>
	<td><input type="text" placeholder="name" name="Name"></td>
</tr>
<tr>
	<td>Address</td>
	<td><input type="text" placeholder="address" name="Address"></td>
</tr>
<tr>
	<td>Email</td>
	<td> <input type="text" placeholder="Email" name="Email" ></td>
</tr>
<tr>
	<td>Contact</td>
	<td><input type="text" name="Contact">
		<input type="text" name="Contact"></td>
</tr>
<tr>
	<td>Gender</td>
	<td><input type="radio" name="Gender" value="male">Male
		<input type="radio" name="Gender" value="female">Female</td>
<tr>
	<td>City</td>
 <td><select name="City">
			
			  <option></option>
			
			  <option value="pune">PUNE</option>
			
			  <option value="Mumbai">MUMBAI</option>
			
			  <option value="Goa">GOA</option>
			
			  <option value="Delhi">DELHI</option>
			
			  </select></td>
		</tr>
<tr>
	<td>Language</td>
	 			<td><input type="checkbox" name="Language" value="english"/>English
                <input type="checkbox" name="Language"  value="hindi"/>Hindi
                <input type="checkbox" name="Language" value="marathi"/>Marathi
                </td>
                  
</tr>
<tr>
	<td><input type="submit" name="submit" value="submit" />
	<input type="submit" name="cancle" value="cancle" /> 
	<a href = "Home.jsp" ></a>
	</td>
</tr>
</form>
</table>
</body>
</html>