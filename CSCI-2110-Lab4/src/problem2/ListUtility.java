package problem2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListUtility 
{
	
	public static <T> List<T> findUnion(List<T> list1, List<T> list2){                 //method to find union of list1 and list2
		
		List<T> list3=new LinkedList<T>();                                             //new list3 object of linkedlist created
		list3.addAll(list1);                                                           //list1 added to list3
		int counter=0;                                                                 //variable counter initialized with 0
			
		while((counter<list2.size()))                                                        
		{
			T item=list2.get(counter);                                                   //item object of type T takes first value from list2                       
			if(list1.contains(item)==false)                                              //if list1 contains item
			     {list3.add(item);}                                                      //added to list3
			counter++;                                                                    //counter increment
		}
	return list3;                                                                       //return list3
}
		public static <T> List<T> findIntersection(List<T> list1, List<T> list2){         //method to find intersection of list1 and list
		
			List<T> list3=new LinkedList<T>();                                            //new list3 object of linkedlist created    
			for(int i=0;i<list1.size();i++)
			{
				if(list3.contains(list1.get(i))) {i=i+1;}                                 //if item is already presenet increment the i
				for(int j=0;j<list2.size();j++)
				{
					if(list1.get(i).equals(list2.get(j))) {list3.add(list1.get(i));break;}
					
				}
			}
			
		return list3;                                                                         //return list3
			
		}
	     public static <T> List<T> interleave(List<T> list1, List<T> list2){               //interleave method
	
			
			List<T> list3=new LinkedList<T>();                                             //new list3 object of linkedlist created
			
			list3.addAll(list1);                                                           //list1 added to list3
			int index=0;
			for(int i=0;i<list1.size();i++)
			{
				if(i%2!=0)                                                                 //check if i is even or not
				{
					
					list3.add(i, list2.get(index));                                       //if not even add item from list2 at specific index
					if(index<list2.size()-1)                                              
					   {index++;}
					else {break;}
				}
			}
			
			
			return list3;                                                                      //return list3
		}
		public static <T> List<T> chopSkip(List<T> list1){                                    //chopSkip method
		
			
			for(int i=0;i<list1.size()-1;i++)
			{
				list1.remove(i+1);
			}
			
			return list1;                                                                    //return list1
		}
	
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		List<String>list1=new LinkedList<String>();                                        //list1 and list 2 of String created 
		List<String>list2=new LinkedList<String>();
		System.out.println("Enter length of list 1 and list 2");                           //take input from user the length of list1 and list2
		int l1=scn.nextInt();
		int l2=scn.nextInt();
		System.out.println("Enter item of list1:");
		for(int i=0;i<l1;i++)                                                             //input from user for elements of lsit1
		{
			
			String lis=scn.next();
		    list1.add(lis);
		}
		System.out.println("Enter item for list2:");                                       //input from user for elements of lsit2
		for(int i=0;i<l2;i++)
		{
			String lis=scn.next();
		    list2.add(lis);
		}
		List<String> list4=ListUtility.findUnion(list1, list2);                           //findunion method called
		System.out.println(list4.toString());
		List<String> list5=ListUtility.findIntersection(list1, list2);                    //find intersection method called
		System.out.println(list5.toString());
		List<String> list6=ListUtility.interleave(list1, list2);                          //interleave method called
		System.out.println(list6.toString());
		List<String> list7=ListUtility.chopSkip(list1);                                   //chopskip method called
		System.out.println(list7.toString()); 
		
	}
	
}
