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
     return true;
} 

</script> 
</head>
<body>
<center><h2>Delete vehicle </h2></center>
    <form name="form" action="dvServlet" method="post" onsubmit="return validate()">
        <table align="center">
         <tr>
         <td>Enter vehicle id</td>
         <td><input type="number" name="vid" /></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="Register"></input></td>
         </tr>
        </table>
    </form>
</body>
</html>