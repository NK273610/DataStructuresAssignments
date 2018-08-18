package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PlayerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();                              // Enter filename from which we have to read file
		File file = new File(filename + ".txt");
		Scanner inputFile = new Scanner(file);                              // Scanner object created to read from file
		StringTokenizer token;                                              //token of class StringTokenizer created
		NHLStats list1 = new NHLStats();                                   // Object created for NHLStats class

		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();                            // File lines taken into string
			token = new StringTokenizer(line, "\t");                       //line given to String tokenizer with tab placed as parameter                     
			String name = token.nextToken();                               //tokens placed in respective position to variables
			String pos = token.nextToken();                                //position of player
			String team = token.nextToken();                               //team of player
			int gp = Integer.parseInt(token.nextToken());                  //games played
			int g = Integer.parseInt(token.nextToken());                   //goals scored
			int a = Integer.parseInt(token.nextToken());                   //assists
			int pim = Integer.parseInt(token.nextToken());                 //penalty in minutes
			int sog = Integer.parseInt(token.nextToken());                 //shots on goal
			int cwg = Integer.parseInt(token.nextToken());                 //game winning goal

			                                                              // Create PlayerRecord object 
			PlayerRecord playrec = new PlayerRecord();
			playrec.setA(a);
			playrec.setG(g);                                              //set all the values
			playrec.setTeam(team);
			playrec.setSOG(sog);
			playrec.setPos(pos);
			playrec.setPIM(pim);
			playrec.setName(name);
			playrec.setGWG(cwg);
			playrec.setGP(gp);
			list1.add(playrec);
			playrec.setP(g + a);
		}
		inputFile.close();
		
		System.out.println("Most aggresive player his team and his position is ");                      //Most aggressive method called
		List<PlayerRecord> playerlist = list1.MostAgressive();                                              //playerlist object of type List<PlayerRecord> created                     
		 do 
		 {
			 PlayerRecord r=playerlist.first();
			 System.out.println("Most Aggresive player is "+r.getName()+" of team "+r.getTeam()+" and hs position is "+r.getPos());
		 }
		 while(playerlist.next()!=null);
	
		 System.out.println("Most game winning goal scored by team and points::");
		List<String> p=list1.mostGameWnGoal();                                                             //most game winning goal method called
		do
		 {
			 String r=p.first();
			 System.out.println("Most game wining goal of team is given  "+r);
		 }
		 while(p.next()!=null);
		System.out.println("Most penalty in minutes of team is given::");
		List<String> k=list1.MostPenalties();                                                               //most penalties method called
		 do
		 {
			 String r=k.first();
			 System.out.println("Most penality minutes of team is given  "+r);
		 }
		 while(k.next()!=null);
		 
		playerlist=list1.MostValuable();                                                                //most valuable method called
		System.out.println("Most valuable player his team is ");
		
		 do
		 {
			 PlayerRecord r=playerlist.first();
			 System.out.println("Most valuable player is "+r.getName()+" of team "+r.getTeam());
		 }
		 while(playerlist.next()!=null);
		playerlist=list1.MaxShotsOnGoal();                                                                //most shots on goal method called
		System.out.println("Most promsing player his team  is ");
		
		 do
		 {
			 PlayerRecord r=playerlist.first();
			 System.out.println("Most promising player is "+r.getName()+" of team "+r.getTeam());
		 }
		 while(playerlist.next()!=null);
		playerlist=list1.HighestPoint();                                                                     //highest point method called
		System.out.println("Most Point scored by player his team and his points is ");
		
		 do
		 {
			 PlayerRecord r=playerlist.first();
			 System.out.println("Most point scored by player is "+r.getName()+" of team "+r.getTeam()+" and hs points is "+r.getP());
		 }
		 while(playerlist.next()!=null);
	}

}
