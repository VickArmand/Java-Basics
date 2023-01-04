/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProjects;
import java.util.Scanner;
/**
 *
 * @author VICKFURY
 */
public class DecimaltoBinary {
    public int DectoBin(int decimalValue)
    {
        int binValue = 0, counter = 0,i,reversed = 0;
        while(decimalValue!=0)
        {
            binValue=(binValue*10)+(decimalValue%2);
            decimalValue=decimalValue/2;
            counter++;
        }
        for(i = 0;i < counter;i++)
        {
            reversed = reversed * 10 + (binValue % 10);
            binValue = (int)binValue/10;
        }
        return reversed;
    }
    public static void main(String [] args)
    {
        System.out.println("Enter a decimal number");
        Scanner sc = new Scanner(System.in);
        int decimalValue = sc.nextInt();
        DecimaltoBinary db = new DecimaltoBinary();
        System.out.println(db.DectoBin(decimalValue));
    }
}
