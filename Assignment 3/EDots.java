//Tara Moses
//Assignment 3, Exercise 3.5
//19th Try
//
//This program is designed to draw 300 dots on a turtle canvas, record how many dots are 
//within a 200-pixel radius, and then use that number to estimate pi. Blue dots are within
//200-pixel radius, black dots are not.

import java.awt.*;

public class EDots {

   public static void main(String[] args) {
	
	Turtle asdf = new Turtle();  //my turtle's name is asdf because it's easy to type

	int countBlue = 0;  //counts the number of blue dots (dots within 200-pixel radius) drawn
	for (int countTotal = 0; countTotal < 300; countTotal++) {
	   
	   int x = (int)((Math.random()*400)-200);  //creates random x values
	   int y = (int)((Math.random()*400)-200);  //creates random y values

	   asdf.penColor(Color.black);  //turtle draws dots black
	   asdf.up();  //turtle isn't able to draw
	   asdf.setPosition(x,y);  //turtle goes to random point (stated above)
	   asdf.down();  //turtle is able to draw
	   
	   if (asdf.distance(0,0) <= 200) {  //if the point is within 200 pixels
		asdf.penColor(Color.blue);  //turtle draws dots blue
		countBlue++;  //add one to the blue dot counter
	   }
	   
	   asdf.dot();  //draw the actual dot

	}

	double blueCount = countBlue;  //change integer countBlue to double blueCount
	double pi = ((blueCount)/300)*4;  //calculate pi using the blue dot counter
	System.out.print(pi);  //display pi in command prompt

   }  //end of main

}  //end of program EDots