package ArrayRelatedCode;

import java.util.Arrays;

//Move all zeros to the end and start of an array

public class MoveallZerostoend {

	public static void main(String[] args) {
	
//1.Move all zeros to the end of an array		
		
		int[] arr = {1,0,9,3,2,0,10,11};
		
		//Position to place the next non-zero element
		int index = 0;
		
		//for loop to traverse array and condition != 0 i.e, to add in index array
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != 0)
			{
				arr[index] = arr[i];
				index++;
			}
		}
		
		//While loop checks untill condition satisfy and it Fill remaining positions with 0
		while(index < arr.length)
		{
			arr[index] = 0;
			index++;
		}
		
		System.out.println("Moved zero to last: " + Arrays.toString(arr));

		
		
//2.Move all zeros to the starting of an array		
		
		int[] arr1 = {1,0,9,3,2,0,10,11};
		
		//Array length store in array variable
		int[] result = new int[arr1.length];
		
		int index1 = 0;
				
		// Step 1: Copy all zeros first
        for (int num : arr1) 
        {
            if (num == 0) 
            {
                result[index1++] = num;
            }
        }
        
        // Step 2: Copy all non-zeros after zeros
        for (int num : arr1) 
        {
            if (num != 0) 
            {
                result[index1++] = num;
            }
        }
		
		System.out.println("Moved zero to first: " + Arrays.toString(result));
		
		
	}

}
