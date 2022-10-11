package polymorphism;

public class B extends A {
	
	public  void m1()
	{
		System.out.println("non static method from B class");
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
		
	}

}
