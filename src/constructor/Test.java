package constructor;

public class Test {

	public Test()
	{
		System.out.println("zero argument constructor");
	}
	
	public Test(int i)
	{
		System.out.println("one argument int constructor");
	}
	

	public Test(String i)
	{
		System.out.println("one argument String  constructor");
	}
	
	public Test(int i, int j)
	{
		System.out.println("two argument int contructor");
	}
	
	public Test(int u, String p)
	{
		System.out.println("two argument int contructor");
	}
	
	public Test(String u, int p)
	{
		System.out.println("two argument int contructor");
	}
	
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Test t1 = new Test();
		
		Test t2 = new Test(50);
		
		String s= "jsdhf";
		
		Test t3 = new Test("Velocity");
		
		
	}
}
