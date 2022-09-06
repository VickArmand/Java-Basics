/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;
import java.util.HashSet;
/**
 *
 * @author VICKFURY
 */
//A HashSet is a collection of items where every item is unique
public class javaHashSets {
    public static void main(String [] args){
        HashSet<String> cars=new HashSet<String>();
        cars.add("Volvo");
          cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    //To check whether an item exists in a HashSet, use the contains() method:

 System.out.printf("The current size of cars is %s",cars.contains("Mazda"));
cars.remove("Volvo");
 System.out.printf("The current size of cars is %s",cars.size());
for (String i : cars) {
  System.out.println(i);
}
cars.clear();
 System.out.printf("The current size of cars is %s",cars.size());
    }
}
