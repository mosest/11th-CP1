//Tara Moses
//Assignment 4, Exercise 4.2
//51st Try

/*
 *This program is designed to draw a star wherever the user clicks
 *the mouse. Stars are of different sizes, colors, and are rotated
 *differently each time.
 */

import java.awt.Color;

public class BStarryNight {

   static double x;
   static double y;

   /**
    *This subroutine sets the background color to black and runs a continuous
    *loop that checks to see whether any mouse button is pressed. If it is, run
    *subroutine drawStar(). If it is not, print out an empty string.
    */

   public static void main(String[] args) {

	Turtle asdf = new Turtle();  //this turtle isn't for drawing; it just checks for mouse clicks
	asdf.hide();  //Turtle is hidden because turtle looks tacky.
	asdf.bgcolor(Color.black);  //background set to black

	while (1==1) {  //keep running until program is closed
	   if (asdf.mouseButton()) {  //if the mouse is clicked
		drawStar();  //draw a star
	   } else {  //if mouse is not clicked
		System.out.print("");  //print empty string
	   }  //end of if-else statement
	}  //end of while-loop	
	
   }  //end of main

   /**
    *Subroutine drawStar() uses a turtle to draw stars on the canvas wherever
    *the user clicks. Certain aspects of each star, such as outline color,
    *angle of rotation, and size, are decided randomly.
    */

   public static void drawStar() {

	Turtle asdf = new Turtle();  //create a new turtle (for drawing this time)
	asdf.hide();  //hide the turtle because it looks tacky (and also, turtles don't belong in the night sky)
	
	x = asdf.canvasX(asdf.mouseX());  //take the X coordinate of the mouse and change them into coordinates of the canvas
	y = asdf.canvasY(asdf.mouseY());  //take the X coordinate of the mouse and change them into coordinates of the canvas

	int length = (int)(25*Math.random()+6);  //this randomly decides the arm length of each star
	int randomAngle = (int)(361*Math.random());  //this randomly decides the angle of rotation of each star
	int randomNumber = (int)(7*Math.random());  //this randomly decides the outline color of each star
	java.awt.Color randomColor = Color.green;  //initialize outline color
	
	if (randomNumber==0) {  //randomly decides outline color of each star using randomNumber above
	   randomColor = Color.magenta;
	} else if (randomNumber==1) {
	   randomColor = Color.blue;
	} else if (randomNumber==2) {
	   randomColor = Color.cyan;
	} else if (randomNumber==3) {
	   randomColor = Color.yellow;
	} else if (randomNumber==4) {
	   randomColor = Color.green;
	} else if (randomNumber==5) {
	   randomColor = Color.white;
	} else if (randomNumber==6) {
	   randomColor = Color.pink;
	}   

	asdf.up(); //don't draw while you're getting to the point where the mouse is
	asdf.penColor(randomColor);  //set outline color using randomColor above
	asdf.setPosition(x,y);  //turtle goes to where the mouse is
	asdf.right(randomAngle);  //set angle of rotation using randomAngle above
	asdf.forward(length/2);  //everything from here down is just drawing the star
	asdf.down();
	asdf.left(54);
	asdf.forward(length);
	asdf.right(216);
	asdf.forward(length);
	asdf.right(72);
	asdf.forward(length);
	asdf.right(216);
	asdf.forward(length);
	asdf.right(72);
	asdf.forward(length);
	asdf.right(216);
	asdf.forward(length);
	asdf.right(72);
	asdf.forward(length);
	asdf.right(216);
	asdf.forward(length);
	asdf.right(72);
	asdf.forward(length);
	asdf.right(216);
	asdf.forward(length);

   }  //end of drawStar()

}  //end of BStarryNight