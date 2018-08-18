import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Controller {

	public static void main(String[] args) {                               //driver class of the program
		// TODO Auto-generated method stub

		ArrayList<Pair> arr = new ArrayList<Pair>();                       //ArrayList of type pair class created
		Scanner scn = new Scanner(System.in);
		try {
			FileReader reader = new FileReader("Pokemon.txt");             //file reader object created to read from file 
			int character;
			int c = 0;

			while ((character = reader.read()) != -1) {                    //loop to read a file character wise and neglecting whitespace and null character
				if (Character.isWhitespace(character) == false) {
					
					int count = 0;
					c++;

					for (int i = 0; i < arr.size(); i++) {                 //loop to add character and their occurrences in arraylist 
						Pair pa = arr.get(i);
						if (pa.getValue() == (char) character) {
							pa.setProb(pa.getProb() + 1);
							count++;
							break;
						}
					}
					if (count == 0) {
						Pair p = new Pair();
						p.setValue((char) character);                       //object of type pair created values set in object and added to arraylist
						p.setProb(1);
						arr.add(p);                                       
					}
				}

			}
			reader.close();
			Collections.sort(arr);

			for (int i = 0; i < arr.size(); i++) {                                        //probablity calculated and then added to arralist
				arr.get(i).setProb(Controller.round(arr.get(i).getProb() / c, 4));
			}

			ArrayList<BinaryTree<Pair>> arrn = Controller.Huffman(arr);                          //Huffman function called passing arraylist
			
			File file = new File("Huffman.txt");                                                 //object created to read hufffman
			// Scanner object created to read from file
			StringTokenizer token;
			int ch1;
			
			FileReader reader1 = new FileReader("Pokemon.txt");                                  //object created to read pokemon
			int characte;
			File file2 = new File("Encoded.txt");                                                
			BufferedWriter out = new BufferedWriter(new FileWriter(file2));                     //object created in order to write to file 
			

			while ((characte = reader1.read()) != -1) {
				
				if (Character.isWhitespace(characte) == false) {
					
					Scanner inputFile = new Scanner(file);
					while (inputFile.hasNext()) {
						String line = inputFile.nextLine();                                  // File lines taken into string
						token = new StringTokenizer(line, " ");
						String bcode = token.nextToken();

						String ch = token.nextToken();

						if (ch.equalsIgnoreCase(Character.toString((char) characte))) {
							
							out.write(bcode);                                              //file written with string content 
							

							inputFile.close();
							break;
						}

					}
				}
			}
			
			out.close();

			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static double round(double value, int places) {                    //round method created to round the value to 4 digits
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	public static ArrayList<BinaryTree<Pair>> Huffman(ArrayList<Pair> arr2) throws IOException {       //huffman mathod created 
		ArrayList<BinaryTree<Pair>> S = new ArrayList<BinaryTree<Pair>>();                             //2 arraylist of Pair class created 
		ArrayList<BinaryTree<Pair>> T = new ArrayList<BinaryTree<Pair>>();
		for (int i = 0; i < arr2.size(); i++) {                                                        //values added in binarytree from arraylist and then added each binary tree to S
			BinaryTree<Pair> br = new BinaryTree<Pair>();
			br.setData(arr2.get(i));
			S.add(br);
		}
		int c = 0;
		
		while (c <= 20) {                                    //loop created in order to build huffman tree
			System.out.println();
			BinaryTree<Pair> A = null;
			BinaryTree<Pair> B = null;                      //Items from the arraylist are compared and inserted into huffman tree
			if (T.isEmpty()) {
				A = S.remove(0);
				B = S.remove(0);
			}
			if (!T.isEmpty()) {
				if (S.get(0).getData().getProb() < T.get(0).getData().getProb()) {
					A = S.remove(0);
				}

				else {
					A = T.remove(0);
				}

				if (!S.isEmpty()) {
					if (!T.isEmpty()) {
						if (S.get(0).getData().getProb() < T.get(0).getData().getProb()) {
							B = S.remove(0);
						} else
							B = T.remove(0);
					} else {
						B = S.remove(0);
					}
				} else {
					B = T.remove(0);
				}

			}
			BinaryTree<Pair> P = new BinaryTree<Pair>();

			Pair p = new Pair(A.getData().getProb() + B.getData().getProb());
			P.setData(p);
			P.setLeft(A);
			P.setRight(B);
			T.add(P);
			c++;
		}
		
		if (T.size() > 1) {
			while (T.size() > 1) {
				BinaryTree<Pair> t1 = T.remove(0);
				BinaryTree<Pair> t2 = T.remove(0);
				BinaryTree<Pair> P = new BinaryTree<Pair>();
				Pair p = new Pair(t1.getData().getProb() + t2.getData().getProb());
				P.setData(p);
				P.setLeft(t1);
				P.setRight(t2);
				T.add(P);

			}
		}
		String[] str = Controller.findEncoding(T.get(0));                            //find encoding method called
		File file = new File("Huffman.txt");                                         //File object created to write
		BufferedWriter output = new BufferedWriter(new FileWriter(file));

		for (String s : str) {

			if (s != null) {
				output.write(s);                                                      //content is written in huffman.txt file
				output.newLine();
			}

		}
		output.close();
		char[] chr = Controller.findDecoding(T.get(0));                          //find decoding method called
		File file2 = new File("Decoded.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(file2));

		for (char ch : chr) {

			out.write(ch);

		}
		out.close();
		return T;

	}

	public static void findEncoding(BinaryTree<Pair> t, String[] a, String prefix) {     //find encoding method 

		if (t.getLeft() == null && t.getRight() == null) {

			a[(byte) (t.getData().getValue())] = prefix + "            " + t.getData().getValue() + "         "
					+ t.getData().getProb();
		}

		else {
			findEncoding(t.getLeft(), a, prefix + "0");
			findEncoding(t.getRight(), a, prefix + "1");
		}

	}

	public static String[] findEncoding(BinaryTree<Pair> t) {             //find encoding method created to encode the text
		String[] result = new String[90];
		findEncoding(t, result, "");                                      //above find encoding method called
		return result;
	}

	public static char[] findDecoding(BinaryTree<Pair> t) {               //find Decoding method crested to decode the text
		BinaryTree<Pair> tree = t;
		char[] result = new char[2000];
		try {
			FileReader reader = new FileReader("Encoded.txt");            //File reader object created to read encoded file
			int character;
			int c = 0;

			while ((character = reader.read()) != -1) {                         //File read character by character
				String ch = Character.toString((char) character);
				if (t.getRight().getData().getValue() == '\0' && ch.equalsIgnoreCase("1")) {
					t = t.getRight();
				} else if (t.getLeft().getData().getValue() == '\0' && ch.equalsIgnoreCase("0")) {
					t = t.getLeft();
				} else {
					if (ch.equalsIgnoreCase("1")) {                                 //1 and 0 appended while encoding based on that file is decoded
						t = t.getRight();
					} else {
						t = t.getLeft();
					}
					result[c] = t.getData().getValue();
					
					t = tree;
					c++;
				}
			}
		}

		catch (IOException e) {                                    //Input-Output exception is handled
			e.printStackTrace();
		}

		return result;
	}
}
