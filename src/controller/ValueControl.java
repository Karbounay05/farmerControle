
package controller;

import dao.CultureDAO;
import model.Culture;
import model.Ferme;
import view.FermeIHM;


public class ValueControl {
    
    public String groupeCulture(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 1")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_gcCulture_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String regime(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 1")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_regime_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String eregime(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 1")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_eRegime_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String pente(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 1")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_pente_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String date(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 1")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_date_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String titreON(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 1")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_title_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    
    public String groupeCulture1(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 2")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_gcCulture_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String regime1(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 2")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_regime_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String eregime1(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 2")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_eRegime_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String pente1(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 2")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_pente_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String date1(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 2")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_date_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
     public String titreON1(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 2")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_title_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    
    public String groupeCulture2(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 3")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_gcCulture_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String regime2(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 3")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_regime_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String eregime2(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 3")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_eRegime_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String pente2(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 3")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_pente_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    public String date2(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 3")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_date_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
     public String titreON2(String culture , String password){
        String value = null;
                 if(culture.equals("Culture 3")){
                      CultureDAO data = new CultureDAO();
                       value = data.get_title_data(culture,password);
                  }else{
                      value = null;
                  }        
          return value    ;
    }
    
    
    
}
