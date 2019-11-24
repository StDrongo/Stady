package com.syntax.class9;

public class FamiliesDemo {

	public static void main(String[] args) {
		
		SmithMember member1 = new SmithMember();
		member1.increment();
		member1.firstName = "John";
		member1.lastName = "Smith";
		member1.gender = 'M';
		member1.salary = 5000;
		SmithMember.addIncome(member1.salary);
		
		member1.memberInfo();
		
		SmithMember member2 = new SmithMember();
		member2.increment();
		member2.firstName = "Jane";
		member2.lastName = "Smith";
		member2.gender = 'F';
		member2.salary = 6000;
		SmithMember.addIncome(member2.salary);
		
		member2.memberInfo();
		
		System.out.println("There are "
		+SmithMember.count + " members in the "
		+member2.lastName+" family");
		
		SmithMember baby = new SmithMember();
		baby.firstName = "Adam";
		baby.gender = 'M';
		baby.salary = 500;
		SmithMember.addIncome(baby.salary);
		
		System.out.println(SmithMember.lastName
		+" family's income is: "+SmithMember.familyIncome);
		
		JamesMember jMember1 = new JamesMember();
		jMember1.increment();;
		jMember1.firstName = "Lebron";
		JamesMember.lastName = "James";
		jMember1.gender = 'M';
		jMember1.salary = 100000;
		
		JamesMember jMember2 = new JamesMember();
		jMember2.increment();
		jMember2.firstName = "Savannah";
		jMember2.gender = 'F';
		jMember2.salary = 200;
		
		
		System.out.println("There are "
			+JamesMember.count + " members in the "
			+jMember2.lastName+" family");
	}
	
	
	
	
	
	
	
	
}
