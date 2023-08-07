<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>MovFlix - Search By Collection Range</title>
</head>
<body>
    <h1>Search By Collection Range</h1>
    <form action="/searchByCollectionResult" method="post">
        Enter Min Collection: <input type="number" name="minCollection" step="0.01">
        <br><br>
        Enter Max Collection: <input type="number" name="maxCollection" step="0.01">
        <br><br>
        <input type="submit">
    </form>
</body>
</html>
