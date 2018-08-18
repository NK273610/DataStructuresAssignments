package problem1;

import java.util.ArrayList;
import java.util.Arrays;

public class NHLStats {

	private List<PlayerRecord> playerlist;                             //playerlist created

	public NHLStats() {                                                //default constructor created
		playerlist = new List<PlayerRecord>();
	}

	public void enumerate() {                                         //enumerate method created
		playerlist.enumerate();
	}

	public void add(PlayerRecord item) {                             //method to add item created
		playerlist.add(item);
	}

	public PlayerRecord first() {                                   //first method created
		return playerlist.first();
	}

	public PlayerRecord next() {                                   //next method  created
		return playerlist.next();
	}

	public boolean isEmpty() {                                     //isEmpty method created
		return playerlist.isEmpty();

	}

	public int size() {                                              //size method created
		return playerlist.size();
	}

	public boolean contains(PlayerRecord item) {                     //contains method created
		return playerlist.contains(item);
	}

	public PlayerRecord getAt(int index) {                          //get at any index method 
		return playerlist.getAt(index);
	}

	public List<PlayerRecord> MostAgressive() {                    //Most aggresive method 

		PlayerRecord play = playerlist.first();
		int max = play.getPIM();
		List<PlayerRecord> list1 = new List<PlayerRecord>();       //list1 object created of type list and class PlayerRecord 
		do {

			if (max < play.getPIM()) {
				max = play.getPIM();

			}

			play = playerlist.next();

		} while ((play = playerlist.next()) != null);
		PlayerRecord play2 = playerlist.first();
		do {
			if (play2.getPIM() == max) {
				list1.add(play2);
			}

			play2 = playerlist.next();

		} while ((play2 = playerlist.next()) != null);

		return list1;

	}

	public List<PlayerRecord> HighestPoint() {                     //highest point method created

		PlayerRecord play = playerlist.first();
		int max = play.getP();
		List<PlayerRecord> list1 = new List<PlayerRecord>();
		do {

			if (max < play.getP()) {
				max = play.getP();

			}

			play = playerlist.next();
			

		} while ((play = playerlist.next()) != null);
		PlayerRecord play2 = playerlist.first();
		do {
			if (play2.getP() == max) {
				list1.add(play2);
			}

			play2 = playerlist.next();

		} while ((play2 = playerlist.next()) != null);

		return list1;

	}

	public List<PlayerRecord> MostValuable() {                            //most valuable method

		PlayerRecord play = playerlist.first();
		int max = play.getGWG();
		List<PlayerRecord> list1 = new List<PlayerRecord>();
		do {

			if (max < play.getGWG()) {
				max = play.getGWG();

			}

			play = playerlist.next();

		}

		while ((play = playerlist.next()) != null);
		PlayerRecord play2 = playerlist.first();
		do {
			if (play2.getGWG() == max) {
				list1.add(play2);
			}

			play2 = playerlist.next();

		} while ((play2 = playerlist.next()) != null);

		return list1;

	}

	public List<PlayerRecord> MaxShotsOnGoal() {                             //most shots on goal method

		PlayerRecord play = playerlist.first();
		int max = play.getSOG();
		List<PlayerRecord> list1 = new List<PlayerRecord>();
		do {

			if (max < play.getSOG()) {
				max = play.getSOG();

			}

			play = playerlist.next();

		} while ((play = playerlist.next()) != null);
		PlayerRecord play2 = playerlist.first();
		do {
			if (play2.getSOG() == max) {
				list1.add(play2);
			}

			play2 = playerlist.next();

		} while ((play2 = playerlist.next()) != null);

		return list1;

	}

	public List<String> mostGameWnGoal() {                                     //most game winning goal method
		PlayerRecord play = playerlist.first();
		List<String> str = new List<String>();
		List<String> plist = new List<String>();
		str.add(play.getTeam());

		int count = 0;
		for (int j = 1; j < playerlist.size() - 1; j++) {
			play = playerlist.next();
			if (str.contains(play.getTeam()) == false) {
				str.add(play.getTeam());
			}

		}
		int smax = 0;
		String team = null;
		String x = str.first();

		do {

			PlayerRecord player = playerlist.first();

			int sum = 0;
			do {
				if (x.compareTo(player.getTeam().toString()) == 0) {
					sum = (sum + player.getGWG());
				}
			} while ((player = playerlist.next()) != null);

			if (smax == sum) {
				team = x;

				plist.add(team + "  " + smax);
			}
			if (smax < sum) {
				smax = sum;
				team = x;
				plist.clear();
				plist.add(team + "  " + smax);
			}

		} while ((x = str.next()) != null);

		return plist;
	}

	public List<String> MostPenalties() {                                  //most penalty method
		PlayerRecord play = playerlist.first();
		List<String> str = new List<String>();
		List<String> plist = new List<String>();
		str.add(play.getTeam());

		int count = 0;
		for (int j = 1; j < playerlist.size() - 1; j++) {
			play = playerlist.next();
			if (str.contains(play.getTeam()) == false) {
				str.add(play.getTeam());
			}

		}
		int pimmax = 0;
		String team = null;
		String x = str.first();

		do {

			PlayerRecord player = playerlist.first();

			int sum = 0;
			do {
				if (x.compareTo(player.getTeam().toString()) == 0) {
					sum = (sum + player.getPIM());
				}
			} while ((player = playerlist.next()) != null);

			if (pimmax == sum) {
				team = x;

				plist.add(team + "  " + pimmax);
			}
			if (pimmax < sum) {
				pimmax = sum;
				team = x;
				plist.clear();
				plist.add(team + "  " + pimmax);
			}
		} while ((x = str.next()) != null);

		return plist;
	}

}
