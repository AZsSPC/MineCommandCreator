package com.azsspc.minecommaker;

import com.azsspc.minecommaker.modules.*;
import java.io.IOException;
import javax.swing.JPanel;

public class Main{
 public static SaveData Data;
 public static Screen MyScreen;
 public static String basicWay = "C:/Users/"+System.getenv("username")+"/Documents/AZsSPC/MCM/";
 public static String[][] staticDataStrings = {
  {"save-data",
   "selected-language:0"},
  //
  {"language",
   "select-lang-labe:Select language;Выберите язык;Оберiть мову\n"
   +"save-changes:Save changes;Сохранить изменения;Зберегти змiни\n"
   +"select-lang-box:English;Русский;Українська"},
  //
  {"menu",
   "settings:engine.png:Program settings;Настройки приложения;Програмнi налаштування\n"
   +"summon:egg-creeper.png:Create mobs;Генератор мобов;Створення створiннь"}};

 public static void main(String[] args) throws IOException{
  Data = new SaveData(false);
  MyScreen = new Screen(false);
 }

 public static JPanel getUI(String id){
  switch(id){
   case "summon": return new aSummon();
   case "settings": return new aSettings();

   default: System.out.println("\""+id+"\" not found. return the Meet-title");
    return new aMeet();
  }
 }


}
