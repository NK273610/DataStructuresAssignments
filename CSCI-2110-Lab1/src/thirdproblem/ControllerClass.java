package thirdproblem;

import java.util.Scanner;

public class ControllerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] points = new double[5][2];                     //double array points created
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + points.length + " points: "); //Enter the points
		for (int i = 0; i < points.length; i++) {
		points[i][0] = input.nextDouble();
		points[i][1] = input.nextDouble();
		}
		Rectangle rect=new Rectangle();                           //new Rectangle object created
		rect.getRectangle(points);                                //getRectangle enclosing the points called
	}

}
