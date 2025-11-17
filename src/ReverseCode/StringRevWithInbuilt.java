package ReverseCode;

//String reversal using inbuit methods. String are immutable to mute the string we need to use StringBuildder and StringBuffer class

public class StringRevWithInbuilt {

	public static void main(String[] args) {
		
		String name = "Sanjai";
		String name1 = "Selenium";
		
		
	StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.reverse();
		System.out.println("Reversed String: " + sb);
		
		
		
	String rev = new StringBuilder(name1).reverse().toString();
		System.out.println("Reversed String: " + rev);

		
		
	StringBuffer sbf = new StringBuffer();
		sbf.append(sb);
		sbf.reverse();
		System.out.println("Reversed String: " + sbf);
		
		
	}

}

// Use StringBuffer
// when you are working in a multi-threaded environment and need to ensure thread safety for string manipulation.

// Use StringBuilder
// when you are working in a single-threaded environment or when you are responsible for managing thread safety yourself, and performance is a critical concern.
