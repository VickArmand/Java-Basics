/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;
import java.util.LinkedList;
/**
 *
 * @author VICKFURY
 */
//ArrayList vs. LinkedList
//The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
//
//The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. This means that you can add items, change items, remove items and clear the list in the same way.
//
//However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.
//
//How the ArrayList works
//The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
//
//How the LinkedList works
//The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
//
//When To Use
//Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
public class javaLinkedLists {
   public static void main(String [] args){
       LinkedList<String> cars= new LinkedList<String>();
       cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars.size());
    System.out.println(cars);  
    System.out.println(cars.getFirst());
    System.out.println(cars.getLast());
    cars.addFirst("Mercedes");
    cars.addLast("Subaru");
        System.out.println(cars); 
    System.out.println(cars.removeFirst());
    System.out.println(cars.removeLast());
        System.out.println(cars); 
    
   } 
}
