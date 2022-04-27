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
<center><h2>Fire Employee</h2></center>
	</ul>
    <form name="form" action="deServlet" method="post" onsubmit="return validate()">
        <table align="center">
         
         <tr>
         <td>Enter manager id</td>
         <td><input type="number" name="mid" /></td>
         </tr>
         
         <tr>
         <td>Enter branch id</td>
         <td><input type="number" name="bid" /></td>
         </tr>
         
         <tr>
         <td>Enter eid</td>
         <td><input type="number" name="eid" /></td>
         </tr>
         
         <tr>
         <td>Enter eid here of employee</td>
         <td><input type="number" name="oeid" /></td>
         </tr>  
         
         <tr>
         <td></td>
         <td><input type="submit" value="Submit"></input></td>
         </tr>
        </table>
    </form>
</body>
</html>