<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Successful</title>
</head>
<body>
<h1>Login Successful</h1>
<p>Welcome, <%= request.getAttribute("userEmail") %>!</p>
</body>
</html>
