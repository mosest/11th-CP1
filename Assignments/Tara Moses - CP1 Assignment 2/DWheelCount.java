//Tara Moses
//Assignment 2, Exercise 2.4
//6th try

import java.util.Scanner;

public class DWheelCount {

   public static void main(String[] args) {

	Scanner stdin = new Scanner( System.in );	

	int cars;  //Number of cars input by user.
	int tris;  //Number of tricycles input by user.
	int bis;  //Number of bicycles and motorcycles input by user.

	System.out.println("Hello, and welcome to WheelCount. Today I, your computer, am going to count the total number of wheels you have on your vehicles. Let's get started!\n"); //Displays greeting message.
	
	System.out.print("How many cars do you have? ");  //Displays message "How many cars do you have? "
	cars = stdin.nextInt();  //User inputs number of cars.

	System.out.print("Okay. Now how many tricycles do you have? (Answer honestly; I won't laugh.) ");  //Displays message "Okay. Now how many tricycles do you have? (Answer honestly; I won't laugh.) ".
	tris = stdin.nextInt();  //User inputs number of tricycles.

	System.out.print("Now how many bicycles? (Motorcycles count!) ");  //Displays message "Now how many bicycles? (Motorcycles count!) ".
	bis = stdin.nextInt();  //User inputs number of bicycles and motorcycles.
	System.out.print("\n");  //Goes to next line.

	int wheels = 4*cars + 3*tris + 2*bis;  //Calculates total number of wheels.
	int brainwheel = wheels + 1;  //Calculates total number of wheels if user counts the one turning in his/her head.

	System.out.println("Okay! Now that we have all the data, we know that you have... " + wheels + " wheels total! (Or " + brainwheel + " if you want to count the wheel turning in your brain!) Thank you for using WheelCount, and have a \"wheely\" good day!\n\n(P.S. - Sorry for the pun; I just couldn't help myself. ;__;)\n");  //Displays goodbye message

   }  //End of main

}  //End of class DWheelCount