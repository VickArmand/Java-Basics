/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProjects;

/**
 *
 * @author VICKFURY
 */
import java.util.Scanner;
public class BinarytoDecimal {
    public int iterateBin(int bin)
    {
        int value = bin;
        int counter = 0;
        int result;
        while(value!=0)
        {
            if((value%10!=0) && (value%10!=1))
            {
                result = 0;
                break;
            }
            else
            {
              value = (int)value/10; 
              counter++;
            }
        }
        return counter -1;
    }
    public int reverseBin(int bin)
    {
        int value = bin;
        int result = 1;
        int reversed = 0;
        while(value!=0)
        {
            if((value%10!=0) && (value%10!=1))
            {
                result = 0;
                break;
            }
            else
            {
              reversed = reversed *10 +value % 10;
              value = (int)value/10;
            }
        }
        return reversed;
    }
    public int power(int counter)
    {
        int result = 1;
        for(int i = 0; i<counter; i++)
        {
            result *= 2; 
        }
       return result; 
    }
    public int BintoDec(int bin)
    {
        BinarytoDecimal bd = new BinarytoDecimal();
        int value = reverseBin(bin);
        int counter = bd.iterateBin(bin);
        int result= 0, product;
        while(value!=0)
        {
            if((value%10!=0) && (value%10!=1))
            {
                result = 0;
                break;
            }
              product= (value % 10)*power(counter);
              value = (int)value/10; 
              result += product;
              counter--;
        }

        return result;
    }
    public static void main(String [] args)
    {
        System.out.println("Enter a binary number");
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        BinarytoDecimal bd = new BinarytoDecimal();
        System.out.printf("The decimal value of %d is %d", bin, bd.BintoDec(bin));
    }
}
