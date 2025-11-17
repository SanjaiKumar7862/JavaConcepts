package FibonacciSeriesCode;

public class Fibonacci {

	public static void main(String[] args) {
		
		
//Using while loop		
		int number = 50;
		int a = 1, b = 1;
		
		int fibonacci = 0;
		
		
		System.out.print("Fibonaaci of number is: " + a + " " + b + " "); 
		
		while(fibonacci <= number)
		{
			fibonacci = a+b;
			a = b;
			b = fibonacci;
			
			if(fibonacci > number)    //if condition not given, then loop executes n times
			{
				break;
			}
					
			System.out.print(fibonacci + " ");
		}

		
		System.out.println();
		
		
		
//Using For Loop
		int number1 = 50;
		int first = 0, second = 1;
		
		System.out.print("Fibonacci: " + first + " " + second + " ");
		for(int i=0; i<=number1; i++)
		{
			int next = first + second;
			first = second;
			second = next;
			
			if(next > number1)
			{
				break;
			}
			
			System.out.print(next + " ");
		}
		
		
	}

}
