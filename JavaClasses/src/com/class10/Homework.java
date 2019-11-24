package com.class10;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
        System.out.println("Enter start number");
        int firstNumber=scan.nextInt();
        int secondNumber=scan.nextInt();
        
        int start = 0;
        int end = 0;
        
        if(firstNumber < secondNumber)
        {
            start = firstNumber;
            end = secondNumber;
        }
        else
        {
            start = secondNumber;
            end = firstNumber;
        }
        int even=0;
        int odd=0;
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                even=even+i;
        }
            else
            {
                odd=odd+i;
            }
            
        }System.out.println("sum of even numbers is "+even);
        System.out.println("som of odd number is "+odd);
    }	
	}

