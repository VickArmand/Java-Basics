/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;
import javax.swing.JOptionPane;
/**
 *
 * @author VICKFURY
 */
public class javaDialogBoxes {
    public static void main(String [] args){
        String name= JOptionPane.showInputDialog("What's your name");
        String message=String.format("Welcome %s to Java Pogramming", name);
        JOptionPane.showMessageDialog(null, message);
    }
}
