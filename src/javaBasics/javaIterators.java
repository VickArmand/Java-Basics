/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;
import java.util.Iterator;
import java.util.ArrayList;
/**
 *
 * @author VICKFURY
 */
//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
//To use an Iterator, you must import it from the java.util package.
public class javaIterators {
    public static void main (String[] args){
        ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
    
    //To loop through a collection, use the hasNext() and next() methods of the Iterator:
    while(it.hasNext()) {
  System.out.println(it.next());
}
    
    //Use an iterator to remove numbers less than 10 from a collection:
   intIterators i= new intIterators();
    i.iteratorsInt();
    }
}
class intIterators{
   public void iteratorsInt(){
      ArrayList<Integer> numbers=new ArrayList<Integer>();
      numbers.add(12);
      numbers.add(8);
      numbers.add(2);
      numbers.add(23);
      Iterator<Integer> it=numbers.iterator();
      while(it.hasNext()){
          Integer i= it.next();
          if(i<10){
              //The remove() method can remove items from a collection while looping.
              it.remove();
          }
      }
      System.out.println(numbers);
   }
}
