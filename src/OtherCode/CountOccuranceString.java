package OtherCode;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceString {

	public static void main(String[] args) {
		
		String str = "KUMARR";
		char[] arr = str.toCharArray();
		
		Map<Character, Integer> count = new HashMap<>();
		
		for(char ch : arr)
		{
			if(count.containsKey(ch))
			{
				count.put(ch, count.get(ch) + 1);
			}
			else
			{
				count.put(ch, 1);
			}
		}
		
		System.out.println("Count occurance: " + count);
		
	}

}
