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
<center><h2>Are you a Salesperson or an Accountant or GeneralManager?(1/2/3) </h2></center>
    <form name="form" action="yetanotherServlet" method="post" onsubmit="return validate()">
        <table align="center">
         <tr>
         <td>Enter here</td>
         <td><input type="number" name="numb" /></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="Register"></input></td>
         </tr>
        </table>
    </form>
</body>
</html>