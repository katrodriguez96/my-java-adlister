<%--
  Created by IntelliJ IDEA.
  User: kathrynrodriguez
  Date: 4/1/22
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color</title>
    <style>
        body {
            background-color: <%= request.getParameter("color")%>;
        }
    </style>
</head>
<body>

</body>
</html>
