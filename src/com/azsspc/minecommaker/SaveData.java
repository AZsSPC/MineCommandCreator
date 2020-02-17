package com.azsspc.minecommaker;

import static com.azsspc.minecommaker.Main.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveData{
 private HashMap<String, String> BUFER = new HashMap<>();
 private ArrayList<String[]> MENU = new ArrayList<>();

 public SaveData(boolean initF) throws IOException{
  initDataFile(initF);
  String[] s2;
  for(String[] staticDataString:staticDataStrings){
   System.out.printf("\n Read "+staticDataString[0]+":");
   if(!staticDataString[0].equals("menu")){
    for(String s:staticDataString[1].split("\n")){
     s2 = s.split(":");
     System.out.printf("\n   <"+s2[0]+">: [Text:"+s2[1]+"]");
     BUFER.put(staticDataString[0]+":"+s2[0], s2[1]+"");
    }
   }else{
    for(String s:staticDataString[1].split("\n")){
     s2 = s.split(":");
     System.out.printf("\n   <"+s2[0]+">: [Image:"+s2[1]+"], [Text:"+s2[2]+"]");
     MENU.add(s2);
    }
   }
   System.out.println("");
  }
  System.out.println("\n Read finished!");

 }

 public int language(){
  return Integer.parseInt(getData("selected-language")[0]);
 }

 public void setSelectedLang(int num){
  staticDataStrings[0][1]="selected-language:"+num;
  BUFER.replace("data-save:selected-language", num+"");
 }

 public String[] getData(String key){
  try{
   return BUFER.get("save-data:"+key).split(";");
  }catch(Exception ex){
   Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex);
   try{
    Data = new SaveData(true);
   }catch(IOException ex1){
    Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex1);
   }
   return getData(key);
  }
 }

 public String[] getLang(String key){
  return BUFER.get("language:"+ key).split(";");

 }

 public ArrayList<String[]> getMenu(){
  return MENU;
 }

 public void dataSave() throws IOException{
  String toSave = "", fromArr = "";
  String[] saveKey = {"selected-language"};
  for(String sec:saveKey){
   for(String data1:getData(sec)){
    fromArr += data1+";";
   }
   toSave += sec+":"+fromArr.substring(0,fromArr.length()-1)+"\n";
  }
  initDataFile(true);
  Data = new SaveData(false);
 }

 void initDataFile(boolean recreate) throws IOException{
  if(new File(basicWay+"files/"+staticDataStrings[0][0]+".txt").exists()&&!recreate){
   System.out.println(staticDataStrings[0][0]+": exist");
   staticDataStrings[0][1] = Files.lines(Paths.get(basicWay+"files/save-data.txt")).reduce("", (a, b)->a+b+"\n");
  }else{
   System.out.println(staticDataStrings[0][0]+": do not exist");
   new File(basicWay+"files/").mkdirs();
   try(FileWriter writer = new FileWriter(new File(basicWay+"files/"+staticDataStrings[0][0]+".txt"), false)){
    writer.write(staticDataStrings[0][1]);
    writer.flush();
   }catch(IOException ex){
    Logger.getLogger(SaveData.class.getName()).log(Level.SEVERE, null, ex);
   }
  }
 }
}
