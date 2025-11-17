package ArrayRelatedCode;

import java.util.Arrays;

public class ReplaceAndCopyElementsSort {

	public static void main(String[] args) {
		
//Combined array 		
		int[] arrayA = {1,3,5,7,9};
		int[] arrayB = {2,4,6,8,10,12,14};
		
		
		//Create new array for combined array
		int[] combined = new int[arrayA.length + arrayB.length];
		
		
		//loops iterate over both arrayA and B
		for(int i=0; i<arrayA.length; i++)
		{
			combined[i] = arrayA[i];
		}
		
		for(int i=0; i<arrayB.length; i++)
		{
			combined[i + arrayA.length] = arrayB[i];
		}
		
		
		System.out.println("Combined Array A and B: ");
		for(int result : combined)
		{
			System.out.print(result + " ");
		}

																		System.out.println();
//Sort in Asc
		
		Arrays.sort(combined);
		
		System.out.println("Combined Array A and B Sorting in Asc: ");
		for(int result1 : combined)
		{
			System.out.print(result1 + " ");
		}
		
																		System.out.println();
//Sort in Desc
		
		System.out.println("Combined Array A and B Sorting in Desc: ");
		for(int i=combined.length-1; i>=0; i--)
		{
			System.out.print(combined[i] + " ");
		}
		
		
																		System.out.println();
//Replace element from A to B				
		
		//Replace element directly from arrayA to begining of arrayB
		for(int i=0; i<arrayA.length; i++)
		{
			arrayB[i] = arrayA[i];
		}
		
		
		System.out.println("Replaced element of arrayB: " );
		for(int res : arrayB)
		{
			System.out.print(res + " ");
		}
		
	}

}
