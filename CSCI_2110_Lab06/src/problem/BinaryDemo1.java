package problem;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		//BinaryTree<String> treelist = new BinaryTree<String>();   //tree list object created of BinaryTree class
		ArrayList<BinaryTree> arr = new ArrayList<BinaryTree>();          //ArrayList created to store values
		String inp = "";
		arr.add(null);
		while (!(inp = scn.next()).equalsIgnoreCase("done")) {                    //input taken from user and stored in arraylist
			System.out.println("Enter or done");
			arr.add(new BinaryTree<String>(inp));
		}
		System.out.println(arr.size());

		for (int i = 1; i < arr.size(); i++) {                     //loop in which elements are stored in tree
			BinaryTree<String> p = arr.get(i);
			BinaryTree<String> left = 2*i<arr.size()? arr.get(2*i):null;
			BinaryTree<String> right = 2*i+1<arr.size()? arr.get(2*i+1):null;
			p.attachLeft(left);
			p.attachRight(right);
		}
		BinaryTree root = arr.get(1);
		System.out.println("PREORDER");
		BinaryTree.preOrder(root); //preorder method called
		System.out.println("POSTORDER");
		BinaryTree.postOrder(root);//postorder method called
		System.out.println("INORDER");
		BinaryTree.inOrder(root);//inorder method called
		System.out.println("Number of Nodes");
		System.out.println(BinaryTree.noOfNodes(root));//noOfNodes method called
		System.out.println("LEVEL ORDER");
		BinaryTree.printLevelOrder(root);//levelorder method called
		System.out.println();
		System.out.println("HEIGHT");
		System.out.println(BinaryTree.height(root));//height method called

	}
}

//package problem;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class BinaryDemo1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		BinaryTree<String> treelist = new BinaryTree<String>();   //tree list object created of BinaryTree class
//		ArrayList<String> arr = new ArrayList<String>();          //ArrayList created to store values
//		String z = "";
//		String x = null;
//		arr.add(x);
//		while (!z.equalsIgnoreCase("done")) {                    //input taken from user and stored in arraylist
//			System.out.println("Enter or done");
//			z = scn.next();
//
//			arr.add(z);
//		}
//		arr.remove(arr.size()-1);
//		System.out.println(arr.size());
//
//		for (int i = 1; i < arr.size(); i++) {                     //loop in which elements are stored in tree
//			BinaryTree<String> left = new BinaryTree<String>();
//			BinaryTree<String> right = new BinaryTree<String>();
//			String p = arr.get(i);
//			if (i == 1) {
//				treelist.makeRoot(p);
//			} else if (i % 2 == 0) {
//				treelist = treelist.getLeftchild();
//			} else {
//				treelist = treelist.getRightchild();
//			}
//			if (2 * i < arr.size()) {
//				left.setData(arr.get(2 * i));                      //left elements added
//				treelist.attachLeft(left);
//				//left.setParent(treelist);
//			} else {
//				break;
//			}
//			if (2 * i + 1 < arr.size()) {
//				right.setData(arr.get(2 * i + 1));                 //right element added
//				treelist.attachRight(right);
//				//right.setParent(treelist);
//			} else {
//				break;
//			}
//
//		}
//
//		BinaryTree.preOrder(treelist); //preorder method called
//		BinaryTree.postOrder(treelist);//postorder method called
//		BinaryTree.inOrder(treelist);//inorder method called
//		System.out.println(BinaryTree.noOfNodes(treelist));//noOfNodes method called
//		BinaryTree.printLevelOrder(treelist);//levelorder method called
//		System.out.println(BinaryTree.height(treelist));//height method called
//
//	}
//}
