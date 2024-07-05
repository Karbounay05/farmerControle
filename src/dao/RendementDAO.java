
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RendementDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ajouterferme";
    private static final String USER = "root";
    private static final String PASS = "amayno99";
    
      public void insertData(String quantite , String superficie ,String produite ,String password ) {
    	   String sql = "INSERT INTO rendementinfos (quantite, superficie , produite ,password) VALUES (?, ?, ?, ?)";

          try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, quantite);
            pstmt.setString(2, superficie);
            pstmt.setString(3, produite);
            pstmt.setString(4, password);
            pstmt.executeUpdate();
          //  System.out.println("quantite, superficie, produite and password  inserted successfully.");
            
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }
      public static String getQuantity_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String quantite = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT quantite FROM rendementinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                quantite = resultSet.getString("quantite");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (resultSet != null) resultSet.close();
	                if (preparedStatement != null) preparedStatement.close();
	                if (connection != null) connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	
	        return quantite;
	     }
      public static String getSuperficie_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String superficie = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT superficie FROM rendementinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                superficie = resultSet.getString("superficie");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (resultSet != null) resultSet.close();
	                if (preparedStatement != null) preparedStatement.close();
	                if (connection != null) connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	
	        return superficie;
	     }
      public static String getProduit_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String produite = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT produite FROM rendementinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                produite = resultSet.getString("produite");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (resultSet != null) resultSet.close();
	                if (preparedStatement != null) preparedStatement.close();
	                if (connection != null) connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	
	        return produite;
	     }
      public static String getPassword_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String password = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT password FROM personelinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                password = resultSet.getString("password");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (resultSet != null) resultSet.close();
	                if (preparedStatement != null) preparedStatement.close();
	                if (connection != null) connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	
	        return password;
	     }
      public void delete(String password ) {
    	   String sql = "DELETE FROM rendementinfos WHERE password = ?;";

          try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
          
            pstmt.setString(1, password);
            pstmt.executeUpdate();
            
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }
    
}
