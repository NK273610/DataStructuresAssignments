package problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OrderListDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		OrderedList<String> list1 = new OrderedList<String>();               //list1 created of type String of OrderedList class
		OrderedList<String> list2 = new OrderedList<String>();                ////list2 created of type String of OrderedList class
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the file name to be read from : ");          //enter file name to be read from
		String f1 = keyboard.next();                                           //filename is in f1            

		File file1 = new File(f1);                                             //file object of File created and f1 passed to it

		Scanner input = new Scanner(file1);                                    //file read and elements inserted in list1
		while (input.hasNext()) {
			String s = input.nextLine();
			list1.insert(s);

		}

		System.out.println("Enter he file name to be read from: ");              //enter file name to be read from
		String f2 = keyboard.next();
		File file2 = new File(f2);                                                //filename is in f2
		Scanner input2 = new Scanner(file2);
		while (input2.hasNext()) {                                                //file read and elements inserted in list1
			String s = input2.nextLine();
			list2.insert(s);

		}
		System.out.println("Elements in first list:---");
		list1.enumerate();                                                          //list method enumerate called
		System.out.println("Elements in second list::");
		list2.enumerate();

		OrderedList<String> list3 = OrderedList.merge(list1, list2);                 //list1 created of type String of OrderedList class and merge method called by passing list1 and list2
		System.out.println("Elements after sorting both list with two finger "
				+ "walking algorithm::");
		System.out.println(list3);                                                            //list method enumerate called

	}

}
