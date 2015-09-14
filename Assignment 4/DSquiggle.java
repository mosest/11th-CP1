//Tara Moses
//Assignment 4, Exercise 4.4
//34th Try

/*
 *YOU HAVE TO SET HOW BIG YOU WANT THE WINDOW FIRST. (OTHERWISE IT WON'T RUN.)
 *This program draws a squiggly line using Turtle.
 */

import java.util.Scanner;

public class DSquiggle {

   /**
    *This subroutine lets the user set the canvas size and runs
    *goRandomDirection(). If the turtle is past the boundaries
    *of the box, go to (0,0) and run goRandomDirection().
    */

   public static void main(String[] args) {

	Turtle asdf = new Turtle();  //this turtle draws the squiggly line
	Scanner scan = new Scanner(System.in);

	System.out.print("How wide (in pixels) would you like the window to be? ");
	int x = scan.nextInt();  //user sets width of window
	System.out.print("How tall (in pixels) would you like the window to be? ");
	int y = scan.nextInt();  //user sets height of window

	asdf.setCanvasSize(x,y);  //canvas is set to user-designated size

	while (1==1) {  //keep running forever
	   if (asdf.getX()>=(x/2) || asdf.getX()<=-(x/2) || asdf.getY()>=(y/2) || asdf.getY()<=-(y/2)) {  //if turtle hits edge of window
		asdf.up();  //stop drawing
		asdf.home();  //go to (0,0)
		asdf.down();  //start drawing again
	   } else {  //if turtle hasn't hit edge of window yet
		goRandomDirection(asdf);  //keep drawing squiggle line
	   }
	}  //end of while-loop

   } //end of main

   /**
    *Subroutine goRandomDirection() faces the turtle in a random
    *direction and then moves it forward 10 pixels.
    */

   public static void goRandomDirection(Turtle t) {

	int randomAngle = (int)((360*Math.random())+1);  //choose a random angle for the turtle to be pointed

	t.right(randomAngle);  //turtle goes right a random number of degrees
	t.forward(10);  //turtle goes forward 10 pixels

   }  //end of goRandomDirection()

}  //end of class DSquiggle