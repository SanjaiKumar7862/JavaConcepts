package SwappingCode;

public class SwappingString {

	public static void main(String[] args) {
		
		String first = "Hello";
		String second = "World";
		
		//Step 1: Concatenate strings - "first = HelloWorld"
		first = first + second;
		
		
		//Step 2 - Extract original 'first' and assign to 'second'  >>  (0, 10 - 5)
		second = first.substring(0, first.length() - second.length());
		
		
		//Step 3 - Extract original 'second' and assign to 'first'  >>  ()
		first = first.substring(second.length());
		
		System.out.println("String Swapping: " + first + second);
		

	}

}

/*

Step 2: Extract original first into second
	second = first.substring(0, first.length() - second.length());

	first.length() = 10
	
	second.length() = 5
	
	first.substring(0, 10 - 5) = first.substring(0, 5) = "Hello"
	
	second = "Hello"
	
	
	
Step 3: Extract original second into first
	first = first.substring(second.length());
	
	second.length() = 5
	
	first.substring(5) = "World"
	
	first = "World"	

*/