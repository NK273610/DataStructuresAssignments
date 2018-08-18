package problem4;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value of no for count down::");
		int n=scn.nextInt();
		int m=scn.nextInt();      //input parameters 
		printMultiple(n,m);       //method called

	}

	public static int printMultiple(int n,int m)
	{
		if(m==0) {return 0;}  //base case
		else {
			
			n= n+printMultiple(n,m-1);  //general case
			System.out.print(n+",");
			return n;
		}
		
	}
}
