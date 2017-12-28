<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>MAKE ORDER</title>
</head>
<body>
<%@ page import="com.tutorial.hibernate.entity.*" %>
<h3> Make an Order</h3>
<h4> Enter your product  </h4>
<form action="${pageContext.request.contextPath}/MakeOrderServlet" method="POST">
    <table >
        <tr> <td>TRANSACTON NUMBER </td>
            <td> <input type="text" name="transactionNumber" /> </td>
        </tr>
        <tr> <td>PRODUCT NAME</td>
            <td> <input type="text" name="productName" /> </td>
        </tr>
        <tr> <td>UNITS TO BUY </td>
            <td> <input type="text" name="units" /> </td>
        </tr>
        <tr> <td><input type="Submit" value="Save"/> </td>
        </tr>
    </table>
</form>
</body>
</html>