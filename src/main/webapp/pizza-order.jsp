<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: kathrynrodriguez
  Date: 4/1/22
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<h1>Pizza Time</h1>
<form method="POST" action="/pizza-order.jsp">
    <label for="crust">Crust</label><br>
    <select name="crust" id="crust">
        <option value="original">Original</option>
        <option value="garlic">Garlic</option>
        <option value="stuffed">Stuffed</option>
    </select><br>
    <br>
    <label for="sauce">Sauce</label><br>
    <select name="sauce" id="sauce">
        <option value="tomato">Tomato</option>
        <option value="marinara">Marinara</option>
        <option value="alfredo">Alfredo</option>
    </select><br>
    <br>
    <label for="size">Size</label><br>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select><br>
    <br>
    <label>Toppings</label><br>
    <input type="checkbox" id="topping1" name="toppings" value="Pepperoni">
    <label for="topping1"> Pepperoni</label><br>
    <input type="checkbox" id="topping2" name="toppings" value="Mushrooms">
    <label for="topping2"> Mushrooms</label><br>
    <input type="checkbox" id="topping3" name="toppings" value="Sausage">
    <label for="topping3"> Sausage</label><br>
    <br>
    <label for="address">Delivery Address</label><br>
    <input type="text" id="address" name="address"><br>
    <br>
    <input type="submit">
</form>
<% System.out.println("Crust type: " + request.getParameter("crust")); %>
<% System.out.println("Sauce type: " + request.getParameter("sauce")); %>
<% System.out.println("Size: " + request.getParameter("size")); %>
<% System.out.println("Toppings: " + Arrays.toString(request.getParameterValues("toppings"))); %>
<% System.out.println("Delivery address: " + request.getParameter("address")); %>
</body>
</html>
