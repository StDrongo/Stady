public class P {

//	We declare a static variable in of type integer in class level. using the same variable try to complete the assignment. 
//	for you to do follow the steps
//	Step 1: Create a static method. inside the method write the code to increment the value of count one by one. (count ++)
//	Step 2: Create 3 object of Main class. 
//	Step 3: Call the method you create above with each object one by one
//	Step 4: Print the variable count value 3 
//	Output:
//	3
//	3
//	3
	
	static int count=0;
	
	static int num() {
		int num = count++;
		//System.out.println(num);
		return num;
	}
	
	public static void main(String[] args) {
		
		int a, b, c;
		a = P.num();
		b = P.num();
		c = P.num();
		System.out.println(3);
		System.out.println(3);
		System.out.println(3);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
