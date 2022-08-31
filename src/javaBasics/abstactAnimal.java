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
abstract public class abstactAnimal {
 public abstract void animalSound();
 public void sleep(){
   System.out.println("ZZZ");   
 }
 
 }
class pig extends abstactAnimal{
    public void animalSound(){
      System.out.println("pig says weee!!!");   
    }
}
class mainClass{
    public static void main(String[] args ){
        pig mypig= new pig();
        mypig.animalSound();
        mypig.sleep();
             
    }
}

