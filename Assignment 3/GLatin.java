//Tara Moses
//Assignment 3, Exercise 3.7
//62nd Try (oh god this was an awful assignment) D:
//
//This program takes input from file pig-latin.txt and displays the text in pig-latin. 
//BONUS: Words display on the same line; the last word (the one with a period in it)
//displays the period (or comma) after the "ay" instead of before the hyphen; consonant 
//clusters for the win!! W00T

import java.io.File;
import java.util.Scanner;

public class GLatin {

   public static void main(String[] args) throws Exception {

	Scanner scan = new Scanner(new File("pig-latin.txt"));  //scanner reads from file instead of system
	
	System.out.println();  //line break
	String vowel = "aeiouAEIOU";
	try {
	   while (scan.hasNext()) {  //while there are still things to read from the file
		String word = scan.next();  //get the first string of letters (stop reading right before a space because that's the default delimiter)
		String first = "a";
		for (int i=0; i<word.length() && word.length()>1; i++) {
		   if (vowel.indexOf(word.substring(0,1))!=(-1) || vowel.indexOf(word.substring(1,2))!=(-1)) {
			first = word.substring(0,1);
		   } else if (vowel.indexOf(word.substring(0,1))==(-1) && vowel.indexOf(word.substring(1,2))==(-1) && vowel.indexOf(word.substring(2,3))!=(-1)) {
			first = word.substring(0,2);
		   } else if (vowel.indexOf(word.substring(0,1))==(-1) && vowel.indexOf(word.substring(1,2))==(-1) && vowel.indexOf(word.substring(2,3))==(-1)) {
			first = word.substring(0,3);
		   }
		}

		if (vowel.indexOf(first)!=(-1)) {  //if the first letter of the word is a vowel
		   System.out.print(word+"-way ");  //display the word (variable first excluded) with "-way" added to the end
		} else if (word.contains(".") && vowel.indexOf(first)==(-1)) {  //if the word contains a period and doesn't start with a vowel
		   System.out.print(word.substring(first.length(),word.length()-1)+"-"+first+"ay. ");  //display the word (variable first excluded) with "-[first]ay[symbol]" added to the end
		} else if (word.contains(".") && vowel.indexOf(first)!=(-1)) {  //if the word contains a period and starts with a vowel
		   System.out.print(word.substring(first.length(),word.length()-1)+"-way. ");  //display the word (variable first excluded) with "-way[symbol]" added to the end
		} else if (word.contains(",") && vowel.indexOf(first)==(-1)) {  //if the word contains a comma and doesn't start with a vowel
		   System.out.print(word.substring(first.length(),word.length()-1)+"-"+first+"ay, ");  //display the word (variable first excluded) with "-[first]ay[symbol]" added to the end
		} else if (word.contains(",") && vowel.indexOf(first)!=(-1)) {  //if the word contains a comma and starts with a vowel
		   System.out.print(word.substring(first.length(),word.length()-1)+"-way, ");  //display the word (variable first excluded) with "-way[symbol]" added to the end
		} else if (vowel.indexOf(first)==(-1)) {  //if the first letter of the word is not a vowel
		  System.out.print(word.substring(first.length())+"-"+first+"ay ");  //display the word (variable first excluded) with "-[first]ay" added to the end
		}  //end of if-else
	   }  //end of while
	}  //end of try
	catch (IllegalArgumentException e) { //do nothing when it catches exception because that exception marks the end of the file
	}  //end of catch
	System.out.println();  //line break
   }  //end of main

}  //end of GLatin