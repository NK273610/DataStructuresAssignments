
public class BinarySearchTree<T extends Comparable<T>> {
	
	private BinaryTree<T> tree;
	private int size;
	
	public BinarySearchTree()
	{
		tree=new BinaryTree<T>();
		size=0;
	}
	
	public BinaryTree<T> getTree() {
		return tree;
	}
	
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return tree.isEmpty();
	}
	public BinaryTree<T> search(T key)
	{
		BinaryTree<T> t=tree;
		boolean found=false;
		while(t!=null && !found )
		{
			int c=key.compareTo(t.getData());
			if(c==0) {found =true;}
			if(c<0) {t=t.getLeft();}
			if(c>0) {t=t.getRight();}
		}
		if(found) {return t;}
		else
			return null;
	}
	public void insert(T item)
	{
		BinaryTree<T>newn=new BinaryTree<T>();
		newn.setData(item);
		if(size==0) {tree=newn;size++;return;}
		BinaryTree<T>t=tree;
		boolean found =false;
		
		while(!found)
		{
			int c=item.compareTo(t.getData());
			if(c==0) {System.out.println("Duplicate value");return;}
			if(c>0) {if(t.getRight()==null) {t.setRight(newn);newn.setParent(t);size++;found=true;}else{t=t.getRight();}}
			if(c<0) {if(t.getLeft()==null) {t.setLeft(newn);newn.setParent(t);size++;found=true;}else{t=t.getLeft();}}
		}
	}
	public BinaryTree<T> findPred(BinaryTree<T> tree)

	{
		if(tree==null) {return null;}
		if(tree.getLeft()==null) {return null;}
		BinaryTree<T> pred=tree.getLeft();
		while(pred.getRight()!=null)
		{
			pred=pred.getRight();
		}
		return pred;
	}
	
public void deleteHere(BinaryTree<T> deletenode,BinaryTree<T> attach)
{
	if(deletenode==null) {return;}
	BinaryTree<T> parent=deletenode.getParent();
	if(parent==null) {return;}
	if(attach==null)
	{
		if(parent.getLeft()==deletenode) {parent.setLeft(null);}
		else parent.setRight(null);
		deletenode.clear();
		return;
	}
	if(deletenode==parent.getRight())
	{
		parent.dettachRight();
		attach.setParent(parent);
		parent.attachRight(attach);
	}
	else if(deletenode==parent.getLeft())
	{
		parent.dettachLeft();
		attach.setParent(parent);
		parent.setLeft(attach);
	}
	deletenode.clear();
	}
public void delete(T key)
{
	if(size==0) {System.out.println("cannot delete no tree");}
	
	BinaryTree<T> deletenode=search(key);
	BinaryTree<T> hold=null;
	if(deletenode==null) {System.out.println("No key found");}
	if(deletenode.getLeft()==null && deletenode.getRight()==null)
	{
		deleteHere(deletenode,null);
	}
	else if(deletenode.getLeft()==null)
	{
		hold=deletenode.getRight();
		deleteHere(deletenode,hold);
	}
	else if(deletenode.getRight()==null)
	{
		hold=deletenode.getLeft();
		deleteHere(deletenode,hold);
	}
	else
	{
		hold=findPred(deletenode);
		deletenode.setData(hold.getData());
		deletenode=hold.getParent();
		deleteHere(deletenode, deletenode.getLeft());
	}
}
}
