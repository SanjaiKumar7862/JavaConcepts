package OtherCode;

public class FindLastWordLengthinString {

	public static void main(String[] args) {


		String str = "Java is a programming language";
		
		//Remove leading and trailing spaces
		String s = str.trim();
		
		//Find last space index
		int lastspaceindex = str.lastIndexOf(" ");
		
		if(lastspaceindex == -1)
		{
			System.out.println(s + s.length());
		}
		else
		{
			System.out.println(s + s.length());
		}

	}

}
