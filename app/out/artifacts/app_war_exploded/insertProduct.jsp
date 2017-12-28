<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Manage Products</title>
</head>
<body>
<%@ page import="com.tutorial.hibernate.entity.*" %>
<h3> Insert Product </h3>
<h4> Enter Products Details  </h4>
<form action="${pageContext.request.contextPath}/InsertProductServlet" method="POST">
    <table >
        <tr> <td>PRODUCT NAME </td>
            <td> <input type="text" name="name" /> </td>
        </tr>
        <tr> <td>UNITS IN STOCK </td>
            <td> <input type="text" name="units" /> </td>
        </tr>
        <tr> <td>CATEGORY </td>
            <td> <input type="text" name="category" /> </td>
        </tr>
        <tr> <td><input type="Submit" value="Save"/> </td>
        </tr>
    </table>
</form>
</body>
</html>