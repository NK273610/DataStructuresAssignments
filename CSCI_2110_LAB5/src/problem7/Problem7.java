package problem7;

import java.util.Scanner;

public class Problem7 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no of dics::");
		int n=scn.nextInt();
		int count=0;
		long startTime, endTime, executionTime;
		startTime = System.currentTimeMillis();
		int k=stepsHanoi(n, 1, 3, 2);                        //method called
		endTime = System.currentTimeMillis();
		executionTime = endTime-startTime;                  //execution time calculated
		System.out.println("Total no of steps:--"+k+"  And Execution time is:--"+executionTime+" ms"); //no of steps and execution time printed
		

	}

	public static int stepsHanoi(int n,int from,int to,int temp)    //recursive method created
	{
		int c=0;
		if(n>0)                                                                     
		{
	                                       
			c=stepsHanoi(n-1,from,temp,to);                          //method called recursively 
	        System.out.println("Move disc "+n+" from peg "+from+"to peg "+to);
	        c++;
			c+=stepsHanoi(n-1,temp,to,from);
		}
		return c;
	}
	
}
