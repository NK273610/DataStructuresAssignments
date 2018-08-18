package test;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the length of an array---");
		int x=scn.nextInt();
		int[] arr=new int[x];
		System.out.println("Enter the values---");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
	
		System.out.println(Triangle.trainglesFormed(arr));
		
	
	}

	public static int trainglesFormed(int[] a)
	{
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int k=0,count=0;
		for(int i=0;i<a.length-2;i++)
		{
			
			k=i+2;
			for(int j=i+1;j<a.length-1;j++)
			{
			
				while(k<a.length)
				{
					
					if(a[i]+a[j]>a[k]) {count++;}
					k++;j++;
					
				}
				
			}
			
		}
		
		return count;

	}
	
}

