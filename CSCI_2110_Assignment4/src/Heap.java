import java.util.ArrayList;

public class Heap<T extends Comparable<T>>
{
	ArrayList<T> heapList;
	
	public Heap()
	{
		heapList = new ArrayList<T>();
	}
	
	public int size()
	{
		return heapList.size();
	}
	
	public boolean isEmpty()
	{
		return heapList.isEmpty();
	}
	
	public void clear()
	{
		heapList.clear();
	}
	public void enumerate()
	{
		System.out.println(heapList);
	}
	
	public void add(T item)
	{
		heapList.add(item);
		int index=heapList.size()-1;
		int pindex=(index-1)/2;
		T parent=heapList.get(pindex);
		while(index>0 && item.compareTo(parent)>0)
		{
			heapList.set(pindex, item);
			heapList.set(index, parent);
			index=pindex;
			pindex=(index-1)/2;
			parent=heapList.get(pindex);
		}
	}
	
	
	public T deleteMax()
	{
		if(heapList.isEmpty()) {System.out.println("heap is empty");return null;}
		else
		{
			T ret=heapList.get(0);
			T root=heapList.remove(heapList.size()-1);
			if(heapList.size()==0) {return ret;}
			heapList.set(0, root);
			int index=0,lindex,rindex,maxindex;
			lindex=index*2+1;
			rindex=index*2+2;
			T maxchild;
			boolean found=false;
			while(!found)
			{
				if(lindex<heapList.size() && rindex<heapList.size())
				{
					if(heapList.get(rindex).compareTo(heapList.get(lindex))>0)
					{
						maxchild=heapList.get(rindex);
						maxindex=rindex;
					}
					else
					{
						maxchild=heapList.get(lindex);
						maxindex=lindex;
					}
					if(root.compareTo(maxchild)<0)
					{
						heapList.set(maxindex, root);
						heapList.set(index, maxchild);
						index=maxindex;
					}
					else
					{
						found=true;
					}
				}
				else if(lindex<heapList.size())
					{
						if(root.compareTo(heapList.get(lindex))<0)
						{
							heapList.set(lindex, root);
							heapList.set(index, heapList.get(lindex));
							index=lindex;
						}
						else
							found=true;
					
				}
				else found=true;
				lindex=index*2+1;
				rindex=index*2+2;
			}
			return ret;
		}
		
		
		
		
	}
	
	public T findMin()
	{
		int index=heapList.size()-1;
		int pindex=((index-1)/2)+1;
		int z=index-1;
		T small=heapList.get(index);
		while (index>=pindex && z>=pindex )
		{
			
			if(small.compareTo(heapList.get(z))<0)
			{
				z=z-1;
			}
			else
			{
				index=z;
				small=heapList.get(z);
				z=z-1;
			}
		}
		return small;
	}
	
	public T dequeueMin()
	{
		int index=heapList.size()-1;
		int pindex=((index-1)/2)+1;
		int z=index-1;
		T small=heapList.get(index);
		while (index>=pindex && z>=pindex )
		{
			
			if(small.compareTo(heapList.get(z))<0)
			{
				z=z-1;
			}
			else
			{
				index=z;
				small=heapList.get(z);
				z=z-1;
			}
		}
		
		T item=heapList.remove(heapList.size()-1);
		heapList.set(index,item);
		int i=index,lindex,rindex,maxindex;
		lindex=i*2+1;
		rindex=i*2+2;
		T maxchild;
		boolean found=false;
		while(!found)
		{
			if(lindex<heapList.size() && rindex<heapList.size())
			{
				if(heapList.get(rindex).compareTo(heapList.get(lindex))>0)
				{
					maxchild=heapList.get(rindex);
					maxindex=rindex;
				}
				else
				{
					maxchild=heapList.get(lindex);
					maxindex=lindex;
				}
				if(item.compareTo(maxchild)<0)
				{
					heapList.set(maxindex, item);
					heapList.set(index, maxchild);
					index=maxindex;
				}
				else
				{
					found=true;
				}
			}
			else if(lindex<heapList.size())
				{
					if(item.compareTo(heapList.get(lindex))<0)
					{
						heapList.set(lindex, item);
						heapList.set(index, heapList.get(lindex));
						index=lindex;
					}
					else
						found=true;
				
			}
			else found=true;
			lindex=index*2+1;
			rindex=index*2+2;
		}
		
		return small;
	}

}
