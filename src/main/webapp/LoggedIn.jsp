<%-- 
    Document   : LoggedIn
    Created on : 19-03-2019, 16:04:03
    Author     : fskn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form method="GET">
            <h1>You can log in here</h1>
            Email:<br>
            <input type=text name=username value=><br>
            Password:<br>
            <input type=password name=password value=>
            <input type=hidden name=action value=logged-in>
            <br>
            <input type=submit value=Login User>
            <br>
        </form>

        <div class="test2">
            <br><br>
            <a type="button" class="btn btn-primary test" href ="Main.jsp">Return to main page</a>
        </div>

    </body>
</html>
