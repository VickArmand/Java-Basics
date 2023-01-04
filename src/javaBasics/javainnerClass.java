/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;

/**
 *
 * @author VICKFURY
 */
//involves nested classes 
//To access the inner class, create an object of the outer class and then create an objectof the inner class
//For static inner classes you can access them without creating an object of the outer class
public class javainnerClass {
    int x=5;
  class innerClass{
      int y=10;
  } 
  static class innerClass2{
    int z=20;
    }
}
 class Main{
    public static void main(String [] args){
        javainnerClass outer= new javainnerClass();
        javainnerClass.innerClass inner= outer.new innerClass();
//        Accessing static inner classes
        javainnerClass.innerClass2 inner2= new javainnerClass.innerClass2();
        System.out.printf("Outer class value x is %d",outer.x);
        System.out.printf("Inner class value y is %d",inner.y);
        System.out.printf("Inner class value z is %d",inner2.z);
    }
}
