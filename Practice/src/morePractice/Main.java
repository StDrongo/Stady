package morePractice;
//Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList. 
//Step 2: Create appleMap<String, Object> and add below pairs into it. 
//"Items", "Apple"
//"Price", 20.00
//"Quantity", 10
//Step 3: Add appleMap to dataList. 
//Step 4: Create orangeMap<String, Object> and add below pairs into it. 
//"Items", "Orange" 
//"Price", 21.99
//"Quantity", 10
//Step 5: Add orangeMap to dataList. 






import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Main {
    
	public static void main(String[] args) {

				List<Map<String, Object>> dataList = new ArrayList<>();

				Map<String, Object> appleMap = new TreeMap<>();
				appleMap.put("Items", "Apple");
				appleMap.put("Price", 20.00);
				appleMap.put("Quantity", 10.0);	

				dataList.add(appleMap);

				Map<String, Object> orangeMap=new TreeMap<>();
		        orangeMap.put("Items", "Orange");
		        orangeMap.put("Price", 21.99);
		        orangeMap.put("Quantity", 10);

		        dataList.add(orangeMap);

		        double totalPrice = 0;
 for (Map<String, Object> map : dataList) {
	 String items = map.get("Items").toString();
	 double price = Double.parseDouble(map.get("Price").toString());
	 double price1 = Double.parseDouble(map.get("Quantity").toString());
	 double total = price*price1;
	 System.out.println("Items: "+items+" Price: "+price+" Quantity "+price1+" SubTotal: "+total);		 
	 
	 totalPrice+=total;	
 }
	System.out.println("Your Purchase total : "+totalPrice);	        
     
	}
}
