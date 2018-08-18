package fourthproblem;

import java.util.Scanner;

public class BinaryProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of n-");                                           //Enter the value of n for binary no
		long startTime,endTime,executionTime;
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		startTime=System.currentTimeMillis();
		BinaryProb.BinaryNo(n);                                                                //BinaryNo function called
		endTime=System.currentTimeMillis();
		System.out.println("The code is executed in : "+(executionTime=endTime-startTime));    //Execution time calculated and printed
		

	}
	public static void BinaryNo(int n)                                                         //BinaryNo function created
	{
            for(int i=0;i<Math.pow(2, n);i++)
			
		{
			
			String sb = Integer.toBinaryString(i);
		
		}
	}

}
