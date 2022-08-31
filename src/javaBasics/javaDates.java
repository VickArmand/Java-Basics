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
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class javaDates {
    public static void main(String [] args){
        LocalDate myDate=LocalDate.now();
        System.out.println(myDate);
        LocalDateTime myDateTime=LocalDateTime.now();
        DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate=myDateTime.format(myFormat);
        System.out.println(formattedDate);
        Date date=new Date();
        System.out.println(date);
        
    }
}
