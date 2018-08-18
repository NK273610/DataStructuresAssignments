package problem3;

public class Captial {
	
	private String country;                                        //variables created 
	private String capital;
	
	
	public Captial() {                                             //default constructor called
		super();
	}


	public Captial(String country, String capital) {               //Parameterized constructor created 
		super();
		this.country = country;
		this.capital = capital;
	}


	public String getCountry() {                                   //getter setter created             
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCapital() {
		return capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}


	@Override                                                                  //toString method created
	public String toString() {
		return "Captial [country=" + country + ", capital=" + capital + "]";
	}
	
	
	

}
