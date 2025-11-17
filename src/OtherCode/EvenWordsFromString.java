package OtherCode;

public class EvenWordsFromString {

	public static void main(String[] args) {


		String str = "Java is a programming language";
		
		String[] words = str.trim().split("\\s+");
		
		for(String res : words)
		{
			if(res.length() % 2 == 0)
			{
				System.out.println(res + "--" + res.length());
			}
		}

	}

}
