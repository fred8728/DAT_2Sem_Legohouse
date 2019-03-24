/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legohouse.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import legohouse.function.LegoException;
import legohouse.function.Order;
import legohouse.function.User;

/**
 *
 * @author fskn
 */
public class DataAccessor {

    private static DBconnector connector = null;

    public DataAccessor() throws Exception {
        try {
            connector = new DBconnector();
        } catch (SQLException e) {
        }
    }

    public static void createUser(String email, String password) throws LegoException, SQLException {
        Connection conn = connector.getConnection();
        Statement statement = conn.createStatement();
        String query = "INSERT INTO USERS (EMAIL, PASSWORD)"
                + "VALUES('" + email + "', '" + password + "');";
        statement.executeUpdate(query);
    }
    
    public static void createOrder(String height, String length, String width) throws LegoException, SQLException {
        Connection conn = connector.getConnection();
            Statement statement = conn.createStatement();
        String query = "INSERT INTO ORDERDETAILS (HEIGHT, LENGTH, WIDTH) VALUES ('"
                + height + "','" + length + "','" + width + "');";
            statement.executeUpdate(query);
    }
    
    public boolean comparePassword(String email, String password) throws Exception {
        Connection conn = connector.getConnection();
        Statement statement = conn.createStatement();
        String query
                = " SELECT PASSWORD "
                + " FROM USERS "
                + " WHERE EMAIL ='" + email + "'; ";
        ResultSet rs = statement.executeQuery(query);

        String passwordreal = "";
        while (rs.next()) {
            passwordreal = rs.getString("PASSWORD");
        }
        if (password.equalsIgnoreCase(passwordreal)) {
            return true;
        } else {
            return false;
        }
    }
    
    public Order getOrder(int id) throws LegoException {
        String query = "SELECT * FROM ORDERDETAILS WHERE ORDER_ID = '" + id + "';";
        Order order = null;
        id = 0;
        int height = 0;
        int length = 0;
        int width = 0;

        try {
            Connection conn = connector.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                id = rs.getInt("ORDER_ID");
                height = rs.getInt("HEIGHT");
                length = rs.getInt("LENGTH");
                width = rs.getInt("WIDTH");

                order = new Order(id, height, length, width);
            }
        } catch (SQLException ex) {
            throw new LegoException("Wrong SQL syntax");
        }
        return order;
    }

    public List<Order> getOrders() throws LegoException {
        ArrayList<Order> orders = new ArrayList<>();
        String query = "SELECT * FROM ORDERDETAILS";

        int id = 0;
        int height = 0;
        int length = 0;
        int width = 0;

        try {
            Connection conn = connector.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                id = rs.getInt("ORDER_ID");
                height = rs.getInt("HEIGHT");
                length = rs.getInt("LENGTH");
                width = rs.getInt("WIDTH");

                orders.add(new Order(id, height, length, width));
            }
        } catch (SQLException ex) {

        }
        return orders;
    }

    public void changeUserBalance(int height, int id) throws LegoException {
        String query = "UPDATE ORDERDETAILS"
                + "SET HEIGHT =" + height
                + "WHERE ORDER_ID =" + id + ";";
        try {
            Connection conn = connector.getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException ex) {
        }
    }

    public void changeLength(int length, int id) throws LegoException {
        String query = "UPDATE ORDERDETAILS"
                + "SET LENGTH =" + length
                + "WHERE ORDER_ID =" + id + ";";
        try {
            Connection conn = connector.getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException ex) {
        }
    }

    public void changeWidth(int width, int id) throws LegoException {
        String query = "UPDATE ORDERDETAILS"
                + "SET WIDTH =" + width
                + "WHERE ORDER_ID =" + id + ";";
        try {
            Connection conn = connector.getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException ex) {
        }
    }
/*
    public User getUser(int id) throws LegoException {

        String query = "SELECT * FROM USERS WHERE USER_ID = '" + id + "';";
        User user = null;

        id = 0;
        String email = "";
        String password = "";
        double balance = 0.0;

        try {
            Connection conn = connector.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                id = rs.getInt("USER_ID");
                email = rs.getString("EMAIL");
                password = rs.getString("PASSWORD");
                balance = rs.getDouble("BALANCE");

                user = new User(email, password, role);
            }
        } catch (SQLException ex) {
            throw new LegoException("Wrong SQL syntax");
        }
        return user;
    }

    public List<User> getUsers() throws LegoException {
        ArrayList<User> users = new ArrayList<>();
        String query = "SELECT * FROM USERS";

        try {
            Connection conn = connector.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            int id = 0;
            String email = "";
            String password = "";
            String role = 0.0;

            while (rs.next()) {
                id = rs.getInt("USER_ID");
                email = rs.getString("EMAIL");
                password = rs.getString("PASSWORD");
                role = rs.getDouble("BALANCE");

                users.add(new User(id, email, password, role));
            }
        } catch (SQLException ex) {

        }
        return (ArrayList<User>) users;
    }*/

}
