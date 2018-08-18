
public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;
	
	public BinaryTree()
	{
	parent=left=right=null;	
	data=null;
	}

	public T getData() {
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

	public BinaryTree<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTree<T> left) {
		this.left = left;
	}

	public BinaryTree<T> getRight() {
		return right;
	}

	public void setRight(BinaryTree<T> right) {
		this.right = right;
	}
	public boolean isEmpty()
	{
		if(data==null) {return true;}
		else return false;
	}
public void clear()
{
	parent=right=left=null;
	data=null;
}
public void makeRoot(T data)
{
	if(!isEmpty()) {System.out.println("Can't make root, tree not empty");}
	else
	{this.data=data;}
}
public void attachLeft(BinaryTree<T>tree)
{
	if(tree==null) {return;}
	if(tree.getParent()!=null || this.left!=null) {return;}
	else
	{
		tree.setParent(this);
		this.setLeft(tree);
	}
}
public void attachRight(BinaryTree<T>tree)
{
	if(tree==null) {return;}
	if(tree.getParent()!=null || this.right!=null) {return;}
	else
	{
		tree.setParent(this);
		this.setRight(tree);
	}
}
public BinaryTree<T> dettachRight()
{
	if(this.isEmpty()) {return null;}
	BinaryTree<T> right=this.getRight();
	this.right=null;
	if(right!=null) {right.setParent(null);}
	return right;
	
	
}
public BinaryTree<T> dettachLeft()
{
	if(this.isEmpty()) {return null;}
	BinaryTree<T> left=this.getLeft();
	this.left=null;
	if(left!=null) {left.setParent(null);}
	return left;
	
	
}
public BinaryTree<T> Root()
{
	if(this.parent==null) {return this;}
	else
	{
		return this.parent.Root();
	}
}
public static <T> void inoderTrav(BinaryTree<T> tree)
{
	if(tree!=null)
	{
	inoderTrav(tree.getLeft())	;
	System.out.println(tree.getData());
	inoderTrav(tree.getRight());
	
	}
}
public static <T> void preoderTrav(BinaryTree<T> tree)
{
	if(tree!=null)
	{
		System.out.println(tree.getData());
	preoderTrav(tree.getLeft())	;
	
	preoderTrav(tree.getRight());
	
	}
}
public static <T> void postoderTrav(BinaryTree<T> tree)
{
	if(tree!=null)
	{
	postoderTrav(tree.getLeft())	;
	postoderTrav(tree.getRight());
	System.out.println(tree.getData());
	
	}
}





}
