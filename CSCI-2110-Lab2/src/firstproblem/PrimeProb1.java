package firstproblem;

import java.util.Scanner;

public class PrimeProb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter position of prime no");      //Enter position at which you want prime no
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		long startTime, endTime, executionTime;    
		startTime = System.currentTimeMillis();                //start time of program
		long p=PrimeProb1.getPrime(x);                         //get prime function called 
		System.out.println("The prime no is :"+p);             //printed prime no at position
		endTime = System.currentTimeMillis();                  //end time of program
		executionTime = endTime - startTime;                   //execution time calculated
		System.out.println("executionTime -"+executionTime);   //printed execution time
			
		}
	public static long getPrime(int x)                         //getPrime function 
	{
		int[] arr=new int[x];
		int count=1;
		arr[0]=2;
		int inPrime=3;
		while(count<x)
		{boolean prime=true;
			for(int j=2;j<=inPrime/2;j++)
			{
				if(inPrime%j==0) 
				{
					prime=false;
				    break;
				}
				
			}
			if(prime==true)
				   
			{
				arr[count]=(int) inPrime;
				count++;
			}
			inPrime++;
		}
		return arr[count-1];
	}
}
