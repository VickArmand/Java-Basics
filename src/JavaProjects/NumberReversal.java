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
public class NumberReversal {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an value");
        int userValue=sc.nextInt();
        System.out.printf("The reverse of %d is %d",userValue, reversal(userValue));

    }
    public static int reversal(int value){
        int finalnum=0;
        while(value%10!=0){
            finalnum=finalnum*10+value%10;
            value=(int)value/10;
            
        }
        return finalnum;
    }
}
