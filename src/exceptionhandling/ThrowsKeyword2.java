package exceptionhandling;

public class ThrowsKeyword2 {
	
	public static void main(String[] args) throws NullPointerException
	
	{		
		String s1 = null;
		
		String s2 = "abc";
		
		boolean b = s1.equals(s2);
		
		System.out.println(b);
		
	}

}
