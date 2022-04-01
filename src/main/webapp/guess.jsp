<%--
  Created by IntelliJ IDEA.
  User: kathrynrodriguez
  Date: 4/1/22
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int numToGuess = (int) (Math.random() * (3 - 1 + 1) + 1); %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<h1>Guessing Game</h1>
<p>(Hint: try <%= numToGuess %>)</p>
<form method="POST" action="/guess.jsp">
    <label for="number">Guess a number between 1-3:</label>
    <input id="number" name="number" type="text">
    <br>
    <input type="submit">
</form>
</body>
</html>
