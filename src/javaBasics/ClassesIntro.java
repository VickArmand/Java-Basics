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
public class ClassesIntro {
    public String format;
    public ClassesIntro(){
        System.out.println("This is a constructor and constructors should have a similar name to the class they belong to");
    }
    public String getFormat(){
        return this.format;
    }
    public void setFormat(String format){
        this.format=format;
    }
}
class logger{
    public static void main(String [] args){
        ClassesIntro intro = new ClassesIntro();
        intro.setFormat("Word");
        System.out.println(intro.getFormat());
    }
}