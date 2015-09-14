//Tara Moses
//Assignment 5, Exercise 5.3
//29th Try

/*
 *This program generates 20 dots randomly on the canvas. The turtle
 *can be moved around using the "wasd" arrow-key setup. if the turtle
 *touches a dot, it will die.
 */

public class CSuicide {

   /**
    *This method generates 20 random dots and allows the user to move
    *the turtle around. Kills the turtle if it touches a dot. Turtle
    *will move forward slowly when no keys are pressed.
    */

   public static void main(String[] args) {

	Turtle asdf = new Turtle();
	asdf.setCanvasSize(500,500);

	asdf.onKey("up", "w");  //
	asdf.onKey("down", "s");  //  these keys allow the user to move the turtle
	asdf.onKey("left", "a");  //
	asdf.onKey("right", "d");  //

	int[] xArray = new int[20];  //x-coordinate for dots
	int[] yArray = new int[20];  //y-coordinate for dots
	int[] sizeArray = new int[20];  //radius size for dots

	for (int i=0; i<20; i++) {  //plot 20 random dots
	   int randomX = (int)(400*Math.random()-201);
	   int randomY = (int)(400*Math.random()-201);
	   int randomSize = (int)(10*Math.random()+5);

	   asdf.hide();
	   asdf.penColor(java.awt.Color.red);
	   asdf.up();
	   asdf.setPosition(randomX, randomY);
	   asdf.down();
	   asdf.width(randomSize);
	   asdf.dot();
	   asdf.up();
	   asdf.home();

	   xArray[i] = randomX;  //add characteristic of each dot to their respective arrays
	   yArray[i] = randomY;
	   sizeArray[i] = randomSize;
	}

	mainLoop: while (1==1) {
	   for (int i=0; i<xArray.length; i++) {  //for every dot
		asdf.show();
		asdf.forward(1);

		if (asdf.distance(xArray[i], yArray[i])<=(sizeArray[i]*3)) {  //if turtle touches a dot
		   asdf.hide();  //turtle disappears ("dies")
		   break mainLoop;  //game over
		}
	   }
	}

	System.out.println("You killed that poor, defenseless turtle.");  //just letting you know what your cruel hand has accomplished, you monster.

   }  //end of main()

   /**
    *This method makes the turtle go up 10 pixels
    *when user presses "w".
    */

   public static void up(Turtle asdf) {
	asdf.down();
	asdf.width(1);
	asdf.penColor(java.awt.Color.black);
	double direction = asdf.getDirection();
	while (direction != 90.0) {  //while the turtle IS NOT facing up (90 degrees), turn left 90 degrees and then recalculate the direction
	   asdf.left(90);
	   direction = asdf.getDirection();
	}
	asdf.forward(10);
   }  //end of up()

   /**
    *This method makes the turtle go down 10 pixels
    *when user presses "s".
    */

   public static void down(Turtle asdf) {
	asdf.down();
	asdf.width(1);
	asdf.penColor(java.awt.Color.black);
	double direction = asdf.getDirection();
	while (direction != 270.0) {  //while turtle IS NOT facing down (270 degrees), turn left 90 degrees and then recalculate direction
	   asdf.left(90);
	   direction = asdf.getDirection();  //while turtle is facing down, go forward 10 pixels
	}
	asdf.forward(10);
   }  //end of down()

   /**
    *This method makes the turtle go left 10 pixels
    *when user presses "a".
    */

   public static void left(Turtle asdf) {
	asdf.down();
	asdf.width(1);
	asdf.penColor(java.awt.Color.black);
	double direction = asdf.getDirection();
	while (direction != 180.0) {  //while turtle IS NOT facing left (180 degrees), turn left 90 degrees and then recalculate direction
	   asdf.left(90);
	   direction = asdf.getDirection();
	}
	asdf.forward(10);
   }  //end of left()

   /**
    *This method makes the turtle go right 10 pixels
    *when user presses "d".
    */

   public static void right(Turtle asdf) {
	asdf.down();
	asdf.width(1);
	double direction = asdf.getDirection();
	while (direction != 0.0) {  //while turtle IS NOT facing right (0 degrees), turn left 90 degrees and then recalculate direction
	   asdf.left(90);
	   direction = asdf.getDirection();
	}
	asdf.forward(10);
   }  //end of right()

}  //end of class CSuicide