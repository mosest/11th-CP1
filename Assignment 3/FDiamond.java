//Tara Moses
//Assignment 3, Exercise 3.6
//42nd Try
//
//This program is designed to have the user input an odd number (if presented with an odd number,
//the program will ask you to reinput it) and draw a diamond using the input number as the width

import java.util.Scanner;

public class FDiamond {

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.print("Please imput an odd number: ");  //asks for an odd number
	int width = scan.nextInt();  //user inputs odd number
	System.out.println();  //line break

	int countTries = 0;  //counts number of mistakes (even numbers) input
	while (width%2!=1 && countTries==0) {  //if width is even and it's the first even number input
	   System.out.print("That's not odd. Try again: ");  //display message asking to try again
	   width = scan.nextInt();  //user inputs odd number again
	   System.out.println();  //line break
	   countTries++;  //update mistake counter
	}

	while (width%2!=1 && countTries>0) {  //if width is even and it's not the first even number input
	   System.out.print("That's STILL not odd. Try again: ");  //display message asking to try again (this time more impatient)
	   width = scan.nextInt();  //user inputs odd number again
	   System.out.println();  //line break
	   countTries++;  //update mistake counter
	}

	int div = width/2;  //divides width by two and gets rid of fractional part
	
	//h is the counter for the number of lines
	//w is the counter for the number of spots on the line (one character takes up one spot)

	for (int h=0; h<(div+1); h++) {  //This is the first half of the diamond. As long as the number of lines is no higher than half of the input width plus one (the +1 is for the middle line, where there are only stars), do the following
	   for  (int w=0; w<width; w++) {  //as long as the number of spots on one line is no higher than the input width, do the following:
		int countStar = 1+(h*2);  //counts the number of stars on a line (this starts at 1 and increases by two for each line we go down)
		if (div-h>=0) {  //as long as there are not a negative number of spaces (number of spaces at the beginning of the line decreases by one for each line we go down)
		   if (w<div-h) {  //as long as we're no more character spots in than the designated number of spaces needed
			System.out.print(" ");  //print a space
		   } else if (w>div-h-1 && w<=countStar+(div-h-1)) {  //if we're after the last space but before the last star needed
			System.out.print("*"); //print a star
		   }  //end of if-else
		}  //end of if-else
	   }  //end of for-loop
	   System.out.println();  //line break
	}  //end of for-loop

	for (int h=0; h<div; h++) {  //This is the second half of the diamond. As long as the number of lines is no higher than half of the input width, do the following:
	   for (int w=0; w<width; w++) {  //as long as the number of spots on one line is no higher than the input width, do the following:
		int countStar = width-(h*2);  //counts the number of stars on a line (this starts with as many stars as the input width and decreases by two for each line we go down)
		if (h+1<=div) {  //as long as the line we're on (add one because computers start counting at zero) is less than or equal to half of the input width
		   if (w<h+1) {  //as long as we're no more character spaces in than the designated number of spaces needed (h+1)
			System.out.print(" ");  //print a space
		   } else if (w>h+1 && w<countStar+h) {  //as long as we're further in than the last space but not before the last star needed
			System.out.print("*");  //print a star
		   }  //end of if-then
		}  //end of if-then
	   }  //end of for-loop
	   System.out.println();  //line break
	}  //end of for-loop

   }  //end of main

}  //end of FDiamonds