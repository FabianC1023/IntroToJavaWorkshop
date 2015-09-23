package day1.robot;

import java.util.concurrent.ForkJoinPool;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot Fabian = new Robot ();
for (int i = 0; i < 4; i++) {
	Fabian.penDown();
	Fabian.setPenColor(255, 0, 0);
	Fabian.move(200);
	Fabian.turn(90);
}

}}