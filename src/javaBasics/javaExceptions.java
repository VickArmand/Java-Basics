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
//The try statement allows you to define a block of code to be tested for errors while it is being executed.
//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
//The finally statement lets you execute code, after try...catch, regardless of the result:
public class javaExceptions {
     static void checkAge(int age) {
    if (age < 18) {
//The throw statement allows you to create a custom error.
//The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
}
    public static void main(String [] args){
       
        try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
//      System.out.println(e.getMessage());
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
         checkAge(15);
    }
}

   
