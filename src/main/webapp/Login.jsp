<%-- 
    Document   : Login
    Created on : 19-03-2019, 16:04:26
    Author     : fskn
--%>

<%@page import="legohouse.data.DataAccessor"%>
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
        <%
            DataAccessor dao = new DataAccessor();

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            if (dao.comparePassword(email, password)) {
        %>
        <div class="test2">
            <br><br>
            <a type="button" class="btn btn-primary test" href=\Legohouse/FrontController?action=loginMain>Your login is confirmed</a>
        </div>

        <%
        } else {%>
        <h1>Something is wrong!</h1> 
        <div class="test2">
            <br><br>
            <a type="button" class="btn btn-primary test" href ="Main.jsp">Return to main page</a>
            <a type="button" class="btn btn-primary test" href="LoggedIn.jsp">Your username or password is incorrect</a>
            <a type="button" class="btn btn-primary test" href="Register.jsp">Create a new user</a>
        </div>
        <%
            }%></a></p> 
</body>
</html>
