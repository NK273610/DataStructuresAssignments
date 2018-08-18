package problem1;

public class Prob1Controller 
{
	
	
	public static void main(String[] args)
	{
	Point<Integer> point1 = new Point<Integer>(10,20);    //Constructors in generic class called
	Point<Double> point2 = new Point<Double>(14.5, 15.6); //Constructors in generic class called
	Point<String> point3 = new Point<String>("topleftx",  //Constructors in generic class called
	"toplefty");
	System.out.println(point1);                            
	System.out.println(point2);
	System.out.println(point3);
	}
	
}


