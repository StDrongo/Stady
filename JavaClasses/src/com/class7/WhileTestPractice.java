package com.class7;

public class WhileTestPractice {

	public static void main(String[] args) {

		//print numbers from 1 to 20
		int i=0;
		
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		//print numbers from 10 to 30 all in 1 line
		int b=10;
		
		while(b<=30) {
			System.out.print(b);
		    b++;
		}
		//print 10 to 1
	
	    int c=10;
	    while(c>=1) {
	    	System.out.println(c);
	        c--;
	    }
	    System.out.println("-------------------------------");
	     //from 50 to 20
	    int d=50;
	    while (d>=20) {
	    	System.out.println(d);
	        d--;
	    }
	    System.out.println("-------------------------------");
	    //print all even numbers from 1 to 20
	    //1 way - increment value by 2
	    int z=2;
	    while (z<=20) {
	    	System.out.println(z);
	    	z+=2;
	    }
	    //2 way modulus
	    int q=1;
	    
	    while (q<=20) {
	    	
	    	if (q%2==0) {
	    		System.out.println(q);
	    	}
	    	q++;
	    	
	    	
	    }
	    
	
	}

}
