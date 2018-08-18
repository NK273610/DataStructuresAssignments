package test;

public class LinkedList<T> {
	
	private Node<T> front;
	private int count;
	private int i;
	public LinkedList() {
		front=null;
		count=0;
	}
	
	public void add(T item)
	{
		Node<T> newN=new Node<T>(item,front);
		front=newN;
		count++;
		
	}

	public int sixe()
	{
		return count;
	}
	
	public void clear()
	{
		front=null;
		count=0;
	}

	public boolean isEmpty()
	{
		if(count==0)
		{
			return true;
		}
		return false;
		
   }
	public void enumerate()
	{
		Node<T> curr=front;
		while(curr!=null)
		{
			System.out.println(curr.getData());
			curr=curr.getNext();
		}
	}

	public T getItem(int x)
	{
		Node<T> curr=front;
		if(x<0 && x>count)
		{
			System.out.println("index out of bound");
			return null;
		}
		else 
		{
			for(int i=0;i<x;i++)
			{
				curr=curr.getNext();
			}
			return curr.getData();
		}
		
	}

	public void insertAt(T item,int index)
	{
		Node<T> prev=front;
		if(index <0 && index>count) {System.out.println("error");}
		else
		
			for(int j=0;j<index;j++)
			{
				prev=prev.getNext();
			   }
		Node<T> newN=new Node<T>(item,prev.getNext());
		
		
		prev.setNext(newN);
		count++;
	}
	public int indexOf(T item)
	{
		Node<T> curr=front;
		for(int i=0;i<count;i++)
		{
			if(item.equals(curr.getData())) {return i;}
			curr=curr.getNext();
		}
		return -1;
	}
	public T removal(int x)
	{
		Node<T> curr=front;
		T result=null;
		if(x<0 && x>count)
		{
			System.out.println("index out of bound");
			result=null;
		}
		
		
		else if(x==0)
		{
				result=front.getData();
		        front=front.getNext();
		        
	    }
		else
		{
			Node<T>prev=front;
			for(int k=0;k<x-1;k++)
			{
				prev=prev.getNext();
			}
			result=prev.getNext().getData();
			prev.setNext(prev.getNext().getNext());
			
		}
		
		count--;
		return result;
}
	public void remove(T item)
	{
		int i=indexOf(item);
		if(i==-1)
		{
			System.out.println("no item");
		}
		else
			removal(i);
	}
	
	public void removeAll(T item)
	{
		Node<T> curr=front;  
		Node<T> prev = null;
		while(curr !=null)
		{
			if(front.getData().equals(item))
			{
				curr=curr.getNext();
				front=front.getNext();
				count--;
			}
			else if(curr==front)
			{
				prev=curr;
				curr=curr.getNext();
			}
			else if(curr !=null)
			{
				
					if(curr.getData().equals(item))
					{
						prev.setNext(curr.getNext());
						curr=prev.getNext();
					}
			count--;
			}
	     
			else
			{
				prev=curr;
				curr=curr.getNext();
			}
		}
		
	}
}


