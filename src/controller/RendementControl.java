package controller;

import dao.RendementDAO;
import java.text.DecimalFormat;


public class RendementControl {
    // Prices in €/tonne or €/kg and costs in €/hectare for different products
    private static final double BLE_DUR_PRICE = 200;
    private static final double OLIVE_PRICE = 800;
    private static final double MARAICHAGE_PRICE = 1500;
    private static final double PLANT_AROMATIQUE_PRICE = 3000;

    private static final double BLE_DUR_COST = 900;
    private static final double OLIVE_COST = 1200;
    private static final double MARAICHAGE_COST = 2000;
    private static final double PLANT_AROMATIQUE_COST = 2500;

     public String[] Calculate(String password) {
        RendementDAO dao = new RendementDAO();
        
        String Quantite = dao.getQuantity_data(password);
        String Superficie = dao.getSuperficie_data(password);
        String Produite = dao.getProduit_data(password);

        int QuantiteToInteger = Integer.parseInt(Quantite);
        Superficie = Superficie.replace(",", ".");
        double SuperficieToDouble = Double.parseDouble(Superficie);
        int x = 0;

        switch (Produite) {
            case "Céréale":
                x = 1;
                break;
            case "Olive":
                x = 2;
                break;
            case "Maraichage":
                x = 3;
                break;
            case "Plantes Aromatiques":
                x = 4;
                break;
            default:
                System.out.println("error in Produite");
                return new String[]{"error in Produite"};
        }

        // Input quantity and area
        double totalProductQuantity = QuantiteToInteger * 1000;
        double farmArea = SuperficieToDouble;

        // Set prices and costs based on the chosen product
        double productPrice = 0;
        double costPerHectare = 0;

        switch (x) {
            case 1:
                productPrice = BLE_DUR_PRICE;
                costPerHectare = BLE_DUR_COST;
                break;
            case 2:
                productPrice = OLIVE_PRICE;
                costPerHectare = OLIVE_COST;
                break;
            case 3:
                productPrice = MARAICHAGE_PRICE;
                costPerHectare = MARAICHAGE_COST;
                break;
            case 4:
                productPrice = PLANT_AROMATIQUE_PRICE;
                costPerHectare = PLANT_AROMATIQUE_COST;
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                System.exit(0);
        }
        
        // Calculations
        double yieldPerHectare = calculateYieldPerHectare(totalProductQuantity, farmArea);
        double grossIncomePerHectare = calculateGrossIncomePerHectare(yieldPerHectare, productPrice);
        double netProfitPerHectare = calculateNetProfitPerHectare(grossIncomePerHectare, costPerHectare);
        double totalFinancialYield = calculateTotalFinancialYield(netProfitPerHectare, farmArea);

        // Format results to two decimal places
        DecimalFormat df = new DecimalFormat("#.00");
        String yieldPerHectareStr = df.format(yieldPerHectare);
        String grossIncomePerHectareStr = df.format(grossIncomePerHectare);
        String netProfitPerHectareStr = df.format(netProfitPerHectare);
        String totalFinancialYieldStr = df.format(totalFinancialYield);

        // Return results as an array of strings
        return new String[]{
            yieldPerHectareStr,
            grossIncomePerHectareStr,
            netProfitPerHectareStr,
            totalFinancialYieldStr
        };
    
   }

    public static double calculateYieldPerHectare(double totalProductQuantity, double farmArea) {
        return totalProductQuantity / farmArea;
    }

    public static double calculateGrossIncomePerHectare(double yieldPerHectare, double productPrice) {
        return yieldPerHectare * productPrice;
    }

    public static double calculateNetProfitPerHectare(double grossIncomePerHectare, double costPerHectare) {
        return grossIncomePerHectare - costPerHectare;
    }

    public static double calculateTotalFinancialYield(double netProfitPerHectare, double farmArea) {
        return netProfitPerHectare * farmArea;
    }
    
    public static void main(String[] args) {
        RendementControl calculator = new RendementControl();
        String password = "karbounay05"; // Sample password
        String[] results = calculator.Calculate(password);

        System.out.println("Yield per hectare: " + results[0] + " tonnes/ha or kg/ha");
        System.out.println("Gross income per hectare: " + results[1] + " €/ha");
        System.out.println("Net profit per hectare: " + results[2] + " €/ha");
        System.out.println("Total financial yield for the farm: " + results[3] + " €");
    }
    
    
}