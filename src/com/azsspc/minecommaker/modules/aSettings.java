package com.azsspc.minecommaker.modules;

import static com.azsspc.minecommaker.Main.*;
import com.azsspc.minecommaker.Screen;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aSettings extends javax.swing.JPanel{

 public aSettings(){
  initComponents();
  LangLabe.setText(Data.getLang(LangLabe.getName())[Data.language()]+":");
  SaveChanges.setText(Data.getLang(SaveChanges.getName())[Data.language()]);
  for(String s:Data.getLang(ChoosedLang.getName())){
   ChoosedLang.addItem(s);
  }
  ChoosedLang.setSelectedIndex(Data.language());
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  SaveChanges = new javax.swing.JButton();
  LangLabe = new javax.swing.JLabel();
  ChoosedLang = new javax.swing.JComboBox<>();

  SaveChanges.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
  SaveChanges.setText("jButton1");
  SaveChanges.setFocusPainted(false);
  SaveChanges.setName("save-changes"); // NOI18N
  SaveChanges.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    SaveChangesActionPerformed(evt);
   }
  });

  LangLabe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
  LangLabe.setText("Select language:");
  LangLabe.setName("select-lang-labe"); // NOI18N

  ChoosedLang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
  ChoosedLang.setFocusable(false);
  ChoosedLang.setName("select-lang-box"); // NOI18N
  ChoosedLang.setRequestFocusEnabled(false);

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
  this.setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addGap(0, 0, Short.MAX_VALUE)
      .addComponent(SaveChanges))
     .addGroup(layout.createSequentialGroup()
      .addComponent(LangLabe)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(ChoosedLang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(0, 161, Short.MAX_VALUE)))
    .addContainerGap())
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(LangLabe)
     .addComponent(ChoosedLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
    .addComponent(SaveChanges)
    .addContainerGap())
  );
 }// </editor-fold>//GEN-END:initComponents

 private void SaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveChangesActionPerformed
  MyScreen.dispose();
  Data.setSelectedLang(ChoosedLang.getSelectedIndex());
  try{
   Data.dataSave();
  }catch(IOException ex){
   Logger.getLogger(aSettings.class.getName()).log(Level.SEVERE, null, ex);
  }
  MyScreen = new Screen(true);
 }//GEN-LAST:event_SaveChangesActionPerformed


 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JComboBox<String> ChoosedLang;
 private javax.swing.JLabel LangLabe;
 private javax.swing.JButton SaveChanges;
 // End of variables declaration//GEN-END:variables
}
