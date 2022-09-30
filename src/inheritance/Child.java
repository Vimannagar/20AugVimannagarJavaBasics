package inheritance;

public class Child extends Parent{
	
	public void bike()
	{
		System.out.println("bike from child");
	}
	
	public static void friend()
	{
		System.out.println("friend from child");
	}
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.bike();
		
		c.home();
		
		c.car();
		
		c.capital();
		
		friend();
		
		furniture();
		
	}

}
