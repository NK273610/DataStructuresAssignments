package test;

import java.util.Scanner;

public class Prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no---");
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		char[] arr=str.toCharArray();
		
		int maxin;
		for(int i=1;i<str.length();i++)
		{
			if(arr[i]>arr[0]) {maxin=arr[0];arr[0]=arr[i];arr[i]=(char) maxin;break;}
		}
		

		

		
		System.out.println(arr);

	}

}
