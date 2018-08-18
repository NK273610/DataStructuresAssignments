package problem2;

import java.util.Scanner;

public class StringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the String : ");                               //Enter the main string
		String str= scn.next();
		
		System.out.println("Enter the sub-string : ");                           //Enter sub string
		String substr=scn.next();
		
		int lenStr=str.length();                                                 //calculate lengths of string and sub string
		int lenSub=substr.length();
		int count=0, k=0,scount=0;;                                              //initialized variables used
		
		if(lenSub>lenStr) {System.out.println("Not valid substring has more characters ");}                    
		else
		{
		
			for(int i=0;i<lenStr;i++)
			{
				if(count>0) {k++;} else {k=0;}
					for( int j=k;j<lenSub;j++)
					{
						if(substr.charAt(j)==str.charAt(i)) {count++;break;}
						else {count=0;break;}
					}
				
				if(count==lenSub) {count=0;scount=scount+1;}
				
			}
		if(scount>0) {System.out.println("The substring was found in "+str+" times "+scount);}
		else {System.out.println("The substring was not found ");}

		
	}
	}
}
