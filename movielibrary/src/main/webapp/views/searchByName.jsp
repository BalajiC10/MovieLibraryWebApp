<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>MovFlix - Search By Movie Name</title>
</head>
<body>
    <h1>Search By Movie Name</h1>
    <form action="/searchByNameResult" method="post">
        Enter Movie Name: <input type="text" name="movieName">
        <br><br>
        <input type="submit">
    </form>
</body>
</html>
