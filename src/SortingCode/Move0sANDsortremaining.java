package SortingCode;

import java.util.Arrays;

public class Move0sANDsortremaining {

	public static void main(String[] args) {
		
		int[] num = {4,1,3,6,8,0,10,20,0};
		
		
		//find zero's count
		
		int count = 0;
		for(int zero : num)
		{
			if(zero == 0)
			{
				count++;
			}
		}
		System.out.println("Zero Count: " + count);
		
		
		//Remove zero and store remaining values in seperate array
		int[] withoutzero = new int[num.length-count];
		
		int index = 0;
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i] != 0)
			{
				withoutzero[index++] = num[i];
			}
		}
		
		System.out.print("After removing Zero: ");
		for(int n : withoutzero)
		{
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		
		
		//Sort the without zero elements
		Arrays.sort(withoutzero);
		System.out.println("After sorting without zero: " + Arrays.toString(withoutzero));
		
		
		
		//Print zero's seperately
		int[] zeros = new int[count];
		
		Arrays.fill(zeros, 0);
		System.out.println("Print zeros seperately: " + Arrays.toString(zeros));
		
		
	}

}
