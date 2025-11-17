package ReverseCode;

//String reversal without inbuit methods. String are Immutable.

public class StringRevWithoutInbuit {

	public static void main(String[] args) {
		
		String name = "Sanjai";
		
		System.out.println("Original String: " + name);
		
		int len = name.length();
		String rev = "";
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println("Reversed string: " + rev);
		
	}

}


// 1.Declaring string variable
// 2.Find the len of the string
// 3.Initialze empty string for concatination
// 4.for loop to traverse into string
//   len-1 > index starts from 0 and len is 6. so len-1 indicates 6-1=5. so index value matches the len
//   i>=0  > i starts from 5 and decrement till 0
// 5.charAt(i)  > This method is To access individual characters in a string by their position.
