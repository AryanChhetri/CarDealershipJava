
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
     var fullname = document.form.fullname.value;
     var addr = document.form.address.value;
     var branchid = document.form.b_id.value; 
     var budget = document.form.budget.value;
     var phnum= document.form.phnum.value;
      
     if (fullname==null || fullname=="")
     { 
     alert("Name can't be blank"); 
     return false; 
     }
     else if (addr==null || addr=="")
     { 
     alert("Address can't be blank"); 
     return false; 
     }
     else if (branchid==null)
     { 
     alert("branch id can't be blank"); 
     return false; 
     }
     else if (budget==null)
     { 
     alert("branch id can't be blank"); 
     return false; 
     } 
     else if (phnum==null)
     { 
     alert("phone number can't be blank"); 
     return false; 
     }  
 } 
</script> 
</head>
<body>
<center><h2>Welcome Customer </h2></center>
    <form name="form" action="customerServlet" method="post" onsubmit="return validate()">
        <table align="center">
         <tr>
         <td>Full Name</td>
         <td><input type="text" name="fullname" /></td>
         </tr>
         <tr>
         <td>Address</td>
         <td><input type="text" name="address" /></td>
         </tr>
         <tr>
         <td>Branch Id</td>
         <td><input type="number" name="b_id" /></td>
         </tr>
         <tr>
         <td>Budget</td>
         <td><input type="number" name="budget" /></td>
         </tr>
         <tr>
         <td>Phone number</td>
         <td><input type="text" name="phnum" /></td>
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