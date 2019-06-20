import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		
	
		String Color = JOptionPane.showInputDialog("What color do you want to use? Red, Green, or Blue");
		if (Color .equals("Red")) {
			robot.setPenColor(255, 0, 0);
		}
		else if (Color .equals("Green")) {
			robot.setPenColor(0, 255, 0);
		}
		if (Color .equals("Blue")) {
			robot.setPenColor(0, 0, 255);
		}
		
		String shape = JOptionPane.showInputDialog("What shape do you want to use? Square,Triangle, or Circle");
	if (shape .equals ("Square")) {
		drawSquare();
	}
	else if (shape .equals ("Triangle")) {
		drawTriangle();
	}
	else if (shape .equals ("Circle")) {
		drawCircle();
	}
	}
}
static void drawSquare() {
	robot.penDown();
	robot.setSpeed(100);
	robot.move(100);
	robot.turn(90);
	robot.move(100);
	robot.turn(90);
	robot.move(100);
	robot.turn(90);
	robot.move(100);
	robot.turn(90);
	robot.move(100);
	robot.penUp();
	robot.move(100);
}
static void  drawTriangle(){
robot.penDown();
robot.setSpeed(100);
robot.move(100);
robot.turn(120);
robot.move(100);
robot.turn(120);
robot.move(100);
robot.turn(120);
robot.penUp();
robot.move(200);
}
static void  drawCircle(){
	robot.penDown();
	robot.setSpeed(100);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.turn(5);
	robot.move(10);
	robot.penUp();
	robot.turn(-90);
	robot.move(100);
}
}

