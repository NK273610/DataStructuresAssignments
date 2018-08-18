package firstproblem;

import java.util.Scanner;

public class PrimeTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter position of prime no");
		Scanner scn=new Scanner(System.in);
		for(int x = 10;x<=10000;x+=1)
		{
			long startTime, endTime, executionTime;
			startTime = System.currentTimeMillis();
			long p=PrimeProb1.getPrime(x);
			endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;
			System.out.printf("%d\t%d\t%d\n",x,p,executionTime);
		}
		
					
		

	}
	public static long getPrime(int x)
	{
		int[] arr=new int[x];
		int count=1;
		arr[0]=2;
		int inPrime=3;
		while(count<x)
		{
			boolean prime=true;
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
