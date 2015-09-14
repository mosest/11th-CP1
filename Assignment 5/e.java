//Tara Moses
//Assignment 5, Exercise 5.5
//1st Try

import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.Color;

public class e {

   public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	Turtle asdf = new Turtle();

	asdf.setCanvasSize(500,500);

	double[] blueX = new double[1];
	double[] blueY = new double[1];

	int blueCount = 0;

	double[] orangeX = new double[1];
	double[] orangeY = new double[1];

	int orangeXCount = 0;
	int orangeYCount = 0;

	double x = 0;
	double y = 0;

	System.out.println("Enter some coordinates!\n");

	mainLoop: while (1==1) {

	   System.out.print("x = ");
	   try {
		x = scan.nextDouble();
	   } catch (InputMismatchException e) {
		break mainLoop;
	   }
	   if (orangeXCount==orangeX.length) {
		int newSize = orangeXCount+1;
		double[] temp = new double[newSize];
		System.arraycopy(orangeX, 0, temp, 0, orangeX.length);
		orangeX = temp;
	   }
	   orangeX[orangeXCount] = x;
	   orangeXCount++;

	   System.out.print("y = ");
	   try {
		y = scan.nextDouble();
	   } catch (InputMismatchException e) {
		break mainLoop;
	   }
	   if (orangeYCount==orangeY.length) {
		int newSize = orangeYCount+1;
		double[] temp = new double[newSize];
		System.arraycopy(orangeY, 0, temp, 0, orangeY.length);
		orangeY = temp;
	   }
	   orangeY[orangeYCount] = y;
	   orangeYCount++;

	   System.out.println();
	}  //end of mainLoop: while

	for (int i=0; i<orangeYCount; i++) { 
	   plotPoints(asdf, Color.orange, orangeX[i], orangeY[i]);
	   asdf.up();
	   asdf.setPosition(orangeX[i], orangeY[i]);
	   asdf.down();
		for (int j=i; j<orangeYCount; j++) {
		   asdf.setPosition(orangeX[j], orangeY[j]);
	   	   asdf.setPosition(orangeX[i], orangeY[i]);
		}
	}

	System.out.println("You gave us "+orangeYCount+" points.\n");

	displayOrangeTriangles(orangeX, orangeY);

	System.out.println("There were "+countOrangeTriangles(orangeX, orangeY)+" orange triangles found.");

	for (int i=0; i<orangeY.length; i++) {
	   for (int j=0; j<orangeY.length && j!= i; j++) {
		for (int k=0; k<orangeY.length && k!=j && k!=i; k++) {
		   for (int l=0; l<orangeY.length && l!=k && l!=j && l!=i; l++) {

			double abSlope = ((orangeY[i]-orangeY[j])/(orangeX[i]-orangeX[j]));
			double acSlope = ((orangeY[i]-orangeY[k])/(orangeX[i]-orangeX[k]));
			double adSlope = ((orangeY[i]-orangeY[l])/(orangeX[i]-orangeX[l]));
			double bcSlope = ((orangeY[j]-orangeY[k])/(orangeX[j]-orangeX[k]));
			double bdSlope = ((orangeY[j]-orangeY[l])/(orangeX[j]-orangeX[l]));
			double cdSlope = ((orangeY[k]-orangeY[l])/(orangeX[k]-orangeX[l]));

			for (double eX=0; eX<=100 && eX>=-100; eX+=0.01) {

			   for (double eY=0; eY<=100 && eY>=-100; eY+=0.01) {

				double abLine = (abSlope*(((double)Math.round(eX*1)/1)-orangeX[i])+orangeY[i]);
				double acLine = (acSlope*(((double)Math.round(eX*1)/1)-orangeX[i])+orangeY[i]);
				double adLine = (adSlope*(((double)Math.round(eX*1)/1)-orangeX[i])+orangeY[i]);
				double bcLine = (bcSlope*(((double)Math.round(eX*1)/1)-orangeX[j])+orangeY[j]);
				double bdLine = (bdSlope*(((double)Math.round(eX*1)/1)-orangeX[j])+orangeY[j]);
				double cdLine = (cdSlope*(((double)Math.round(eX*1)/1)-orangeX[k])+orangeY[k]);

				double abRounded = (double)Math.round(abLine*1)/1;
				double acRounded = (double)Math.round(acLine*1)/1;
				double adRounded = (double)Math.round(adLine*1)/1;
				double bcRounded = (double)Math.round(bcLine*1)/1;
				double bdRounded = (double)Math.round(bdLine*1)/1;
				double cdRounded = (double)Math.round(cdLine*1)/1;

				if (((double)Math.round(eY*1)/1)==abRounded && ((double)Math.round(eY*1)/1)==cdRounded) {
					if (blueCount==blueX.length) {
					   int newSize = blueCount+1;
					   double[] temp = new double[newSize];
					   System.arraycopy(blueX, 0, temp, 0, blueX.length);
					   blueX = temp;
	   				}
					if (blueCount==blueY.length) {
					   int newSize = blueCount+1;
					   double[] temp = new double[newSize];
					   System.arraycopy(blueY, 0, temp, 0, blueY.length);
					   blueY = temp;
	   				}
					blueX[blueCount] = ((double)Math.round(eX*1)/1);
					blueY[blueCount] = ((double)Math.round(eY*1)/1);
					blueCount++;
					System.out.println("blueCount = "+blueCount);
				} else if (((double)Math.round(eY*1)/1)==acRounded && ((double)Math.round(eY*1)/1)==bdRounded) {
					if (blueCount==blueX.length) {
					   int newSize = blueCount+1;
					   double[] temp = new double[newSize];
					   System.arraycopy(blueX, 0, temp, 0, blueX.length);
					   blueX = temp;
	   				}
					if (blueCount==blueY.length) {
					   int newSize = blueCount+1;
					   double[] temp = new double[newSize];
					   System.arraycopy(blueY, 0, temp, 0, blueY.length);
					   blueY = temp;
	   				}
					blueX[blueCount] = ((double)Math.round(eX*1)/1);
					blueY[blueCount] = ((double)Math.round(eY*1)/1);
					blueCount++;
					System.out.println("blueCount = "+blueCount);
				} else if (((double)Math.round(eY*1)/1)==adRounded && ((double)Math.round(eY*1)/1)==bcRounded && ) {
					if (blueCount==blueX.length) {
					   int newSize = blueCount+1;
					   double[] temp = new double[newSize];
					   System.arraycopy(blueX, 0, temp, 0, blueX.length);
					   blueX = temp;
	   				}
					if (blueCount==blueY.length) {
					   int newSize = blueCount+1;
					   double[] temp = new double[newSize];
					   System.arraycopy(blueY, 0, temp, 0, blueY.length);
					   blueY = temp;
	   				}
					blueX[blueCount] = ((double)Math.round(eX*1)/1);
					blueY[blueCount] = ((double)Math.round(eY*1)/1);
					blueCount++;
					System.out.println("blueCount = "+blueCount);
				}
			   }
			}
		   }
		}
	   }
	}

	for (int i=0; i<blueY.length; i++) {
	   plotPoints(asdf, Color.blue, blueX[i], blueY[i]);
	}

	System.out.println("There were "+blueY.length+" blue points found.");

   }  //end of main()

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

   public static void displayOrangeTriangles(double[] xArray, double[] yArray) {

	for (int i=0; i<yArray.length; i++) {
	   for (int j=0; j<yArray.length && j!= i; j++) {
		for (int k=0; k<yArray.length && k!=j && k!=i; k++) {
		   double slope = ((yArray[i]-yArray[j])/(xArray[i]-xArray[j]));

		   double firstHalf = (yArray[k]-yArray[i]);
		   double secondHalf = (slope*(xArray[k]-xArray[i]));

		   double roundedFirstHalf = (double)Math.round(firstHalf*100)/100;
		   double roundedSecondHalf = (double)Math.round(secondHalf*100)/100;

		   if (roundedFirstHalf!=roundedSecondHalf) {
			System.out.println("("+xArray[i]+", "+yArray[i]+") and ("+xArray[j]+", "+yArray[j]+") and ("+xArray[k]+", "+yArray[k]+")\n");
		   } else {
			System.out.println();
		   }
		}
	   }
	}

   }  //end of displayOrangeTriangles()

   public static int countOrangeTriangles(double[] xArray, double[] yArray) {

	int count = 0;

	for (int i=0; i<yArray.length; i++) {
	   for (int j=0; j<yArray.length && j!= i; j++) {
		for (int k=0; k<yArray.length && k!=j && k!=i; k++) {
		   double slope = ((yArray[i]-yArray[j])/(xArray[i]-xArray[j]));

		   double firstHalf = (yArray[k]-yArray[i]);
		   double secondHalf = (slope*(xArray[k]-xArray[i]));

		   double roundedFirstHalf = (double)Math.round(firstHalf*100)/100;
		   double roundedSecondHalf = (double)Math.round(secondHalf*100)/100;

		   if (roundedFirstHalf!=roundedSecondHalf)
			count++;
		}
	   }
	}

	return count;

   }  //end of countOrangeTriangles()

}  //end of class e
































