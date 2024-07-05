
package controller;

import dao.CultureDAO;
import dao.HistoriqueDAO;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Culture;
import view.AjouterCultureIHM;
import view.FermeIHM;


public class CultureControl {
    private boolean test  ;
    private String erreurMsg = "les données sont incorrectes";
    private String vide = " ";
    private String messageAcces;
   
    public void getControlCulture(String groupCereal ,String regime ,String etatRegime ,String pente ,String date , String password,String culture,AjouterCultureIHM frameInfo,String title){
         Culture auto = new Culture();
         
        
        
       //  String verify = auto.controlSpace(culture,password);
           auto.print(culture, password);
          if (  auto.getAll() == true){
              
                 CultureDAO passwordData = new CultureDAO();
                 String pass = passwordData.getPassword_data(password);
              if(pass != null){
                    
                  CultureDAO inserteCultureData = new CultureDAO();
                  Culture oo = new Culture();
                  String h = oo.print(culture, password);
                 // System.out.println(h);
                  inserteCultureData.replaceData(groupCereal,regime, etatRegime,pente,date,culture,password,h,title);
                  test = true ;
                  
                 
                  ValueControl op = new ValueControl();
                  String gcultureVal = op.groupeCulture(culture,password);
                  String regimeVal = op.regime(culture,password);
                  String eregimeVal = op.eregime(culture,password);
                  String penteVal = op.pente(culture,password);
                  String dateVal = op.date(culture,password);
                  String titreVal = op.titreON(culture,password);
                 
                  String gcultureVal1 = op.groupeCulture1(culture,password);
                  String regimeVal1 = op.regime1(culture,password);
                  String eregimeVal1 = op.eregime1(culture,password);
                  String penteVal1 = op.pente1(culture,password);
                  String dateVal1 = op.date1(culture,password);
                  String titreVal1 = op.titreON1(culture,password);
                 
                  String gcultureVal2 = op.groupeCulture2(culture,password);
                  String regimeVal2 = op.regime2(culture,password);
                  String eregimeVal2 = op.eregime2(culture,password);
                  String penteVal2 = op.pente2(culture,password);
                  String dateVal2 = op.date2(culture,password);
                  String titreVal2 = op.titreON2(culture,password);
                 
                 cultureControleValue obj1 = new cultureControleValue();
                 
                 FermeIHM dataInfo = new FermeIHM();
                 dataInfo.setVisible(true);
                 dataInfo.pack();
                 dataInfo.setLocationRelativeTo(null);
                 dataInfo.Setpass(password);
                 String dataNom = inserteCultureData.getNom_data(password);
            	 dataInfo.setNomData(dataNom);
                 String dataPrenom = inserteCultureData.getPrenom_data(password);
            	 dataInfo.setPrenomData(dataPrenom);
                 String dataReg = inserteCultureData.getreg_data(password);
            	 dataInfo.setRegData(dataReg);
                 String dataSup = inserteCultureData.getsup_data(password);
            	 dataInfo.setSupData(dataSup);
                 String dataDate = inserteCultureData.getdate_data(password);
            	 dataInfo.setDateData(dataDate);
                 
                 String groupeCulture1C1 = obj1.insertCult1(culture, password,"gcCulture2") ;
                 String regime1C1 = obj1.insertCult1(culture, password,"regime2") ;
                 String eRegime1C1 = obj1.insertCult1(culture, password,"eRegime2") ;
                 String pente1C1 = obj1.insertCult1(culture, password,"pente2") ;
                 String dateCulture1C1 = obj1.insertCult1(culture, password,"date2") ;
                 String titreCulture1C1 = obj1.insertCult1(culture, password,"titre2") ;
        
        
                 String groupeCulture2C1 = obj1.insertCult1(culture, password,"gcCulture3") ;
                 String regime2C1 = obj1.insertCult1(culture, password,"regime3") ;
                 String eRegime2C1 = obj1.insertCult1(culture, password,"eRegime3") ;
                 String pente2C1 = obj1.insertCult1(culture, password,"pente3") ;
                 String dateCulture2C1 = obj1.insertCult1(culture, password,"date3") ;
                 String titreCulture2C1 = obj1.insertCult1(culture, password,"titre3") ;
        
        
                 String groupeCultureC2 = obj1.insertCult2(culture, password,"gcCulture1") ;
                 String regimeC2 = obj1.insertCult2(culture, password,"regime1") ;
                 String eRegimeC2 = obj1.insertCult2(culture, password,"eRegime1") ;
                 String penteC2 = obj1.insertCult2(culture, password,"pente1") ;
                 String dateCultureC2 = obj1.insertCult2(culture, password,"date1") ;
                 String titreCultureC2 = obj1.insertCult2(culture, password,"titre1") ;
        
        
                 String groupeCulture2C2 = obj1.insertCult2(culture, password,"gcCulture3") ;
                 String regime2C2 = obj1.insertCult2(culture, password,"regime3") ;
                 String eRegime2C2 = obj1.insertCult2(culture, password,"eRegime3") ;
                 String pente2C2 = obj1.insertCult2(culture, password,"pente3") ;
                 String dateCulture2C2 = obj1.insertCult2(culture, password,"date3") ;
                 String titreCulture2C2 = obj1.insertCult2(culture, password,"titre3") ;
        
        
                 String groupeCultureC3 = obj1.insertCult2(culture, password,"gcCulture1") ;
                 String regimeC3 = obj1.insertCult2(culture, password,"regime1") ;
                 String eRegimeC3 = obj1.insertCult2(culture, password,"eRegime1") ;
                 String penteC3 = obj1.insertCult2(culture, password,"pente1") ;
                 String dateCultureC3 = obj1.insertCult2(culture, password,"date1") ;
                 String titreCultureC3 = obj1.insertCult2(culture, password,"titre1") ;
        
        
                 String groupeCulture1C3 = obj1.insertCult1(culture, password,"gcCulture2") ;
                 String regime1C3 = obj1.insertCult1(culture, password,"regime2") ;
                 String eRegime1C3 = obj1.insertCult1(culture, password,"eRegime2") ;
                 String pente1C3 = obj1.insertCult1(culture, password,"pente2") ;
                 String dateCulture1C3 = obj1.insertCult1(culture, password,"date2") ;
                 String titreCulture1C3 = obj1.insertCult1(culture, password,"titre2") ;
        
                 
                
                 
                 
                 dataInfo.groupeCulture(gcultureVal);
                 dataInfo.regime(regimeVal);
                 dataInfo.eRegime(eregimeVal);
                 dataInfo.pente(penteVal);
                 dataInfo.dateCulture(dateVal);
                 dataInfo.title(titreVal);
                 
                  if(culture.equals("Culture 1")){  
                 String txt = "- vous aves ajoutée "+titreVal;
                 String number = "Culture 1";
                 HistoriqueDAO hs = new HistoriqueDAO();
                 hs.insertHistory(number, txt,password);
                
                     
                 
                  }
                 
                 dataInfo.groupeCulture1(gcultureVal1);
                 dataInfo.regime1(regimeVal1);
                 dataInfo.eRegime1(eregimeVal1);
                 dataInfo.pente1(penteVal1);
                 dataInfo.dateCulture1(dateVal1);
                 dataInfo.title1(titreVal1);
                 
                 if(culture.equals("Culture 2")){
                 String txt1 = "- vous aves ajoutée "+titreVal1;
                 String number1 = "Culture 2";
                 HistoriqueDAO hs = new HistoriqueDAO();
                 hs.insertHistory(number1, txt1,password);
                
                
                 }
                 
                 dataInfo.groupeCulture2(gcultureVal2);
                 dataInfo.regime2(regimeVal2);
                 dataInfo.eRegime2(eregimeVal2);
                 dataInfo.pente2(penteVal2);
                 dataInfo.dateCulture2(dateVal2);
                 dataInfo.title2(titreVal2);
                 
                 if(culture.equals("Culture 3")){
                 String txt2 = "- vous aves ajoutée "+titreVal2;
                 String number2 = "Culture 3";
                 HistoriqueDAO hs = new HistoriqueDAO();
                 hs.insertHistory(number2, txt2,password);
               
                     
                 }
                 
                 
                 ////////////// Culture 1
                 if(culture.equals("Culture 1")){  
                 dataInfo.groupeCulture1(groupeCulture1C1);
                 dataInfo.regime1(regime1C1);
                 dataInfo.eRegime1(eRegime1C1);
                 dataInfo.pente1(pente1C1);
                 dataInfo.dateCulture1(dateCulture1C1);
                 dataInfo.title1(titreCulture1C1);
                 
                 
                 dataInfo.groupeCulture2(groupeCulture2C1);
                 dataInfo.regime2(regime2C1);
                 dataInfo.eRegime2(eRegime2C1);
                 dataInfo.pente2(pente2C1);
                 dataInfo.dateCulture2(dateCulture2C1);
                 dataInfo.title2(titreCulture2C1);
                    ////complete soon
                 }
                 ///////// Culture 2
                 if(culture.equals("Culture 2")){  
                 dataInfo.groupeCulture(groupeCultureC2);
                 dataInfo.regime(regimeC2);
                 dataInfo.eRegime(eRegimeC2);
                 dataInfo.pente(penteC2);
                 dataInfo.dateCulture(dateCultureC2);
                 dataInfo.title(titreCultureC2);
                 
                 dataInfo.groupeCulture2(groupeCulture2C2);
                 dataInfo.regime2(regime2C2);
                 dataInfo.eRegime2(eRegime2C2);
                 dataInfo.pente2(pente2C2);
                 dataInfo.dateCulture2(dateCulture2C2);
                 dataInfo.title2(titreCulture2C2);
                 
                 }
                 //////////////// Culture 3
                  if(culture.equals("Culture 3")){  
                 dataInfo.groupeCulture(groupeCultureC3);
                 dataInfo.regime(regimeC3);
                 dataInfo.eRegime(eRegimeC3);
                 dataInfo.pente(penteC3);
                 dataInfo.dateCulture(dateCultureC3);
                 dataInfo.title(titreCultureC3);
                 
                 dataInfo.groupeCulture1(groupeCulture1C3);
                 dataInfo.regime1(regime1C3);
                 dataInfo.eRegime1(eRegime1C3);
                 dataInfo.pente1(pente1C3);
                 dataInfo.dateCulture1(dateCulture1C3);
                 dataInfo.title1(titreCulture1C3);
                
                 
                 
                  }
                 
                
                  frameInfo.setVisible(false);
              }else{
                test = false ;
              }
              
              
              
          }else{
                     messageAcces = "vous n'avez pas l'autorisation d'ajouter une la nouvelle culture";
	             String titre = "Erreur";
	             JOptionPane.showMessageDialog(null, messageAcces, titre, JOptionPane.ERROR_MESSAGE);
            
          }  
         
         
    }
    
    public String afficherControl() {
	        if (test) {
	            return vide;
	        } else {
	            return erreurMsg;
	        }
    }
    
    public void insertHistorique() {
        HistoriqueDAO fetcher = new HistoriqueDAO();
        List<String> results = fetcher.getLastTenRows();

        StringBuilder labelText = new StringBuilder("<html>");

        for (String result : results) {
            labelText.append(result).append("<br>");
        }

        labelText.append("</html>");
     
    }

    public static void main(String[] args) {
      
         cultureControleValue obj1 = new cultureControleValue();
         String groupeCulture1 = obj1.insertCult1("Culture 1", "karbounay05","gcCulture2") ;
             
    }
}
