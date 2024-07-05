
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class HistoriqueDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ajouterferme";
    private static final String USER = "root";
    private static final String PASS = "amayno99";
    
    public void insertHistory(String number , String text,String password ) {
    	   String sql = "INSERT INTO historiqueinfos (number, text ,password) VALUES (?, ?, ?)";

          try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, number);
            pstmt.setString(2, text);
            pstmt.setString(3, password);
           
            pstmt.executeUpdate();
           // System.out.println("inserted successfully.");
            
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }
   
   
    public List<String> getLastTenRows() {
        List<String> results = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return results;
        }

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "SELECT number, text, temps FROM historiqueinfos ORDER BY id DESC LIMIT 40";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String text = resultSet.getString("text");
                        String temps = resultSet.getString("temps");
                        String number = resultSet.getString("number");
                        results.add("   "+ temps+ " - "+text + " - " + number); // Example format: "text - temps"
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return results;
    }

     public void deleteAllRecords() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Establish connection to the database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // SQL query to delete all rows from historiqueinfos table
            String sql = "DELETE FROM historiqueinfos";

            // Create a PreparedStatement with the delete query
            pstmt = conn.prepareStatement(sql);
            // Execute the delete operation
            //System.out.println("Deleted " + rowsAffected + " rows from historiqueinfos table.");


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close PreparedStatement and Connection
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
