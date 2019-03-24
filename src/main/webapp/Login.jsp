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
        %><a href=\LegoHouse/FrontController?action=main-login>Your login is confirmed</a>
                
                <% 
            } else {%>
                        <h1>Something is wrong!</h1> 

        <p><a href="LoggedIn.jsp">Your username or password is incorrect</a></p>
        <p><a href="Register.jsp">Create a new user</a></p>
        <a href="Main.jsp">Return to main page</a> <%
            }%></a></p> 
</body>
</html>
