<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 9/22/2021
  Time: 8:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new product</a>

<%--<form class="sbox" action="/search" method="get">--%>


<%--</form>--%>
</p>
<form  method="get" action="/products">
    <input type="text" hidden name="action" value="search">
    <input type="search" name="search" placeholder="Tìm kiếm theo tên">
    <button type="submit">Search</button>
</form>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Supplier name</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getSupplierName()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>