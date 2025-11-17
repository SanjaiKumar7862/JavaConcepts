package ArrayRelatedCode;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNuminArray {

	public static void main(String[] args) {
		
//Find missing number in an Array		
		
		int[] arr = {1,2,3,6,7,10};
		
		int n = 10;
		
		List<Integer> missing = new ArrayList<>();
		
		for(int i=1; i<=n; i++)
		{
			boolean found = false;
			
			for(int c : arr)
			{
				if(c == i)
				{
					found = true;
					break;
				}
			}
			
			if(!found)
			{
				missing.add(i);
			}
			
		}
		
		System.out.println("Missing:" + missing);

	}

}
