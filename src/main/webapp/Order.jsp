<%-- 
    Document   : Order
    Created on : 19-03-2019, 16:26:13
    Author     : fskn
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Create your order here</h1><br><br>
        <form action="FrontController?action=showOrder" method="POST">
            <table class="table table-striped">
                <thead><tr><th>Heigth</th><th>Length</th><th>Width</th><th>Select</th><th></th></tr></thead>
                <tbody> 
                <td><input type="text" name="heigth" id="heigthInput"></td>
                <td><input type="text" name="length" id="lengthInput"></td>
                <td><input type="text" name="width"  id="widthInput"></td>
                <td><input type="submit" value="Confirm"></td><td></td>
                </tr>

            </table>
        </form>
    </body>
</html>