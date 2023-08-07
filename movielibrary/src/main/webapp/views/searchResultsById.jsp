<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>MovFlix - Search Results</title>
</head>
<body>
    <h1>MovFlix - Search Results</h1>

    <c:if test="${movie ne null}">
        <h2>Search Results for Movie ID ${param.id}</h2>
        <table border="1">
            <tr>
                <th>Movie ID</th>
                <th>Movie Name</th>
                <th>Collection</th>
            </tr>
            <tr>
                <td>${movie.id}</td>
                <td>${movie.name}</td>
                <td>${movie.collection}</td>
            </tr>
        </table>
    </c:if>

    <c:if test="${movie eq null}">
        <p>No movies found for the given ID.</p>
    </c:if>
</body>
</html>
