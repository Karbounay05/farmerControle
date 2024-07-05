
package geo;

import java.util.ArrayList;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.WaypointPainter;
import org.jxmapviewer.viewer.Waypoint;
import view.CalculerRendementIHM;

public class Geographie extends javax.swing.JFrame {
	     private int counter = 12;
             private ArrayList<Point> points = new ArrayList<>();
             private ArrayList<Point[]> lines = new ArrayList<>();
             private boolean drawingSquare = false;
             private boolean drawingActive = false;
             private WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
             private BufferedImage locationImage;
	    
             public Geographie() {
	        initComponents();
	        init();

	        MouseInputListener mm = new PanMouseInputListener(jXMapViewer1);
	        jXMapViewer1.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer1));

	        jXMapViewer1.addMouseListener(new MouseInputAdapter() {
	            @Override
	            public void mousePressed(MouseEvent e) {
	                if (drawingActive) {
	                    Point clickPoint = SwingUtilities.convertPoint(e.getComponent(), e.getPoint(), jXMapViewer1);
	                    points.add(clickPoint);
	                    if (points.size() % 2 == 0) {
	                        // Create a line using the last two points
	                        Point[] line = {points.get(points.size() - 2), points.get(points.size() - 1)};
	                        lines.add(line);
	                    }

	                    // If there are 4 points, set drawingSquare to true
	                    if (points.size() == 4) {
	                        drawingSquare = true;
	                    }

	                    repaint(); // Repaint the JFrame to show the changes
	                } else {
	                    mm.mousePressed(e);
	                }
	            }

	          public void mouseReleased(MouseEvent e) {
                if (!drawingActive) {
                    mm.mouseReleased(e);
                } else {
                    // Check if four points have been drawn
                    if (points.size() == 4) {
                        double area = calculateArea();
                      //  System.out.println("Votre Surface en mètres carrés : " + area);
                        String formattedArea = String.format("%.2f", area);
                        jLabel1.setText(String.format("%.2f", area));
                        String msg = "Votre Surface en mètres carrés : " + formattedArea;
                        System.out.println("Votre Surface en mètres carrés : " + formattedArea);
                        jLabel2.setText("m²");
                        JOptionPane.showMessageDialog(null, msg);
                    }
                }
            }
        });


	        jXMapViewer1.addMouseMotionListener(new MouseInputAdapter() {
	            @Override
	            public void mouseDragged(MouseEvent e) {
	                if (!drawingActive) {
	                    mm.mouseDragged(e);
	                }
	            }
	        });

	        try {
	            URL imageURL = getClass().getResource("location.png");
	            if (imageURL != null) {
	                locationImage = ImageIO.read(imageURL);
	            } else {
	                System.err.println("Image not found: location.png");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private void init() {
	        TileFactoryInfo info = new OSMTileFactoryInfo();
	        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
	        jXMapViewer1.setTileFactory(tileFactory);
	        GeoPosition geo = new GeoPosition(34.3077788, -6.5770771);
	        jXMapViewer1.setAddressLocation(geo);
	        jXMapViewer1.setZoom(counter);
	        jXMapViewer1.setOverlayPainter(waypointPainter);

	    }
     private double calculateArea() {
        if (points.size() != 4) {
            return 0;
        }
        
        GeoPosition[] geoPositions = new GeoPosition[4];
        for (int i = 0; i < 4; i++) {
            geoPositions[i] = jXMapViewer1.convertPointToGeoPosition(points.get(i));
        }

        // Approximate area calculation using shoelace formula
        double[] lat = new double[4];
        double[] lon = new double[4];
        for (int i = 0; i < 4; i++) {
            lat[i] = geoPositions[i].getLatitude();
            lon[i] = geoPositions[i].getLongitude();
        }

        double area = 0.0;
        int j = 3; // Previous vertex to last vertex
        for (int i = 0; i < 4; i++) {
            area += (lon[j] + lon[i]) * (lat[j] - lat[i]);
            j = i; // Current vertex becomes previous
        }
        area = Math.abs(area) / 2.0;

        // Convert to square meters (this is an approximation)
        final double RADIUS_EARTH = 6378137; // Radius of Earth in meters
        area = area * Math.pow((Math.PI / 180.0 * RADIUS_EARTH), 2);
        
        return area;
    }
  
     
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jXMapViewer1 = new org.jxmapviewer.JXMapViewer();
        comboxMapType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToggleDrawing = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saisir = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboxMapType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open Stree", "Virtual Earth", "Hybird", "Satellite" }));
        comboxMapType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxMapTypeActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Effacer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToggleDrawing.setText("Sélectionner");
        jToggleDrawing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingActive = jToggleDrawing.isSelected();
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("m²");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        saisir.setText("Saisir");
        saisir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saisirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXMapViewer1Layout = new javax.swing.GroupLayout(jXMapViewer1);
        jXMapViewer1.setLayout(jXMapViewer1Layout);
        jXMapViewer1Layout.setHorizontalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewer1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jXMapViewer1Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2))
                        .addComponent(jToggleDrawing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 641, Short.MAX_VALUE)
                .addGroup(jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXMapViewer1Layout.createSequentialGroup()
                        .addComponent(comboxMapType, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXMapViewer1Layout.createSequentialGroup()
                        .addGroup(jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(saisir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jXMapViewer1Layout.setVerticalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXMapViewer1Layout.createSequentialGroup()
                        .addGroup(jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboxMapType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXMapViewer1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleDrawing, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saisir))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXMapViewer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXMapViewer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboxMapTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxMapTypeActionPerformed
        // TODO add your handling code here:
        TileFactoryInfo info;
        int index = comboxMapType.getSelectedIndex();
        if (index==0){
            info = new OSMTileFactoryInfo();
        }else if(index==1){
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
        }else if(index==2){
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
        }else{
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
        }
         DefaultTileFactory tileFactory = new DefaultTileFactory(info);
         jXMapViewer1.setTileFactory(tileFactory);
    }//GEN-LAST:event_comboxMapTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      counter++;
        jXMapViewer1.setZoom(counter);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       counter--;
       jXMapViewer1.setZoom(counter);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        points.clear();
        lines.clear();
        drawingSquare = false;
        repaint();
        jLabel1.setText("");
        jLabel2.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleDrawingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleDrawingActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jToggleDrawingActionPerformed

    private void saisirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saisirActionPerformed
        // TODO add your handling code here:
        String pass = jLabel3.getText();
        String s = jLabel1.getText();
        CalculerRendementIHM obj = new CalculerRendementIHM();
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        obj.setSuperficie(s);
       
        obj.setPassCalculate(pass);
        this.dispose();
    }//GEN-LAST:event_saisirActionPerformed

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
            java.util.logging.Logger.getLogger(Geographie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Geographie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Geographie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Geographie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Geographie().setVisible(true);
            }
        });
    }
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboxMapType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleDrawing;
    private org.jxmapviewer.JXMapViewer jXMapViewer1;
    private javax.swing.JButton saisir;
    // End of variables declaration//GEN-END:variables
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set the stroke width to 3px
        g2d.setStroke(new BasicStroke(3));

        // Translate the graphics context to the `JXMapViewer`'s coordinate system
        Point mapViewerLocation = jXMapViewer1.getLocationOnScreen();
        Point frameLocation = this.getLocationOnScreen();
        int offsetX = mapViewerLocation.x - frameLocation.x;
        int offsetY = mapViewerLocation.y - frameLocation.y;

        g2d.translate(offsetX, offsetY);

        // Draw the image at the click position if drawingActive is true
        if (drawingActive && locationImage != null) {
            for (Point point : points) {
                g.drawImage(locationImage, point.x - locationImage.getWidth() / 2, point.y - locationImage.getHeight() / 2, null);
            }
        }

        // Draw all completed lines
        g.setColor(Color.BLUE);
        for (Point[] line : lines) {
            g.drawLine(line[0].x, line[0].y, line[1].x, line[1].y);
        }

        // If drawingSquare is true, draw a square
        if (drawingSquare) {
            g.setColor(Color.RED);
            g.drawLine(points.get(0).x, points.get(0).y, points.get(1).x, points.get(1).y);
            g.drawLine(points.get(1).x, points.get(1).y, points.get(2).x, points.get(2).y);
            g.drawLine(points.get(2).x, points.get(2).y, points.get(3).x, points.get(3).y);
            g.drawLine(points.get(3).x, points.get(3).y, points.get(0).x, points.get(0).y);
        }
    }
    public void setPassgeo(String pass){
    jLabel3.setText(pass);
  }
}
