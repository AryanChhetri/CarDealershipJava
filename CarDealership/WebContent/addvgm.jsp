
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>
<script> 
function validate()
{ 
  return true;
 } 
</script> 
</head>
<body>
<center><h2>Add Vehicle </h2></center>
    <form name="form" action="addvServlet" method="post" onsubmit="return validate()">
        <table align="center">
         <tr>
         <td>Branch id</td>
         <td><input type="number" name="bid" /></td>
         </tr>
         <tr>
         <td>Vehicle id</td>
         <td><input type="number" name="vid" /></td>
         </tr>
         <tr>
         <td>Cost</td>
         <td><input type="number" name="cost" /></td>
         </tr>
         <tr>
         <td>Mileage</td>
         <td><input type="number" name="mileage" /></td>
         </tr>
         <tr>
         <td>model</td>
         <td><input type="text" name="model" /></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="Submit"></input></td>
         </tr>
        </table>
    </form>
</body>
</html>