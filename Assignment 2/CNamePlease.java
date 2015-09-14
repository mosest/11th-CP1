//Tara Moses
//Assignment 2, Exercise 2.3
//21st Try

import java.util.Scanner;  //Makes the Scanner class available.

public class CNamePlease {  //This is the program NamePlease. It asks for your name, and then "greets" you.

   public static void main(String[] args) {

	Scanner stdin = new Scanner( System.in );  //Creates the scanner.
	
	String inputName;  //The name input by the user.
	
	System.out.print("What is your name? ");  //Displays message "What is your name? "
	inputName = stdin.next();  //Allows user to type in name
	
	String redoneA = inputName.substring(0,1); //redoneA is the first letter of the name, unchanged.
	String redoneB = inputName.substring(1);  //redoneB is the other letters of the name, unchanged.

	redoneA = redoneA.toUpperCase();  //Capitalizes redoneA
	redoneB = redoneB.toLowerCase();  //Lowercases redoneB
	
	String redoneC = redoneA + redoneB;  //Represents a correctly typed name (Uppercase first letter, lowercase other letters)

	if (inputName.equals(redoneC)) {  //If the name is typed correctly (Uppercase first letter, lowercase other letters), it compliments you. If you type it wrong, it scolds you.
	   System.out.print(redoneC + ", I love you. You type so well! You wouldn't believe how the last person typed. It wEnt A LiTTLe LIke thiS. Ugh. ");
	} else {
	   System.out.print(redoneC + ", I love you... but you need to learn how to type. Seriously, \"" + inputName + "\"? Really? I thought you were better than this.");
	}  //End of "if, then" statement

   }  //End of Main

}  //End of class CNamePlease
