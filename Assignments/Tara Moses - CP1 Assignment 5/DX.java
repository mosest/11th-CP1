//Tara Moses
//Assignment 5, Exercise 5.4
//22nd Try

/*
 *This program asks for numbers until user inputs a letter.
 *Displays the numbers input, how many numbers were input,
 *and the sum of the numbers.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class DX {

   /**
    *This method takes input from the user. If user inputs a
    *number, computer adds it to array numArray. If user inputs
    *anything but a number, computer stops asking for numbers
    *and displays how many numbers were input as well as the sum.
    */

   public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);

	int newNumber = 0;
	int sum = 0;
	int[] numArray = new int[0];
	int count = 0;

	System.out.println("\nPlease enter some numbers, or a letter to end program: ");

	mainLoop: while (1==1) {

	   if (count==numArray.length) {
		int newSize = count+1;
		int[] temp = new int[newSize];
		System.arraycopy(numArray, 0, temp, 0, numArray.length);
		numArray = temp;
	   }

	   try {
		newNumber = scan.nextInt();
	   } catch (InputMismatchException e) {
		break mainLoop;
	   }

	   numArray[count] = newNumber;
	   count++;

	}

	System.out.println("\nYou input "+count+" numbers.\n");

	for (int item : numArray) {
	   sum += item;
	}

	for (int i=0; i<numArray.length; i++) {
	   if (i<numArray.length-1 && i!=numArray.length-2) {
		System.out.print(numArray[i]+" + ");
	   }

	   if (i==numArray.length-2) {
		System.out.print(numArray[i]+" = ");
	   }
	}

	System.out.print(sum+"\n");

   }  //end of main()

}  //end of class DX