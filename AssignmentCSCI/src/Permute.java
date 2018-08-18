import java.util.Arrays;
import java.util.Scanner;

public class Permute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of an array");
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		Permute(arr,0);
		
	}
	public static void Permute(int[] arr,int start)
	{
		int x=arr.length;
		if(start==arr.length)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+",");
			}
			System.out.println("");
		}
		
		for(int index=start;index<arr.length;index++)
		{
			System.out.println(arr[index]+"&&&&&&");
			int y=arr[index];
			System.out.println("*******"+y);
			arr[index]=arr[start];
			System.out.println(arr[index]+"((((");
			arr[start]=y;
			System.out.println(arr[start]+"??????");
		    Permute(arr,start+1);
		    System.out.println(arr[index]+"^^^^^^");
		    y=arr[index];
		    System.out.println(y+"----------");
			arr[index]=arr[start];
			System.out.println(arr[start]+"%%%%%%%");
			arr[start]=y;
		}
		
		
	}
	

}
