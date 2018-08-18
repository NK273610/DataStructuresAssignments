package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MatrixPathA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startx=0,starty=0;                                                         //start variables declared and initialized with zero
		int endx,endy;                                                                 //end variables declared 
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the matrix size :");                                 //enter the size of matrix
		endx=endy=scn.nextInt();                                                       //end variables initialized with matrix size                                     
		long startTime, endTime, executionTime;                                        //startTime,endTime and executionTime initialized 
		startTime = System.currentTimeMillis();                                        //current time method called
		
		
		List <String> str=MatrixPathA.getPaths(startx, starty, endx, endy);             //function to get paths called
		System.out.println(str);                                                       //printing paths
		endTime = System.currentTimeMillis();                                          //current time function called
		executionTime = endTime - startTime;                                           //execution time calculated and printed
		System.out.println("Execution time --"+executionTime);                         
		                                                                                     //display executionTime
		
	}
	
	public static List getPaths(int startx,int starty,int endx,int endy)                     //getPaths function called
	{
		List<String> str1 = new ArrayList<String>(), str2 = new ArrayList<String>();          //two ArrayList of type string created
		
		//end point condition-1
		if(startx==endx && starty==endy-1)
		{
			return new ArrayList<String>(Arrays.asList(new String[] {"N"}));	
		}
		//end point condition-2
		else if(startx==endx-1 && starty==endy)
		{
			return new ArrayList<String>(Arrays.asList(new String[] {"E"}));
		}
		
		
		//go 1 step east
		if(startx<endx) {
			
			str1 = getPaths(startx+1,starty,endx,endy);
			for(int i = 0;i<str1.size(); i++)
				str1.set(i, "E"+str1.get(i));
		}
		//go 1 step north
		if(starty<endy) {
			str2 = getPaths(startx,starty+1,endx,endy);
			for(int i = 0;i<str2.size(); i++)
				str2.set(i, "N"+str2.get(i));
		}
		
		
		str1.addAll(str2);
		
		return str1;
	}

}
