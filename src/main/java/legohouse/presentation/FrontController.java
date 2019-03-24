/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legohouse.presentation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import legohouse.data.DataAccessor;
import legohouse.function.LegoException;

/**
 *
 * @author fskn
 */
@WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {

    private final Connection connection = null;

    private static final String IP = "167.99.209.21";
    private static final String PORT = "3306";
    public static final String DATABASE = "LEGOHOUSE";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        ArrayList<String> list = new ArrayList<>();
        DataAccessor us = new DataAccessor();
        ArrayList<Integer> num = new ArrayList<>();
        HttpSession session = request.getSession(true);
        Boolean loggedIn = (Boolean) session.getAttribute("loggedIn");
        String action = request.getParameter("action");
        if (null == action) {
            if (session.isNew() || loggedIn == null || !loggedIn) {
                session.setAttribute("loggedIn", false);
                main(request, response);
            }
        } else {
            switch (action) {
                case "newUser":
                    newUser(request, response);
                    break;
                case "register":
                    register(request, response);
                    break;
                case "main":
                    main(request, response);
                    break;
                case "login":
                    loggedIn(request, response);
                    break;
                case "logged-in":
                    login(request, response);
                    break;
                case "logOut":
                    session.setAttribute("loggedIn", false);
                    main(request, response);
                    break;
                case "loginMain":
                    session.setAttribute("loggedIn", true);
                    main(request, response);
                    break;
                case "order":
                    if(loggedIn == true){
                    order(request, response);
                } else{ 
                        main(request, response);
                        }
                    break;
                case "showOrder":
                    ShowOrder.generateOrder(request, response);
            }
        }
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }

    private void main(HttpServletRequest request, HttpServletResponse response) throws LegoException {
        try {
            request.getRequestDispatcher("Main.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws LegoException {
        try {
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
        }
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws LegoException {
        try {
            request.getRequestDispatcher("Register.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
        }
    }

    private void newUser(HttpServletRequest request, HttpServletResponse response) throws LegoException, SQLException {
        try {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            DataAccessor.createUser(email, password);

            request.getRequestDispatcher("Main.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {

        }
    }

    private void loggedIn(HttpServletRequest request, HttpServletResponse response) throws LegoException {
        try {
            request.getRequestDispatcher("LoggedIn.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
        }
    }

    private void order(HttpServletRequest request, HttpServletResponse response) throws LegoException {
        try {
            request.getRequestDispatcher("Order.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(FrontController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
