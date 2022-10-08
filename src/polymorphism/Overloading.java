package polymorphism;

public class Overloading {
	
	public void m1()
	{
		System.out.println("m1 method with no argument");
	}
	
	
	public void m1(int i)
	{
		System.out.println("m1 method with int argument");
	}
	
	
	public void m1(String s)
	{
		System.out.println("String argument m1 method");
	}
	
	
	public void m1(double d , char c)
	{
		System.out.println("double and character");
	}
	
	public void m1(char d , double c)
	{
		System.out.println("double and character");
	}
	
	public static void m1(String s, double d)
	{
		System.out.println("static method with String and double as an argument");
	}
	
	
	
	public int m1(boolean b)
	{
		System.out.println("method with return type");
		
		return 80;
	}
	
	
	
	
}
