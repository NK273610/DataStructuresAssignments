import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the table::");
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
        ArrayList<LinkedList<Integer>> arr = new ArrayList<LinkedList<Integer>>(x);
		
        for (int i = 0; i < x; i++) {
			arr.add(null);
		}
        
        System.out.println("Enter the no of keys to be hashed::");
		int keys = scn.nextInt();
		Random rand = new Random();
		int bound = 10000;
		int max = 0;
		int collison = 0;
		
		for (int i = 0; i < keys; i++) {
			int x1 = rand.nextInt(bound);
			int pos = x1 % x;
			if (arr.get(pos) == null) {
				LinkedList<Integer> lis = new LinkedList<Integer>();
				lis.add(x1);
				arr.set(pos, lis);
			}
			else {
				LinkedList lis = arr.get(pos);
				lis.add(x1);
				collison++;
				}
		}
		
		for (LinkedList l1 : arr) {
			if (l1 == null) {
				System.out.println("Empty");
			}
			else {
				if (max < l1.size()) {
					max = l1.size();
				}
				System.out.println(l1.toString());
			}
		}
		System.out.println("statistics::");
		System.out.println("Table size: "+x);
		System.out.println("No of Keys: "+keys);
		System.out.println("The no of collisons is:  " + collison);
		System.out.println("The maximum size of linkedlist: " + max);
		System.out.println("Load factor is:  " + (keys / x));
		}
}


