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
     if (num!=1 && num!=2 && num!=3)
     { 
     alert("Should enter 1 or 2 or 3"); 
     return false;
     } 
} 

</script> 
</head>
<body>
<center><h2>What would you like to do?</h2></center>
	<ul align = "center">
	<li>See all vehicles available(Enter 1)</li>
	<li>Request Price(Enter 2)</li>
	<li>Make a purchase(Enter 3)</li>
	<li>Request loan(Enter 4)</li>
	</ul>
    <form name="form" action="custmenuServlet" method="post" onsubmit="return validate()">
        <table align="center">
         <tr>
         <td>Enter here</td>
         <td><input type="number" name="numb" /></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="Register"></input><input
         type="reset" value="Reset"></input></td>
         </tr>
        </table>
    </form>
</body>
</html>