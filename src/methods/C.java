package methods;

public class C {
	
	public static void m1()
	{
		System.out.println("static method m1");
	}
	
	public void m2()
	{
		System.out.println("non static method m2");
	}
	
	
	public static void main(String[] args) {
		m1();// mem allocation done at class loading
		
		C c = new C();
		
		c.m2();// memory allocation at the time of execution
		
		m1();
		
	}

}
