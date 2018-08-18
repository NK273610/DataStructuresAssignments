   package secondproblem;

import java.util.Scanner;

public class CollatzProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);        
		System.out.println("Enter the no -");                            //Enter any no whose for Collatz series
		long startTime=0, endTime, executionTime;
		int x=scn.nextInt();
		int curr = x-1;                                                  
		startTime=System.currentTimeMillis();                            //start time of program
		int maxSteps = CollatzProb.CollatzSeries(x), maxNum = x;         //CollatzSeries function called
		while(curr>1)
		{
			int currSteps = CollatzProb.CollatzSeries(curr);
			if(currSteps>maxSteps)
			{
				maxNum = curr;
				maxSteps = currSteps;
			}
			curr--;
		}
		endTime = System.currentTimeMillis();                              //end time of program
		executionTime = endTime - startTime;                               //execution time calculated
		System.out.println("The no is : "+maxNum+" Steps-- "+(maxSteps));  //the no and max steps are printed 
		System.out.println("executionTime -"+executionTime);                //execution time printed
	}
	
	public static int CollatzSeries(int x)                                  //CollatzSeries fuction created
	{
		int count=0;
		while(x>1)
		{
			if(x%2==0) {x=x/2;count++;}
			else {x=3*x+1;count++;}
		}
		
		return count + 1;
		}

}
