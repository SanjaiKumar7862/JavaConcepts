package ArrayRelatedCode;

import java.util.ArrayList;

public class OddorEven {

	public static void main(String[] args) {
		
//1.Odd or Even number
		
		int a = 43;
		
		if(a%2 == 0)
		{
			System.out.println("a is Even number");
		}
		else
		{
			System.out.println("a is Odd number");
		}

		
//2.Odd or Even using Arrays using for loop and for each
		int[] arr = {1,2,3,4,8,10,11};
		
		System.out.println("Even numbers: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Odd numbers: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 != 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
		
		for(int num : arr)
		{
			if(num%2 == 0)
			{
				System.out.println("Even number" + num);
			}
			else 
			{
				System.out.println("Odd number" + num);	
			}
		}
		
	
//3.Odd or Even using Array list
		
		int[] number = {3,2,5,6,8,10,12,11};
		
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		//for-each to traverse through array integer
		for(int num : number)
		{
			if(num%2 == 0)
			{
				even.add(num);
			}
			else
			{	
				odd.add(num);
			}	
		}
		
		//Convert ArrayList to Array
		int[] arr1 = new int[even.size()];
		int[] arr2 = new int[odd.size()];
		
		for(int i=0; i<even.size(); i++)
		{
			arr1[i] = even.get(i);
		}
		
		for(int i=0; i<odd.size(); i++)
		{
			arr2[i] = odd.get(i);
		}
		
		
		//Traverse through arr1 and arr2 and print them
		for(int e : arr1)
		{
			System.out.println("Even numbers: " + e);
		}
		
		for(int o : arr2)
		{
			System.out.println("Odd numbers: " + o);
		}
		
		
		
		
	}

}
