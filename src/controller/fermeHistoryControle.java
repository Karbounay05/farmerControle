
package controller;

import dao.CultureDAO;
import model.Culture;
import view.FermeIHM;



public class fermeHistoryControle {
    
          private String cult1;
          private String cult2;
          private String cult3;
          private String[] results;
          private String nom;
          private String prenom;
          private String reg;
          private String sup;
          private String pass;
          private String date;
          
            
            public void action(String password){
              String cult = "Culture X";
              
              FermeIHM ferme = new FermeIHM();
              ferme.setVisible(true);
              ferme.pack();
              ferme.setLocationRelativeTo(null);
              
              CultureDAO dao = new CultureDAO();
               nom = dao.getNom_data(password);
               prenom = dao.getPrenom_data(password);
               pass = dao.getPassword_data(password);
              
              ferme.setNomData(nom);
              ferme.setPrenomData(prenom);
              ferme.Setpass(pass);
              System.out.println(pass);
              
               reg = dao.getreg_data(password);
               sup = dao.getsup_data(password);
               date = dao.getdate_data(password);
             
              ferme.setRegData(reg);
              ferme.setSupData(sup);
              ferme.setDateData(date);
              
              fermeHistoryControle objFerme = new fermeHistoryControle();
              String gcCulture1 = objFerme.insertCult(cult, password, "gcCulture1");
              String regime1 = objFerme.insertCult(cult, password, "regime1");
              String eRegime1 = objFerme.insertCult(cult, password, "eRegime1");
              String pente1 = objFerme.insertCult(cult, password, "pente1");
              String date1 = objFerme.insertCult(cult, password, "date1");
              String titre1 = objFerme.insertCult(cult, password, "titre1");
              
              String gcCulture2 = objFerme.insertCult(cult, password, "gcCulture2");
              String regime2 = objFerme.insertCult(cult, password, "regime2");
              String eRegime2 = objFerme.insertCult(cult, password, "eRegime2");
              String pente2 = objFerme.insertCult(cult, password, "pente2");
              String date2 = objFerme.insertCult(cult, password, "date2");
              String titre2 = objFerme.insertCult(cult, password, "titre2");
              
              String gcCulture3 = objFerme.insertCult(cult, password, "gcCulture3");
              String regime3 = objFerme.insertCult(cult, password, "regime3");
              String eRegime3 = objFerme.insertCult(cult, password, "eRegime3");
              String pente3 = objFerme.insertCult(cult, password, "pente3");
              String date3 = objFerme.insertCult(cult, password, "date3");
              String titre3 = objFerme.insertCult(cult, password, "titre3");
               
              
              ferme.groupeCulture(gcCulture1);
              ferme.regime(regime1);
              ferme.eRegime(eRegime1);
              ferme.pente(pente1);
              ferme.dateCulture(date1);
              ferme.title(titre1);
              
              ferme.groupeCulture1(gcCulture2);
              ferme.regime1(regime2);
              ferme.eRegime1(eRegime2);
              ferme.pente1(pente2);
              ferme.dateCulture1(date2);
              ferme.title1(titre2);
              
              ferme.groupeCulture2(gcCulture3);
              ferme.regime2(regime3);
              ferme.eRegime2(eRegime3);
              ferme.pente2(pente3);
              ferme.dateCulture2(date3);
              ferme.title2(titre3);
              
              
        
            }
            
            
           
    
    
            
            
            public String[] selectCult(String culture, String password) {
            // Extract the base culture name without the number
            String baseCulture = culture.substring(0, culture.lastIndexOf(" "));

            // Initialize the culture variables
             cult1 = baseCulture + " 1";
             cult2 = baseCulture + " 2";
             cult3 = baseCulture + " 3";

            // Return an array containing  cult2, and cult3 and cult3
            return new String[]{cult1, cult2, cult3};
           }
            public String val1Cult(String culture , String password){
            fermeHistoryControle obj1 = new fermeHistoryControle();
            results = obj1.selectCult(culture, password);
            String m = results[0];
            return m;
           }
            public String val2Cult(String culture , String password){
            fermeHistoryControle obj1 = new fermeHistoryControle();
             results = obj1.selectCult(culture, password);
            String m = results[1];
            return m;
           }
            public String val3Cult(String culture , String password){
            fermeHistoryControle obj1 = new fermeHistoryControle();
            results = obj1.selectCult(culture, password);
            String m = results[2];
            return m;
           }
            public String insertCult(String culture, String password, String valueToReturn) {
            fermeHistoryControle obj1 = new fermeHistoryControle();
             cult1 = obj1.val1Cult(culture, password);
             cult2 = obj1.val2Cult(culture, password); // This will print "Culture 2"
             cult3 = obj1.val3Cult(culture, password); // This will print "Culture 2"

            Culture obj = new Culture();
            CultureDAO data = new CultureDAO();
            
            String result = "";
            
            String cult1FromData = obj.print(cult1, password);
            String cult2FromData = obj.print(cult2, password);
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
                   String titre1 = data.get_title_data(cult1Reward,password);
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
                 String titre2 = data.get_title_data(cult2Reward,password);
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
            
            
            
            
}
