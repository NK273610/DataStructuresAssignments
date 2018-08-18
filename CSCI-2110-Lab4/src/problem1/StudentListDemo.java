package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentListDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);                                  //scanner object to read from file created 
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.next();                                          //file slist                          
		
		
		File file = new File(filename);                                             //file object created
		Scanner inputFile = new Scanner(file);
		
		StudentList stuli = new StudentList();                                     //list of type student list created
		String email, major, faculty,fname,lname;
		int stuid;
		Student stu=null;
		
		while (inputFile.hasNext())                                                 //input file read
		{
			
			stuid=inputFile.nextInt();
			fname = inputFile.next();
			lname = inputFile.next();
			email = inputFile.next();
			major = inputFile.next();
			faculty = inputFile.next();
			stu = new Student(stuid,fname,lname,email,major,faculty);
			stuli.addStudent(stu);;
		}
		
		inputFile.close();		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any major for display records: ");
		String maj=scn.next();
		stuli.displayMajorRec(maj);                                             //displayMajorRec method called
		System.out.println("Enter any email for display records: ");
		String e_mail=scn.next();
		System.out.println(stuli.searchEmail(e_mail));                   //searchemail method called          
		System.out.println("Enter any first name and last name for display records: ");
		String f=scn.next();
		String l=scn.next();
		System.out.println(stuli.searchName(f,l));                      //searchname method called
		System.out.println("Enter any faculty for display records: ");
		String fac=scn.next();
		stuli.displayFacultyRec(fac);                                        //displayFacultyRec called
		System.out.println("Enter any id for display records: ");
		int idd=scn.nextInt();
		System.out.println(stuli.searchId(idd));                                 //searchId called

	}

}
