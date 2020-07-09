package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.setSpeed(70);
		rob.setX(0);
		rob.setY(600);
		rob.miniaturize();
		rob.penDown();
		
		for (int i = 0; i < 22; i++) {
			rob.setRandomPenColor();
			run();
			rob.setRandomPenColor();
			smol();
			rob.setRandomPenColor();
			chonk();
			rob.setRandomPenColor();
		}

	}

	static public void run() {
		rob.turn(90);
		rob.move(30);
		rob.turn(-90);
		rob.move(60);
		rob.turn(90);
		rob.move(10);
		rob.turn(90);
		rob.move(60);
		rob.setAngle(0);
		
	}
	static public void smol() {
		rob.turn(90);
		rob.move(30);
		rob.turn(-90);
		rob.move(120);
		rob.turn(90);
		rob.move(10);
		rob.turn(90);
		rob.move(120);
		rob.setAngle(0);
		
	}
	static public void chonk() {
		rob.turn(90);
		rob.move(30);
		rob.turn(-90);
		rob.move(250);
		rob.turn(90);
		rob.move(10);
		rob.turn(90);
		rob.move(250);
		rob.setAngle(0);
		
	}
}
