//Tara Moses
//Assignment 3, Exercise 3.2
//39th Try
//
//This program is designed to ask for a number of lines to draw and a length for those lines. It
//is supposed to draw a starburst using the data. BONUS FEATURES: if you input a negative number,
//it lets you retry it. If you put an incredibly low number of lines to draw, the computer kindly
//advises you to input a higher number of lines.
//
//tl;dr computer draws a star with user-input data; doesn't crash easily :D

import java.util.Scanner;

public class BStar {

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	Turtle asdf = new Turtle();

	System.out.print("\nOkay, today we're drawing a starburst. How many lines would you like? ");  //asks user to input number of lines to draw
	int lines = scan.nextInt();  //user inputs number of lines to draw
	System.out.println();  //line break

	while (lines < 0) {  //tells you to try again when you input a negative number for the number of lines to draw
	   System.out.print("How am I supposed to draw negative lines? Try again: ");  //displays "error" message
	   lines = scan.nextInt();  //user reinputs number of lines
	   System.out.println();  //line break
	}

	int countMistake = 0;  //the "mistake couter"; counts how many times you've gone through the "firstMistake" or "secondMistake" while loops
	firstMistake: while (lines > 0 && lines <= 4 && countMistake == 0) {  //if number of lines is less than 4, the star won't be very pretty, so the program asks you to rethink it
	   System.out.print("That's going to be a pretty crappy star. Are you sure you don't want any more\nlines? (A simple yes or no will suffice.) ");
	   String tryAgain = scan.next();
	   if (tryAgain.equalsIgnoreCase("no")) {  //if you say you're not sure (by inputting "no")
		System.out.print("\nThat's what I thought. Try again: ");  //program gets a little snippy; asks user to reinput number of lines to draw
		lines = scan.nextInt();  //user reinputs number of lines to draw
		System.out.println();  //line break
		countMistake++;  //adds one to the mistake counter
	   } else {  //if you say you're sure you want to draw a crappy star (by inputting "yes")
		System.out.print("\nWhatever. ");  //program gets snippy
		break firstMistake;  //breaks out of while loop "firstMistake"
	   }  //end of if-else
	}  //end of firstMistake
	
	secondMistake: while ((lines > 0 && lines <= 4) && countMistake > 0) {  //if number of lines is less than 4, the star looks crappy, so program asks you again to rethink it
	   System.out.print("That's STILL going to be a pretty crappy star. Are you sure you don't want any\nmore lines? (A simple yes or no will suffice.) ");  //program gets even snippier because you made a mistake twice (hence count > 0)
	   String tryAgain = scan.next();  //user chooses whether or not to reinput number of lines
	   if (tryAgain.equalsIgnoreCase("no")) {  //if you say you're not sure (by inputting "no")
		System.out.print("\nThat's what I thought. Try again: ");  //this program really needs to get over itself (what does that say about the author? haha)
		lines = scan.nextInt();  //user reinputs number of lines
		System.out.println();  //line break
		countMistake++;  //adds one to the mistake counter
	   } else {  //if you say you're sure you want to draw a crappy star (by inputting "yes")
		System.out.print("\nWhatever. ");  //program just has to deal with it
		countMistake++;  //adds one to the mistake counter
		break secondMistake;  //breaks out of while loop "secondMistake"
	   }  //end of if-else
	}  //end of secondMistake

	System.out.print("Now how many pixels long do you want those lines? ");  //asks user to input length of lines
	int radius = scan.nextInt();  //user inputs length of lines
	System.out.println();  //line break

	for (int countLines = 0; countLines <= lines; countLines++) {  //countLines starts at 0; as long as countLines is less than the input number of lines, do the following and then add one to countLines
	   asdf.right(360/lines);  //turtle turns right the correct number of degrees (calculated by dividing the number of lines by 360)
	   asdf.forward(radius);  //turtle goes forward the length of lines input by user
	   asdf.right(180);  //turtle turns around 180 degrees
	   asdf.forward(radius);  //turtle goes back the way it came
	   asdf.right(180);  //turtle turns around 180 degrees again (to get ready for the for loop to restart)
	}  //end of for loop

   }  //end of main

}  //end of class BStar

	