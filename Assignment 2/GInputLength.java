//Tara Moses
//Assignment 2, Exercise 2.7
//6th Try

import java.util.Scanner;

public class GInputLength {  //GInputLength is a program designed to ask for an angle and a length and make a square out of it

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	Turtle asdf = new Turtle();  //creates new turtle asdf, which is the best name ever.

	System.out.print("What length (in pixels) would you like to make a square out of? ");
	int length = scan.nextInt();  //user inputs length
	System.out.print("Thanks! Now what angle (in degrees) would you like to rotate this square by? ");
	int angle = scan.nextInt();  //user inputs angle
	System.out.println("Okay. Drawing now...");

	asdf.right(angle);  //turtle turns right the number of degrees given
	asdf.forward(length);  //turtle goes forward the number of pixels given
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(length);  //turtle goes forward the number of pixels given
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(length);  //turtle goes forward the number of pixels given
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(length);  //turtle goes forward the number of pixels given
	asdf.zoomFit();  //centers the square to fit the screen

   }  //end of main

}  //end of class GInputLength