//Tara Moses
//Assignment 6, Exercise 6.2
//45th Try

import java.util.Scanner;  //takes input from user

/*
 *This program evaluates any simple expression. The
 *expression must have only two numbers and only one
 *operator.
 */

public class BEquation {

   /**
    *This method separates the expression input by the
    *user into three parts: first number, operator, and
    *second number. If any part is not valid, displays
    *error messages accordingly.
    */

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	String operatorList = "+-*/^";  //list of valid operators

	String firstN = "";  //first number in expression
	String secondN = "";  //second number in expression
	String operator = "";  //operator in expression

	double numberFirstN = 0;  //first number after it's been changed to double
	double numberSecondN = 0;  //second number after it's been changed to double
	double answer = 0;  //evaluation of expression

	String yN = "";  //checks to see if program should run again

	do {

	   System.out.print("\nEnter an expression: ");
	   String userExpression = scan.next();  //expression input by user

	   System.out.println();

	   if (howManyOperators(operatorList, userExpression)==0) {  //if there is no operator
		System.out.println("No operator was found.");  //tell user there's no operator
	   } else if (howManyOperators(operatorList, userExpression)>1) {  //if there is more than one operator
		System.out.println("Too many operators.");  //tell user there's more than one operator
	   } else if (howManyOperators(operatorList, userExpression)==1) {  //if there's one operator
		for (int i=0; i<userExpression.length(); i++) {  //for every character in the expression
		   if (operatorList.indexOf(userExpression.charAt(i))!=(-1)) {  //if it's the operator (we know there's only one operator at this point)
			firstN = userExpression.substring(0, i);  //everything before the operator is the first number
			operator = userExpression.substring(i, i+1);   //the operator is the operator ;)
			secondN = userExpression.substring(i+1, userExpression.length());  //everything after the operator is the second number

			if (thereAreLetters(firstN)) {  //if there are letters in the first number
			   System.out.println(firstN+" is not a valid number.");  //tell the user
			} else {  //if there aren't letters in the first number
			   numberFirstN = Double.valueOf(firstN);  //convert it to a double
			}

			if (thereAreLetters(secondN)) {  //if there are letters in the second number
			   System.out.println(secondN+" is not a valid number.");  //tell the user
			} else {  //if there aren't letters in the second number
			   numberSecondN = Double.valueOf(secondN);  //convert it to a double
			}
		   }
		}
	   }

	   //if EVERYTHING IS OKAY with the expression that the user typed

	   if (!thereAreLetters(firstN) && !thereAreLetters(secondN) && howManyOperators(operatorList, userExpression)==1) {
		System.out.print(numberFirstN+" "+operator+" "+numberSecondN+" = ");

		if (operator.equals("+")) {  //evaluate the expression based on what operator was input
		   System.out.println(numberFirstN+numberSecondN);
		} else if (operator.equals("-")) {
		   System.out.println(numberFirstN-numberSecondN);
		} else if (operator.equals("*")) {
		   System.out.println(numberFirstN*numberSecondN);
		} else if (operator.equals("/")) {
		   System.out.println(numberFirstN/numberSecondN);
		} else if (operator.equals("^")) {
		   System.out.println(Math.pow(numberFirstN, numberSecondN));
		}
	   }

	   System.out.print("\nWould you like to input another expression? (Y/N): ");
	   yN = scan.next();  //decides whether the program runs again

	} while (yN.equalsIgnoreCase("y"));

   }  //end of main()

   /**
    *This method counts how many operators are in the
    *expression.
    *@param list the list of operators
    *@param str the string of characters containing the operator(s)
    *@return how many operators were found
    */

   public static int howManyOperators(String list, String str) {

	int count = 0;  //counts how many operators are in the expression

	int[] temp = new int[str.length()];  //array that holds the operator-test results

	for (int i=0; i<str.length(); i++) {  //for all the characters in the string
	   if (list.indexOf(str.charAt(i))!=(-1))  //if it's an operator
		temp[i] = 1;  //operator-test result is ONE
	}

	for (int item : temp) {
	   if (item==1) {  //FOR ALL ONES
		count++;  //count it as an operator found
	   }
	}

	return count;  //return how many operators were found

   }  //end of howManyOperators()

   /**
    *This method checks to see whether a number is valid based
    *on whether it has letters or not in it.
    *@param str the number that we're checking for letters
    *@boolean return true if there are letters in the number
    */

   public static boolean thereAreLetters(String str) {

	int count = 0;

	for (int i=0; i<str.length(); i++) {  //for every character in the string
	   if (!Character.isDigit(str.charAt(i)) && str.charAt(i)!='.')  //if the character is a letter
		count++;  //add one to count
	}

	if (count>0) {
	   return true;  //if there are not ZERO letters, then there ARE LETTERS AND YOU SHOULD RETURN TRUE
	} else {
	   return false;  //it's cool because it's a valid number with no letters
	}

   }  //thereAreLetters()

}  //end of class BEquation