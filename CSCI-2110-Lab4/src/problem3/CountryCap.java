package problem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CountryCap {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);                    
		String country,captial;                                                                   //String capital and country 
		List<Captial> caplist=new LinkedList<Captial>();                                          //new linkedlist object of Captial type created
		File file = new File("CountriesCapitals.txt");                                            //file to read specified
		Scanner inputFile = new Scanner(file);                                                    //scanner object to input from file created
		
		
		while(inputFile.hasNext())                                                                //file read
		{
			country=inputFile.nextLine();                                                         //input read from file line by lne and placed in string captal and country
			captial=inputFile.nextLine();
			Captial cap=new Captial();                                                           //new cap object of Capital type created
			cap.setCountry(country);
			cap.setCapital(captial);                                                             //values set in cap object
			
			caplist.add(cap);                                                                    //object added to caplist
			
		}
		inputFile.close();
		
		System.out.println("Welcome to Country Capital Quiz: Play?");                            
		String ans=scn.next();
		int len = caplist.size();
		
		Random randomgenerator=new Random();                                                       //random generator object created
		boolean x=true;
		int randomint=0;
		String y=null;
		
		if(ans.equalsIgnoreCase("yes"))
		{
			while(x==true)
			{
		    randomint = randomgenerator.nextInt(len);                                               //range of random generator speified
		    
		    Captial cap2=new Captial();                                                             //new object of Capital class created
			cap2=caplist.get(randomint);                                                            //object at andom position 
			
			System.out.println("What is capital of "+cap2.getCountry());                                                  
			String ans2=scn.next();
			if(ans2.equalsIgnoreCase(cap2.getCapital()))                                             //if ans for capital is correct for any country
			{x=true;}
			else {y=cap2.getCapital(); String k;                                                     //if ans is incorrect
			System.out.println(" Sorry wrong Answer, The correct ans is :"+y+" Do you want to play again press yes: ");
			k=scn.next();
			if(k.equalsIgnoreCase("yes")) {x=true;}
			else {break;}
			}
		}
			
		}
		else
		{
			System.out.println("If you want to play please type Yes:");
		}
		System.out.println("Thanks you playing the game ");

		
	}

}
