package javaProjects;
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
public class GuessingGame {
    public static void main(String args []){
        
        while(true){
            int answer=(int)Math.random();
            System.out.println("Guess a number");
            Scanner sc= new Scanner(System.in);
            int userguess=sc.nextInt();
           if(userguess==answer){
            System.out.println("Correct guess ");
            break;
             }
        else{
           System.out.printf("Wrong guess try again. The answer is %d ",answer); 
        }  
        }

       
        
        
    }
}
