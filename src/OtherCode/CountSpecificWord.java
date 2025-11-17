package OtherCode;

public class CountSpecificWord {

	public static void main(String[] args) {
		
		String str = "SANJAIKUMAR";
		
		String targetchar = "A";
		
		int count = 0;
		
		String result = "";
		
		for(int i=0; i<str.length(); i++)
		{
			result = result + str.charAt(i);
			
			if(str.charAt(i) == targetchar.charAt(0))
			{
				count++;
			}
			
		}
		
		System.out.println("Result of strin: " + result);
		System.out.println("Count in string: " + count);
	}

}
