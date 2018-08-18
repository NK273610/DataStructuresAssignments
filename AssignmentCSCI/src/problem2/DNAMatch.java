package problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DNAMatch {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		long startTime = 0;	                                                              //starttime,endtime and executiontime variables declared
		long endTime, executionTime = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");                             //Enter filename to read from
		String filename = keyboard.nextLine();
		File file = new File(filename+".txt");
		Scanner inputFile = new Scanner(file);
		System.out.println("Enter the sub-string : ");                                     //Enter the substring
		String substr=keyboard.next();
		int lenSub=substr.length();                                                         //calculate length of substring
		int count=0, k=0,scount=0;;
		
		while(inputFile.hasNextLine())
		{
			String s=inputFile.nextLine();                                               //file read line by line
			startTime = System.currentTimeMillis();
			                                                                             //include the code snippet (or call to the method) here
			for(int i=0;i<s.length();i++)
			{
				if(count>0) {k++;} else {k=0;}
					for( int j=k;j<lenSub;j++)
					{
						if(substr.charAt(j)==s.charAt(i)) {count++;break;}
						else {count=0;break;}
					}
				if(count==lenSub) {count=0;scount=scount+1;}
				
			}
			endTime = System.currentTimeMillis();                                           //endtime calculated
			
			 executionTime += endTime - startTime;                                          //executiontime time calculated
	}
		if(scount>0) {System.out.println("The substring was found in main time "+scount);}
		else {System.out.println("The substring was not found ");}
		System.out.println("Execution time---"+executionTime);
		                                                          //display executionTime

	}

}
