//Tara Moses
//Assignment 3, Exercise 3.1
//29th Try
//
//This program is designed to draw a rectangle using user-specified data. Nothing bonus-worthy here.

import java.util.Scanner;

public class ARectangle {

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.print("\nEnter a height: ");  //asks user to input height of rectangle
	int height = scan.nextInt();  //user inputs height; stored as variable "height"
	
	System.out.print("Enter a length: ");  //asks user to input length of rectangle
	int length = scan.nextInt();  //user inputs length; stored as variable "length"
	
	System.out.print("Enter a character: ");  //asks user to input character for design of rectangle
	String character = scan.next();  //user inputs character; stored as variable "character"
	System.out.println();  //line break
	
	//countHeight tracks what line you're on
	//countLength tracks what character you're on (in the line)

	for(int countHeight = 0; countHeight < height; countHeight++) {  //countLeight starts at 0; as long as countHeight is less than height, do the following
	   for(int countLength = 0; countLength < length; countLength++) {  //countLength starts at 0; as long as countLength is less than length, do the following
		if ((countHeight > 0 && countHeight < height-1) && (countLength > 0 && countLength < length-1)) {  //if you aren't on the outline of the rectangle, display a space
		   System.out.print(" ");
		} else {  //if you're part of the outline of the rectangle, display the chosen character
		   System.out.print(character);
		}
	   }
	   System.out.println();  //line break
	}

    }  //end of main

}  //end of class ARectangle