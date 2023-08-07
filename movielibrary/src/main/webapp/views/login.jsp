<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>MovFlix - Admin Login</title>
</head>
<body>
    <h1>MovFlix - Admin Login</h1>

    <!-- Admin Login Form -->
    <form action="/admin/login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required /><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required /><br>

        <button type="submit">Login</button>
    </form>
</body>
</html>
