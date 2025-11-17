package OtherCode;

import java.util.HashMap;
import java.util.Map;

public class MapLooping {

	public static void main(String[] args) {
		
		        // data added in map
		        Map<Integer, String> data = new HashMap<>();
		        data.put(1, "Apple");
		        data.put(2, "Banana");
		        data.put(3, "Cherry");
		        
		        
		        // Loop using entrySet()
		        System.out.println("Loop using entrySet:");
		        for (Map.Entry<Integer, String> entry : data.entrySet()) 
		        {
		            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		        }
		        
		        
		        // Loop using keySet()
		        System.out.println("\nLoop using keySet:");
		        for (Integer key : data.keySet()) 
		        {
		            System.out.println("Key: " + key + ", Value: " + data.get(key));
		        }
		        
		        
		        // Loop using values()
		        System.out.println("\nLoop using values:");
		        for (String value : data.values()) 
		        {
		            System.out.println("Value: " + value);
		        }

		

	}

}
