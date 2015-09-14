//Tara Moses
//Assignment 4, Exercise 4.6
//45th Try

/*
 *This program asks the user what order fractal
 *they would like, and then draws a design based
 *on the user's input.
 */

import java.util.Scanner;

public class FSnowflake {

   /*
    *This subroutine asks the user what order fractal
    *they would like and then draws a design based on
    *the user's input.
    */

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.print("What order fractal would you like? ");
	int order = scan.nextInt();  //user inputs order fractal

	String directions = "SRSRS";  //0th order fractal starts with this string of directions

	if (order==0) {  //if user chooses 0th order fractal, 
	   directions = "SRSRS";  //directions stay the same
	}

	for (int i = 0; order!=0 && i <= order-1; i++) {  //if order fractal is larger than 0
	   directions = modString(directions);  //input old directions into modString() and get new directions out
	}

	drawString(directions);  //draw directions

   }  //end of main()

   /*
    *Subroutine modString() takes a string and replaces
    *all of the S's with "SLSRSLS".
    */

   public static String modString(String str) {

	String modified = "";  //new string starts out blank

	for (int i = 0; i <= str.length()-1; i++) {  //for every character in the word  
	   char charLetter = (str.charAt(i));  
	   String letter = String.valueOf(charLetter);  //"letter" = one letter in the word

	   if (letter.equalsIgnoreCase("S")) {  //if letter is s
		letter = "SLSRSLS";  //replace it with SLSRSLS
	   } else {  //if letter is not s
		letter = letter;  //don't change letter
	   }

	   modified = modified + letter;  //add the next letter (or SLSRSLS) to the new string
	}
	   return modified;  //return the new string

   }  //end of modString()

   /*
    *Subroutine drawString() takes every letter
    *in the input String and, depending on what
    *it is, moves a certain way.
    */

   public static void drawString(String str) {

	Turtle asdf = new Turtle();

	asdf.hide();  //hide the turtle because it's tacky

	for (int i = 0; i <= str.length()-1; i++) {  //for every letter in the string of directions
	   char charLetter = str.charAt(i);
	   String letter = String.valueOf(charLetter);  //letter = a letter in the word

	   if (letter.equalsIgnoreCase("S")) {  //if the letter is s
		asdf.forward(10);  //go forward 10 pixels
	   } else if (letter.equalsIgnoreCase("R")) {  //if the letter is r
		asdf.right(120);  //go right 120 degrees
	   } else if (letter.equalsIgnoreCase("L")) {  //if the letter is l
		asdf.left(60);  //go left 60 degrees
	   }
	}  //end of for-loop

	asdf.zoomFit();  //fit everything centered on the canvas

   }  //end of drawString()

}  //end of class FSnowflake



















