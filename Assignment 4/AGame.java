//Tara Moses
//Assignment 4, Exercise 4.1
//17th Try

/*
 *This program is designed to run a game in which the user will try to guess a random number chosen by the computer.
 *There are three levels of difficulty, with a different number of allotted guesses and a different range of random
 *numbers. 
 */

import java.util.Scanner;

public class AGame {

   static int guessLimit;  //limited amount of guesses that a user is given before game ends. differs with each difficulty
   static int randomNumber;  //random number chosen by computer. differs with each difficulty

   /**
    *This subroutine prompts user to choose a level of difficulty and then runs the
    *corresponding subroutine. If user inputs a character other than a number between
    *1 and 3, IllegalArgumentException is thrown and program crashes. Game runs only
    *once before program ends.
    */

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("\n1. Easy");  //display levels of difficulty
	System.out.println("2. Medium");
	System.out.println("3. Hard");
	System.out.println();
	System.out.print("Welcome to \"Guess the Number\". Choose your level of difficulty by selecting a\nnumber between 1 and 3: ");
	int difficultyChosen = scan.nextInt();  //user inputs difficulty chosen
	System.out.println();

	if (difficultyChosen==1) {  //if user chooses easy
	   playEasy();  //run subroutine playEasy()
	} else if (difficultyChosen==2) {  //if user chooses medium
	   playMedium();  //run subroutine playMedium()
	} else if (difficultyChosen==3) {  //if user chooses hard
	   playHard();  //run subroutine playHard()
	} else if (difficultyChosen!=1 && difficultyChosen!=2 && difficultyChosen!=3) {  //if user chooses something other than 1, 2, or 3
	   throw new IllegalArgumentException ("Please choose a number between 1 and 3: ");  //exception is thrown
	}

   }  //end of main

   /**
    *playEasy() runs the game on easy difficulty. Sets range of numbers to choose from and then
    *gives the user ten tries to guess it before the game ends.
    */

   public static void playEasy() {

	System.out.println("Okay, you chose easy, so you have 10 tries to get the number. Let's start!");
	System.out.println();
	System.out.print("I'm thinking of a number between 1 and 10.");
	randomNumber = (int)(10*Math.random()+1);  //computer chooses random number between 1 and 10
	System.out.print(" ... What is it? ");

	guessLimit = 10;  //user gets ten guesses

	tellUserThings();  //runs subroutine tellUserThings()
	
   }  //end of playEasy()

   /**
    *playMedium() runs the game on medium difficulty. Sets range of numbers to choose from and then
    *gives the user 5 tries to guess it before the game ends.
    */

   public static void playMedium() {

	System.out.println("Okay, you chose medium, so you only have 5 tries to get the number. Let's start!");
	System.out.print("I'm thinking of a number between 1 and 50.");
	randomNumber = (int)(50*Math.random()+1);  //computer chooses random number between 1 and 50
	System.out.print(" ... What is it? ");

	guessLimit = 5;  //user gets five guesses

	tellUserThings();  //runs subroutine tellUserThings()
	
   }  //end of playMedium()

   /**
    *playHard() runs the game on hard difficulty. Sets range of numbers to choose from and then
    *gives the user 3 tries to guess it before the game ends.
    */

   public static void playHard() {

	System.out.println("Okay, you chose hard, so you only have 3 tries to get the number. Let's start!");
	System.out.println();
	System.out.print("I'm thinking of a number between 1 and 100.");
	randomNumber = (int)(100*Math.random()+1);  //computer chooses random number between 1 and 100
	System.out.print(" ... What is it? ");

	guessLimit = 3;  //user gets three guesses

	tellUserThings();  //runs subroutine tellUserThings()
	
   }  //end of playHard()

   /**
    *This subroutine asks for the user's guess, and responds accordingly based on what the number is in relation to
    *the computer's number and how many guesses the user gave prior.
    */

   public static void tellUserThings() {

	Scanner scan = new Scanner(System.in);  //new Scanner created for user input

	int guessCount = 0;  //user has not guessed a number yet

	while (1==1) {  //until something breaks this loop
	   int usersGuess = scan.nextInt();  //get user's guess
	   guessCount++;  //add one to guessCount (guessCount counts number of times user has guessed)
	   
	   if (usersGuess==randomNumber && guessCount==1) {  //if user guesses the number on the first try
		System.out.println("That was my number! ...Whoa, and you got it on the first try, too. Scary.");
		break;  //break out of loop because the game is over (user wins)
	   }

	   if (usersGuess==randomNumber && guessCount>1) {  //if user guesses the number after the first try
		System.out.println("That was my number! You got it in "+guessCount+" tries! Congratulations.");
		break;  //break out of loop because the game is over (user wins)
	   }

	   if (guessCount==guessLimit) {  //if the user doesn't guess the number in the required amount of guesses
		System.out.println("Ouch! Sorry, the number was "+randomNumber+". You couldn't get it in "+guessLimit+" tries. You lose.");
		break;  //break out of loop because the game is over (user loses)
	   }

	   if (usersGuess>randomNumber) {  //if the user guesses a number higher than the random number
		System.out.print(usersGuess+" is too high. Try again: "); //tell the user it's too high
	   } else if (usersGuess<randomNumber) {  //if the user guesses a number lower than the random number
		System.out.print(usersGuess+" is too low. Try again: "); //tell the user it's too low
	   }

	}  //end of while loop

   }  //end of tellUserThings

} //end of class AGame

























