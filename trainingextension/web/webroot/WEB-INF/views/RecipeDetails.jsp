<%--
  Created by IntelliJ IDEA.
  User: tatianasamsonova
  Date: 09/11/2020
  Time: 1:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <title>Recipe Details</title>
</head>
<body>
    <h1>Recipe Details</h1>
    Recipe Details for ${recipe.name}
    <p>Date of creation: ${recipe.dateOfCreation}</p>
    <p>Recipe's complexity: ${recipe.complexity}</p>
    <p>Number of Ingredients: ${recipe.numberOfIngredients}</p>
<a href="../recipes">Back to Recipe List</a>
</body>
</html>
