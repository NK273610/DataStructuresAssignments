package problem4;

import java.util.ArrayList;

public class GenericQueue<T> {                         //generic queue class created
	private ArrayList<T> queue;
	int cursor;

	GenericQueue()                                    //default constructor created
	{
		queue=new ArrayList<T>();
	}
	
	public int size()                                 //size method to get size of queue created
	{
		return queue.size();
	}
	
	public boolean isEmpty()                          //isEmpty method to check if queue is empty is created
	{
		if(queue.size()==0)
		{
			return true;
		}
		return false;
	}
	
	public void clear()                               //clear method ro clear queue created
	{
		queue.clear();
	}
	public void enqueue(T item)                        //enqueue method to add an item in queue is created
	{
		queue.add(cursor++, item);
	}
	public T dequeue()                                 //dequeue method to remove an item is created
	{
	
		return queue.remove(0);
		
	}
	
	public int intPositionOf(T t)                      //method to get position of item is created
	{
		if(true)
		{
			return queue.indexOf(t);
          
		}
		return -1;
	}
	
	public T peek()                                       //peek method to view front of queue is created
	{
		return queue.get(0);
	}
	public T first()                                     //first method to get first element is created
	{
		cursor=0;
		return queue.get(cursor);
	}
	
	public T next()                                     //next method to get next element is created
	{
		cursor++;
		return queue.get(cursor);
	}
	public int positionOf(T item)                       //positionOf method created to get position of item
	{
		return queue.indexOf(item);
	}
	
	public void remove(T item)                           //remove method created to remove item
	{
		int i=queue.indexOf(item);
		queue.remove(i);
	}

	@Override
	public String toString() {
		return "queue = " + queue;
	}

	
	
}
