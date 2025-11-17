package OtherCode;


class Method
{
	public  int number(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
}

public class Functions {

	public static void main(String[] args)
	{
		Method m1 = new Method();
		int res = m1.number(1, 1);
		
		System.out.println("Sum: " + res);
	
}

}
