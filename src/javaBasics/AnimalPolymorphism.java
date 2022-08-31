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
//This explains function overridding
public class AnimalPolymorphism {
    public void animalSound(){
        System.out.println("Animal makes a sound");
    }
}
class Pig extends AnimalPolymorphism{
   public void animalSound(){
        System.out.println("Pig says wee...");
    } 
}
class Dog extends AnimalPolymorphism{
    public void animalSound(){
        System.out.println("Dog barks");
    }
}
class myMainClass{
    public static void main(String [] args){
        AnimalPolymorphism myAnimal = new AnimalPolymorphism();
        AnimalPolymorphism myPig= new Pig();
        AnimalPolymorphism myDog = new Dog();
        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}
