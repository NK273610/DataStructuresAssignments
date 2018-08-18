

public class BinaryTree<T>                    //BinaryTree generic class
{
	private T data;                           //variables parent left right created
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;
	
	public BinaryTree()                       //default constructor called
	{
		parent = left = right = null;
		data = null;
	}
	public BinaryTree(T s)                   //Parameterized constructor called
	{
		parent = left = right = null;
		data = s;
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
		return left;
	}

	public void setLeftchild(BinaryTree<T> leftchild) {
		this.left = leftchild;
	}

	public BinaryTree<T> getRightchild() {
		return right;
	}

	public void setRightchild(BinaryTree<T> rightchild) {
		this.right = rightchild;
	}

	public void clear() { // clear method created
		left = right = parent = null;
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
		} else if (this.left != null || tree.getParent() != null) {
			return;
		} else {
			tree.setParent(this);
			this.setLeftchild(tree);
		}
	}

	public void attachRight(BinaryTree<T> tree) { // attachRight method created
		if (tree == null) {
			return;
		} else if (this.right != null || tree.getParent() != null) {
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
		BinaryTree<T> leftref = this.left;
		this.left = null;
		if (leftref != null) {
			leftref.setParent(null);
		}
		return leftref;

	}

	public BinaryTree<T> detachRight() { // detachRight method created
		if (this.isEmpty()) {
			return null;
		}
		BinaryTree<T> rightref = this.right;
		this.right = null;
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
}