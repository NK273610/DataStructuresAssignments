package problem1;

public class PlayerRecord{
	private String Name;              //parameters of PlayerRecord class
	                                  //name of player,
	private String Pos;               //position of player
	private String Team;              //team of player
	private int GP;                   //games played
	private int G;                    //goals
	private int A;                    //assists
	private int PIM;                  //penalty in minutes
	private int SOG;                  //shots on goal
	private int GWG;                  //game winning goal
	private int P;                    //point=g+a
	
	public PlayerRecord() {          //default constructor 
		super();
	}

	public PlayerRecord(String name, String pos, String team, int gP, int g, int a, int pIM, int sOG, int gWG, int p) {   //Parameterized constructor
		super();
		Name = name;
		Pos = pos;
		Team = team;
		GP = gP;
		G = g;
		A = a;
		PIM = pIM;
		SOG = sOG;
		GWG = gWG;
		P = p;
	}

	public String getName() {                         //getter setter created
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPos() {
		return Pos;
	}

	public void setPos(String pos) {
		Pos = pos;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	public int getGP() {
		return GP;
	}

	public void setGP(int gP) {
		GP = gP;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getPIM() {
		return PIM;
	}

	public void setPIM(int pIM) {
		PIM = pIM;
	}

	public int getSOG() {
		return SOG;
	}

	public void setSOG(int sOG) {
		SOG = sOG;
	}

	public int getGWG() {
		return GWG;
	}

	public void setGWG(int gWG) {
		GWG = gWG;
	}

	public int getP() {
		return P;
	}

	public void setP(int p) {
		P = p;
	}
                                                           //To String method overridden
	@Override
	public String toString() {
		return "PlayerRecord [Name=" + Name + ", Pos=" + Pos + ", Team=" + Team + ", GP=" + GP + ", G=" + G + ", A=" + A
				+ ", PIM=" + PIM + ", SOG=" + SOG + ", GWG=" + GWG + ", P=" + P + "]";
	}
	
	
	

}
