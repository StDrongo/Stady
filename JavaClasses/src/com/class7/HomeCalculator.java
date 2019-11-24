package com.class7;

import java.util.Scanner;

public class HomeCalculator {

	public static void main(String[] args) {
        //HomeWork: Using scanner class create calculator.
        //Allow user to enter 2 numbers and operator(+,-,*,/).
        //Based on operator provide the result to user.
     Scanner scan=new Scanner(System.in);
     System.out.println("please enter first number");
     int num1=scan.nextInt();
     System.out.println("please enter second number");
     int num2=scan.nextInt();
     System.out.println("please enter operator (+,-,*,/");
     char op=scan.next().charAt(0);
     int result;
     switch (op) {
     case '+':
         result= num1 + num2;
         break;
     case '-':
         result= num1-num2;
         break;
     case '*':
         result= num1*num2;
         break;
     case '/':
         result=num1/num2;
         break;
         default:
             result=0;
             
             }
     System.out.println(result);
	}

}
