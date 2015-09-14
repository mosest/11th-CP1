//Tara Moses
//Assignment 3, Exercise 3.4
//8th Try
//
//This program is designed to roll 4 'dice' and record how many rolls it takes to 
//get a sum of 21 from one roll.

public class DRoll {

   public static void main(String[] args) {

	int rollA = (int)(6*Math.random())+1;  //rollA is a random number between 1 and 6
	int rollB = (int)(6*Math.random())+1;  //rollB is a random number between 1 and 6
	int rollC = (int)(6*Math.random())+1;  //rollC is a random number between 1 and 6
	int rollD = (int)(6*Math.random())+1;  //rollD is a random number between 1 and 6

	int sum = rollA + rollB + rollC + rollD;  //the sum of the numbers rolled

	int count = 0;  //counts how many tries it takes to get 21
	while (sum != 21) {  //while sum is not 21, display the 4 old numbers (along with sum), roll 4 new numbers, and test to see if their sum is 21
	   System.out.println(rollA + " + " + rollB + " + " + rollC + " + " + rollD + " = " + sum + "\n");
	   rollA = (int)(6*Math.random()+1);
	   rollB = (int)(6*Math.random()+1);
	   rollC = (int)(6*Math.random()+1);
	   rollD = (int)(6*Math.random()+1);
	   sum = rollA + rollB + rollC + rollD;
	   count++;
	}

	System.out.println(rollA + " + " + rollB + " + " + rollC + " + " + rollD + " = " + sum);  //while sum is 21, display rolls (along with sum)
	System.out.println("We got a final sum of 21, and it only took " + count + " tries!");  //tells how many tries it took to get 21

   }  //end of main

}  //end of class DRoll