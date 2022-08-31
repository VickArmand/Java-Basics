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
//Interface is an abstract class used to group related methods with empty bodies
public interface NewInterface {
    public void communicate();
}
interface NewInterface2 {
    public void move();
}
class Human implements NewInterface,NewInterface2{
    public void communicate(){
        System.out.println("Humans talk");
    }
    public void move(){
        System.out.println("Humans walk");
    }
}
class Bird implements NewInterface,NewInterface2{
    public void communicate(){
        System.out.println("Birds chirp");
    }
    public void move(){
        System.out.println("Birds fly");
    }
}
class MainClass{
    public static void main(String [] args){
        Human myHuman= new Human();
        myHuman.communicate();
        myHuman.move();
        Bird myBird= new Bird();
        myBird.communicate();
        myBird.move();
        
    }
}
