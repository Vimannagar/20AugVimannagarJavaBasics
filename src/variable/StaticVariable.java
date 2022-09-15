package variable;

public class StaticVariable {
	
//	Syntax --> static data_type variable_name = value;
	
	static boolean b = false;
	
	static int v = 50;
	
	static String s = "Henry";
	
	
	public static void m1()
	{
		System.out.println(b);
		
		System.out.println(StaticVariable.b);
	}
	
	
	public void m2()
	{
		System.out.println(v);
	}
	
	public static void main(String[] args) {
		m1();
		
		System.out.println(v);// accessing static variable from same class
		
		System.out.println(Test.i);//accessing static variable from other class
		
		StaticVariable sv = new StaticVariable();
		
		sv.m2();
		
		System.out.println(s);
		
		
		
		
		
		
		
	}
	
	
	
	
}
