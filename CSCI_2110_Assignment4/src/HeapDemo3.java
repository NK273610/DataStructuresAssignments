import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class HeapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap<Integer> myHeap = new Heap<Integer>();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter positive integers into the heap (-1 when done): ");
		Integer num = keyboard.nextInt();
		while (num != -1) {
			myHeap.add(num);
			num = keyboard.nextInt();
		}
		Heap<Integer> myHeap2 = new Heap<Integer>();

		System.out.print("Enter positive integers into the heap (-1 when done): ");
		Integer num2 = keyboard.nextInt();
		while (num2 != -1) {
			myHeap.add(num2);
			num2 = keyboard.nextInt();
		}

		ArrayList<Integer> arr = HeapDemo3.merge(myHeap, myHeap2);
		System.out.println(arr);
	}

	public static <T extends Comparable<T>> ArrayList merge(Heap<T> heap1, Heap<T> heap2) {

		
		heap1.heapList.addAll(heap2.heapList);
		ArrayList al = heap1.heapList;
		
		int z = al.size() - 1;
		for (int i = z; i >= z / 2; i--) {
			
			int cIndex = i;
			int pIndex = (i-1) / 2;
			
			T child = (T) al.get(cIndex);
			T parent = (T) al.get(pIndex);

			while (pIndex > 0 && child.compareTo(parent) > 0) {
				al.set(pIndex, child);
				al.set(cIndex, parent);
				cIndex = pIndex;
				pIndex = (pIndex - 1) / 2;
				parent = (T) al.get(pIndex);
				child = (T) al.get(cIndex);
			}
			if(child.compareTo(parent)>0) {
				al.set(pIndex, child);
				al.set(cIndex, parent);
			}
		}

		return al;

	}

}
