package ReverseCode;

//How do you reverse only a part of a string (substring reversal)?

public class StringRevPartofString {

	public static void main(String[] args) {
		
		String name = "Sanjai Kumar";
		int len = name.length()/2;
		
		String firsthalf = name.substring(0, len);
		String secondhalf = name.substring(len);
		
		System.out.println("FirstHalf: " + firsthalf);
		System.out.println("SecondHalf: " + secondhalf);
		
		String rev = "";
		
		for(int i=firsthalf.length()-1; i>=0; i--)
		{
			rev = rev + firsthalf.charAt(i);
		}
		System.out.println("Firsthalf Reversed :" + rev);

		String result = rev + secondhalf;
		System.out.println("Result :" + result);
		
		//reverse second half
		
	}

}
