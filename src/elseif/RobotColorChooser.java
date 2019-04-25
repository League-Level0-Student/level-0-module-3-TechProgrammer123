//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot robot = new Robot();
		//3. Ask the user what color they would like the robot to draw
		
		//5. Use an if/else statement to set the pen color that the user requested
		for (int i = 0; i < 10; i++) {
			
		
			String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
if (color .equals("Blue")) {
	robot.setPenColor(0, 0, 255);
}
else if (color .equals ("Red")) {
	robot.setPenColor(255, 0, 0);
}
else if (color .equals ("Green")) {
	robot.setPenColor(0, 255, 0);
}
else {
	robot.setRandomPenColor();
	
}
robot.penDown();
robot.setSpeed(100);
robot.move(250);
robot.turn(90);
robot.move(250);
robot.turn(90);
robot.move(250);
robot.turn(90);
robot.move(250);
robot.turn(90);
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		robot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
robot.penDown();
robot.setSpeed(100);

	}
}
