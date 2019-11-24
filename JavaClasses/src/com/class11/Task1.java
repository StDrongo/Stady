package com.class11;

public class Task1 {

	public static void main(String[] args) {

		String[][] names= {
                {"Khan","Yousuf","Alex","Zynab","jjj"},
                {"Mohammad","Ann","Naslyhan","Weqas"},
                {"Diago","Asif","Zubair","Shogofa"},    
        };
        
        
        int lengthOfRows=names.length;
        System.out.println(lengthOfRows);
        
        int lengthOfCols=names[1].length;
        System.out.println(lengthOfCols);
        
        for(String getArrays[]: names) {
            for(String getName: getArrays) {
                
                System.out.print(getName+" ");
                
            }
            System.out.println();
            
        }
		
		
		
	}

}
