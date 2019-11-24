package com.class21;

public class Students {

//	2. Create a Class called Students
//	● Create three variables studentName , studentID 
//	and numberOfStudents
//	● Create three objects of the Students Class
//	● Set the value for studentName , 
//	studentID and increment the numberOfStudents 
//	for each object
//	● Print out total number of students
	
	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	 
	
	
	public static void main(String[] args) {
		Students.numberOfStudents = 0;
		
		Students st1 = new Students();
		Students st2 = new Students();
		Students st3 = new Students();
		
		st1.studentName = "Eric";
		st1.studentID = 1;
		Students.numberOfStudents++;
		
		st2.studentName = "Jhon";
		st2.studentID = 2;
		Students.numberOfStudents++;
		
		st3.studentName = "Alex";
		st3.studentID = 3;
		Students.numberOfStudents++;
		
		System.out.println("The total number of students is: "
		+Students.numberOfStudents);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
