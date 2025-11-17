package OtherCode;

public class StringSpecialChar {

	public static void main(String[] args) {
	
//Special char seperately
		
		String str = "Welcome@!@#ToCbe**!";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isLetterOrDigit(ch))
			{
				System.out.println(ch + " -> Non Special char");
			}	
			else
			{
				System.out.println(ch + " -> Special char");
			}
		}
		
		
//Special char using StringBuilder class
		
		StringBuilder special = new StringBuilder();
		StringBuilder nonspecial = new StringBuilder();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isLetterOrDigit(ch))
			{
				nonspecial.append(ch);
			}
			else
			{
				special.append(ch);
			}
		}
		
		System.out.println("Special char: " + special);
		System.out.println("Non Special char: " + nonspecial);
		
	}

}
