<%-- 
    Document   : Register
    Created on : 19-03-2019, 16:03:52
    Author     : fskn
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href = "style.css">
    </head>
    <body>
        <form action="FrontController?action=newUser" method="POST">
            <h1>Register here</h1>
            <hr>
            Email:<br>
            <input type="text" name="email" value=><br>
            Password:<br>
            <input type=password name=password value=></p>
            <input type="submit" value="Submit">
        </form>
        <div class="test2">
            <br><br>
            <a type="button" class="btn btn-primary test" href ="Main.jsp">Return to main page</a>
        </div>
    </body>
</html>
