/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProjects;

/**
 *
 * @author VICKFURY
 */
import java.util.Scanner;
public class Recursion {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int userValue=sc.nextInt();
        System.out.printf("Factorial of %d is %d",userValue, factorial(userValue));
    }
    public static int factorial(int value){
        if(value==0){
            return 1;
        }
        else{
            return (value*factorial(value-1));
        }
    }
}
