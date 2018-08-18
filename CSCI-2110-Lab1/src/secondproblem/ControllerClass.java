package secondproblem;

import java.util.Scanner;

import firstproblem.Rectangle;

public class ControllerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
		
		Circle Cgiven=new Circle(3,4,5);                               //default constructor called in CIrcle
		int xp,yp,radi;
		
		System.out.println("Enter xposition for new Circle");          //Enter the values of x-position,y-position,radius
		 xp=scn.nextInt();
		
		System.out.println("Enter yposition for new Circle");
		yp=scn.nextInt();
		
		System.out.println("Enter radius for new Circle");
		radi=scn.nextInt();
		
		Circle Cnew=new Circle();                                       //new Circle object created
		Cnew.setXcordinate(xp);
		Cnew.setYcordinate(yp);
		Cnew.setRadius(radi);
		                                                                //contains and touches function called in Circle class
		boolean result=Cgiven.contains(Cnew);
		boolean result2=Cgiven.touches(Cnew);
		
		System.out.println(result);                                     //result shown on screen
		System.out.println(result2);
		
	}

}
