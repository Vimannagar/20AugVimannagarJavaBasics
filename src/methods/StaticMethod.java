package methods;

public class StaticMethod {
	
//	access_modifier static void name_of_method()
//	{
//		actions to be executed
//	}
	
	public static void additionOfNumbers()
	{
		int a =10;
		int b = 20;
		int c= a+b;
		
		System.out.println("Addtion of "+a+" and "+b+" is "+c);
	}
	
	public static void main(String[] args) {
		
		additionOfNumbers();
		
		additionOfNumbers();
		
		System.out.println("Executed the methods for 2 times");
		
		 additionOfNumbers();
		 
		 additionOfNumbers();
		 
		 StaticMethod.additionOfNumbers();
		 
		 substraction();
		 
		 A.printHello();
		 
		 A.loginToApp();
		 
		
	}
	
	public static void substraction()
	{
		int a =10;
		int b = 20;
		int c= a-b;
		
		System.out.println("differnce between "+a+" and "+b+" is "+c);
	}
	
	
	
//	WAP to print the output of substraction, multiplication and division of numbers using methods

}
