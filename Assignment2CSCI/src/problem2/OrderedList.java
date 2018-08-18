package problem2;

import java.util.ArrayList;
import java.util.Collection;

public class OrderedList<T extends Comparable<T>> {                     //generic class OrderedList

	private ArrayList<T> element;                                       //element of type ArrayList created
	private int cursor;

	public OrderedList() {                                              //default constructor called element and cursor initialized
		element = new ArrayList<T>();
		cursor = -1;
	}

	public int size() {                                                 //size method gives size of list
		return element.size();
	}

	public boolean isEmpty() {                                          //isEmpty checks if list is empty or not
		return element.isEmpty();
	}

	public int binarySearch(T item) {                                   //binary search method to search element in list
		if (element.size() == 0) {
			return -1;
		}
		int low = 0, mid = 0, hig = element.size() - 1;
		while (low <= hig) {
			mid = (low + hig) / 2;
			int c = item.compareTo(element.get(mid));
			if (c == 0) {
				return mid;
			}
			if (c > 0) {
				low = mid + 1;
			}
			if (c < 0) {
				hig = mid - 1;
			}
		}
		if (item.compareTo(element.get(mid)) < 0) {                       //compare To method called to compare objects
			return (-(mid + 1));
		} else
			return (-(mid + 2));
	}

	public void insert(T item) {                                           //insert method created to add an item to list
		if (element.size() == 0) {
			element.add(item);
			return;
		}
		int pos = binarySearch(item);
		if (pos >= 0) {
			return;
		} else {
			element.add(-(pos) - 1, item);
		}
	}

	public void enumerate() {
		System.out.println(element);                                         //Enumerate method created
	}

	public void addIndex(int index, T item) {                                //add item at any index methid created           
		element.add(index, item);
	}

	             
	public T getItem(int pos) {                                                //getItem at any index methid created
		return element.get(pos);
	}

	public static <T extends Comparable<T>> OrderedList<T> merge(OrderedList<T> list1, OrderedList<T> list2) {          //merge method created taking two list as parameter and returning list
		OrderedList<T> list3 = new OrderedList<T>();                                                                     //list3 created 
		int f1 = 0;
		int f2 = 0;

		while (f1 < list1.size() && f2 < list2.size()) {                                                                  //walking algorithm
			if (list1.getItem(f1).compareTo(list2.getItem(f2)) < 0) {
				list3.insert(list1.getItem(f1));
				f1++;
			} else if (list1.getItem(f1).compareTo(list2.getItem(f2)) > 0) {
				list3.insert(list2.getItem(f2));
				f2++;
			} else {
				list3.insert(list1.getItem(f1));
				f1++;
				f2++;
			}

		}
		if (f1 < list1.size()) {
			for (int x = f1; x < list1.size(); x++) {
				list3.insert(list1.getItem(x));
			}

		}
		if (f2 < list2.size()) {
			for (int x = f2; x < list2.size(); x++) {
				list3.insert(list2.getItem(x));
			}
		}

		return list3;                                                                                                               //return list
	}

}
