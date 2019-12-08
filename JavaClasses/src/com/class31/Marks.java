package com.class31;

public abstract class Marks {
	
	abstract double getPercentage();
	}
	class A extends Marks {
	    double g1, g2, g3;
	    A(double g1, double g2, double g3) {
	        System.out.println("Student A got this marks: " + g1 + " " + g2 + " " + g3);
	        this.g1 = g1;
	        this.g2 = g2;
	        this.g3 = g3;
	    }
	    public double getPercentage() {
	        double percentage = (g1 + g2 + g3) / 300 * 100;
	        return percentage;
	    }
	}
	class B extends Marks {
	    double grade1, grade2, grade3, grade4;
	    B(double grade1, double grade2, double grade3, double grade4) {
	        System.out.println("Student B got this marks: " + grade1 + " " + grade2 + " " + grade3 + " " + grade4);
	        this.grade1 = grade1;
	        this.grade2 = grade2;
	        this.grade3 = grade3;
	        this.grade4 = grade4;
	    }
	    public double getPercentage() {
	        double percentage = (grade1 + grade2 + grade3 + grade4) / 400 * 100;
	        return percentage;
	    }
	}