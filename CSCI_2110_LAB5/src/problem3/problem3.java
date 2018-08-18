package problem3;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the value of no for count down::");    //input parameters 
			int n=scn.nextInt();
			countDown(n);                                                   //method called
	}
		public static void countDown(int n)
		{
			String s="";
			if(n<=2) {s="Blast-OFF !";}                            //base case
			if(n<=0) {return;}                                     //base case
			if(n%2==0) {System.out.print(n+","+s);countDown(n-2);} //base case
			else
			{
				System.out.print(n+","+s);countDown(n-2);          //general case
			}
		}

}
