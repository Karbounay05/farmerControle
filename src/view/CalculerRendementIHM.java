/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.RendementControl;
import dao.CultureDAO;
import dao.RendementDAO;
import geo.Geographie;

/**
 *
 * @author ikona
 */
public class CalculerRendementIHM extends javax.swing.JFrame {
       private String superficie;
       private String pass;
       private String quantite;
       private String produite;
       private String[] results ;
               

    /**
     * Creates new form CalculerRendementIHM
     */
    public CalculerRendementIHM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Superficier = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        quantity = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        superficieData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        produit = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Calculer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        superficieOutput = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quantiteOutput = new javax.swing.JLabel();
        prix = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/market (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 81));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Le Rendement Financie");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 265, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/map (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 80, 81));

        Superficier.setText("Superficie");
        Superficier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuperficierActionPerformed(evt);
            }
        });
        jPanel1.add(Superficier, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 110, -1));

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMaximum(50);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 430, -1));
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 146, 30));

        jButton2.setText("Saisir la quantité");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 130, -1));

        superficieData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superficieDataActionPerformed(evt);
            }
        });
        jPanel1.add(superficieData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 148, 32));

        jLabel4.setText("Superficie");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setText("quantité en (kg)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        produit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Céréale", "Olive", "Maraichage", "Plantes Aromatiques" }));
        jPanel1.add(produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 146, -1));

        jLabel6.setText("Produite");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 910, 1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(30, 500));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 1, 530));

        jLabel7.setText("Calculer le superficie en zone geographie");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 280, -1));

        Calculer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Calculer.setForeground(new java.awt.Color(51, 51, 255));
        Calculer.setText("Calculer");
        Calculer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculerActionPerformed(evt);
            }
        });
        jPanel1.add(Calculer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 350, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/arrow (1).png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 100, 20));

        jPanel4.setBackground(new java.awt.Color(74, 105, 245));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rendement Financie");

        jLabel9.setText("Rendement par hectare");

        superficieOutput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        superficieOutput.setForeground(new java.awt.Color(255, 255, 255));
        superficieOutput.setText("00.00");

        jLabel10.setText(" Revenu brut par hectare");

        jLabel11.setText("Prix de vente du la culture ");

        quantiteOutput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        quantiteOutput.setForeground(new java.awt.Color(255, 255, 255));
        quantiteOutput.setText("00.00");

        prix.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prix.setForeground(new java.awt.Color(255, 255, 255));
        prix.setText("00.00");

        jLabel12.setText("Coût total de production");

        cout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cout.setForeground(new java.awt.Color(255, 255, 255));
        cout.setText("00.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantiteOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(superficieOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(prix, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(cout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel13)
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(superficieOutput))
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(quantiteOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(prix))
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cout))
                .addGap(119, 119, 119))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 460, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 910, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       // int x =Integer.parseInt(jTextField1.getText());
        int y = jSlider1.getValue();
        String z = Integer.toString(y);
       quantity.setText(z);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SuperficierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuperficierActionPerformed
        // TODO add your handling code here:
        String pass = jLabel8.getText();
        Geographie geo = new Geographie();
        geo.setVisible(true);
        geo.pack();
        geo.setLocationRelativeTo(null);
        geo.setPassgeo(pass);
        this.dispose();
    }//GEN-LAST:event_SuperficierActionPerformed

    private void CalculerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculerActionPerformed
        // TODO add your handling code here:
         pass = jLabel8.getText();
         superficie = superficieData.getText();
         quantite = quantity.getText();
         produite = produit.getSelectedItem().toString();
        
        RendementDAO dao = new RendementDAO();
        
        
        dao.insertData(quantite, superficie, produite, pass);
        
        RendementControl calculator = new RendementControl();
        results = calculator.Calculate(pass);
        jLabel13.setText(produite);
        superficieOutput.setText(results[0]+" DH");
        quantiteOutput.setText(results[1]+" DH");
        prix.setText(results[2]+" DH");
        cout.setText(results[3]+" DH");
        dao.delete(pass);
        
    }//GEN-LAST:event_CalculerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        AccueilIHM accueil = new AccueilIHM();
        accueil.setVisible(true);
        accueil.pack();
        accueil.setLocationRelativeTo(null);

        String passwordReturn = jLabel8.getText();
        CultureDAO dao = new CultureDAO();
        String nom = dao.getNom_data(passwordReturn);
        String prenom = dao.getPrenom_data(passwordReturn);
        String passU = dao.getPassword_data(passwordReturn);
        
        accueil.setNom(nom);
        accueil.setPrenom(prenom);
        accueil.setPass(passU);
 
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void superficieDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superficieDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_superficieDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculerRendementIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculerRendementIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculerRendementIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculerRendementIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculerRendementIHM().setVisible(true);
            }
        });
    }
  public void setSuperficie(String data){
    superficieData.setText(data);
  }
  public void setSuperficieoutput(String data){
     String val1 =data + " DH";
    superficieOutput.setText(val1);
  }
  public void setQuantityoutput(String data){
      String val2 =data + " DH";
    quantiteOutput.setText(val2);
  }
  public void setPrix(String data){
      String val3 =data + " DH";
    prix.setText(val3);
  }
  public void setcout(String data){
     String val4 =data + " DH";
    cout.setText(val4);
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculer;
    private javax.swing.JButton Superficier;
    private javax.swing.JLabel cout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel prix;
    private javax.swing.JComboBox<String> produit;
    private javax.swing.JLabel quantiteOutput;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField superficieData;
    private javax.swing.JLabel superficieOutput;
    // End of variables declaration//GEN-END:variables

    public void setPassCalculate(String password){
      jLabel8.setText(password);
    }
    
    

}
