package problem5;

import java.util.ArrayList;

public class PrintQueue {
	
	private ArrayList<Job> queue;
	private int cursor=0;
	
	
	PrintQueue()                                  
	{
		queue=new ArrayList<Job>();
	}
	
	public void lpr(String owner,int v)                                 //method to add owner with specific id created
	{
		
		Job job1=new Job(owner,v);
		queue.add(job1);
	}
	                                                                     //method to print queue created
	public void lpq()
	{
		for(Job t: queue)
		{
			System.out.println(t.getOwner()+"    "+t.getJobId());
		}
	}
	
	public void lprm (int id)                                              //method to remove item for specific id created
	{
		for(Job job:queue)
		{
			if(job.getJobId()==id)
				{queue.remove(job);}
			
		}
	}                                                                     //similarly for owner

	public void lprmAll (String owner)                                     //method to remove all item for specific name created
	{ 
		for( int i = 0; i < queue.size(); i++ )
		{
		    Job lValue = queue.get(i);
		    if(lValue.getOwner().equals(owner))
		    {
		         queue.remove(lValue);
		         i--; 
		    }  
		}
	}
}
