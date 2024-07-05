package test;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class DatabaseFetcher {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ajouterferme";
    private static final String USER = "root";
    private static final String PASS = "amayno99";

    public List<String> getLastTenRows() {
        List<String> results = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return results;
        }

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "SELECT number, text, temps FROM historiqueinfos ORDER BY id DESC LIMIT 15";
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

  
}
