<%--
  Created by IntelliJ IDEA.
  User: kathrynrodriguez
  Date: 3/31/22
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<h1>Login</h1>
<br>
<h4>Try using username 'admin' and password 'password'</h4>
<form method="POST" action="/login.jsp">
    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit">
</form>
<%--JSTL--%>
    <c:if test="${param.username == 'admin' && param.password == 'password'}">
        <c:redirect url="/profile.jsp"/>
    </c:if>
<%--JSP--%>
<%--    <% if (request.getParameter("username") != null) {--%>
<%--        if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {--%>
<%--            response.sendRedirect("/profile.jsp");--%>
<%--        }--%>
<%--    } %>--%>
</body>
</html>
