//Tara Moses
//Assignment 2, Exercise 2.5
//13th Try

import java.io.File;
import java.util.Scanner;

public class EBMI {  //This program is designed to take information from student_stats.txt and use it to show the BMI (and then give advice based on it!)

   public static void main(String[] args) throws Exception {

	Scanner scan = new Scanner(new File("student_stats.txt"));  //Creates the Scanner class; tells it to use data from "student_stats.txt"

	String name = scan.nextLine();  //Takes the first line (name of student) from student_stats.txt and assigns it to variable "name"
	int A = scan.nextInt();  //Takes the next line from student_stats.txt (height in feet) and assigns it to variable "A"
	int B = scan.nextInt();  //Takes the next line (height in inches) and assigns it to variable "B"
	int C = scan.nextInt();  //Takes the next line (weight in pounds) and assigns it to variable "C"

	double heightInFeet = A;  //Changes A to type double and renames it
	double heightInInches = B;  //Changes B to type double and renames it
	double weight = C;  //Changes C to type double and renames it

	double heightTotal = heightInFeet*12 + heightInInches;  //Calculates total height (in inches)
	double BMI = (weight/(heightTotal*heightTotal))*703;  //Calculates BMI

	System.out.print(name + ", your BMI is ");  //Displays message "<name>, your BMI is "
	System.out.printf("%1.1f", BMI);  //Rounds BMI to one digit and displays it
	System.out.println();

	double d = BMI*10;  //These three lines do the same thing as System.out.printf("%1.1f", BMI) except now I can store it as variable "roundedBMI" :D
	double v = Math.round(d);
	double roundedBMI = v/10;

	if (roundedBMI < 18.5) {  //Checks to see what range your BMI is in; gives advice accordingly.
	   System.out.println("Advice: you are underweight. Eat a sandwich.");
	} else if (18.5 <= roundedBMI && roundedBMI <= 29.9) {
	   System.out.println("Advice: you have a normal weight. Congratulations!");
	} else if (roundedBMI >= 30.0) {
	   System.out.println("Advice: you are obese. Buy a treadmill.");
	}

   }  //End of main

}  //End of class EBMI