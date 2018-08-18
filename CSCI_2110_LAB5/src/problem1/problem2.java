package problem1;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		for(int i=1;i<=10;i++)                                       // to print factorial of 10 numbers as given in question
		{
			int fact=Factorial(i);
			System.out.println("The factorial of "+i+" is---  "+fact);
			
		}
		}
		
		
		

	
	public static int Factorial(int n)
	{
		if(n==1) {return 1;} //base case
		else
		{
			return n* Factorial(n-1); //eneral case
		}
	}

}
