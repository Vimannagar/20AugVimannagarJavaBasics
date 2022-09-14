package methods;

public class CallingStaticMethod {
	
	
	public static void m1()
	{
		System.out.println("m1 static method");
		m2();// calling of static method into static method
	}
	
	
	public static void m2()
	{
		System.out.println("m2 static method");
	}
	
	public void m3()
	{
		System.out.println("m3 non static");
		m1();// calling of static into non static method
	}

	
	public static void main(String[] args) {
		m1();
		
		CallingStaticMethod csm = new CallingStaticMethod();
		csm.m3();
		
		
	}
}
