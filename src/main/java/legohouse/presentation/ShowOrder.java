/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legohouse.presentation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import legohouse.data.DataAccessor;
import legohouse.function.LegoException;
import legohouse.function.ShoppingCart;

/**
 *
 * @author fskn
 */
public class ShowOrder {

    public static void generateOrder(HttpServletRequest request, HttpServletResponse response) throws LegoException, IOException {
        String heigth = request.getParameter("heigth");
        String length = request.getParameter("length");
        String width = request.getParameter("width");
        String total = heigth+"x"+length+"x"+width;
        
        try {
            DataAccessor.createOrder(heigth, length, width);
        } catch (Exception ex) {

        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet lol</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
            out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>This is your order</h1>");
            out.println(" <table class=\"table table-striped\"><thead><tr><th>Heigth</th><th>Length</th><th>Width</th><th>Total </th>"
                    + "</tr></thead><tbody><tr><td>" + heigth + "</td><td>" + length + "</td><td>" + width + "</td>"
                    + "<td class=\"lineprice\">" + total + "</td><td><form action=\"Control\" method=\"POST\"><input type=\"hidden\" name=\"origin\" value=\"removeLine\">"
                    + "<input type=\"hidden\" name=\"lineId\" value=\"473\"></form></td></tr><tr><td>"
                    + "</td><td></td><td></td><td><form id=\"checkoutForm\" action=\"Control\" method=\"POST\"><input type=\"hidden\" "
                    + "name=\"origin\" value=\"submitInvoice\"/>"
                    + "</form></td></tr>\n"
                    + "                        </tbody>\n"
                    + "                    </table>");
            out.println("<p><a href=\"Main.jsp\">Return to main page</a></p>");
            out.println("</body>");
            out.println("</html>");
        }

    }
}
