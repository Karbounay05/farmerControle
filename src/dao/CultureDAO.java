
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CultureDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ajouterferme";
    private static final String USER = "root";
    private static final String PASS = "amayno99";
    
    
    //***********************
     public static String getNom_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String nom = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT nom FROM personelinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                nom = resultSet.getString("nom");
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
    
   // ***************************
      public static String getPrenom_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String prenom = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT prenom FROM personelinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                prenom = resultSet.getString("prenom");
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
	
	        return prenom;
	     }
    
     //****************************
    public static String getPassword_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String password = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT password FROM fermeinfos WHERE password = ?";
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
               
   //*************************
    public static String gettel_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String tel = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT tel FROM fermeinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                tel = resultSet.getString("tel");
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
	
	        return tel;
	     }
    //****
     public static String getEmail_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String email = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT email FROM personelinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                email = resultSet.getString("email");
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
	
	        return email;
	     }
    
   //***********************
    public static String getreg_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String reg = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT reg FROM fermeinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                reg = resultSet.getString("reg");
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
	
	        return reg;
	     }
     
   //*****************
    public static String getsup_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String sup = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT sup FROM fermeinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                sup = resultSet.getString("sup");
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
	
	        return sup;
	     }
     
   //*************
    public static String getdate_data(String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String date = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT date FROM fermeinfos WHERE password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                date = resultSet.getString("date");
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
	
	        return date;
	     }
     
   //**************
    public List<String> getCulturesByPassword(String password) {
                        List<String> cultures = new ArrayList<>();
                        String query = "SELECT culture FROM cultureinfos WHERE password = '" + password + "'";

                        // Load the MySQL JDBC driver
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                            return cultures;
                        }

                        // Connect to the database and execute the query
                        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                             Statement stmt = con.createStatement();
                             ResultSet rs = stmt.executeQuery(query)) {

                            // Process the results
                            while (rs.next() && cultures.size() < 4) { // Limiting to first 4 results
                                String culture = rs.getString("culture");
                                cultures.add(culture);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        return cultures;
                    }
    
    //**************
    
   public void replaceData(String groupCereal, String regime, String etatRegime, String pente, String date, String culture, String newPassword,String model ,String titre) {
    String sql = "UPDATE cultureinfos SET gcCulture = ?, regime = ?, eRegime = ?, pente = ?, date = ?, culture = ?, password = ?, titre = ? WHERE culture = ? AND password = ?";
    
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, groupCereal);
        pstmt.setString(2, regime);
        pstmt.setString(3, etatRegime);
        pstmt.setString(4, pente);
        pstmt.setString(5, date);
        pstmt.setString(6, culture);
        pstmt.setString(7, newPassword);
        pstmt.setString(8, titre);
        pstmt.setString(9, model);
        pstmt.setString(10, newPassword);
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
          //  System.out.println("Data replaced successfully.");
        } else {
            System.out.println("No data found to replace.");
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
  //*****************
   public void DeleteCulture1(String password) {
    String sql = "UPDATE cultureinfos SET gcCulture = ?, regime = ?, eRegime = ?, pente = ?, date = ?, culture = ?, password = ? WHERE culture = ? AND password = ?";
    
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, null);
        pstmt.setString(2, null);
        pstmt.setString(3, null);
        pstmt.setString(4, null);
        pstmt.setString(5, null);
        pstmt.setString(6, "A");
        pstmt.setString(7, password);
        pstmt.setString(8, "Culture 1");
        pstmt.setString(9, password);
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
           // System.out.println("Data replaced successfully.");
        } else {
            System.out.println("No data found to replace.");
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
  //***************
   public void DeleteCulture2(String password) {
    String sql = "UPDATE cultureinfos SET gcCulture = ?, regime = ?, eRegime = ?, pente = ?, date = ?, culture = ?, password = ? WHERE culture = ? AND password = ?";
    
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, null);
        pstmt.setString(2, null);
        pstmt.setString(3, null);
        pstmt.setString(4, null);
        pstmt.setString(5, null);
        pstmt.setString(6, "B");
        pstmt.setString(7, password);
        pstmt.setString(8, "Culture 2");
        pstmt.setString(9, password);
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
          //  System.out.println("Data replaced successfully.");
        } else {
            System.out.println("No data found to replace.");
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
   //*********
   public void DeleteCulture3(String password) {
    String sql = "UPDATE cultureinfos SET gcCulture = ?, regime = ?, eRegime = ?, pente = ?, date = ?, culture = ?, password = ? WHERE culture = ? AND password = ?";
    
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, null);
        pstmt.setString(2, null);
        pstmt.setString(3, null);
        pstmt.setString(4, null);
        pstmt.setString(5, null);
        pstmt.setString(6, "C");
        pstmt.setString(7, password);
        pstmt.setString(8, "Culture 3");
        pstmt.setString(9, password);
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
          //  System.out.println("Data replaced successfully.");
        } else {
            System.out.println("No data found to replace.");
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
   //********************************
   public static String get_gcCulture_data(String culture ,String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String gcCulture = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT gcCulture FROM cultureinfos WHERE culture = ? AND password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, culture);
                    preparedStatement.setString(2, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                gcCulture = resultSet.getString("gcCulture");
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
	
	        return gcCulture;
	     }
    
   //*********************
    public static String get_regime_data(String culture ,String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String regime = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT regime FROM cultureinfos WHERE culture = ? AND password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, culture);
                    preparedStatement.setString(2, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                regime = resultSet.getString("regime");
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
	
	        return regime;
	     }
    //********
    public static String get_eRegime_data(String culture ,String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String eRegime = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT eRegime FROM cultureinfos WHERE culture = ? AND password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, culture);
                    preparedStatement.setString(2, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                eRegime = resultSet.getString("eRegime");
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
	
	        return eRegime;
	     }
    //*****
    
    public static String get_pente_data(String culture ,String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String pente = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT pente FROM cultureinfos WHERE culture = ? AND password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, culture);
                    preparedStatement.setString(2, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                pente = resultSet.getString("pente");
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
	
	        return pente;
	     }
    //***
     public static String get_date_data(String culture ,String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String date = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT date FROM cultureinfos WHERE culture = ? AND password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, culture);
                    preparedStatement.setString(2, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                date = resultSet.getString("date");
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
	
	        return date;
	     }
     public static String get_title_data(String culture ,String passwordValue) {
                   Connection connection = null;
	           PreparedStatement preparedStatement = null;
	           ResultSet resultSet = null;
	           String titre = null;
                    try {
	            connection = DriverManager.getConnection(DB_URL, USER, PASS);
	
	            String selectQuery = "SELECT titre FROM cultureinfos WHERE culture = ? AND password = ?";
	            preparedStatement = connection.prepareStatement(selectQuery);
	            preparedStatement.setString(1, culture);
                    preparedStatement.setString(2, passwordValue);
	
	            resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                titre = resultSet.getString("titre");
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
	
	        return titre;
	     }
   
      public void updatePassword1( String oldPassword,String newPassword) {
    String sql = "UPDATE personelinfos SET  password = ? WHERE  password = ?";
    
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        
        pstmt.setString(1, newPassword);
        pstmt.setString(2, oldPassword);
        
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
           // System.out.println("Data replaced successfully.");
        } else {
            System.out.println("No data found to replace.");
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
      public void updatePassword2( String oldPassword,String newPassword) {
    String sql = "UPDATE cultureinfos SET  password = ? WHERE  password = ?";
    
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        
        pstmt.setString(1, newPassword);
        pstmt.setString(2, oldPassword);
        
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
           // System.out.println("Data replaced successfully.");
        } else {
            System.out.println("No data found to replace.");
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
      public void updatePassword3( String oldPassword,String newPassword) {
    String sql = "UPDATE fermeinfos SET  password = ? WHERE  password = ?";
    
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        
        pstmt.setString(1, newPassword);
        pstmt.setString(2, oldPassword);
        
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
           // System.out.println("Data replaced successfully.");
        } else {
            System.out.println("No data found to replace.");
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
      public void updatePassword4( String oldPassword,String newPassword) {
    String sql = "UPDATE rendementinfos SET  password = ? WHERE  password = ?";
    
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        
        pstmt.setString(1, newPassword);
        pstmt.setString(2, oldPassword);
        
        
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("Data replaced successfully.");
        } else {
            System.out.println("No data found to replace.");
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
    
    
    
      public static void main(String[] args) {
       // String password = "ggggg";
      //  CultureDAO obj = new CultureDAO();
     //   String gcCulture = obj.get_gcCulture_data("Culture 2","karbounay05");
       // String regime = obj.get_regime_data("Culture 3","karbounay05");
      //  String eRegime = obj.get_eRegime_data("Culture 3","karbounay05");
      //  String pente = obj.get_pente_data("Culture 3","karbounay05");
      //   String date = obj.get_date_data("Culture 3","karbounay05");
      //    System.out.println(gcCulture);
        //  System.out.println(regime);
       //   System.out.println(eRegime);
        //  System.out.println(pente);
       //   System.out.println(gcCulture);
      /*  if(pass != null){
          System.out.println(pass);
        }
        else{
            System.out.println("no data");
        }
      }*/
      
     /*  String groupCereal ="ble dure";
       String regime ="orage";
       String etatRegime="autre";
       String pente = "absente";
       String date = "2024-06-06";
       
      CultureDAO obj = new CultureDAO();
      obj.insertData(groupCereal,regime, etatRegime,pente,date);
     */ 
     
     CultureDAO dao = new CultureDAO();
     dao.replaceData(null, null, null, null, null, "B", "karbounay05", "Culture 1", null);
    }


}

