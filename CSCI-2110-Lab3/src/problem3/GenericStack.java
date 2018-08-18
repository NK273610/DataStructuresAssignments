package problem3;

import java.util.ArrayList;
import java.util.Collection;

public class GenericStack<T> {
	
	private ArrayList<T> stack;
	private int cursor=0;
	

	GenericStack()
	{
		stack=new ArrayList<T>();
	}
	
	public void push(T t) {                                              //push method created to add object
		stack.add(cursor++, t);;
	}
	public void peek()                                                   //peek method created to view first object from front
	{
		System.out.println(stack.get(stack.size()-1));
	}
	
	public T pop()                                                        //pop method created to remove object
	{
		return stack.remove(stack.size()-1);
	}
	
	public int getSize()                                                  //getSize method created to get size of stack
	{
		return stack.size();
	}


	public boolean isEmpty()
	{                                                                     //isEmpty method created to check if stack is empty
		if(stack.size()==0)
		{
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "GenericStack [stack=" + stack + ", top=" + stack.size() + "]";
	}
}
