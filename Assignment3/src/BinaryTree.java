import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class BinaryTree<T>                      //genetic Binary Tree class created 
{
	private T data;                            //Variables created for binary tree
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;
	
	public BinaryTree()                               //default constructor 
	{
		parent = left = right = null;
		data = null;
	}
	
	
	public void makeRoot(T data)                     //makeRoot method created to make data passed as root
	{
		if (!isEmpty())
		{
			System.out.println("Can't make root. Already exists");
		}
		else
			this.data = data;
	}
	
	public void setData(T data)                            //getter-setter created
	{
		this.data = data;
	}
	
	public void setLeft(BinaryTree<T> tree)
	{
		left = tree;
	}
	public void setRight(BinaryTree<T> tree)
	{
		right = tree;
	}
	public void setParent(BinaryTree<T> tree)
	{
		parent = tree;
	}
	
	public T getData()
	{
		return data;
	}
	public BinaryTree<T> getParent()
	{
		return parent;
	}
	public BinaryTree<T> getLeft()
	{
		return left;
	}
	public BinaryTree<T> getRight()
	{
		return right;
	}
	
	
	public void attachLeft(BinaryTree<T> tree)              //attach Left method created to attach tree passed to left of given tree
	{
		if (tree==null) return;
		else if (left!=null || tree.getParent()!=null)
		{
			System.out.println("Can't attach");
			return;
		}
		else
		{
			
				tree.setParent(this);
				this.setLeft(tree);
		}
	}
	
	public void attachRight(BinaryTree<T> tree)                                //attach Right method created to attach tree passed to right of given tree
	{
		if (tree==null) return;
		else if (right!=null || tree.getParent()!=null)
		{
			System.out.println("Can't attach");
			return;
		}
		else
		{
	
				tree.setParent(this);
				this.setRight(tree);
		}
	}
	
	public BinaryTree<T> detachLeft()                           //deattach Left method created to deattach left subtree  of given tree
	{
		if (this.isEmpty()) return null;
		BinaryTree<T> retLeft = left;
		left = null;
		if (retLeft!=null) retLeft.setParent(null);
		return retLeft;
	}
	public BinaryTree<T> detachRight()                            //deattach Right method created to deattach right subtree  of given tree
	{
		if (this.isEmpty()) return null;
		BinaryTree<T> retRight = right;
		right =null;
		if (retRight!=null) retRight.setParent(null);
		return retRight;
	}
	public boolean isEmpty()                                    //IsEmpty method created to check if tree is empty or not
	{
		if (data == null)
			return true;
		else
			return false;
	}
	public void clear()                                          
	{
		left = right = parent =null;
		data = null;
	}
	
	public BinaryTree<T> root()                               //root method created to find root of binary tree
	{
		if (parent == null)
			return this;
		else
		{
			BinaryTree<T> next = parent;
			while (next.getParent()!=null)
				next = next.getParent();
			return next;
		}
	}
	
	public static < T > void preorder(BinaryTree<T> t)                   //preorder method created for preorder traversal
	{
		if (t!=null)
		{
			System.out.print(t.getData()+"\t");
			preorder(t.getLeft());	
			preorder(t.getRight());
		}
	}
	
	public static <T> void inorder(BinaryTree<T> t)                 //inorder methid created for inorder traversal
	{
		if (t!=null)
		{
			inorder(t.getLeft());
			System.out.print(t.getData() + "\t");
			inorder(t.getRight());
		}
	}
	
	public static  <T> void postorder(BinaryTree<T> t)               //postorder method created for postorder traversal
	{
		if (t!=null)
		{
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() + "\t");
		}
	}


	
	

}

