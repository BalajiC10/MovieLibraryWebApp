<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!-- Add this taglib declaration -->
<!DOCTYPE html>
<html>
<head>
    <title>MovFlix - Search Results By Name</title>
</head>
<body>
    <h1>MovFlix - Search Results By Name</h1>
    <c:if test="${not empty movies}">
        <h2>Search Results for Movie Name: ${searchValue}</h2>
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
    </c:if>

    <c:if test="${empty movies}">
        <p>No movies found for the given movie name.</p>
    </c:if>
</body>
</html>
