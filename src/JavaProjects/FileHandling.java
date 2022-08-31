/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProjects;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author VICKFURY
 */
public class FileHandling {
    public static void main(String [] args){
        String filename="filename.txt";
        System.out.println(CreateFile(filename));
        WriteFile(filename,"Hello this is file handling in Java programming");
        System.out.println(ReadFile(filename));
        DeleteFile(filename);
//        if (DeleteFile("C:\\Users\\VICKFURY\\Documents\\NetBeansProjects\\Introduction to Java\\"+filename)){
//            System.out.println("File deleted");
//        }
//        else{
//           System.out.println("Error"); 
//        }
    }
    public static String ReadFile(String filename){
        String message="";
        try{
         File myFile= new File(filename);
         Scanner myReader= new Scanner(myFile);
         while(myReader.hasNextLine()){
             String data =myReader.nextLine();
            message+= data;
         }
        }catch(FileNotFoundException e){
            message+= e.getMessage();
        }
        return message;
    }
    public static void DeleteFile(String filename){
        try{
           File myFile= new File(filename);
            if(myFile.delete()){
//                return true;
                System.out.println("File deleted");
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
//        else{
//           return false; 
//        }
    }
    public static boolean DeleteFolder(String foldername){
        File myFile= new File(foldername);
        if(myFile.delete()){
            return true;
        }
        else{
           return false; 
        }
    }
    public static String CreateFile(String filename){
        try{
          File myFile= new File(filename);
          if(myFile.createNewFile()){
            return "File created";
          } 
          else{
            return "File exists";  
          }
        }catch(IOException e){
            return e.getMessage();
        }
        
    }
    public static void WriteFile(String filename,String content){
        try{
          FileWriter myFile= new FileWriter(filename);
          myFile.write(content);
          myFile.close();
          System.out.println("Successfully wrote to file");
        }catch(IOException e){
             System.out.println(e.getMessage());
        }
    }
}
