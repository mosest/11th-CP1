//Tara Moses
//Assignment 5, Exercise 5.2
//38th Try

/*
 *This program simulates an unlimited number of random birthdays.
 *Runs until two matching birthdays are found, and displays the
 *birthday that is shared (month and day, not day of the year) as
 *well as the number of birthdays it took before a match was found.
 */

public class BBirthday {

   /**
    *This method adds a random number to array birthdayList
    *and checks whether it was already in it using hasBeenUsed().
    *If it was, then stop inputting numbers and display message
    *stating that a birthday match has been found.
    */

   public static void main(String[] args) {

	int[] birthdayList = new int[10];  //create array for holding random birthdays (start with 10 slots to fill)
	int count = 0;  //initialize count of birthdays
	int random = 0;  //initialize random birthday

	mainLoop: while (1==1) {
	   if (count>0 && hasBeenUsed(birthdayList, random)) {  //if a birthday is already in the array
		System.out.println("\nI found a birthday duplicate after "+count+" tries!");
		System.out.println("The shared birthday is "+findMonth(birthdayList[count-1])+" "+findDay(birthdayList[count-1])+".");
		break mainLoop;  //break out of the forever-running loop
	   }

	   random = (int)(365*Math.random()+1);  //generate a random number

	   if (count==birthdayList.length) {  //if the array is full
		int newSize = count+1;  //make a new size for the array (in this case, increase array size by one)
		int[] temp = new int[newSize];  //create a temporary array with the new size
		System.arraycopy(birthdayList, 0, temp, 0, birthdayList.length);  //copy everything from the old array to the new array
		birthdayList = temp;  //old array refers to new array
	   }

	   birthdayList[count] = random;  //add the new random birthday to the array
	   count++; 

	}  //end of while

   }  //end of main

   /**
    *This method checks whether a number is already in an array.
    *@param array the array that holds each random birthday
    *@param number the random birthday being checked
    *@return true if number is already in array
    */

   public static boolean hasBeenUsed(int[] array, int number) {

	int countBirthdays = 0;  //initalize countBirthdays (countBirthday counts how many times a birthday occurs in an array)

	forLoop: for (int item : array) {  //for every item in the array
	   if (item==number) {  //if a random birthday occurs in the array
		countBirthdays++;  //count it
	   }
	}

	if (countBirthdays==2) {  //if a random birthday occurs twice in the array
	   return true;  //return true because it means we found a birthday match! :D
	} else {
	   return false;
	}

   }  //end of hasBeenUsed()

   /**
    *This method takes a day of the year and tells which month
    *it occurs in.
    *@param birthday the day of the year
    *@return the month that birthday occurs in
    */

   public static String findMonth(int birthday) {

	String month = "";  //initialize month

	if (birthday>=1 && birthday<=31) {  //I shouldn't have to explain this part
	   month = "January";
	} else if (birthday>=32 && birthday<=59) {
	   month = "February";
	} else if (birthday>=60 && birthday<=90) {
	   month = "March";
	} else if (birthday>=91 && birthday<=120) {
	   month = "April";
	} else if (birthday>=121 && birthday<=151) {
	   month = "May";
	} else if (birthday>=152 && birthday<=181) {
	   month = "June";
	} else if (birthday>=182 && birthday<=212) {
	   month = "July";
	} else if (birthday>=213 && birthday<=243) {
	   month = "August";
	} else if (birthday>=244 && birthday<=273) {
	   month = "September";
	} else if (birthday>=274 && birthday<=304) {
	   month = "October";
	} else if (birthday>=305 && birthday<=334) {
	   month = "November";
	} else {
	   month = "December";
	}

	return month;

   }  //end of findMonth()

   /**
    *This method takes a day of the year and tells what day
    *of the month it occurs in.
    *@param birthday the day of the year
    *@return the day of the month
    */

   public static int findDay(int birthday) {

	int day = 0;  //initialize day
	
	if (birthday>=1 && birthday<=31) {
	   day = birthday;
	} else if (birthday>=32 && birthday<=59) {
	   day = birthday-31;
	} else if (birthday>=60 && birthday<=90) {
	   day = birthday-59;
	} else if (birthday>=91 && birthday<=120) {
	   day = birthday-90;
	} else if (birthday>=121 && birthday<=151) {
	   day = birthday-120;
	} else if (birthday>=152 && birthday<=181) {
	   day = birthday-151;
	} else if (birthday>=182 && birthday<=212) {
	   day = birthday-181;
	} else if (birthday>=213 && birthday<=243) {
	   day = birthday-212;
	} else if (birthday>=244 && birthday<=273) {
	   day = birthday-243;
	} else if (birthday>=274 && birthday<=304) {
	   day = birthday-273;
	} else if (birthday>=305 && birthday<=334) {
	   day = birthday-304;
	} else {
	   day = birthday-334;
	}

	return day;

   }  //end of findDay()

}  //end of class BBirthday