package problem5;

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of n::");  //input parameters 
		int n=scn.nextInt();
		Vertical(n*10);                                //function called

	}

	public static int Vertical(int n)
	{
		if(n<10) {return n;}   //base case
		else
		{
			
			int c=Vertical(n/10);  //general case
			System.out.println(c);
			return n%10;
			
		}
		
	}
}
