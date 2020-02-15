package com.azsspc.minecommaker.modules;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

public class MyLayout implements LayoutManager{
 private int space;
 private final Dimension size = new Dimension();

 public MyLayout(int s){
  this.space = s;
 }

 @Override
 public void addLayoutComponent(String name, Component comp){
 }

 @Override
 public void removeLayoutComponent(Component comp){
 }

 @Override
 public Dimension minimumLayoutSize(Container c){
  return calculateBestSize(c);
 }

 @Override
 public Dimension preferredLayoutSize(Container c){
  return calculateBestSize(c);
 }

 @Override
 public void layoutContainer(Container container){
  Component list[] = container.getComponents();
  int currentY = space;
  for(Component list1:list){
   Dimension pref = list1.getPreferredSize();
   list1.setBounds(space, currentY, pref.width, pref.height);
   currentY += space;
   currentY += pref.height;
  }
 }

 private Dimension calculateBestSize(Container c){
  Component[] list = c.getComponents();
  int maxWidth = 0;
  for(Component list1:list){
   int width = list1.getWidth();
   if(width>maxWidth)maxWidth = width;
  }
  size.width = maxWidth+5;
  int height = 0;
  for(Component list1:list){
   height += 5;
   height += list1.getHeight();
  }
  size.height = height;
  return size;
 }
}
