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
import java.util.*;
public class ExtractValues {
    public static void main (String [] args){
        System.out.println("Enter the number of values");
        Scanner sc=new Scanner(System.in);
        int numdigits=sc.nextInt();
        System.out.println("Enter the value");
        int num=sc.nextInt();
        int rem;
        int iter=0;
        int arr[]=new int[numdigits];
        while(num!=0){
            rem=num%10;
            arr[iter]=rem;
            if(rem==0&&num==0){
                break;
            }
            num/=10;
            iter++;
        }
        for(int i=arr.length-1;i>=0;i--){
         System.out.println(arr[i]);
        }
    }
}
