package exceptionhandling;

public class Test2 {
	
	Test1 t1;
	
	public void m2()
	{
		System.out.println("m2 method from Test2 class");
		t1.m1();
	}
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		
		t2.m2();
		
	}

}
