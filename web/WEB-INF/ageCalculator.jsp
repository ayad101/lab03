<%-- 
    Document   : ageCalculator
    Created on : 21-Sep-2022, 1:50:37 PM
    Author     : ayad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculate Age</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            <label for="age">Enter current age: </label>
            <input type="number" name="age" id="age"><br>
            <button type="submit">Calculate your age</button>
        </form>
        
        ${message}<br>
        <a href="arithmetic">Arithmetic Calculator</a>   
    </body>