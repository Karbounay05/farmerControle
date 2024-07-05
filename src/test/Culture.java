package test;
import java.util.List;

public class Culture {
    public static void main(String[] args) {
        DatabaseQuery dbQuery = new DatabaseQuery();
        List<String> cultures = dbQuery.getCulturesByPassword("karbounay05");

        // Assign results to variables A, B, C, D
        String A = cultures.size() > 0 ? cultures.get(0) : "";
        String B = cultures.size() > 1 ? cultures.get(1) : "";
        String C = cultures.size() > 2 ? cultures.get(2) : "";
        String D = cultures.size() > 3 ? cultures.get(3) : "";
        String E = cultures.size() > 4 ? cultures.get(4) : "null";

        // Display the results
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("E: " + E);
    }
}
