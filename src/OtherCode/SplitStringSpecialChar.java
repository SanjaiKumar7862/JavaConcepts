package OtherCode;

//String split and using Regex

public class SplitStringSpecialChar {

	public static void main(String[] args) {
		
//using REGEX 
		String name = "welcome_to_JAVA**-test()_eclipse !! 123";
	
		String[] arr = name.split("[^a-zA-Z]+");
		
		System.out.println("Original String name: " + name);
		
		System.out.println("After split using Regex: ");
		for(String res : arr)
		{
			System.out.print(res);
		}

		
																System.out.println();

//Normal split using substring
		String input = "Welcome_To Java";
		int len = input.length()/2;
		
		String firsthalf = input.substring(0, len);
		String secondhalf = input.substring(len);
		
		System.out.println("First half using Sustring: " + firsthalf);
		System.out.println("Second half using Sustring: " + secondhalf);
		
		
		
//Normal split using for loop
		String input1 = "Welcome_To Java";
		char[] arr1 = input1.toCharArray();
		int mid = input1.length()/2;
		
		String result = "";
		String result1 = "";
		
		for(int i=0; i<mid; i++)
		{
			result += arr1[i];
		}
		
		for(int j=mid; j<arr1.length; j++)
		{
			result1 += arr1[j];
		}
		
		System.out.println("First Half using Loop: " + result);
		System.out.println("Second Half using Loop: " + result1);
		
	}

}
