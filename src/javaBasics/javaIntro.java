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
import java.util.Scanner;
public class javaIntro {

    /**
     * @param args the command line arguments
     */
    public int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int value1=sc.nextInt();
        int value2=sc.nextInt();
        javaIntro jv= new javaIntro();
        System.out.println(jv.add(value1,value2));
    }
    
}
