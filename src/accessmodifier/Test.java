package accessmodifier;

public class Test {
	
	
	public void m1()
	{
		System.out.println("public non static method from Test class");
	}
	
	void m2()
	{
		System.out.println("default method from Test class");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.m1();// public method from Test class
		
		t.m2();// default method from Test class
		
		
	}

}
