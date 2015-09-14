//Tara Moses
//Assignment 5, Exercise 5.5
//44th Try

import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.Color;

/*
 *This program allows the user to input coordinates. Turtle
 *plots these points on the canvas and draws lines connecting
 *all of them.
 */

public class ETriangles {

   /**
    *This method takes coordinates from user. Plots them on
    *the canvas and draws lines connecting them.
    */

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	Turtle asdf = new Turtle();

	asdf.setCanvasSize(500,500);  //sets canvas size

	double[] orangeX = new double[1];  //holds x-coordinate of point taken from user
	double[] orangeY = new double[1];  //holds y-coordinate of point taken from user

	int orangeXCount = 0;  //counts Xs given
	int orangeYCount = 0;  //counts Ys given

	double x = 0;  //temporary variable used to take input from user
	double y = 0;  //temporary variable used to take input from user

	System.out.println("Enter some coordinates!\n");

	mainLoop: while (1==1) {

	   System.out.print("x = ");  //input an x-coordinate
	   try {
		x = scan.nextDouble();
	   } catch (InputMismatchException e) {  //if it's not a number, then stop asking for points
		break mainLoop;
	   }
	   if (orangeXCount==orangeX.length) {  //if array is full, then make a new one that's bigger
		int newSize = orangeXCount+1;
		double[] temp = new double[newSize];
		System.arraycopy(orangeX, 0, temp, 0, orangeX.length);
		orangeX = temp;
	   }
	   orangeX[orangeXCount] = x;  //add to array
	   orangeXCount++;  //update counter

	   System.out.print("y = ");  //input a y-coordinate
	   try {
		y = scan.nextDouble();
	   } catch (InputMismatchException e) {  //if it's not a number, then stop asking for points
		break mainLoop;
	   }
	   if (orangeYCount==orangeY.length) {  //if array is full, then make a new one that's bigger
		int newSize = orangeYCount+1;
		double[] temp = new double[newSize];
		System.arraycopy(orangeY, 0, temp, 0, orangeY.length);
		orangeY = temp;
	   }
	   orangeY[orangeYCount] = y;  //add to array
	   orangeYCount++;  //update counter

	   System.out.println();
	}  //end of mainLoop: while

	for (int i=0; i<orangeYCount; i++) {  //for every point given
	   plotPoints(asdf, Color.orange, orangeX[i], orangeY[i]);  //plot it
	   asdf.up();  //stop drawing
	   asdf.setPosition(orangeX[i], orangeY[i]);  //go to the point
	   asdf.down();  //draw
		for (int j=i; j<orangeYCount; j++) {  //for every point
		   asdf.setPosition(orangeX[j], orangeY[j]);  //draw a line between points
	   	   asdf.setPosition(orangeX[i], orangeY[i]);
		}
	}

   }  //end of main()

   /**
    *This method plots the points that the user gave.
    *@param t the turtle that draws the dot
    *@param color the color of the dot
    *@param x the x-coordinate of where to place the dot
    *@param y the y-coordinate of where to place the dot
    */

   public static void plotPoints(Turtle t, java.awt.Color color, double x, double y) {

	t.hide();
	t.penColor(color);
	t.up();
	t.setPosition(x, y);
	t.down();
	t.width(3);
	t.dot();
	t.width(1);
	
   }  //end of plotPoints()

}  //end of class ETriangles
































