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
public class ExampleOverloading {
   public static void main (String [] args){
       double length=10.0; 
       double width=20.0;
       double radius=20;
       System.out.printf("Area of circle of radius %f is %f ",radius, area(radius));
       System.out.printf("Area of rectangle of length %f and width %f is %f ",length,width,area(length,width));
   } 
  public static double area(double radius){
      double area=(22 *radius*radius)/7;
      return area;
  }
 
  public static double area(double length,double width ){
      double area=length * width ;
      return area;
  }
}
