package polymorphism;

public class B extends A {
	
	public  void m1()
	{
		System.out.println("non static method from B class");
	}
	
	public void m3()
	{
		System.out.println("m3 method from B class");
	}
	
	public static void m2()
	{
		System.out.println("static method m2 from B class");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.m1();// B class m1 method
		
		A a = new B();
		a.m1();// B class m1 method
		
		a.m4();// a class m4 method
		
		
		b.m3();// b class m3 method
		
		b.m1();// b class m1 method
		
		
		
		
		
	}

}
