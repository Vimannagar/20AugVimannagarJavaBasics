package exceptionhandling;

public class Test {
	
	public static void main(String[] args) {
		int k = 0;
		
		try {
			
		int i = 10;
		
		int j = 0;
			
		 k =i/j;
		
		System.out.println("inside the try block");
		}
		
		catch(ArithmeticException r)
		{
			System.out.println("catch block is executing");
		}
		
		
		System.out.println(k);
	}

}
