/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legohouse.function;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import legohouse.data.DataAccessor;

/**
 *
 * @author fskn
 */
public class PageOrder {
   /* public static void generateOrder(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            UserMapper us = new UserMapper();
            OrderMapper om = new OrderMapper();
            
            int  heigth =Integer.parseInt(request.getParameter("height"));
            int length = Integer.parseInt(request.getParameter("length"));
            int width = Integer.parseInt(request.getParameter("width"));
            House house = new House(heigth, length,width);
            String email = request.getParameter("email");
            String passwrod = request.getParameter("password");
            String quant = request.getParameter("qty");
            String str = "";
            String temp = "";
            int price = 0;
            
            
            price = heigth + length + width;
                str = acc.getBottoms(bot);
                temp = acc.getTops(top);
                price = acc.getPriceBot(bot) + acc.getPriceTop(top);
            } catch (Exception e) {
            }
            int total = quanti * price;
            String name = str.replace("6", "with ");
            String topp = temp.replace("6", "");
            String namee = name.replace("5", "with ");
            String toppp = topp.replace("5", "");
            String finish = namee + toppp;
            
            // liner = new LineItems(top, bot, quanti);
            // shopperz.addToList(liner);
            try {
                acc.sendOrderToDB(bot, top, quanti);
            } catch (Exception e) {
            }
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
              /*  out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet lol</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Your order is done!</h1>");
                out.println(" <table class=\"table table-striped\"><thead><tr><th>Name</th><th>Quantity</th><th>Price</th><th>Total</th>"
                        + "<th>Remove</th></tr></thead><tbody><tr><td>" + finish + "</td><td>" + quant + "</td><td>" + price + "</td>"
                                + "<td class=\"lineprice\">" + total + "</td><td><form action=\"Control\" method=\"POST\"><input type=\"hidden\" name=\"origin\" value=\"removeLine\">"
                                        + "<input type=\"hidden\" name=\"lineId\" value=\"473\"><input type=\"submit\"value=\"remove\"></form></td></tr><tr><td><h4>Total price</h4>"
                                        + "</td><td></td><td></td><td id=\"totalprice\"></td><td><form id=\"checkoutForm\" action=\"Control\" method=\"POST\"><input type=\"hidden\" "
                                        + "name=\"origin\" value=\"submitInvoice\"/>"
                                        + "<input type=\"submit\" value=\"Check out your order\"></form></td></tr>\n"
                                        + "                        </tbody>\n"
                                        + "                    </table>");
                out.println("<p><a href=\"/exercise1recipes/lol?action=main\">Return to main page!</a></p>");
                out.println("</body>");
                out.println("</html>");
            }
        } catch (Exception ex) {
            Logger.getLogger(PageOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}*/
    
}
