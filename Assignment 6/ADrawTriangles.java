//Tara Moses
//Assignment 6, Exercise 6.1
//53rd Try

import java.util.Scanner;
import java.util.InputMismatchException;

/*
 *This program lets the user click anywhere on the Turtle canvas
 *in three different places. The program draws a triangle from the
 *three points, and displays the side lengths, angle measurements,
 *and area of the triangle.
 */

public class ADrawTriangles {

   /**
    *This method takes in the points for the triangle. Calculates
    *the statistics (see first comment of program) and outputs them.
    */

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	Turtle asdf = new Turtle();
	asdf.hide();  //hide the turtle. I've never liked how he looks.

	int triangleCount = 0;  //count how many triangles the user has drawn
	String yN = "";

	double[] xArray = new double[3];  //x-coordinates for the three vertices of the triangle
	double[] yArray = new double[3];  //y-coordinates for the three vertices of the triangle

	System.out.println("\nClick anywhere on the Turtle canvas to place a point.");
	System.out.println("After three different points have been placed, you will receive statistics.");

	do {
	
	   System.out.println("\nStart clicking!");  //DO WHAT IT SAYS. JUST DO IT.
	
	   int count = 0;  //counts how many points have been taken in

	   for (int i=0; i<3; i++) {  //reset all the x- and y-coordinates in the arrays to something crazy
		xArray[i] = -5000;    //so they don't show up as points that have already been entered
		yArray[i] = -5000;
	   }

	   mainLoop: while (1==1) {  //run forever! this loop keeps the program checking for a clicked mouse
		if (asdf.mouseButton()) {  //if the mouse is clicked
		
		   double x = asdf.canvasX(asdf.mouseX());  //x-coordinate of mouse
		   double y = asdf.canvasY(asdf.mouseY());  //y-coordinate of mouse

		   asdf.up();  //don't draw, turtle
		   asdf.setPosition(x, y);  //go to where the mouse clicked
		   asdf.down();  //draw, turtle
		   asdf.dot();  //draw a dot

		   if (isNewPoint(xArray, x) || isNewPoint(yArray, y)) {  //if the point HASN'T been input into the arrays already
			xArray[count] = x;  //add the point
			yArray[count] = y;  //
			count++;  //count the point
		   }

		   if (count>2)  //if there are three points
			break mainLoop;  //stop asking for points

		} else {  //if the mouse ISN'T clicked
		   System.out.print("");  //print out nothing (this is just here so the loop will work)
		}
	   }

	   System.out.println("\nThe points you gave me are: ");  //tell user what points he clicked
	   System.out.println("A ("+xArray[0]+", "+yArray[0]+")");
	   System.out.println("B ("+xArray[1]+", "+yArray[1]+")");
	   System.out.println("C ("+xArray[2]+", "+yArray[2]+")");

	   connectDots(asdf, xArray, yArray);  //connect all the dots in the arrays

	   asdf.up();  //calculates how long the side lengths are
	   asdf.setPosition(xArray[1], yArray[1]);
	   double a = asdf.distance(xArray[2], yArray[2]);
	   asdf.setPosition(xArray[0], yArray[0]);
	   double b = asdf.distance(xArray[2], yArray[2]);
	   asdf.setPosition(xArray[0], yArray[0]);
	   double c = asdf.distance(xArray[1], yArray[1]);

	   System.out.println("\nThe three side lengths are: ");  //tells the user how long the side lengths are
	   System.out.printf("Line AB: %1.2f", c);
	   System.out.println(" pixels");
	   System.out.printf("Line BC: %1.2f", a);
	   System.out.println(" pixels");
	   System.out.printf("Line CA: %1.2f", b);
	   System.out.println(" pixels");

	   double angleA = Math.acos((b*b+c*c-a*a)/(2*b*c));  //calculate measures of all the angles
	   double angleB = Math.acos((a*a+c*c-b*b)/(2*a*c));
	   double angleC = Math.acos((a*a+b*b-c*c)/(2*a*b));

	   System.out.println("\nThe three angle measurements are: ");  //tell the user the angle measurements (in degrees, not radians)
	   System.out.printf("Angle A: %1.2f", angleA*(180/Math.PI));
	   System.out.println(" degrees");
	   System.out.printf("Angle B: %1.2f", angleB*(180/Math.PI));
	   System.out.println(" degrees");
	   System.out.printf("Angle C: %1.2f", angleC*(180/Math.PI));
	   System.out.println(" degrees");

	   double s = ((a+b+c)/2);  //these two lines are basically Heron's Formula
	   double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

	   System.out.println("\nAnd the area of the triangle is: ");  //tell the user the area of the triangle
	   System.out.printf("%1.2f", area);
	   System.out.println(" pixels squared\n");

	   triangleCount++;

	   System.out.print("Would you like to input another triangle? (Y/N): ");	   
	   yN = scan.next();  //"yN" decides whether the program runs again or not

	} while (yN.equalsIgnoreCase("y"));  //if user inputs Y, KEEP GOING FORMULA GO GO GO

	System.out.println("Okay then. By the way, you drew "+triangleCount+" triangle(s). Bye!");  //tells user how many triangles he drew

   }  //end of main()

   /**
    *This method checks to see whether a number is already in
    *the array.
    *@param array the array that n may or not be in
    *@param n the number we're checking array for
    *@return true if n was not found, false if n was found
    */

   public static boolean isNewPoint(double[] array, double n) {

	int answer = 1;

	for (double item: array) {  //for every item in the array
	   if (n==item)  //if the item is already in the array
		answer = 0;  //return false (later in the method)
	}

	if (answer==0) {
	   return false;
	} else {
	   return true;
	}

   }  //end of isNewPoint()

   /**
    *This method draws lines connecting all of the points in
    *the arrays.
    *@param asdf the Turtle that's going to draw the lines
    *@param xArray the x-coordinates of the points
    *@param yArray the y-coordinates of the points
    */

   public static void connectDots(Turtle asdf, double[] xArray, double[] yArray) {

	for (int i=0; i<xArray.length; i++) {  //for every point in the first array
	   for (int j=0; j<xArray.length; j++) {  //for every point in the first array again
		asdf.setPosition(xArray[i], yArray[i]);  //draw a line from every point in the first array
		asdf.setPosition(xArray[j], yArray[j]);  //to every OTHER point in the first array
	   }
	}

   }  //end of connectDots()

}  //end of class ADrawTriangles