package _01_houses;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	static int movement = 0;
	static String size;
	static String roof;
	static Random ran = new Random();
	static int real;

	public static void main(String[] args) {
		rob.setSpeed(70);
		rob.setX(0);
		rob.setY(600);
		rob.miniaturize();
		rob.penDown();
		// first house
		rob.setRandomPenColor();
		rob.turn(90);
		rob.move(30);
		rob.turn(-90);
		rob.move(100);
		drawPointyRoof();
		rob.move(100);
		rob.setAngle(0);
		//
for (int i = 0; i < 22; i++) {
	

		real = ran.nextInt(3);

rob.setRandomPenColor();
			if (real == 0) {
				movement = 60;
			} else if (real == 1) {
				movement = 120;
			} else if (real == 2) {
				movement = 250;
			}
			run();
}
	}

	private static long nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	static public void run() {
		
		rob.turn(90);
		rob.move(30);
		rob.turn(-90);
		rob.move(movement);
		if (real == 2) {
			
			drawPointyRoof();
		}
		if (real == 1 ) {
			
			drawFlatRoof();
			
		}
		if (real == 0 ) {
		
			drawFlatRoof();
		}
		
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
