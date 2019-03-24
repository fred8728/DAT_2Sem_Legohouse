<%-- 
    Document   : Main
    Created on : 19-03-2019, 16:03:06
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
        <form2 name="logOut.jsp" action="FrontController" method="POST">
        <input type=hidden name=action value=logOut.jsp>
        <input type=submit value=logout >
        </form2>
        
        <h1 class=""><b>LegoHouse</b></h1>
        <br>
        <div class="test">
        <a type="button" class="btn btn-primary test " href =Register.jsp> Register </a>
        <a type="button" class="btn btn-primary test" href ="LoggedIn.jsp"> Log in here </a>
        <a type="button" class="btn btn-primary test" href ="Order.jsp"> Create order </a>
        </div>
        
        
    </body>
</html>