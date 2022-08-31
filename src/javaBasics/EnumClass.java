package javaBasics;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VICKFURY
 */
//Enum is a special class that represents a group of constants(unchangable variables/final variables)

public class EnumClass {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
}
  public static void main(String [] args){
      Level myVar=Level.HIGH;
      System.out.println(myVar);
        //Loop through an enum   
      for(Level myElement:Level.values()){
          System.out.println(myElement);
      }
  }
}
