package problem;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTree<T> {
	private T data; // elements of binary tree
	private BinaryTree<T> parent; // parent element
	private BinaryTree<T> leftchild; // leftchild element
	private BinaryTree<T> rightchild; // rightchild element

	public BinaryTree() { // default constructor
		parent = leftchild = rightchild = null;
		data = null;

	}

	public BinaryTree(T dat) { // default constructor
		parent = leftchild = rightchild = null;
		data = dat;
	}
	
	public T getData() { // getter-setter created
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTree<T> getParent() {
		return parent;
	}

	public void setParent(BinaryTree<T> parent) {
		this.parent = parent;
	}

	public BinaryTree<T> getLeftchild() {
		return leftchild;
	}

	public void setLeftchild(BinaryTree<T> leftchild) {
		this.leftchild = leftchild;
	}

	public BinaryTree<T> getRightchild() {
		return rightchild;
	}

	public void setRightchild(BinaryTree<T> rightchild) {
		this.rightchild = rightchild;
	}

	public void clear() { // clear method created
		leftchild = rightchild = parent = null;
		data = null;
	}

	public boolean isEmpty() { // isEmpty method created
		if (data == null) {
			return true;
		} else {
			return false;
		}
	}

	public void makeRoot(T data) { // make root method created
		if (!isEmpty()) {
			System.out.println("Root already exists sorry !!!");
		} else {
			this.data = data;
		}
	}

	public void attachLeft(BinaryTree<T> tree) { // attachLeft method created
		if (tree == null) {
			return;
		} else if (this.leftchild != null || tree.getParent() != null) {
			return;
		} else {
			tree.setParent(this);
			this.setLeftchild(tree);
		}
	}

	public void attachRight(BinaryTree<T> tree) { // attachRight method created
		if (tree == null) {
			return;
		} else if (this.rightchild != null || tree.getParent() != null) {
			return;
		} else {
			tree.setParent(this);
			this.setRightchild(tree);
		}
	}

	public BinaryTree<T> detachLeft() { // detachleft method created
		if (this.isEmpty()) {
			return null;
		}
		BinaryTree<T> leftref = this.leftchild;
		this.leftchild = null;
		if (leftref != null) {
			leftref.setParent(null);
		}
		return leftref;

	}

	public BinaryTree<T> detachRight() { // detachRight method created
		if (this.isEmpty()) {
			return null;
		}
		BinaryTree<T> rightref = this.rightchild;
		this.rightchild = null;
		if (rightref != null) {
			rightref.setParent(null);
		}
		return rightref;

	}

	public BinaryTree<T> Root() { // Root method created
		if (this.parent == null) {
			return this;
		} else {
			return this.parent.Root();
		}

	}

	public static <T> void preOrder(BinaryTree<T> tree) { // preOrder method created
		if (tree != null) {
			System.out.println(tree.getData() + "\t");
			preOrder(tree.getLeftchild());
			preOrder(tree.getRightchild());
		}
	}

	public static <T> void inOrder(BinaryTree<T> tree) { // Inorder method created
		if (tree != null) {
			inOrder(tree.getLeftchild());
			System.out.println(tree.getData() + "\t");
			inOrder(tree.getRightchild());
		}
	}

	public static <T> void postOrder(BinaryTree<T> tree) { // post Order method created
		if (tree != null) {
			postOrder(tree.getLeftchild());
			postOrder(tree.getRightchild());
			System.out.println(tree.getData() + "\t");
		}
	}

	public static <T> int noOfNodes(BinaryTree<T> tree) { // noOfnodes method created
		if (tree == null) {
			return 0;
		} else {
			return 1 + noOfNodes(tree.getRightchild()) + noOfNodes(tree.getLeftchild());
		}

	}

	public static <T> int height(BinaryTree<T> tree) { // Height method created
		if (tree == null) {
			return -1;
		}
		int x = 1 + height(tree.getLeftchild());
		int y = 1 + height(tree.getRightchild());
		return Math.max(x, y);

	}

	public static <T> int balanced(BinaryTree<T> tree) { // balanced method created

		if (tree == null) {
			return 0;
		}
		int x = 1 + balanced(tree.getLeftchild());
		int y = 1 + balanced(tree.getRightchild());
		if (x > y + 1 || y > x + 1) {
			System.out.println("Not balanced ");
			return 0;
		}
	
		return Math.max(x, y);

	}

	public static <T> void printLevelOrder(BinaryTree<T> tree) { // printLevelOrder method created
		
		ArrayList<BinaryTree> queue = new ArrayList();
		ArrayList<Integer> heights = new ArrayList();
		queue.add(tree.Root());
		heights.add(0);
		
		int printing_height = 0;
		while(!queue.isEmpty())
		{
			BinaryTree curr = queue.remove(0);
			
			int curr_height = heights.remove(0);
			
			if(curr.leftchild!=null)
				queue.add(curr.leftchild);
			if(curr.rightchild!=null)
				queue.add(curr.rightchild);
			heights.add(curr_height + 1);
			heights.add(curr_height + 1);
			if(curr_height>printing_height)
			{
				printing_height = curr_height;
				System.out.println();
			}
			System.out.print(curr.data);
		}
	}

	/*public static <T> void printGivenLevel(BinaryTree<T> tree, int level) { // print at given level method created
		if (tree == null)
			return;
		if (level == 2)
			System.out.print(tree.getData() + " ");
		else if (level > 1) {
			printGivenLevel(tree.getLeftchild(), level - 1);
			printGivenLevel(tree.getRightchild(), level - 1);
		}
	}*/
	
	public static <T> boolean Complete(BinaryTree<T> tree)
	{
		if(tree.getLeftchild()==null && tree.getRightchild()==null) {return true;}
		if(tree.getLeftchild()!=null && tree.getRightchild()!=null) {return Complete(tree.getLeftchild()) && Complete(tree.getRightchild());}
		
	   return false;
	}
    public static <T> boolean cc(BinaryTree<T> tree)
    {
    	ArrayList<BinaryTree> al=new ArrayList<BinaryTree>();
    	al.add(tree);
    	boolean x=false;
    	while(!al.isEmpty())
    	{
    		BinaryTree<T>p=al.remove(0);
    		if(p.getLeftchild()!=null)
    		{
    			if(x==true) {return false;}
    			al.add(p.getLeftchild());
    		}
    		else
    		{
    			x=true;
    		}
    		
    		if(p.getRightchild()!=null)
    		{
    			if(x==true) {return false;}
    			al.add(p.getRightchild());
    		}
    		else
    		{
    			x=true;
    		}
    	}
    	return true;
    }

}
