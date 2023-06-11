
package uaspbo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class config {
    private static final String DB = "jdbc:mysql://localhost:3306/dbuas";
    
    
    public static Connection getConnection() throws SQLException{
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(DB, "root", "");
            System.out.println("Connected to database.");
        } catch (Exception e) {
            System.err.println("Failed to connect to database.");
            e.printStackTrace();
        }
        return conn;
    }

    static PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}