//Tara Moses
//Assignment 3, Exercise 3.3
//17th Try
//
//This program is designed to work like an Etch-a-Sketch(TM), except 
//instead of knobs, one uses the WASD "arrow keys" setup. Press X to clear.

public class CEtch {

   public static void up(Turtle asdf) {  //defines call routine "up"
	double direction = asdf.getDirection();
	while (direction != 90.0) {  //while the turtle IS NOT facing up (90 degrees), turn left 90 degrees and then recalculate the direction
	   asdf.left(90);
	   direction = asdf.getDirection();
	}
	asdf.forward(10);  while turtle is facing up, go forward 10 pixels
   }  //end of up

   public static void down(Turtle asdf) {  //defines call routine "down"
	double direction = asdf.getDirection();
	while (direction != 270.0) {  //while turtle IS NOT facing down (270 degrees), turn left 90 degrees and then recalculate direction
	   asdf.left(90);
	   direction = asdf.getDirection();  //while turtle is facing down, go forward 10 pixels
	}
	asdf.forward(10);
   }  //end of down

   public static void left(Turtle asdf) {  //defines call routine "left"
	double direction = asdf.getDirection();
	while (direction != 180.0) {  //while turtle IS NOT facing left (180 degrees), turn left 90 degrees and then recalculate direction
	   asdf.left(90);
	   direction = asdf.getDirection();
	}
	asdf.forward(10);  //while turtle is facing left, go forward 10 pixels
   }  //end of left

   public static void right(Turtle asdf) {  //defines call routine "right"
	double direction = asdf.getDirection();
	while (direction != 0.0) {  //while turtle IS NOT facing right (0 degrees), turn left 90 degrees and then recalculate direction
	   asdf.left(90);
	   direction = asdf.getDirection();
	}
	asdf.forward(10);  //while turtle is facing right, go forward 10 pixels
   }  //end of right

   public static void clear(Turtle asdf) {  //defines call routine "clear"
	asdf.home();  //turtle goes home (0,0)
	asdf.clear();  //turtle clears everything (Thank you for adding this, Mr. Seward! :D)
   }  //end of clear
		
   public static void main(String[] args) {
	Turtle asdf = new Turtle();
	asdf.onKey("up", "w");  //runs "up" call routine when "w" is pressed
	asdf.onKey("left", "a");  //runs "left" call routine when "a" is pressed
	asdf.onKey("down", "s");  //runs "down" call routine when "s" is pressed
	asdf.onKey("right", "d");  //runs "right" call routine when "d" is pressed
	asdf.onKey("clear", "x");  //runs "clear" call routine when "x" is pressed
   }  //end of main

}  //end of class CEtch