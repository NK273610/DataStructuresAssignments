package problem1;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		for(int i=0; i<=20; i++){ System.out.print(fib(i) +" "); }             //to print fibonacci series upto 20 numbers as given in question

		

	}

	public static int fib(int n)
	{
		int sum=0;
		if (n==0) {return 0;}//base case
		if (n==1) {return 1;}//base case
		else { return fib(n-1) + fib(n-2); //general case
		}
	}
}
