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
     if (num!=1)
     { 
     alert("You can only do 1"); 
     return false;
     } 
} 

</script> 
</head>
<body>
<center><h2>Hello Salesperson </h2></center>
    <form name="form" action="anotheroneServlet" method="post" onsubmit="return validate()">
        <table align="center">
         <tr>
         <td>Enter 1 for viewing vehicles</td>
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