package DuplicatesCode;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {

	public static void main(String[] args) {
		
//Count duplicates in String/Array	
		String str = "SANJAIKUMARS";
		
		//convert to charArray
		char[] character = str.toCharArray();
		
		int len = character.length;
		int count = 0;
		
		System.out.print("String Duplicates: ");
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(character[i] == character[j])
				{
					count++;
				}
			}
		}
		System.out.println("Count: " + count);
		
		
//Count duplicates in String using Map
				        
        String str1 = "SANJAIKUMARS";
        
        // Convert to char array
        char[] chars = str.toCharArray();
        
        // Map to store character counts
        Map<Character, Integer> map = new HashMap<>();
        
        // Count frequency of each character
        for(char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Print duplicates
        System.out.print("Duplicate characters: ");
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

		
		
	}

}
