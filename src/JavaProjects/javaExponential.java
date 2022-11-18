/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProjects;
import java.util.Scanner;
/**
 *
 * @author VICKFURY
 */
public class javaExponential {
    public static void main(String [] args){
       System.out.println("Enter a number and its exponent");
       Scanner sc = new Scanner(System.in);
       int base=sc.nextInt();
       int exp=sc.nextInt();
       int result=1;
       while(exp!=0){
           result*=base;
           --exp;
       }
       System.out.println(result);
       
       
    }
}
