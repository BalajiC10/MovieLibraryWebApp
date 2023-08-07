<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>MovFlix - Add Movie</title>
</head>
<body>
    <h1>Add Movie</h1>
    <form action="/addMovie" method="post">

        Enter Movie ID: <input type="number" name="id">
        <br><br>
        Enter Movie Name: <input type="text" name="name">
        <br><br>
        Enter Collection: <input type="number" name="collection">
        <br><br>
        <input type="submit">
    </form>
     <p>Click on the buttons below:</p>
    <a href="viewAllMovies">View All Movies</a> <!-- Assuming "viewAllMovies.jsp" is the JSP view to display all movies -->
    <a href="adminDashboard">Home Page</a>
</body>
</html>
