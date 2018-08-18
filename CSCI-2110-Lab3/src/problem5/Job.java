package problem5;

public class Job {                                   

	private String owner;
	private int jobId;
	
	
	public Job() {                                      //default constructor created
		super();
	}
	public Job(String o, int j)                        //Parameterized constructor created
	{
	owner = o;
	jobId = j;
	}
	public String getOwner()                           //getter and setter created
	{
	return owner;
	}
	public int getJobId()
	{
	return jobId;
	}
	
	
}
