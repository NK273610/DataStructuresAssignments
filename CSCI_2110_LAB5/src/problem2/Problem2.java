package problem2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in); 
		System.out.println("Enter the value of no for count down::");
		int n=scn.nextInt();                                           //input parameters                          
		countDown(n);                                                 //method called
		
	}
	public static void countDown(int n)
	{
		String s="";
		if(n==1) {s="Blast-Off !";}    //base case
		if(n==0) { return;}            //base case
		
		else {
			
			System.out.print(n+" "+s);  //general case
			countDown(n-1);
			
		}
		
	}

}
