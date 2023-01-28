<%-- 
    Document   : arithmeticcalculator
    Created on : 28-Jan-2023, 12:36:18 PM
    Author     : lynnh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="tex" name="fstint"><br>
            Second: <input type="tex" name="secint"><br>
            <input type="submit" name="submit" value="+">
            <input type="submit" name="submit" value="-">
            <input type="submit" name="submit" value="*">
            <input type="submit" name="submit" value="%">
        </form>
        <div>Result ${result}</div>
            <a href="age"> Age Calculator</a>
    </body>
</html>
