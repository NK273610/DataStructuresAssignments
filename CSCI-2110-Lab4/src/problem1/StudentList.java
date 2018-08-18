package problem1;

import java.util.LinkedList;
import java.util.List;

public class StudentList {
	
	private List<Student> stulist;                                   //stulist object referencing list created
	
	
	public StudentList() {
		stulist=new LinkedList <Student>();                       // object of linkedlist created of Student type
	}

	public void addStudent(Student stu)                           //method add student created
	{
		stulist.add(stu);
	}
	                                                             //method remove student created
	public void remove(Student stu)
	{
		stulist.remove(stu);
	}
	
	public void displayMajorRec(String major)                    //method to display student on major as input created 
	{
		int cursor=0;
		Student stu1=stulist.get(cursor);
		while(cursor<stulist.size()-1)
		{
			
			if(stu1.getMajor().equalsIgnoreCase(major))
			{
				
				System.out.println(stu1.toString());
			}
			
			cursor++;
			stu1=stulist.get(cursor);
			
			
		}
	}
	
	public void displayFacultyRec(String faculty)                        //method to display student record on faculty as input created
	{
		int cursor=0;
		Student stu1=stulist.get(cursor);
		while(cursor<stulist.size()-1)
		{
			
			if(stu1.getFaculty().equalsIgnoreCase(faculty))
			{
				System.out.println(stu1.toString());
			}
			cursor++;
			stu1=stulist.get(cursor);
			
			
		}
	}
	
	public Student searchId(int stuid)                                     //method to search student record on stuid as input created
	{
		int cursor=0;
		Student stu1=stulist.get(cursor);
		while(cursor<stulist.size()-1)
		{
			
			if(stu1.getStudentId()==stuid)
			{
				return stu1;
			}
			cursor++;
			stu1=stulist.get(cursor);
			
			
		}
		return null;
	}
	
	public Student searchEmail(String email)                         //method to search student record on email as input created
	{
		int cursor=0;
		Student stu1=stulist.get(cursor);
		while(cursor<stulist.size()-1)
		{
			
			if(stu1.getEmail().equalsIgnoreCase(email))
			{
				return stu1;
			}
			cursor++;
			stu1=stulist.get(cursor);
			
			
		}
		return null;
	}
	public Student searchName(String fname, String lname)                    //method to search student record on fname and lname as input created
	{
		int cursor=0;
		Student stu1=stulist.get(cursor);
		while(cursor<stulist.size()-1)
		{
			
			if(stu1.getFname().equalsIgnoreCase(fname) && stu1.getLname().equalsIgnoreCase(lname))
			{
				return stu1;
			}
			cursor++;
			stu1=stulist.get(cursor);
			
			
		}
		return null;
	}
	

	@Override
	public String toString() {
		return "StudentList [stulist=" + stulist + "]";
	}
	
	
}
