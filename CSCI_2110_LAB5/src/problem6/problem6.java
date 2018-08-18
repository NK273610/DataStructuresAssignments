package problem6;

import java.util.Scanner;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of no for count down::");
		int n=scn.nextInt();                                         //input parameters 
		System.out.println(Squares(n));                              //method called 

	}

	public static int Squares(int n)
	{
		int x=0;
		
		if(n==1) {return 1; }            //base case
		else {
			
			return x=(int) (Math.pow(n, 2)+Squares(n-1)); //general case
			
		}
		
		
	}
}
