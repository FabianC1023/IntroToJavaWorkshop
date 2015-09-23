package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class multicolorsquare {
	public static void main(String[] args) {
		Robot Fabian = new Robot ();
		for (int i = 0; i < 100; i++) {
			Fabian.penDown();
			Fabian.setRandomPenColor();
			Fabian.setSpeed(10000);
			Fabian.setPenWidth(20);
			for (int j = 0; j < 4; j++) {
				Fabian.move(100);
				Fabian.turn(90);
				Fabian.move(50);
			}
			
			}
			
		}}
				
	

	
