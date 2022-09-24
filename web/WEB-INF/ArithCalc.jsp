<%-- 
    Document   : ArithCalc
    Created on : 21-Sep-2022, 1:50:52 PM
    Author     : ayad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="first">First: </label>
            <input type="number" name="first" id="first"><br>
            <label for="second">Second: </label>
            <input type="number" name="second" id="second"><br>
            <button type="submit" name="add" id="add"> + </button>
            <button type="submit" name="subtract" id="subtract"> - </button>
            <button type="submit" name="multiply" id="multiply"> * </button> 
            <button type="submit" name="divide" id="divide"> / </button>
        </form>
        
        <p>Result: ${result}</p>
        
    </body>
    
    <a href="age">Calculate Age<a>
            
</html>