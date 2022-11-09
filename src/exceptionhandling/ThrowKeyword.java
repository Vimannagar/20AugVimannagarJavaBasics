package exceptionhandling;

public class ThrowKeyword {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		int j = 20;
		
		if(i>j)
		{
			throw new ArithmeticException("Something went wrong please try again");
					
		}
		else {
			
			throw new NullPointerException("please try again");
		}
		

			
		
		
		
	}

}
