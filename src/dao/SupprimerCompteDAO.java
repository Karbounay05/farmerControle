
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class SupprimerCompteDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ajouterferme";
    private static final String USER = "root";
    private static final String PASS = "amayno99";
    
    
     public void delete1(String password ) {
    	   String sql = "DELETE FROM cultureinfos WHERE password = ?;";

          try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
          
            pstmt.setString(1, password);
            pstmt.executeUpdate();
            
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }
     public void delete2(String password ) {
    	   String sql = "DELETE FROM fermeinfos WHERE password = ?;";

          try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
          
            pstmt.setString(1, password);
            pstmt.executeUpdate();
            
         } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
     }
     public void delete3(String password ) {
               String sql = "DELETE FROM personelinfos WHERE password = ?;";

              try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {


                pstmt.setString(1, password);
                pstmt.executeUpdate();

             } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
         }
     public void delete4(String password ) {
               String sql = "DELETE FROM rendementinfos WHERE password = ?;";

              try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {


                pstmt.setString(1, password);
                pstmt.executeUpdate();

             } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
         }
     public void delete5(String password ) {
               String sql = "DELETE FROM historiqueinfos WHERE password = ?;";

              try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {


                pstmt.setString(1, password);
                pstmt.executeUpdate();

             } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
         }






}

