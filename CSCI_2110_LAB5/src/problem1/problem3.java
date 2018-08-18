package problem1;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no::-");
		int x=scn.nextInt();
		System.out.println("Enter the value of power::-"); //input parameters x and n
		int n=scn.nextInt();
		int ans=pow(x,n);                                //method pow called
		System.out.println("the answer is  "+ans);
		
	}

	public static int pow(int x,int n)
	{
		if(n==0) {return 1;}   //base case
		else
		{
			return x*pow(x,n-1);  //general case
		}
	}
}
