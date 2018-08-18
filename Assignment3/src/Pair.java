
public class Pair implements Comparable<Pair> {

	private char value;                   //value and prob varaiables created to store probablity and value
	private double prob;
	
	
	public Pair() {                      //default constructor created
		super();
	}
	public Pair(char value, double prob) { //Parameterized constructor created
		super();
		this.value = value;
		this.prob = prob;
	}
	
	public Pair(double prob) {             //constructor created for variable prob
		super();
		this.prob = prob;
	}
	public char getValue() {              //getter setter created 
		return value;
	}
	public void setValue(char value) {
		this.value = value;
	}
	public double getProb() {
		return prob;
	}
	public void setProb(double prob) {
		this.prob = prob;
	}
	@Override
	public String toString() {                          //toString method created to convert object to string
		return "Pair [value=" + value + ", prob=" + prob + "]";
	}
	
	public int compareTo(Pair o) {                      //compare method created for comparison 
		// TODO Auto-generated method stub
		return (int) (this.prob-o.prob);
	}
	
	
}
