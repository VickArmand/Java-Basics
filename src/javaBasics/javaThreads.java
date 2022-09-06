/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;

/**
 *There are two ways to create a thread.

It can be created by extending the Thread class and overriding its run() method:
* Another way to create a thread is to implement the Runnable interface:
 * @author VICKFURY
 */
public class javaThreads extends Thread {
    public void run() {
    System.out.println("This code is running in a thread");
  }
}
