/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * we can import the java.util.regex package to work with regular expressions. The package includes the following classes:

Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern
PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
 *
 * @author VICKFURY
 */
//A regular expression is a sequence of characters that forms a search pattern.
public class javaRegEx {
   //The first parameter of the Pattern.compile() method is the pattern. It describes what is being searched for.
    public static void main(String [] args){
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
    
      if(MatchFinder()) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
    }
    public static boolean MatchFinder(){
        Pattern pattern=Pattern.compile("[0-9]");
        Matcher matcher= pattern.matcher("Hey everyone9");
        boolean matchFound=matcher.find();

        return matchFound; 
    }
}
/**
 * Example Explained
In this example, The word "w3schools" is being searched for in a sentence.

First, the pattern is created using the Pattern.compile() method. The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that the search should be case-insensitive. The second parameter is optional.

The matcher() method is used to search for the pattern in a string. It returns a Matcher object which contains information about the search that was performed.

The find() method returns true if the pattern was found in the string and false if it was not found.
 */
