package StarPatternCode;

public class PrintStar {

	public static void main(String[] args) {
		
//Star - 1		
		
		int row = 3;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//Star - 2
		
		int rows = 5;
		
		for(int i=rows; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//Start - 
		
		
		
	}

}
