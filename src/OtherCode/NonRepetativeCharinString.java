package OtherCode;

public class NonRepetativeCharinString {

	public static void main(String[] args) {
		
		
//First Non Repetative char in a String 		
		
		String str = "SASAN";
		
		for(int i=0; i<str.length(); i++)
		{
			//assume current char is unique
			boolean isunique = true;
			
			for(int j=0; j<str.length(); j++)
			{
				
				if( i!=j && str.charAt(i) == str.charAt(j))
				{
					isunique = false;
					break;  // stop checking further
				}
			}
			
			if(isunique)
			{
				System.out.println(str.charAt(i));
				break;  // stop after first non-repeating char
			}
			
		}

		
		
	}

}
