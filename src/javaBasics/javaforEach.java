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
public class javaforEach {
    public static void main(String [] args){
        double[] myList={1.9,2.4,3.5,7.7,8,9};
        for(double element:myList){
        //it menas for each element in myList  
            System.out.println(element);
        }
    }
}
