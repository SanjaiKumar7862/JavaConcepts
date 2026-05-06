package PrimeNumberCode;

public class PrimeNumber {

	public static void main(String[] args) {
		
//Prime Number 
		
		int number = 23;
		boolean isPrime = true;
		
		//Prime numbers are greater than 1
		
		// 23 <= 1 -- false
		if(number <= 1)
		{
			isPrime = false;
		}
		
		else
		{
			for(int i=2; i <= Math.sqrt(number); i++)
			{
				if(number % i == 0)
				{
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime)
		{
			System.out.println("Prime number of a number: " + isPrime);
		}
		else
		{
			System.out.println("Prime number of a number: " + isPrime);
		}

		
//Prime number n time
		
		System.out.println("Prime number of n number: ");
		
		for(int num=1; num<=100; num++)
		{
			boolean isPrime1 = true;
			
			for(int i=2; i <= Math.sqrt(num); i++)
			{
				if(num % i == 0)
				{
					isPrime1 = false;
					break;
				}
			}
			
			if(isPrime1)
			{
				System.out.print(num + " ");
			}
		}
		
		
		
	}

}
