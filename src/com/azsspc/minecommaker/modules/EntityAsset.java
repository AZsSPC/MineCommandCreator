package com.azsspc.minecommaker.modules;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EntityAsset extends javax.swing.JPanel{
 Icon ic;

 public EntityAsset(String data, boolean torf){
  initComponents();
  if(!torf){
   ic = (Icon) new ImageIcon(getClass().getResource("/resources/mobs/null.png"));
  }else{

  }
 }

 public Icon getIcon(){
  return ic;
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
  this.setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 400, Short.MAX_VALUE)
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 300, Short.MAX_VALUE)
  );
 }// </editor-fold>//GEN-END:initComponents


 // Variables declaration - do not modify//GEN-BEGIN:variables
 // End of variables declaration//GEN-END:variables
}
