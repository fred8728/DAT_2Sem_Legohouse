<%-- 
    Document   : ShowOrder
    Created on : 19-03-2019, 16:32:04
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
        <%DataAccessor dao = new DataAccessor();%>
        <form action="FrontController?action=newOrder" method="GET">
            <h1>This is your order:</h1>
            <table class="table table-striped">
                <thead><tr><th>Heigth</th><th>Length</th><th>Width</th><th>Total</th></tr></thead><tbody><tr>
                <tbody>
                    <input type="hidden" name="Length" value="<%=request.getParameter("Length")%>">
                
                        <td></td>
                        <td><form id="checkoutForm" action=Control method=POST><input type=hidden name=origin value=submitInvoice/>
                                <input type=submit value=Return out your order></form></td></tr>
                        </tbody>
            </table></form>

    </body>
</html>
