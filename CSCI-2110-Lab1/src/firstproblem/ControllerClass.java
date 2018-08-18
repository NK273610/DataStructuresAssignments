package firstproblem;

import java.util.Scanner;

public class ControllerClass  {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn=new Scanner(System.in);
		
		Rectangle Rgiven= new Rectangle(10,5,3,3);                   //constructor called in Rectangle class
		int xp,yp,heigh,widt;                                       //local variables created for heigh,width,x-position,y-position
		
		System.out.println("Enter xposition for new rectangle");    //inputs taken from user
		 xp=scn.nextInt();
		
		System.out.println("Enter yposition for new rectangle");
		yp=scn.nextInt();
		
		System.out.println("Enter height for new rectangle");
		heigh=scn.nextInt();
		
	    System.out.println("Enter width for new rectangle");
	    widt=scn.nextInt();
	    
	    Rectangle rnew=new Rectangle();                             //new object for Rectangle class created
	    rnew.setXpos(xp);
	    rnew.setYpos(yp);
	    rnew.setHeight(heigh);
	    rnew.setWidth(widt);
	    
	    boolean result=Rgiven.contains(rnew);                       //contains method called
	    
	    boolean result2=Rgiven.touches(rnew);                       //touches method called
	    System.out.println(result);                                 //result shown on screen
		
	    System.out.println(result2);
		
		

	}

}
