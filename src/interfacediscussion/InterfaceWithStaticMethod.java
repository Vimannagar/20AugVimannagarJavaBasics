package interfacediscussion;

public interface InterfaceWithStaticMethod {
	
	
	
	public static void m1()
	{
		System.out.println("Static m1 method");
	}
	
	
	public static void main(String[] args)
	{
		m1();
		
		InterfaceWithStaticMethod.m1();
		
		
	}

}
