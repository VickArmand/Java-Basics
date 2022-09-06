/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author VICKFURY
 */
//Arraylist are commonly used in Java since they are not of fixed size on creation as compared to Arrays
public class javaArrayLists {
    public static void main(String [] args){
    ArrayList<String> cars =new ArrayList<String>();//Creating an Arraylist object
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    System.out.println(cars);
//    Access items in an arrayList
 System.out.printf("The curent element in index 0 in cars is %s",cars.get(0));
//Changing items in an arraylist use the set()
cars.set(0,"Mercedes");
 System.out.printf("The new element in index 0 in cars is %s",cars.get(0));
//Remove items in an arraylist use the remove()
cars.remove(2);

//To find out how many elements an ArrayList have, use the size method:
cars.size();
 System.out.printf("The current size of cars is %s",cars.size());

//Sort an arraylist using the sort() in in the java.util package in the Collections class
Collections.sort(cars);
//Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
 for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
// You can also loop through an ArrayList with the for-each loop:
for (String i : cars) {
      System.out.println(i);
    }

//to remove all elements in an arraylist use the clear()
cars.clear();
 System.out.printf("The current size of cars is %s",cars.size());
    }
}
