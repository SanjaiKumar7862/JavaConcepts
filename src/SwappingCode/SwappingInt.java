package SwappingCode;

public class SwappingInt {

	public static void main(String[] args) {
		
//Using Temp variable		
		int a = 1, b = 2;
		System.out.println("Before swapping: " + "[" + a + " " + b + "]");
		
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping: " + "[" + a + " " + b + "]");

		

//without Using Temp variable
		int first = 5, last = 7;
		System.out.println("Before swapping: " + "[" + first + " " + last + "]");
		
		first = first - last;
		last = first + last;
		first = last - first;
		
		System.out.println("After swapping: " + "[" + first + " " + last + "]");
		
		
	}

}
