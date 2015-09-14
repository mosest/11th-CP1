//Tara Moses
//Assignment 5, Exercise 5.1
//18th Try

/*
 *This program creates an array of 100 integers between 10
 *and 42. Prints every number out and reports the min, max,
 *and average of the numbers.
 */

public class ANumbers {

   /**
    *This method creates an array and adds 100 random numbers
    *to it. Reports the average, minimum, and maximum of the
    *set of data.
    */

   public static void main(String[] args) {

	int[] numberList = new int[100];  //create new array that can hold 100 numbers
	int max = 0;  //initialize max number
	int min = 42;  //initialize min number

	System.out.println("The numbers are: \n");

	for (int i=0; i < numberList.length; i++) {  //as long as there are spaces to fill in the array
	   int random = (int)(33*Math.random()+10);  //generate a random number between 10 and 42
	   numberList[i] = random;  //add random number to the array

	   if (numberList[i] > max)  //if the random number is bigger than whatever the max number was before
		max = numberList[i];  //random number is the new max

	   if (numberList[i] < min)  //if the random number is smaller than whatever the min number was before
		min = numberList[i];  //random number is the new min

	   System.out.printf("%4d", numberList[i]);  //display every number in the array (20 numbers to a line)
	}

	double sum = 0;  //initialize sum
	for (int item : numberList) {  //for every item in the array
	   sum = sum + item;  //total up sum
	}

	System.out.println("\nThe average of these numbers is "+(sum/100)+".\n");  //display sum
	System.out.println("The smallest number is "+min+".\n");  //display smallest number in array
	System.out.println("The largest number is "+max+".\n");  //display largest number in array

   }  //end of main

}  //end of class ANumbers