package morePractice;

public class Employee {

//	Include the following class variables:
//		* name(String)
//		* lastName(String)
//		* employeeId(int)
//		* startDate(String)
//		* salary(int)
//		Write two constructors:
//		* non-argument constructor
//		* parameterized constructor
//		Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
//		Output:
//		null null 0 null 0
//		Joe Smith 12345 01/01/1970 35000
	
	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	Employee() {
		
	}
	
	Employee(String na, String last, int id, String start, int sal) {
		name = na;
		lastName = last;
		employeeId = id;
		startDate = start;		
		salary = sal;
	}
	void display() {
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	
	
}
