package ArrayRelatedCode;

import java.util.ArrayList;
import java.util.Arrays;

//Get specific values from an array

public class GetSpecificValue {

	public static void main(String[] args) {
		
//		
		int[] arr = {1,2,3,4,5,6,7,8};
		int result = arr[3];
		System.out.println("Results :" + result);
		
				
//		
		Integer[] arr1 = {1,2,3,4,5,6,7,8};
		
		//Covert to Arraylist
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr1));
		int str = list.get(3);
		System.out.println("Results :" + str);
		
		
	}

}
