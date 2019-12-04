package morePractice;

import java.util.Scanner; // импорт сканера

class Test1 {
	public static void main(String args[]){
		System.out.println("------------");
		System.out.print("Введите любое дробное число: ");
		Scanner scan = new Scanner(System.in);
		double number = scan.nextDouble();
		System.out.println ("Вы ввели число " + number);
	}
}
