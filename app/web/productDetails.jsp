<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Manage Products</title>
</head>
<body>
<%@ page import="com.tutorial.hibernate.entity.*,java.util.List" %>
<%@ page import="model.Product" %>
<h3> Available Products Details </h3>
<%
    List<Product> products = (List<Product>)request.getAttribute("products");
%>
<h4> Total Number of Products are <%= products.size() %> </h4>
<table border="1">
    <tr>
        <td>PRODUCT NAME </td> <td> UNITS IN STOCK </td> <td> CATEGORY </td>
    </tr>
    <%
        for(int i=0;i<products.size();i++)
        {
            Product product = products.get(i) ;
            %>
            <tr>
                <td><%= product.getProductName() %></td>
                <td><%= product.getUnitsOnStock() %></td>
                <td><%= product.getCategory().getName() %></td>
            </tr>
            <%
        }
    %>
</table>
</body>
</html>