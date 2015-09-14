//Tara Moses
//Assignment 2, Exercise 2.6
//32nd Try

public class FShapes {

   public static void main(String[] args) {

	Turtle asdf = new Turtle(); //asdf is the name of my new turtle! (shut up. I was always bad at names ;__;)
	asdf.hide();  //Hides the turtle. It looked tacky, anyways.
	
	asdf.up();  //Makes turtle stop drawing. (all these lines set up to draw an F)
	asdf.right(180);  //turtle turns to the right 180 degrees
	asdf.forward(180);  //turtle goes forward 180 pixels
	asdf.down();  //turtle commences drawing

	asdf.forward(20);  //These lines draw an F
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(100);  //turtle goes forward 100 pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(60);  //turtle goes forward that many pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(40);  //turtle goes forward that many pixels
	asdf.left(90);  //turtle turns left 90 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.left(90);  //turtle turns left 90 degrees
	asdf.forward(40);  //turtle goes forward that many pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(40);  //turtle goes forward that many pixels
	asdf.left(90);  //turtle turns left 90 degrees
	asdf.forward(40);  //turtle goes forward that many pixels

	asdf.up();  //These lines set up to draw a T
	asdf.left(90);  //turtle turns left 90 degrees
	asdf.forward(80);  //turtle goes forward that many pixels
	asdf.down();  //turtle draws

	asdf.left(90);  //These lines draw a T
	asdf.forward(80);  //turtle goes forward that many pixels
	asdf.left(90);  //turtle turns left 90 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(60);  //turtle goes forward that many pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.left(90);  //turtle turns left 90 degrees
	asdf.forward(80);  //turtle goes forward that many pixels
	asdf.right(90);  //turtle turns right 90 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
		
	asdf.up();  //turtle lifts tail to stop drawing
	asdf.setPosition(-40,100);  //turtle goes to those coordinates
	asdf.down();  //turtle commences drawing
	
	asdf.setPosition(-22.367,0);  //turtle goes to those coordinates
	asdf.right(180);  //turtle turns right 180 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.setPosition(6.449,50);  //turtle goes to those coordinates
	asdf.setPosition(15.265,0);  //turtle goes to those coordinates
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.setPosition(52.898,100);  //turtle goes to those coordinates
	asdf.right(180);  //turtle turns right 180 degrees
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.setPosition(25.265,56.711);  //turtle goes to those coordinates
	asdf.setPosition(17.632,100);  //turtle goes to those coordinates
	asdf.forward(20);  //turtle goes forward that many pixels
	asdf.setPosition(-10.271,56.711);  //turtle goes to those coordinates
	asdf.setPosition(-20,100);  //turtle goes to those coordinates
	asdf.forward(20);  //turtle goes forward that many pixels

   }  //end of main

}  //end of class FShapes