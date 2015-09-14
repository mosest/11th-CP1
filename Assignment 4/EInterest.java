//Tara Moses
//Assignment 4, Exercise 4.5
//22nd Try

/*
 *This program calculates the future value of an investment.
 */

import java.util.Scanner;

public class EInterest {

   static int principal;
   static double percentRate;
   static double decimalRate;
   static double years;

   /**
    *This subroutine asks for certain details about the investment,
    *and then shows how much the future investment will be.
    */

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.print("What is the amount you are investing? ");
	principal = scan.nextInt();  //set principal

	System.out.print("What is the annual percentage rate of interest? ");
	percentRate = scan.nextDouble();  //user sets rate of interest (as a percent, not a decimal)
	decimalRate = (percentRate/100);  //percent rate is converted to decimal form

	System.out.print("For how many years will this be invested? ");
	years = scan.nextDouble();  //user sets years to let investment sit

	System.out.println();
	System.out.print("After "+(int)(years)+" years, the investment will have grown to $");
	System.out.printf("%1.2f", futureValue(principal,decimalRate,years));  //display future investment, formatted
	System.out.print(".");

   }  //end of main()

   /**
    *This subroutine takes the principal, rate, and years for an investment
    *and returns the value of the investment after the years given.
    */

   public static double futureValue(int p, double r, double y) {
	
	double future = p*(Math.pow((1+r),y));  //calculate future investment
	return future;  //return future investment

   }  //end of futureValue()

}  //end of EInterest