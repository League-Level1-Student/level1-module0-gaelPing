package _01_houses;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	static int movement = 0;
	static String size;
	static String roof;
 static Random ran= new Random();
	public static void main(String[] args) {
		rob.setSpeed(70);
		rob.setX(0);
		rob.setY(600);
		rob.miniaturize();
		rob.penDown();
		//first house
//		rob.turn(90);
//		rob.move(30);
//		rob.turn(-90);
//		rob.move(100);
//		drawPointyRoof();
//		rob.move(100);
//		rob.setAngle(0);
//		//
		
		
		
	for (int i = 0; i < 22; i++) {

//
//			if (ran.equals(0)) {
//				movement = 60;
//			} else if (ran.equals(1)) {
//				movement = 120;
//			} else if (ran.equals(2)) {
//				movement = 250;
//			}
//			run();
//
		}

	}

	static public void run() {
		rob.turn(90);
		rob.move(30);
		rob.turn(-90);
		rob.move(movement);
 if (roof.equals("pointy")) {
			drawPointyRoof();
		}
//		if () {
//			drawFlatRoof();}
		rob.move(movement);
		rob.setAngle(0);

	}

	static public void drawPointyRoof() {
		rob.turn(45);
		rob.move(10);
		rob.turn(90);
		rob.move(10);
		rob.turn(45);

	}

	static public void drawFlatRoof() {
		rob.turn(90);
		rob.move(10);
		rob.turn(90);
	}
}
