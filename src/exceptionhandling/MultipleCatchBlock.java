package exceptionhandling;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("first line of try block");
			int [] a = {1, 5, 3, 2, 6};
			
			System.out.println(a[9]);
			
			System.out.println("last line of try block");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Catch block is executing");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Nullpointer Catch block is executing");
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception catch is executing");
		}
		
		
	}

}
