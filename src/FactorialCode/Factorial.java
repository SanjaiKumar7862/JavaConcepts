package FactorialCode;

public class Factorial {

	public static void main(String[] args) {
		
//Factorial using for loop
		int number = 5;
		int factorial = 1;
		
		for(int i=1; i<=number; i++)
		{
			factorial = factorial * i;
		}
		
		System.out.println("Factorial using For loop: " + factorial);
		
		
		
//Factorial using recursion method
		
		class recursion
		{
			static int factorial(int n)
			{
				if(n <= 1)
				{
					return 1;
				}
				else
				{
					return n * factorial(n-1);
				}
			}
		}
		
		recursion fact = new recursion();
		int res = fact.factorial(5);
		System.out.println("Factorial using Recursion method: " + res);
		
		
		
//Factorial using While loop
		
		int num = 5;
		int i = 1;
		int facto = 1;
		
		while(i <= num)
		{
			facto = facto * i;
			i++;
		}
		System.out.println("Factorial using while loop: " + facto);
		
	}

}

/*
 * Recursion in Java is a programming technique where a method calls itself directly or indirectly to solve a problem. 
 * It is particularly useful for breaking down complex problems into smaller, more manageable sub-problems. 
 * A method that uses recursion is called a recursive method.
 */


