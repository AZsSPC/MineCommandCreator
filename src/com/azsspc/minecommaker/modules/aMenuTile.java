package com.azsspc.minecommaker.modules;

import com.azsspc.minecommaker.Main;
import static com.azsspc.minecommaker.Main.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class aMenuTile extends javax.swing.JPanel{
 String title;
 Icon ic;
 String key;

 public aMenuTile(String text, String iconText, String theKey){
  initComponents();
  key = theKey.replaceAll("\n", "");
  title = text.replaceAll("\n", "");
  try{
   ic = (Icon) new ImageIcon(getClass().getResource("/resources/images/"+iconText.replaceAll("\n", "")));
   if(ic.getIconHeight()==ic.getIconWidth()&&ic.getIconHeight()==64){
    DataLabel.setIcon(ic);
    DataLabel.setText(title);
   }else{
    System.out.println("Image \""+iconText+"\" have unregister size");
    DataLabel.setText("  "+title);
   }
  }catch(Exception ex){
   System.out.println("Image \""+iconText+"\" not found");
   DataLabel.setText("  "+title);
  }
 }

 // <editor-fold defaultstate="collapsed" desc="Auto-generated">    
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  DataLabel = new javax.swing.JLabel();

  setBackground(new java.awt.Color(102, 102, 102));
  setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(150, 150, 150)));
  setForeground(new java.awt.Color(102, 102, 102));
  setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
  setMaximumSize(new java.awt.Dimension(500, 68));
  setMinimumSize(new java.awt.Dimension(350, 64));
  setPreferredSize(new java.awt.Dimension(350, 64));
  addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    onMouseClicked(evt);
   }
   public void mouseEntered(java.awt.event.MouseEvent evt) {
    onMouseEntered(evt);
   }
   public void mouseExited(java.awt.event.MouseEvent evt) {
    onMouseExited(evt);
   }
  });

  DataLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
  DataLabel.setForeground(new java.awt.Color(255, 255, 255));

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
  this.setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(DataLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(DataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
  );
 }// </editor-fold>//GEN-END:initComponents

 private void onMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseClicked
  MyScreen.sArea.setViewportView(Main.getUI(key));
  MyScreen.pMain.updateUI();
 }//GEN-LAST:event_onMouseClicked

 private void onMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseEntered
  setBackground(new Color(150, 150, 150));
  setBorder(new MatteBorder(0, 6, 0, 0, new Color(200, 200, 200)));
 }//GEN-LAST:event_onMouseEntered

 private void onMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMouseExited
  setBackground(new Color(102, 102, 102));
  setBorder(new MatteBorder(0, 3, 0, 0, new Color(150, 150, 150)));
 }//GEN-LAST:event_onMouseExited
// </editor-fold>   


 // Variables declaration - do not modify//GEN-BEGIN:variables
 public javax.swing.JLabel DataLabel;
 // End of variables declaration//GEN-END:variables
}
