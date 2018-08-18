import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HeapDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Heap<String> myHeap = new Heap<String>();
		System.out.println("Enter the file name to read from ");
		String filename = scn.next();
		File file = new File(filename);
		Scanner inputfile = new Scanner(file);

		while (inputfile.hasNext()) {
			String s = inputfile.nextLine();
			myHeap.add(s);
		}
		myHeap.enumerate();
		File file2 = new File("output.txt");
		BufferedWriter write = new BufferedWriter(new FileWriter(file2));
		while (myHeap.size() != 0) {
			String p = myHeap.deleteMax();

			write.write(p);
			write.newLine();

		}
		write.close();

	}

}
