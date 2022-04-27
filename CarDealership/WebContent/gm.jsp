<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<script> 
function validate()
{ 
     var num = document.form.numb.value;
     
} 

</script> 
</head>
<body>
<center><h2>What would you like to do?</h2></center>
	<ul align = "center">
	<li>view salesperson db (Enter 1)</li>
	<li>Rate employee(Enter 2)</li>
	<li>View Vehicles(Enter 3)</li>
	<li>Fire employee(Enter 4)</li>
	<li>add vehicle(Enter 5)</li>
	<li>delete vehicle(Enter 6)</li>
	</ul>
    <form name="form" action="wowanotherServlet" method="post" onsubmit="return validate()">
        <table align="center">
         
         
         <tr>
         <td>Enter here</td>
         <td><input type="number" name="numb" /></td>
         </tr>
         
         
         <tr>
         <td></td>
         <td><input type="submit" value="Submit"></input></td>
         </tr>
        </table>
    </form>
</body>
</html>