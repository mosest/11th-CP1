//Tara Moses
//Assignment 6, Exercise 6.3
//38th Try

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 *This program reads a file (specified by the user) and counts how many
 *times each word appears.
 */

public class CCountWords {

   /**
    *This method gets all the words and adds them to the corresponding
    *array.
    */

   public static void main(String[] args) throws Exception {

	Scanner fromUser = new Scanner(System.in);

	String[] newWords = new String[0];  //holds all the words in the file that have occurred at all
	String[] newWordsRevised = new String[0];  //holds all the new words in the file (after they've been converted to lower case and most of the punctuation has been removed)
	int[] timesWordAppears = new int[0];  //holds the count for every new word

	String word = "";  //a word in the file
	String wordRevised = "";  //a word in the file (with no caps or punctuation)

	int wordCount = 0;  //counts how many words have been read

	System.out.print("\nWhat file would you like to read from? ");
	String fileName = fromUser.next();  //user inputs a file name

	try {

	   Scanner scan = new Scanner(new File(fileName));  //scanner tries to read from file that user specified

	   System.out.println();

	   while (scan.hasNext()) {

		word = scan.next();  //the next word
		wordRevised = deformatWord(word);  //the next word, just deformatted

		if (isNewWord(newWordsRevised, wordRevised)) {  //if the word is new
		   if (newWordsRevised.length==wordCount) {  //make the array bigger if it's not already
			int newSize = wordCount+1;
			String[] temp = new String[newSize];
			System.arraycopy(newWordsRevised, 0, temp, 0, newWordsRevised.length);
			newWordsRevised = temp;
		   }

		   if (newWords.length==wordCount) {  //make the array bigger if it's not already
			int newSize = wordCount+1;
			String[] temp = new String[newSize];
			System.arraycopy(newWords, 0, temp, 0, newWords.length);
			newWords = temp;
		   }

		   if (timesWordAppears.length==wordCount) {  //make the array bigger if it's not already
			int newSize = wordCount+1;
			int[] temp = new int[newSize];
			System.arraycopy(timesWordAppears, 0, temp, 0, timesWordAppears.length);
			timesWordAppears = temp;
		   }

		   newWords[wordCount] = word;  //add word to newWord array
		   newWordsRevised[wordCount] = wordRevised;  //add revised word to newWordRevised array
		   timesWordAppears[wordCount] = 1;  //that new word has occurred ONCE so add ONE to the timesWordAppears array at the index of the word
		} else { //if the word ISN'T new
		   int spot = getIndexOfWord(newWordsRevised, wordRevised);  //find the index of the word that was input into the newWords array when the word was new

		   timesWordAppears[spot] += 1;  //add one to that count
		}

		wordCount++;  //add one to the wordCount
	   }

	   for (int i=0; i<newWordsRevised.length; i++) {  //for every original word in the file
		System.out.println(newWordsRevised[i]+": "+timesWordAppears[i]);  //display the word with its count
	   }

	} catch (FileNotFoundException e) {  //this exception is thrown if the file was not found, so
	   System.out.println("File not found.");  //tell the user that the file was not found
	}

   }  //end of main()

   /**
    *This method takes all of the punctuation out of the word
    *(except for the apostrophes) and returns it in lower-case.
    *@param str the word to be deformatted
    *@return the string after it's been deformatted
    */

   public static String deformatWord(String str) {

	String revision = "";  //the word after it's been deformatted

	for (int i=0; i<str.length(); i++) {  //for every character in the array
	   if (Character.isLetter(str.charAt(i)) || str.charAt(i)=='\'')  //if the character is a letter or apostrophe
		revision += str.charAt(i);  //add it to the revised word
	}

	return revision.toLowerCase();  //return the revised word in lower case

   }  //end of deformatWord()

   /**
    *This method checks whether a word is in an array or not.
    *@param arrayOfWords the array of words that str might be in
    *@param str the word that is being checked for
    *@return true if word isn't in the array
    */

   public static boolean isNewWord(String[] arrayOfWords, String str) {

	int count = 0;  //count how many times the word occurs in the array

	for (String item : arrayOfWords) {
	   if (str.equalsIgnoreCase(item))  //if the word occurs in the array
		count++;  //add one to count
	}

	if (count==0) {  //if the word NEVER occurred in the array
	   return true;  //return true because the word is obviously new
	} else {
	   return false;  //it's not new, so return false
	}

   }  //end of isNewWord()

   /**
    *This method finds where a word occurred in an array.
    *@param arrayOfWords the array of words that str is in
    *@param str the word that is being checked for
    *@return the index of the word
    */

   public static int getIndexOfWord(String[] arrayOfWords, String str) {

	int i = 0;  //index

	for (i=0; i<arrayOfWords.length; i++) {  //for every word in the array
	   if (arrayOfWords[i].equalsIgnoreCase(str))  //if the word is in the array at a certain index
		break;  //don't do anything else to the index i
	}

	return i;  //return the index of the word

   }  //end of getIndexOfWord()

}  //end of class CCountWords