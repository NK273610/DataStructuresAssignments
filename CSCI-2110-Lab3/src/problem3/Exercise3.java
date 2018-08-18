package problem3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise3 {
	public static void main(String[] args)throws IOException{
		//TODO: Create stack1 to hold StudentRecord objects
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();                                            //Enter filename from which we have to read file
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);                                            //Scanner object created to read from file
		StringTokenizer token;
		GenericStack<StudentRecord> stack1=new GenericStack<StudentRecord>();              //Object created for StudentRecord class
		
		while (inputFile.hasNext())                                                        
		{
		String line = inputFile.nextLine();                                                 //File lines taken into string
		token = new StringTokenizer(line, " ");
		String f = token.nextToken();
		String l = token.nextToken();
		String bString = token.nextToken();
		
		//TODO: Convert bString to an Integer object
		int bid=Integer.parseInt(bString);                                                  //String converted to integer
		                                                                                   //Create a StudentRecord object with the first name, last name and
		StudentRecord sturec=new StudentRecord();
		sturec.setFirstname(f);
		sturec.setLastname(l);
		sturec.setBannerId(bid);
		
		                                                                                    //ID number, push it into stack1
		stack1.push(sturec);
		}
		inputFile.close();
		
		                                                                                    //TODO: Continue with the rest of the steps 5, 6 and 7
		GenericStack<String>stack2=new GenericStack<String>();                              //Stack2 object of type String is created 
	    while(stack1.isEmpty()==false)
		{
	    	StudentRecord s1=stack1.pop();                                                  //pop method called to remove from stack1
	    	stack2.push(s1.getLastname());                                                  //push method called to add lastname to stack2
		}
		
	    while(stack2.isEmpty()==false)
		{
	    	System.out.println(stack2.pop());                                               //pop method called for stack
		}
	}
	
}
