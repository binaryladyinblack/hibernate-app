<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Transactions Details</title>
</head>
<body>
<%@ page import="com.tutorial.hibernate.entity.*,java.util.List" %>
<%@ page import="model.MyTransaction" %>
<h3> Available Products Details </h3>
<%
    List<MyTransaction> transactions = (List<MyTransaction>)request.getAttribute("transactions");
%>
<h4> Total Number of Transactions are <%= transactions.size() %> </h4>
<table border="1">
    <tr>
        <td>TRANSACTION NUMBER </td> <td> PRODUCT NAME </td> <td> QUANTITY </td>
    </tr>
    <%
        for(int i=0;i<transactions.size();i++)
        {
            MyTransaction transaction = transactions.get(i) ;
    %>
    <tr>
        <td><%= transaction.getTransactionNumber() %></td>
        <td><%= transaction.getProducts() %></td>
        <td><%= transaction.getQuantity() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>