package test;

public class List<T> {
	private LinkedList<T> element;
	private int cursor;
	
	public List()
	{
		element=new LinkedList<T>();
		cursor=0;
	}
	public void add(T item)
	{
		element.add(item);
	}

	public int size()
	{
		return element.sixe();
	}
	public boolean isEmpty()
	{
		return element.isEmpty();
	}
}
