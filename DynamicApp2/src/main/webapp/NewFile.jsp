<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="NewServlet" method="get">
 <label> name </label>
<input type="text" name="name" size="15"/> <br> 

Address:<input type="text" name="address">
<br/>
Phone :
</label>
<input type="text" name="country code" value="+91" size="2"/>
city:
<input type="text" name="city" size="15"/> <br> 
state:
<input type="text" name="state" size="15"/> <br>
country :
<input type="text" name="country " size="15"/> <br>

<input type="button" value="Submit"/>


</form>
</body>
</html>