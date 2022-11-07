package exceptionhandling;

public class CheckedException2 {
	
	public static void main(String[] args) {
		
		System.out.println("first line ");
		
		try {
			Thread.sleep(5000);
		} 
		
		catch (InterruptedException e) {
			System.out.println("inside the catch block");
			
		}
		
		System.out.println("Last line ");
		
	}

}
