package exceptionhandling;

public class TryCatchFinallyBlock {
	
	
	
	public static void main(String[] args) {
		
		
		try {
		String s = "abc";
		
		String s1 = "abc";
		
		boolean s2 = s.equals(s1);
		}
		
		catch(ArithmeticException e)
		{
			String message = e.getMessage();
			
			System.out.println(message);
		}
		
		finally
		{
			System.out.println("finally is executing");
		}
		
		
		
		
	}
	


}
