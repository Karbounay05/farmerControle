package controller;

import javax.print.attribute.standard.Media;
import javax.swing.JOptionPane;
import dao.FermeDAO;
import model.Ferme;
import view.AjouterFermeIHM;
import view.AjouterFermeInfos;
import dialog.MessageFermeConfermation;


public class FermeControl {
	   
       private String erreurMsg = "les informations sont incorrectes";
       private String vide = " ";
       private boolean test  ;
       private String messageAcces;
	   
	
    

    public void getControl(String nom, String prenom, String password,  String tel,String region, String superficie, String date,AjouterFermeInfos frameInfo,AjouterFermeIHM parentFrame) {
    	Ferme auto = new Ferme();
        auto.getAll( password);
        String autoriser = auto.getAll(password);
        
        if (autoriser.equals("auto")){

		        FermeDAO donnerData = new FermeDAO();
		        String dataPassword = donnerData.getPassword_data(nom);
        
			        if (dataPassword != null && dataPassword.equals(password)) {
                                    
			            FermeDAO ajouterDonnes = new FermeDAO();
			            ajouterDonnes.insertData(tel, region, superficie, date,password);
                                    ajouterDonnes.insertDataCulture1(password);
                                    ajouterDonnes.insertDataCulture2(password);
                                    ajouterDonnes.insertDataCulture3(password);
			            test = true ;
                                    MessageFermeConfermation conferme = new  MessageFermeConfermation( parentFrame);
                                    conferme.setNom(nom);
                                    conferme.setPrenom(prenom);
                                    conferme.setSuperficie(superficie);
                                    conferme.setDate(date);
                                    conferme.setTel(tel);
                                    conferme.setRegion(region);
                                    conferme.setVisible(true);
                                    conferme.pack();
                                    conferme.setLocationRelativeTo(null);
                  
                                    frameInfo.setVisible(false);
                                 
			        } else {
			                       test = false ;
			        }
			        
        }
        
        else {
	             messageAcces = "vous aves déja ajouter une ferme agricole";
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
   
  
    
}

