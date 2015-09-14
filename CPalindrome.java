//Tara Moses
//Assignment 4, Exercise 4.3
//28th Try

/*
 *This program reads all of the words in file "dictionary.txt"
 *and prints out all of the palindromes. After all of the words
 *have been read, prints out how many palindromes were found
 *and what percent of the words were palindromes.
 */

import java.io.File;
import java.util.Scanner;

public class CPalindrome {

   /**
    *This subroutine reads all of the words in the file "dictionary.txt"
    *and, using isPalindrome(), decides whether the word is a palindrome
    *or not. If it is, the computer will print it out. If it is not, the 
    *computer does nothing. After all the words have been read, the 
    *computer will display how many palindromes were found, and what per-
    *centage of words were palindromes.
    */

   public static void main(String[] args) throws Exception {

	Scanner scan = new Scanner(new File("dictionary.txt"));

	int countPal = 0;  //counts how many palindromes were found
	double countElse = 0.0;  //counts how many non-palindromes were found

	try {
	   while (scan.hasNext()) {  //while there are still words to read in the file
		String word = scan.next();  //read the next word

		if (isPalindrome(word)) {  //if the word is a palindrome
		   System.out.println(word);  //print out the word
		   countPal++;   //add one to the palindrome counter
		} else {  //if the word is not a palindrome
		   System.out.print("");  //print out a blank string
		   countElse++;  //add one to the non-palindrome counter
		}
	   }  //end of while-loop
	}  //end of try
	catch (IllegalArgumentException e) { }  //catch exception but do nothing because this marks the end of the file we're reading from
	
	double percent = (countPal/(countPal+countElse))*100;  //percent of words that were palindromes
	System.out.print("\nThere were "+countPal+" palindromes in this file. ");
	System.out.printf("%1.2f", percent);  //display percent, but formatted
	System.out.print(" percent of words are palindromes.");

   }  //end of main

   /**
    *Subroutine reverse() takes a string and returns the backwards
    *spelling of it.
    */

   public static String reverse(String word) {

	String backwardsWord = "";  //start with an empty string
	for (int i = word.length()-1; i>=0; i--) {  //"i" is the number letter we're on. Start at the last letter, and while i is not negative, do the following, and subtract 1 from i each time
	   backwardsWord = backwardsWord+word.charAt(i);  //add the next letter
	}
	return backwardsWord;  //return the input word, but spelled backwards

   }  //end of reverse

   /**
    *Subroutine isPalindrome() uses the subroutine reverse()
    *to check whether a word equals its backwards spelling.
    *If it does, return true. If it does not, return false.
    */

   public static boolean isPalindrome(String word) {

	if (word.equalsIgnoreCase(reverse(word))) {  //if the input word equals itself spelled backwards
	   return true;  //return true
	} else {  //if the input word does not equal itself spelled backwards
	   return false;  //return false
	}

   }  //end of isPalindrome

}  //end of CPalindrome