<%--
  Created by IntelliJ IDEA.
  User: tatianasamsonova
  Date: 09/11/2020
  Time: 1:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <title>Recipe list</title>
</head>
<body>
    <h1>Recipe List</h1>
        <ul>
            <c:forEach var="recipe" items="${recipes}">
                <li><a href="./recipes/${recipe.id}">${recipe.name}</a></li>
            </c:forEach>
        </ul>
</body>
</html>
