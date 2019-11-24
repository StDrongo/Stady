package com.syntax.class8;

public class World {

	public static void main(String[] args) {
        //World w1 = new World();
        
		Baby baby1;
		baby1 = new Baby();
		
		baby1.cry();
		
		baby1.firstName = "John";
		baby1.lastName = "Doe";
		baby1.gender = 'M';
		baby1.hairColor = "Yellow";
		baby1.weigth = 7;
		
		System.out.println(baby1.firstName);
		baby1.walk(3);
		
		System.out.println("Done with baby1");
		
		Baby baby2 = new Baby();
		
		baby2.cry();
		baby2.firstName = "Ann";
		baby2.lastName = "Smith";
		baby2.hairColor = "Black";
		baby2.gender = 'F';
		baby2.weigth = 6;
		
		baby2.cry();
		
		baby2.talk();
		System.out.println("Full name of baby "
		+baby2.firstName+" "+baby2.lastName);
		baby2.walk(2);
		
		System.out.println("----------------");
		baby2.displayBabyInfo();
		baby1.displayBabyInfo();
	}

}
