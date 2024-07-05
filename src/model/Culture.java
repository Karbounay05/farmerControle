/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.CultureDAO;
import java.util.List;
import test.DatabaseQuery;

/**
 *
 * @author ikona
 */
public class Culture {
    private boolean auotorisation ;

   
    
    
    
                     public String print(String culture, String pass) {
                             DatabaseQuery dbQuery = new DatabaseQuery();
                             List<String> cultures = dbQuery.getCulturesByPassword(pass);

                             // Assign results to variables A, B, C
                             String A = cultures.size() > 0 ? cultures.get(0) : "null";
                             String B = cultures.size() > 1 ? cultures.get(1) : "null";
                             String C = cultures.size() > 2 ? cultures.get(2) : "null";

                             // Create a StringBuilder to store all the results
                             StringBuilder resultBuilder = new StringBuilder();

                             // Control flow based on culture
                             switch (culture) {
                                 case "Culture 1":
                                     if ("Culture 1".equals(A)) {
                                         resultBuilder.append("plein");
                                         auotorisation = false;
                                     } else {
                                         resultBuilder.append("A");
                                         auotorisation = true;
                                     }
                                     break;
                                 case "Culture 2":
                                     if ("Culture 2".equals(B)) {
                                         resultBuilder.append("plein");
                                         auotorisation = false;
                                     } else {
                                         resultBuilder.append("B");
                                         auotorisation = true;
                                     }
                                     break;
                                 case "Culture 3":
                                     if ("Culture 3".equals(C)) {
                                         resultBuilder.append("plein");
                                         auotorisation = false;
                                     } else {
                                         resultBuilder.append("C");
                                         auotorisation = true;
                                     }
                                     break;
                                 default:
                                     // Handle unknown culture
                                     resultBuilder.append("Unknown culture\n");
                                     auotorisation = false; // Assuming unknown culture defaults to true
                                     break;
                             }

                             // Convert StringBuilder to String and return
                             return resultBuilder.toString();
                         }


                          
                          
                            
                public boolean getAll() {
                    return auotorisation;
                }

    
    
    
    public static void main(String[] args) {
          Culture obj = new Culture();
        // String ss = obj.controlSpace("Culture 1", "karbounay05");
        // System.out.println(ss);
        System.out.println(obj.print( "Culture 1","karbounay05"));
       // System.out.println(obj.getAll());
        //obj.old("karbounay05");
        //System.out.println(obj.print("Culture 2","karbounay05"));
         
    }
}
