package morePractice;

import java.util.Scanner;

//Create a final method and name it reverseString with a return type of String. 
//when you call the method and enter the string parameter, the method should return my string. 
//implement a scanner class to reverse the string.
//Input:
// hello
//Output:
//olleh
        public class Main {    
public final static String reverseString(String str) {
	Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String reverse = "";
    for(int i = str1.length() - 1; i >= 0; i--)
      {
          reverse = reverse + str1.charAt(i);
      }
    System.out.println(reverse);
    return reverse;
    }


    public static void main(String[] args) {

    	Main a = new Main();
    	String str1=null;
    	Main.reverseString(str1);
    	//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        String reverse = "";
//        
//        
//        for(int i = str.length() - 1; i >= 0; i--)
//        {
//            reverse = reverse + str.charAt(i);
//        }
//        
//        System.out.println("Reversed string is:");
//        System.out.println(reverse);
    }
}


		
		

