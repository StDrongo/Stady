package com.class38;

public class SpecificToGeneral {

	public static void main(String[] args) {
		
		int num1=10; int num2=2;
		int result;
		
		try {
			result=num1/num2;//new ArithmeticException();
			System.err.println(result);
			Thread.sleep(5000);//new InterruptedException();
			
//		}catch (Exception e) {CE: unreachable code
//			System.out.println("Catching all types of exception");
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
