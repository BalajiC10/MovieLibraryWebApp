<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
    <title>MovFlix - View All Movies</title>
</head>
<body>
    <h1>View All Movies</h1>
    <table border="1">
        <tr>
            <th>Movie ID</th>
            <th>Movie Name</th>
            <th>Collection</th>
        </tr>
        <c:forEach var="movie" items="${movies}">
            <tr>
                <td>${movie.id}</td>
                <td>${movie.name}</td>
                <td>${movie.collection}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="adminDashboard">Back to Admin Dashboard</a>
</body>
</html>
