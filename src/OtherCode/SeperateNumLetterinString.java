package OtherCode;

//Seperate number and letter in String

public class SeperateNumLetterinString {

	public static void main(String[] args) {
		
//Using StringBuilder class
		String str = "Welcome1234";
		
		StringBuilder character = new StringBuilder();
		StringBuilder number = new StringBuilder();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isLetter(ch))
			{
				character.append(ch);
			}
			else
			{
				number.append(ch);
			}	
		}
		
		System.out.println("Character: " + character);
		System.out.println("Numbers: " + number);

		
//without using StringBuilder
		String str1 = "WelcomeTo0123456";
		
		String chr = " ";
		String num = " ";
		
		for(int i=0; i<str1.length(); i++)
		{
			char ch = str1.charAt(i);
			
			if(Character.isLetter(ch))
			{
				chr += ch;
			}
			else
			{
				num += ch;
			}
			
		}

		System.out.println("Character: " + chr.toString());
		System.out.println("Numbers: " + num.toString());	
				
	}

}
