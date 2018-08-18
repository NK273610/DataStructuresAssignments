package problem5;

public class Prob5Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		PrintQueue pq= new PrintQueue();          //object created
		pq.lpr("swilliams",309);                  //items added in object
		pq.lpr("swilliams",315);
		pq.lpr("ronadhino",301);
		pq.lpr("davidh",135);
		pq.lpr("davidh",140);
		pq.lpr("ronaldhino",140);
		
		pq.lpq();                                //method called to show queue
		
		pq.lprm(140);                           //method called to remove owner for specific id
		
		pq.lpq();                               //method called to show queue
		
		pq.lprmAll("swilliams");                //method called to remove all items of specific owner from queue
		
		pq.lpq();                               //method called to show queue

	}

}
