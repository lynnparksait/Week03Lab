<%-- 
    Document   : agecalculator
    Created on : 28-Jan-2023, 12:31:28 PM
    Author     : lynnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age: <input type="tex" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            <p> ${msg}</p>
            <a href="arithmetic"> Arithmetical Calculator</a>
    </body>
</html>
