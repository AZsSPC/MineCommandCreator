package com.azsspc.minecommaker;

import com.azsspc.minecommaker.modules.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import com.azsspc.minecommaker.*;
import static com.azsspc.minecommaker.Main.*;

public class Screen extends javax.swing.JFrame{

 public Screen(){
  initComponents();
  initAll();
  setIconImage(new ImageIcon(getClass().getResource("/resources/images/icon.png")).getImage());

  pMenu.setLayout(new MyLayout(3));
  for(String[] menuList1:menuList){
   pMenu.add(new MenuTile(menuList1[2].split(";")[selectedLang], menuList1[1], menuList1[0]));
  }

 }

 void initAll(){
  try{
   String buf[] = Files.lines(Paths.get(new File(getClass().getResource("/resources/files/menu.txt").getFile()).getPath())).reduce("", (a, b)->a+b+"\n").split("\n");
   menuList = new String[buf.length][3];
   for(int i = 0; i<menuList.length; i++){
    menuList[i] = buf[i].split(":");
   }
  }catch(Exception ex){
   System.out.println(ex);
  }
 }

 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  pMain = new javax.swing.JPanel();
  sMenu = new javax.swing.JScrollPane();
  pMenu = new javax.swing.JPanel();
  sArea = new javax.swing.JScrollPane();
  pArea = new javax.swing.JPanel();
  jButton1 = new javax.swing.JButton();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  setTitle("Command Maker");

  pMain.setBackground(new java.awt.Color(204, 204, 204));
  pMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

  sMenu.setBackground(new java.awt.Color(0, 0, 0));
  sMenu.setBorder(null);
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
   .addGap(0, 322, Short.MAX_VALUE)
  );

  sMenu.setViewportView(pMenu);

  sArea.setBorder(null);
  sArea.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
  sArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

  pArea.setPreferredSize(new java.awt.Dimension(350, 300));

  jButton1.setText("jButton1");

  javax.swing.GroupLayout pAreaLayout = new javax.swing.GroupLayout(pArea);
  pArea.setLayout(pAreaLayout);
  pAreaLayout.setHorizontalGroup(
   pAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAreaLayout.createSequentialGroup()
    .addContainerGap(267, Short.MAX_VALUE)
    .addComponent(jButton1)
    .addContainerGap())
  );
  pAreaLayout.setVerticalGroup(
   pAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(pAreaLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(jButton1)
    .addContainerGap(288, Short.MAX_VALUE))
  );

  sArea.setViewportView(pArea);

  javax.swing.GroupLayout pMainLayout = new javax.swing.GroupLayout(pMain);
  pMain.setLayout(pMainLayout);
  pMainLayout.setHorizontalGroup(
   pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(pMainLayout.createSequentialGroup()
    .addContainerGap()
    .addComponent(sMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addComponent(sArea)
    .addContainerGap())
  );
  pMainLayout.setVerticalGroup(
   pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
    .addContainerGap()
    .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
     .addComponent(sArea, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
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
 private javax.swing.JButton jButton1;
 public javax.swing.JPanel pArea;
 public javax.swing.JPanel pMain;
 public javax.swing.JPanel pMenu;
 public javax.swing.JScrollPane sArea;
 public javax.swing.JScrollPane sMenu;
 // End of variables declaration//GEN-END:variables
}
