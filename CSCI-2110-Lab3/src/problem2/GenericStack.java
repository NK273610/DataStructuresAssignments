package problem2;

import java.util.ArrayList;
import java.util.Collection;

public class GenericStack<T> {                                //generic class created
	
	private ArrayList<T> stack;                                //An object generic type of ArrayList is created
	

	GenericStack()                                             //constructor created 
	{
		stack=new ArrayList<T>();
	}
	
	public void push(T t) {                                   //Push method created to add
		stack.add(t);
	}
	public void peek()
	{
		System.out.println(stack.get(stack.size()-1));
	}
	
	public T pop()                                            //Pop method created to remove
	{
		return stack.remove(stack.size()-1);
	}
	
	public int getSize()                                      //getSize method created which gives size of stack
	{
		return stack.size();
	}


	public boolean isEmpty()                                  //IsEmpty method created which return true if stack is empty
	{
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
