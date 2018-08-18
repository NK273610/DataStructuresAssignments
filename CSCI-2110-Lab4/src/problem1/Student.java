package problem1;

public class Student {
	
	private int studentId;                                                                                       //variables studentid,fname,lname.email,major and faculty created
	private String fname;
	private String lname;
	private String email;
	private String major;
	private String faculty;
	public Student() {                                                                                           //default constructor created
		super();
	}
	public Student(int studentId, String fname, String lname, String email, String major, String faculty) {       //Parameterized constructor created
		super();
		this.studentId = studentId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.major = major;
		this.faculty = faculty;
	}
	public int getStudentId() {                                                                           //getter setter created
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	@Override                                                                                                         //ToString method created
	public String toString() {
		return "Student [studentId=" + studentId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", major=" + major + ", faculty=" + faculty + "]";
	}
	
	
	

}
