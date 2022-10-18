package polymorphism;

public class D extends C {
	
	int i = 10;
	
	
	
	public static void m1()
	{
		System.out.println("static method m1 from D class");
	}
	
	public  void m2()
	{
		System.out.println("non static method m2 from D class");
	}
	
	
	public static void main(String[] args) {
		
		
		D d = new D();
		
		d.m1();// d class static method
		
		d.m2();// D class m2 method
		
		
		C c = new D();
		
		c.m1();// C class static method--> method hiding
		
		c.m2();// D class m2 method
		
		
		System.out.println(c.i);
	}


}
