/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legohouse.data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author fskn
 */
public class DBconnector {
    private Connection connection = null;
    
    private static final String IP = "167.99.209.21";
    private static final String PORT = "3306";
    public static final String DATABASE = "LEGOHOUSE";
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = "1234";

    public DBconnector() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        
        this.connection = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
	}
    
    public Connection getConnection(){
        return this.connection;
    }
    
}
