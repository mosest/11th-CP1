//Tara Moses
//Assignment 6, Exercise 6.4
//15th Try

import java.util.Scanner;

/*
 *This program lets the user click the Turtle canvas in two
 *different spots, and then it draws a line connecting them.
 *Tells the user how long the line is, as well.
 *(This is kind of EXACTLY like assignment 6.1. What the crap?)
 */

public class DLine {

   /**
    *This method gets the points from the user and then
    *draws a line through them.
    */

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	Turtle asdf = new Turtle();
	asdf.hide();  //hide the turtle because it's tacky and ugly and I hate it

	double[] xArray = new double[2];  //holds the x-coordinates for the endpoints of the line
	double[] yArray = new double[2];  //holds the y-coordinates for the endpoints of the line

	String yN = "";

	System.out.println("\nThis program draws a line for you and tells you the length of it.");
	System.out.println("All you have to do is enter the endpoints!");

	do {
	
	   System.out.println("\nStart clicking!");
	
	   int count = 0;  //counts how many points have been input

	   for (int i=0; i<2; i++) {  //for every space in the arrays that hold the coordinates
		xArray[i] = -5000;  //reset the spaces to something outrageous so that the points aren't falsely accused of being input already
		yArray[i] = -5000;  //reset the spaces to something outrageous so that the points aren't falsely accused of being input already
	   }

	   mainLoop: while (1==1) {  //keep checking to see whether the mouse is clicked or not
		if (asdf.mouseButton()) {  //if the mouse button is down
		
		   double x = asdf.canvasX(asdf.mouseX());  //x-coordinate of wherever the mouse clicked
		   double y = asdf.canvasY(asdf.mouseY());  //y-coordinate of wherever the mouse clicked

		   asdf.up();  //don't draw, turtle
		   asdf.setPosition(x, y);  //go to wherever the mouse clicked, turtle
		   asdf.down();  //draw, turtle
		   asdf.dot();  //draw a dot, turtle

		   if (isNewPoint(xArray, x) || isNewPoint(yArray, y)) {  //if the point is new
			xArray[count] = x;  //add it to the array
			yArray[count] = y;  //add it to the array
			count++;  //add one to count
		   }

		   if (count>1)  //if there are two points
			break mainLoop;  //stop asking for points

		} else {  //if the mouse button is not down
		   System.out.print("");  //don't do anything :D
		}
	   }

	   System.out.println("\nThe points you gave me are: ");  //show user where he clicked
	   System.out.println("A ("+xArray[0]+", "+yArray[0]+")");
	   System.out.println("B ("+xArray[1]+", "+yArray[1]+")");

	   asdf.up();  //don't draw, turtle
	   asdf.setPosition(xArray[0], yArray[0]);  //go to the first point
	   double distance = asdf.distance(xArray[1], yArray[1]);  //find the distance between the points
	   asdf.down();  //draw
	   asdf.setPosition(xArray[1], yArray[1]);  //draw a line from the first point to the second point

	   System.out.println("\nThe line was about "+distance+" pixels long.");  //tell the user how long the line was

	   System.out.print("\nAgain? (Y/N): ");
	   yN = scan.next();  //user decides whether to run program or not

	} while (yN.equalsIgnoreCase("y"));

   }  //end of main()

   /**
    *This method checks to see whether a point has already been
    *entered or not.
    *@param array the array that contains the point
    *@param n the number that's being checked for
    *@return true if the point is new
    */

   public static boolean isNewPoint(double[] array, double n) {

	int answer = 1;

	for (double item: array) {  //for every item in the array
	   if (n==item)  //if it matches the number n
		answer = 0;  //return false
	}

	if (answer==0) {
	   return false;
	} else {
	   return true;
	}

   }  //end of isNewPoint()

}  //end of class DLine