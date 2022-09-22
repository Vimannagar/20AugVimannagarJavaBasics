package categoriesofmethod;

public class WithRetWithArg {
	
	public int m1(int a, int b)
	{
		int multivalue = a*b;
		
		return multivalue;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		WithRetWithArg wrwa = new WithRetWithArg();
		int a = wrwa.m1(10, 20);
		
		System.out.println(a);
		
		int b = a+20;
		
		System.out.println(b);
	}

}
