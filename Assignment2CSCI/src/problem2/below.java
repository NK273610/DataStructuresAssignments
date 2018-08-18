package problem2;

public class below 
{
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean found=false;
		int n=6;
		
		while(n!=0 && found==false)
		{
			if(n==3) {System.out.println(n); found=true;}
			else System.out.println(n);
			n--;
		}
	}
}
