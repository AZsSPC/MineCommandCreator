package com.azsspc.minecommaker;

import com.azsspc.minecommaker.modules.*;
import javax.swing.ImageIcon;
import static com.azsspc.minecommaker.Main.*;

public class Screen extends javax.swing.JFrame{

 public Screen(boolean refresh){
  initComponents();
  setExtendedState(MAXIMIZED_BOTH);
  setIconImage(new ImageIcon(getClass().getResource("/resources/images/icon.png")).getImage());

  pMenu.setLayout(new MyLayout(3));
  sArea.setViewportView(new aMeet());
  initAll();
  if(refresh){
   sArea.setViewportView(Main.getUI("settings"));
   pMain.updateUI();
  }
  setVisible(true);
 }

 void initAll(){
  for(String[] mL:Data.getMenu()){
   pMenu.add(new aMenuTile(mL[2].split(";")[Data.language()], mL[1], mL[0]));
  }
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  pMain = new javax.swing.JPanel();
  sMenu = new javax.swing.JScrollPane();
  pMenu = new javax.swing.JPanel();
  sArea = new javax.swing.JScrollPane();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  setTitle("Command Maker");
  setMinimumSize(new java.awt.Dimension(1000, 600));
  setName("Screen"); // NOI18N
  setSize(new java.awt.Dimension(1000, 600));

  pMain.setBackground(new java.awt.Color(204, 204, 204));
  pMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
  pMain.setMinimumSize(new java.awt.Dimension(1000, 600));

  sMenu.setBackground(new java.awt.Color(0, 0, 0));
  sMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
  sMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
  sMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
  sMenu.setMaximumSize(new java.awt.Dimension(250, 32767));
  sMenu.setMinimumSize(new java.awt.Dimension(100, 23));
  sMenu.setPreferredSize(new java.awt.Dimension(250, 100));

  pMenu.setBackground(new java.awt.Color(102, 102, 102));
  pMenu.setForeground(new java.awt.Color(255, 255, 255));
  pMenu.setPreferredSize(new java.awt.Dimension(350, 200));

  javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
  pMenu.setLayout(pMenuLayout);
  pMenuLayout.setHorizontalGroup(
   pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 350, Short.MAX_VALUE)
  );
  pMenuLayout.setVerticalGroup(
   pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGap(0, 576, Short.MAX_VALUE)
  );

  sMenu.setViewportView(pMenu);

  sArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
  sArea.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
  sArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

  javax.swing.GroupLayout pMainLayout = new javax.swing.GroupLayout(pMain);
  pMain.setLayout(pMainLayout);
  pMainLayout.setHorizontalGroup(
   pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(pMainLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(sMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(sArea, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
    .addContainerGap())
  );
  pMainLayout.setVerticalGroup(
   pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
    .addContainerGap()
    .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
     .addComponent(sArea, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
     .addComponent(sMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addContainerGap())
  );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
  );

  pack();
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents


 // Variables declaration - do not modify//GEN-BEGIN:variables
 public javax.swing.JPanel pMain;
 public javax.swing.JPanel pMenu;
 public javax.swing.JScrollPane sArea;
 public javax.swing.JScrollPane sMenu;
 // End of variables declaration//GEN-END:variables
}
