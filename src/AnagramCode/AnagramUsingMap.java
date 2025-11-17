package AnagramCode;

import java.util.HashMap;

public class AnagramUsingMap {

    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listejhgfn";

        
        // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        
        // If lengths differ, not an anagram
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram ❌");
            return;
        }

        
        // Step 1: Count frequency of characters in str1
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        
        // Step 2: Decrease frequency using str2
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c)) {
                System.out.println("Not Anagram ❌");
                return;
            }
            map.put(c, map.get(c) - 1);

            // If count becomes 0, remove char
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        
        // Step 3: If map is empty, strings are anagram
        if (map.isEmpty()) {
            System.out.println("Anagram ✅");
        } else {
            System.out.println("Not Anagram ❌");
        }

		
	}

}
