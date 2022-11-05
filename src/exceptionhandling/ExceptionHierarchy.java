package exceptionhandling;

public class ExceptionHierarchy {
	
public static void main(String[] args) {
		
		try
		{
			System.out.println("first line of try block");
			int [] a = {1, 5, 3, 2, 6};
			
			System.out.println(a[9]);
			
			System.out.println("last line of try block");
			
			int i = 10/0;
		}
					
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Catch block is executing");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Nullpointer Catch block is executing");
		}
		
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception catch is executing");
		}
		
		catch(RuntimeException e)
		{
			System.out.println("RunTimeException catch is executing");
		}
		
		
		
	}

}
