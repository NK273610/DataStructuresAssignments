package problem;

public class BinaryTreeDemo {
	public static void main(String[] args) {
		BinaryTree<String> A = new BinaryTree<String>(); // tree A created
		BinaryTree<String> B = new BinaryTree<String>();// tree B created
		BinaryTree<String> C = new BinaryTree<String>();// tree C created
		BinaryTree<String> D = new BinaryTree<String>();// tree D created
		BinaryTree<String> E = new BinaryTree<String>();// tree E created
		BinaryTree<String> F = new BinaryTree<String>();// tree F created
		A.makeRoot("A");// make root method called in BinaryTree class
		B.makeRoot("B");// make root method called in BinaryTree class
		C.makeRoot("C");// make root method called in BinaryTree class
		D.makeRoot("D");// make root method called in BinaryTree class
		E.makeRoot("E");// make root method called in BinaryTree class
		F.makeRoot("F");// make root method called in BinaryTree class

		A.attachLeft(B);// attach left method called of BinaryTree class
		A.attachRight(C);// attach left method called of BinaryTree class
		B.attachLeft(D);// attach left method called of BinaryTree class
		B.attachRight(E);// attach left method called of BinaryTree class
		D.attachRight(F);// attach left method called of BinaryTree class
		
		System.out.println(BinaryTree.cc(B));

//		System.out.print("Preorder:\t"); // preorder method called
//		BinaryTree.preOrder(A);
//		System.out.println();
//
//		System.out.print("Inorder:\t"); // inorder method called
//		BinaryTree.inOrder(A);
//		System.out.println();
//
//		System.out.print("Postorder:\t"); // postorder method called
//		BinaryTree.postOrder(A);
//		System.out.println();
//		System.out.println("Nodes");
//		int n = BinaryTree.noOfNodes(A);
//		int n1 = BinaryTree.noOfNodes(B);
//		int n2 = BinaryTree.noOfNodes(D);// noOfNodes method called
//		System.out.println("nodes of A " + n+" nodes of B "+n1+"  node of D "+n2);
//		int h = BinaryTree.height(A);
//		int h1 = BinaryTree.height(B);
//		int h2 = BinaryTree.height(D);// balanced method called
//		System.out.println("height of A " + h+" height of B "+h1+"  height of D "+h2);
//		System.out.println("Level Order A :");
//		BinaryTree.printLevelOrder(A);
//		System.out.println("Level Order B :");
//		BinaryTree.printLevelOrder(B);
//		System.out.println("Level Order D :");
//		BinaryTree.printLevelOrder(D);// level order method called
//		System.out.println("Balanced A");
//		BinaryTree.balanced(A);
//		System.out.println("Balanced B"); //balanced method called
//		if(BinaryTree.balanced(B)!=0) {System.out.println("Balanced");}
//		System.out.println("Balanced D");
//		if(BinaryTree.balanced(D)!=0) {System.out.println("Balanced");}
	}

}
