package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQuery {
    private static final String URL = "jdbc:mysql://localhost:3306/ajouterferme";
    private static final String USER = "root";
    private static final String PASSWORD = "amayno99";

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
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
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
}
