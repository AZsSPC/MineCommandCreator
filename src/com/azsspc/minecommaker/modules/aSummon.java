package com.azsspc.minecommaker.modules;

public class aSummon extends javax.swing.JPanel{

 public aSummon(){
  initComponents();
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  TypeLabe = new javax.swing.JLabel();
  TypeBox = new javax.swing.JComboBox<>();
  OutLabe = new javax.swing.JLabel();
  GenerateCommand = new javax.swing.JButton();
  EntityTab = new javax.swing.JTabbedPane();
  AddEntity = new javax.swing.JButton();

  TypeLabe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
  TypeLabe.setText("Select language:");
  TypeLabe.setName("select-lang-labe"); // NOI18N

  TypeBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
  TypeBox.setFocusable(false);
  TypeBox.setName("select-lang-box"); // NOI18N
  TypeBox.setRequestFocusEnabled(false);

  OutLabe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
  OutLabe.setText("Select language:");
  OutLabe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
  OutLabe.setName("select-lang-labe"); // NOI18N

  GenerateCommand.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
  GenerateCommand.setText("GO");
  GenerateCommand.setFocusPainted(false);
  GenerateCommand.setName("save-changes"); // NOI18N
  GenerateCommand.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    GenerateCommandActionPerformed(evt);
   }
  });

  AddEntity.setBackground(new java.awt.Color(0, 204, 0));
  AddEntity.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
  AddEntity.setForeground(new java.awt.Color(255, 255, 255));
  AddEntity.setText("+");
  AddEntity.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
  AddEntity.setFocusPainted(false);
  AddEntity.setPreferredSize(new java.awt.Dimension(25, 25));
  AddEntity.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    AddEntityActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
  this.setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
     .addComponent(EntityTab)
     .addComponent(OutLabe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
       .addComponent(GenerateCommand, javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
        .addComponent(TypeLabe)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
      .addGap(0, 161, Short.MAX_VALUE))
     .addGroup(layout.createSequentialGroup()
      .addGap(0, 0, Short.MAX_VALUE)
      .addComponent(AddEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
    .addContainerGap())
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addContainerGap()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
      .addComponent(TypeLabe)
      .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addComponent(AddEntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(EntityTab, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(GenerateCommand)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(OutLabe)
    .addContainerGap())
  );
 }// </editor-fold>//GEN-END:initComponents

 private void GenerateCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateCommandActionPerformed

 }//GEN-LAST:event_GenerateCommandActionPerformed

 private void AddEntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEntityActionPerformed
  EntityAsset entity = new EntityAsset(null, false);
  EntityTab.add(entity, entity.getIcon());
 }//GEN-LAST:event_AddEntityActionPerformed


 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton AddEntity;
 private javax.swing.JTabbedPane EntityTab;
 private javax.swing.JButton GenerateCommand;
 private javax.swing.JLabel OutLabe;
 private javax.swing.JComboBox<String> TypeBox;
 private javax.swing.JLabel TypeLabe;
 // End of variables declaration//GEN-END:variables
}
