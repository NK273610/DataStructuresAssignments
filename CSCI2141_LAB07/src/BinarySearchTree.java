//Binary Search Tree class
//uses the Binary Tree class
public class BinarySearchTree<T extends Comparable<T>> 
//you are using the compareTo method on objects of type T; hence T should extend Comparable<T>
{
	private BinaryTree<T> tree;    //BinaryTree object created
	private int size;
	
	public BinarySearchTree()        //default constructor
	{
		tree = new BinaryTree<T>();
		size=0;
	}
	public BinaryTree<T> getTree()   //getter-setter created
	{
		return tree;
	}
	public boolean isEmpty()
	{
		return tree.isEmpty();
	}
	public int size()
	{
		return size;
	}
	public BinaryTree<T> search(T key)           //search method to search a key created
	{
		BinaryTree<T> t = tree;
		if (isEmpty()) return null;
		while (t!=null)
		{
			if (key.compareTo(t.getData())<0)
				t = t.getLeftchild();
			else if (key.compareTo(t.getData())>0)
				t = t.getRightchild();
			else // key is found
				return t;
		}
		return null;
	}
		
		
	public void insert(T item)                 //insert a item into the tree created
	{
		BinaryTree<T> newNode = new BinaryTree<T>(); //sets left, right, parent and data to null
		newNode.setData(item);

		if (size==0){tree = newNode; size++;return;}
		
		BinaryTree<T> t = tree;
		boolean done = false;
		while (!done)
		{
			int c = item.compareTo(t.getData());
			if (c==0)
			{
				System.out.println("Duplicate key. Can't insert");
				return;
			}
			else if (c<0) //need to go left
			{
				if (t.getLeftchild()==null)	//place to insert found
				{
					t.setLeftchild(newNode);
					newNode.setParent(t);
					size++;
					done = true;
				}
				else
					t = t.getLeftchild(); //otherwise go left one branch
			}
			else //c>0; need to go right
			{
				if (t.getRightchild()==null) //place to insert found
				{
					t.setRightchild(newNode);
					newNode.setParent(t);
					size++;
					done=true;
				}
				else
					t = t.getRightchild();
			}
		}
	}
	
	public BinaryTree<T> findPredecessor(BinaryTree<T> node)          //find predecessor method created
	{
		if (node==null) return null;
		if (node.getLeftchild()==null) return null;
		BinaryTree<T> pred = node.getLeftchild();
		while (pred.getRightchild()!=null)
			pred = pred.getRightchild();
		return pred;
	}
	
	public void deleteHere(BinaryTree<T> deleteNode, BinaryTree<T> attach)  //deletehere method created
	{
		if (deleteNode==null) return;
		BinaryTree<T> parent = deleteNode.getParent();
		
		if (parent == null) return;
		if (attach == null)
		{
			if (parent.getLeftchild()==deleteNode)
				parent.setLeftchild(null);
			else
				parent.setRightchild(null);
			return;
		}
		if (deleteNode==parent.getRightchild())
		{
			parent.detachRight();
			deleteNode.setParent(null);
			//attach.setParent(parent);
			attach.setParent(null);
			parent.attachRight(attach);
			attach.setParent(parent);
		}
		else
		{
			parent.detachLeft();
			deleteNode.setParent(null);
			
			//attach.setParent(parent);
			attach.setParent(null);
			parent.attachLeft(attach);
			attach.setParent(parent);
		}
		deleteNode.clear();
	}
	
	public void delete(T key)    //delete method to delete a item created 
	{
		if (size==0){System.out.println("Can't delete. Empty tree"); return;}
		BinaryTree<T> deleteNode = search(key);
		if (deleteNode==null) {System.out.println("Key not found. Can't delete"); return;}
		
		BinaryTree<T> hold = null;
		if (deleteNode.getLeftchild()==null && deleteNode.getRightchild()==null)
		{
			deleteHere(deleteNode, null);
		}
		else if (deleteNode.getLeftchild()==null)
		{
			hold = deleteNode.getRightchild();
			deleteHere(deleteNode, hold);
		}
		else if (deleteNode.getRightchild()==null)
		{
			hold = deleteNode.getLeftchild();
			deleteHere(deleteNode, hold);
		}
		else
		{
			hold = findPredecessor(deleteNode);
			deleteNode.setData(hold.getData());
			deleteNode=hold;
			deleteHere(deleteNode, deleteNode.getLeftchild());
		}
		size--;
	}
	public T findMax()         //finmax to find max item created
	{
		BinaryTree<T>tre=this.getTree().getRightchild();
		while(tre.getRightchild()!=null)
		{
			tre=tre.getRightchild();
		}
		return tre.getData();
			
	}
	public T findMin()         //findmin to find minimum item created
	{
		if(this.getTree().getLeftchild()==null) {return null;}
		BinaryTree<T>tre=this.getTree().getLeftchild();
		
		while(tre.getLeftchild()!=null)
		{
			tre=tre.getLeftchild();
		}
		return tre.getData();
	}
	public BinaryTree<T> recursiveSearch(T key)        //search method implemented using recursion
	{
	if (tree.isEmpty())
	return null;
	else
	return recursiveSearch(tree, key);
	}
	public BinaryTree<T> recursiveSearch(BinaryTree<T> t, T key)//search method implemented using recursion
	{
	//complete the code
		int c=key.compareTo(t.getData());
		BinaryTree<T> p = null;
		if(c==0)
		{
			return t;
		}
		if(c>0 && t.getRightchild()!=null)
		{
			 p=recursiveSearch(t.getRightchild(),key);
		}
		if(c<0 && t.getLeftchild() !=null)
		{
			p=recursiveSearch(t.getLeftchild(),key);
		}
		
		return p;
		
		
	}
	public boolean isBinarySearchTree(BinaryTree<T> t)//isBinaryTree method created to check if tree is binary tree or not
	{
		int c=0;
		int p=0;
		
		if(t ==null) {return true;}
		if(t.getRightchild()!=null)
		 c=t.getRightchild().getData().compareTo(t.getData());
		if(t.getLeftchild()!=null)
		 p=t.getLeftchild().getData().compareTo(t.getData());
		if(c<0 || p>0) {return false;}
		else 
			return isBinarySearchTree(t.getLeftchild()) && isBinarySearchTree(t.getRightchild());
		
		
	}
	
}
	