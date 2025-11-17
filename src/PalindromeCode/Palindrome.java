package PalindromeCode;

public class Palindrome {

	public static void main(String[] args) {
		
//String Palindrome		
		String name1 = "SASASAS";
		String rev = "";
		
		for(int i=name1.length()-1; i>=0; i--)
		{
			rev = rev+ name1.charAt(i);
		}

		System.out.println("Reversed: " + rev );		
		
		System.out.println();
		
		if(rev.equals(name1))
		{
			System.out.println("Given String is a Palindrome");
		}
		else
		{
			System.out.println("Given String is not a Palindrome");
		}
		
																	System.out.println();
		
//Integer Palindrome
		int num = 123;
		int original = num;   //Store original num for comparison
		int reverse = 0;    //will hold reverse number
		
		while(num != 0)   //loops executed untill num becomes 0
		{
			int digit = num % 10;   // 123 % 10 = 3  >> Extract last digit it divides and give remaining value
			reverse = reverse * 10 + digit;   // 0 * 10 + 3 = 3  >> Add digit to reverse number
			num = num / 10;  //  123/10 = 12  >> Remove last digit from num
		}
		
		System.out.println("reverse number: " + reverse);
		
		if(original == reverse)
		{
			System.out.println("Given number is Palindrome");
		}
		else
		{
			System.out.println("Given number is not Palindrome");
		}
		
																	System.out.println();	
		
																	
//Array string Palindrome
		String[] str = {"MADAM", "HELLO", "JAVA", "LEVEL"};
		
		for(String res : str)
		{
			String rev1 = new StringBuilder(res).reverse().toString();
			if(rev1.equalsIgnoreCase(res))
			{
				System.out.println(res + "is a Palindrome");
			}
			else
			{
				System.out.println(res + "is not a Palindrome");
			}
		}																	
	


//Array int palindrome		
		int[] arr = {1,2,3,4,3,2,1};
		
		if(isPalindrome(arr))
		{
			System.out.println("Given array number is Palindrome");
		}
		else
		{
			System.out.println("Given array number is not Palindrome");
		}
		
		
	}

	private static boolean isPalindrome(int[] arr) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			if(arr[start] != arr[end])
			{
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}


	
	
}
