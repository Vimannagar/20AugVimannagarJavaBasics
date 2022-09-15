package variable;

public class NonStaticVariable {
	
	
//	syntax: data_type variable_name =value;
	
	int i = 10;
	
	double d = 56.23;
	
	String s = "Eder";
	
	char c = 'f';
	
	public static void main(String[] args) {
		
		NonStaticVariable nsv = new NonStaticVariable();
		
		System.out.println(nsv.i);
		
		m1();
		
		nsv.m2();
				
	}
	
	public static void m1()
	{
		NonStaticVariable obj = new NonStaticVariable();
		
		System.out.println(obj.d);//56.23
		
		System.out.println(obj.i);//10
	}
	
	
	public void m2()
	{
		System.out.println(s);
		
		System.out.println(c);
		
	}
	
	
	

}
