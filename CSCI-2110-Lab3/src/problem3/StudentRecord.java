package problem3;

public class StudentRecord {                                                           
	
	private String firstname;                                                             //elements in class declared
	private String lastname;
	private int bannerId;
	
	
	
	public StudentRecord() {                                                             
		super();                                                                          //Default constructor created
	}
	public StudentRecord(String firstname, String lastname, int bannerId) {              //Parameterized constructor created
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.bannerId = bannerId;
	}
	public String getFirstname() {                                                       //getter setters created
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getBannerId() {
		return bannerId;
	}
	public void setBannerId(int bannerId) {
		this.bannerId = bannerId;
	}
	@Override
	public String toString() {                                                                 //Tostring method created
		return "StudentRecord [firstname=" + firstname + ", lastname=" + lastname + ", bannerId=" + bannerId + "]";
	}
	
	
	
	

}
