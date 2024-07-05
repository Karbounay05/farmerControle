/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.FermeDAO;


public class Ferme {
    

    public  String getAll( String Password) {
  
     FermeDAO donnerData = new FermeDAO();
     String sign = donnerData.getPassword_dataFromFerme(Password);
      
    if( sign != null && sign.equals(Password)){
       
       return "nauto";
    }else{
       
    }
        return "auto";
  
    }
    
  /*  public static void main(String[] args) {
        Ferme jj = new Ferme();
        String ss = "karbounay05";
        System.out.println(jj.getAll( ss));
    }
   
    */

}
