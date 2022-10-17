package polymorphism;

public class D extends C {
	
	int i = 10;
	
	
	
	public static void m1()
	{
		System.out.println("static method m1 from D class");
	}
	
	
	public static void main(String[] args) {
		
		
		D d = new D();
		
		d.m1();
		
		
		C c = new D();
		
		c.m1();
		
		System.out.println(c.i);
	}


}
