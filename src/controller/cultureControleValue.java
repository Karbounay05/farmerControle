package controller;

import dao.CultureDAO;
import model.Culture;
import view.FermeIHM;

public class cultureControleValue {

    public String[] selectCult1(String culture, String password) {
        // Extract the base culture name without the number
        String baseCulture = culture.substring(0, culture.lastIndexOf(" "));
        
        // Initialize the culture variables
        String cult2 = baseCulture + " 2";
        String cult3 = baseCulture + " 3";
        
        // Return an array containing  cult2, and cult3
        return new String[]{cult2, cult3};
    }
    public String val1Cult1(String culture , String password){
        cultureControleValue obj1 = new cultureControleValue();
        String[] results = obj1.selectCult1(culture, password);
        String m = results[0];
        return m;
    }
    public String val2Cult1(String culture , String password){
        cultureControleValue obj1 = new cultureControleValue();
        String[] results = obj1.selectCult1(culture, password);
        String n = results[1];
        return n;
    } 
    public String insertCult1(String culture, String password, String valueToReturn) {
    cultureControleValue obj1 = new cultureControleValue();
    String cult2 = obj1.val1Cult1(culture, password); // This will print "Culture 2"
    String cult3 = obj1.val2Cult1(culture, password); // This will print "Culture 2"

    Culture obj = new Culture();
    CultureDAO data = new CultureDAO();
    FermeIHM set = new FermeIHM();

    String result = "";

    String cult2FromData = obj.print(cult2, password);
    String cult3FromData = obj.print(cult3, password);
    if (cult2FromData.equals("B")) {
        result += "";
    } else {
        String cult2Reward = "Culture 2";
        //  System.out.println("B plein");
        String gcCulture2 = data.get_gcCulture_data(cult2Reward, password);
        String regime2 = data.get_regime_data(cult2Reward, password);
        String eRegime2 = data.get_eRegime_data(cult2Reward, password);
        String pente2 = data.get_pente_data(cult2Reward, password);
        String date2 = data.get_date_data(cult2Reward, password);
        String titre2 = data.get_title_data(cult2Reward, password);
        
        // Determine which value to return based on the input
        if (valueToReturn.equals("gcCulture2")) {
            result += gcCulture2;
        } else if (valueToReturn.equals("regime2")) {
            result += regime2;
        } else if (valueToReturn.equals("eRegime2")) {
            result += eRegime2;
        } else if (valueToReturn.equals("pente2")) {
            result += pente2;
        } else if (valueToReturn.equals("date2")) {
            result += date2;
        }else if (valueToReturn.equals("titre2")) {
            result += titre2;
        }
    }
    if (cult3FromData.equals("C")) {
        result += "";
    } else {
        String cult2Reward = "Culture 3";
        // System.out.println("C plein");
        String gcCulture3 = data.get_gcCulture_data(cult2Reward, password);
        // Only concatenate gcCulture3 to the result
        if (valueToReturn.equals("gcCulture3")) {
            result += gcCulture3;
        } else if (valueToReturn.equals("regime3")) {
            String regime3 = data.get_regime_data(cult2Reward, password);
            result += regime3;
        } else if (valueToReturn.equals("eRegime3")) {
            String eRegime3 = data.get_eRegime_data(cult2Reward, password);
            result += eRegime3;
        } else if (valueToReturn.equals("pente3")) {
            String pente3 = data.get_pente_data(cult2Reward, password);
            result += pente3;
        } else if (valueToReturn.equals("date3")) {
            String date3 = data.get_date_data(cult2Reward, password);
            result += date3;
        }else if (valueToReturn.equals("titre3")) {
            String titre3 = data.get_title_data(cult2Reward, password);
            result += titre3;
        }
    }
    return result;
}

    public String[] selectCult2(String culture, String password) {
        // Extract the base culture name without the number
        String baseCulture = culture.substring(0, culture.lastIndexOf(" "));
        
        // Initialize the culture variables
        String cult1 = baseCulture + " 1";
        String cult3 = baseCulture + " 3";
        
        // Return an array containing  cult2, and cult3
        return new String[]{cult1, cult3};
    }
    public String val1Cult2(String culture , String password){
        cultureControleValue obj1 = new cultureControleValue();
        String[] results = obj1.selectCult1(culture, password);
        String m = results[0];
        return m;
    }
    public String val2Cult2(String culture , String password){
        cultureControleValue obj1 = new cultureControleValue();
        String[] results = obj1.selectCult1(culture, password);
        String n = results[1];
        return n;
    } 
    public String insertCult2(String culture, String password, String valueToReturn) {
    cultureControleValue obj1 = new cultureControleValue();
    String cult1 = obj1.val1Cult2(culture, password); // This will print "Culture 2"
    String cult3 = obj1.val2Cult2(culture, password); // This will print "Culture 2"

    Culture obj = new Culture();
    CultureDAO data = new CultureDAO();
    FermeIHM set = new FermeIHM();

    String result = "";

    String cult1FromData = obj.print(cult1, password);
    String cult3FromData = obj.print(cult3, password);
    if (cult1FromData.equals("A")) {
        result += "";
    } else {
        String cult1Reward = "Culture 1";
        //  System.out.println("B plein");
        String gcCulture1 = data.get_gcCulture_data(cult1Reward, password);
        String regime1 = data.get_regime_data(cult1Reward, password);
        String eRegime1 = data.get_eRegime_data(cult1Reward, password);
        String pente1 = data.get_pente_data(cult1Reward, password);
        String date1 = data.get_date_data(cult1Reward, password);
        String titre1 = data.get_title_data(cult1Reward, password);
        
// Determine which value to return based on the input
        if (valueToReturn.equals("gcCulture1")) {
            result += gcCulture1;
        } else if (valueToReturn.equals("regime1")) {
            result += regime1;
        } else if (valueToReturn.equals("eRegime1")) {
            result += eRegime1;
        } else if (valueToReturn.equals("pente1")) {
            result += pente1;
        } else if (valueToReturn.equals("date1")) {
            result += date1;
        }else if (valueToReturn.equals("titre1")) {
            result += titre1;
        }
    }
    if (cult3FromData.equals("C")) {
        result += "";
    } else {
        String cult2Reward = "Culture 3";
        // System.out.println("C plein");
        String gcCulture3 = data.get_gcCulture_data(cult2Reward, password);
        // Only concatenate gcCulture3 to the result
        if (valueToReturn.equals("gcCulture3")) {
            result += gcCulture3;
        } else if (valueToReturn.equals("regime3")) {
            String regime3 = data.get_regime_data(cult2Reward, password);
            result += regime3;
        } else if (valueToReturn.equals("eRegime3")) {
            String eRegime3 = data.get_eRegime_data(cult2Reward, password);
            result += eRegime3;
        } else if (valueToReturn.equals("pente3")) {
            String pente3 = data.get_pente_data(cult2Reward, password);
            result += pente3;
        } else if (valueToReturn.equals("date3")) {
            String date3 = data.get_date_data(cult2Reward, password);
            result += date3;
        }else if (valueToReturn.equals("titre3")) {
            String titre3 = data.get_title_data(cult2Reward, password);
            result += titre3;
        }
    }
    return result;
}

    public String[] selectCult3(String culture, String password) {
        // Extract the base culture name without the number
        String baseCulture = culture.substring(0, culture.lastIndexOf(" "));
        
        // Initialize the culture variables
        String cult1 = baseCulture + " 1";
        String cult2 = baseCulture + " 2";
        
        // Return an array containing  cult2, and cult3
        return new String[]{cult1, cult2};
    }
    public String val1Cult3(String culture , String password){
        cultureControleValue obj1 = new cultureControleValue();
        String[] results = obj1.selectCult3(culture, password);
        String m = results[0];
        return m;
    }
    public String val2Cult3(String culture , String password){
        cultureControleValue obj1 = new cultureControleValue();
        String[] results = obj1.selectCult3(culture, password);
        String n = results[1];
        return n;
    } 
    public String insertCult3(String culture, String password, String valueToReturn) {
    cultureControleValue obj1 = new cultureControleValue();
    String cult1 = obj1.val1Cult3(culture, password); // This will print "Culture 2"
    String cult2 = obj1.val2Cult3(culture, password); // This will print "Culture 2"

    Culture obj = new Culture();
    CultureDAO data = new CultureDAO();
    FermeIHM set = new FermeIHM();

    String result = "";

    String cult1FromData = obj.print(cult1, password);
    String cult2FromData = obj.print(cult2, password);
    if (cult1FromData.equals("A")) {
        result += "";
    } else {
        String cult1Reward = "Culture 1";
        //  System.out.println("B plein");
        String gcCulture1 = data.get_gcCulture_data(cult1Reward, password);
        String regime1 = data.get_regime_data(cult1Reward, password);
        String eRegime1 = data.get_eRegime_data(cult1Reward, password);
        String pente1 = data.get_pente_data(cult1Reward, password);
        String date1 = data.get_date_data(cult1Reward, password);
        String titre1 = data.get_title_data(cult1Reward, password);
        
        // Determine which value to return based on the input
        if (valueToReturn.equals("gcCulture1")) {
            result += gcCulture1;
        } else if (valueToReturn.equals("regime1")) {
            result += regime1;
        } else if (valueToReturn.equals("eRegime1")) {
            result += eRegime1;
        } else if (valueToReturn.equals("pente1")) {
            result += pente1;
        } else if (valueToReturn.equals("date1")) {
            result += date1;
        }
        else if (valueToReturn.equals("titre1")) {
            result += titre1;
        }
    }
    if (cult2FromData.equals("B")) {
        result += "";
    } else {
        String cult2Reward = "Culture 2";
        // System.out.println("C plein");
        String gcCulture2 = data.get_gcCulture_data(cult2Reward, password);
        // Only concatenate gcCulture3 to the result
        if (valueToReturn.equals("gcCulture2")) {
            result += gcCulture2;
        } else if (valueToReturn.equals("regime2")) {
            String regime2 = data.get_regime_data(cult2Reward, password);
            result += regime2;
        } else if (valueToReturn.equals("eRegime2")) {
            String eRegime2 = data.get_eRegime_data(cult2Reward, password);
            result += eRegime2;
        } else if (valueToReturn.equals("pente2")) {
            String pente2 = data.get_pente_data(cult2Reward, password);
            result += pente2;
        } else if (valueToReturn.equals("date2")) {
            String date2 = data.get_date_data(cult2Reward, password);
            result += date2;
        }else if (valueToReturn.equals("titre2")) {
            String titre2 = data.get_title_data(cult2Reward, password);
            result += titre2;
        }
    }
    return result;
}

         
     public static void main(String[] args) {
         cultureControleValue obj1 = new cultureControleValue();
         String a = obj1.val2Cult1("Culture 1", "karbounay05");
         
         System.out.println(a);
        // Calling the insert method with the specified parameters
          //    String result = obj1.insertCult1("Culture 1", "karbounay05", "gcCulture2");
        // Printing the result to the console
        // System.out.println(result);
        
      //  System.out.println(cult2);
       
    }
}
