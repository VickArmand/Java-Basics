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
public class javaSwitch {
    public static void main(String [] args){
        char c ='a';
        switch(c){
            case 'a':
                System.out.println("Today is Monday");
                break;
            case 'b':
                System.out.println("Today is Tuesday");
                break;
            case 'c':
                System.out.println("Today is Wednesday");
                break;
            case 'd':
                System.out.println("Today is Thursday");
                break;
            case 'e':
                System.out.println("Today is Friday");
                break;
            case 'f':
                System.out.println("Today is Saturday");
                break;
            case 'g':
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
