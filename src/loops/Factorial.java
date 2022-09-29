package loops;

public class Factorial {
	
	public static void factorial(int number)
	{
		
		int factorial =1;
		
		for(int i=1; i<=number; i++)
		{
			factorial = factorial * i;
		}
		
		System.out.println(factorial);
	}
	
	
	
	public static void main(String[] args) {
		
		
//		int number = 2;
//		int factorial =1;
//		
//		for(int i=1; i<=number; i++)
//		{
//			factorial = factorial * i;
//		}
//		
//		System.out.println(factorial);
		
		factorial(5);
		factorial(10);
	}

}
