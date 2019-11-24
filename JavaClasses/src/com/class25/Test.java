package com.class25;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Creating an object of a Employee class");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("---Creating an object of a Scrum Team class-----");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		sm.attendScrumMeetings();
		
		System.out.println("---Creating an object of a Developer class-----");
		Developer dev=new Developer();
		dev.salary=130000;//accessing default varibale within same package
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		dev.attendScrumMeetings();
		dev.employeeId=101;
		//dev.employeeSsn not accessible
		

	
	}
}
