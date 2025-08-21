package coreJava;

public class Variables {

	//Instance Variable --> Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block.
	public int i;
	public String geek;
	public Integer I;
	public Variables()
	{
		//Default constructor
		//Initializing Instance variable
		this.geek = "Geeks for Geeks";
	}
	
	//Declared Static Variable --> Static variables are also known as class variables. These variables are declared similarly to instance variables. 
	//The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.
	public static String geeks = "Geeks for Geeks. Geeks for Geeks";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare Local variable
		int var = 2; 	// datatype   variablename    value
		char var1 = 'A';
		String var2 = "Declare more then 1 character using string datatype";
		
		//This variable is local to this main method only
		System.out.println("Local Variable: " + var);
		System.out.print("\n");
		
		if (var>3)
		{
			String result = "Var is greater than 3";
			System.out.println(result);
		}
		else 
		{
			String result1 = "Var is less than 3";	
			System.out.println(result1);
		}
		
		if (var1 == 'B')
		{
			String result2 = "Print A";
			System.out.println(result2);		
		}
		else
		{
			String result3 = "Not equal to A";
			System.out.println(result3);
		}
		
		if (var2.equals(var1))
		{
			String result4 = "Its a String";
			System.out.println(result4);
		}
		else
		{
			String result5 = "Its not a String";
			System.out.println(result5);
			System.out.println("\n");
		}
		
		for (int i = 0; i<3; i++) 
		{
			String loopmessage = "Iteration" +i;
			System.out.println(loopmessage);
		}
		System.out.println("\n");
		
		
		//Instance variable - Object creation for Local variable
		Variables name = new Variables();
		//Print output
		System.out.println("Instance Variable");
		System.out.println("geek name: " + name.geek);
		System.out.println("Default value of int: " + name.i);
		System.out.println("Default value of Integer: " + name.I);
		
		
		System.out.println("\n");
		// Static variable
		// geeks variable can be accessed without object
        // creation Displaying O/P Variables.geeks --> using the
        // static variable
        System.out.println("Geek Name is : " + Variables.geeks);
 
        // static int c=0;
        // above line,when uncommented,
        // will throw an error as static variables cannot be
        // declared locally.
		
	}
}

//In Java, Variables are the data containers that save the data values during Java program execution. 
//Every Variable in Java is assigned a data type that designates the type and quantity of value it can hold. 
//A variable is a memory location name for the data.

// --> https://www.geeksforgeeks.org/variables-in-java/


