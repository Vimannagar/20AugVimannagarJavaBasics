package categoriesofmethod;

public class WithRetNoArg {
	
	public static String m1()
	{
		String s = "abc";
		
		String ss = s+"def";
		
		System.out.println(s);
		
		return  "Velocity";
		
	}
	

	public static char m2()
	{
		String s = "abc";
		
		String ss = s+"def";
		
		System.out.println(s);
		
		return 'c';
		
	}


	public static void main(String[] args) {
		
		String a = m1();
	
	System.out.println(a);
	
	char d = m2();
	
	
	System.out.println(d);
		
		
	}



}
