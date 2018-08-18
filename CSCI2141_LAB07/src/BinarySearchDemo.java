import java.util.ArrayList;
import java.util.Scanner;



public class BinarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String ip="";
		BinarySearchTree<String> tree=new BinarySearchTree<String>();  //BinarySearchTree object tree created
		System.out.println("Enter or done");
		while (!(ip = scn.next()).equalsIgnoreCase("done")) {                    //input taken from user and stored in tree
			System.out.println("Enter or done");
			tree.insert(ip);
		}
		System.out.println("Maximum is");
		System.out.println(tree.findMax());       //findmax method called
		System.out.println("Minimum is");
		System.out.println(tree.findMin());       //findmin method called
		System.out.println("Enter element to be found");
		String str=scn.next();
		BinaryTree <String> t=tree.recursiveSearch(str); //recursive search method called
		if(t!=null)
		{
		System.out.println("the element is present "+t.getData());
		}
		else
		{
			System.out.println("null");
		}
		
		ArrayList<BinaryTree> arr = new ArrayList<BinaryTree>();          //ArrayList created to store values
		String inp = "";
		arr.add(null);
		System.out.println("Enter or done");
		while (!(inp = scn.next()).equalsIgnoreCase("done")) {                    //input taken from user and stored in arraylist
			System.out.println("Enter or done");
			arr.add(new BinaryTree<String>(inp));                                 //arr added with binarytree
		}
		

		for (int i = 1; i < arr.size(); i++) {                     //loop in which elements are stored in tree
			BinaryTree<String> p = arr.get(i);
			BinaryTree<String> left = 2*i<arr.size()? arr.get(2*i):null;
			BinaryTree<String> right = 2*i+1<arr.size()? arr.get(2*i+1):null;
			p.attachLeft(left);
			p.attachRight(right);
		}
		BinaryTree root = arr.get(1);                                
		boolean x=tree.isBinarySearchTree(root);    //isBinarySearch method called
		System.out.println("The given tree is binarysearch tree");
		System.out.println(x);
		
		
		
	}


}
