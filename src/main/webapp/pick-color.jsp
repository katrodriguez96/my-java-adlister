<%--
  Created by IntelliJ IDEA.
  User: kathrynrodriguez
  Date: 4/1/22
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pick a Color</title>
</head>
<body>
<h1>What color would you like to see?</h1>
<form method="POST" action="/color.jsp">
    <label for="color">Type in a color:</label>
    <input id="color" name="color" type="text">
    <br>
    <input type="submit">
</form>
<% if (request.getParameter("color") != null) {
    response.sendRedirect("/color.jsp");
} %>
</body>
</html>
