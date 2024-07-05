package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Ferme;

public class FermeDAO {
	
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ajouterferme";
    private static final String USER = "root";
    private static final String PASS = "amayno99";
    
    private String data; 
    private Ferme main = new Ferme();
    
   
 
     
       //***************** ajouter une ferme agricole
	public static String getPassword_data(String nomValue) {
	           Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String nom = null;
	
	        try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT password FROM personelinfos WHERE nom = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, nomValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                nom = resultSet.getString("password");
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
	
	        return nom;
	     }
        public void insertData(String tel , String reg ,String sup ,String date ,String password ) {
    	   String sql = "INSERT INTO fermeinfos (tel, reg , sup ,date,password) VALUES (?, ?, ?, ?, ?)";

          try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, tel);
            pstmt.setString(2, reg);
            pstmt.setString(3, sup);
            pstmt.setString(4, date);
            pstmt.setString(5, password);
            pstmt.executeUpdate();
           // System.out.println("tel, reg, sup, date and password  inserted successfully.");
            
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }
       

       //**************** ajouter une culture 
       public static String getPassword_dataFromFerme(String Password) {
	           Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String pass = null;
	
	        try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT password FROM fermeinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, Password);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                pass = resultSet.getString("password");
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
	
	        return pass;
	     }
       public void insertDataCulture1(String password ) {
    	   String sql = "INSERT INTO cultureinfos VALUES (null, null, null, null, null, 'A', ?,null)";

          try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
           
            pstmt.setString(1, password);
            pstmt.executeUpdate();
            
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }
       public void insertDataCulture2(String password ) {
    	   String sql = "INSERT INTO cultureinfos VALUES (null, null, null, null, null, 'B', ?,null)";

          try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
           
            pstmt.setString(1, password);
            pstmt.executeUpdate();
            
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }
       public void insertDataCulture3(String password ) {
    	   String sql = "INSERT INTO cultureinfos VALUES (null, null, null, null, null, 'C', ?,null)";

          try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
           
            pstmt.setString(1, password);
            pstmt.executeUpdate();
            
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }
     
   
    
       

}
