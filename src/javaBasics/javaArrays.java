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
public class javaArrays {
    public static void main(String [] args){
       String x[]={"John","Ken","Jack","Joe","Rick"};
       for(int i =0;i<x.length;i++){
           System.out.println(x[i]);
       }
        // Multidimensional arrays
        String heroes[][]={{"Thor","Black Widow","Captain America"},{"Hulk","Hawk","Dr. Strange"}};
        for (int i=0;i<heroes.length;i++){
            for(int j=0;j<heroes[i].length;j++){
                 System.out.println(heroes[i][j]);
            }
        }
        int matrix [][]= new int [10][10];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=(int)Math.random()*1000;
                System.out.println(matrix[i][j]);
            }
        }
    }
    
}
