package inheritance;

public class B extends A{
	
	
	public B(int i)
	{
	super("one argument");
	System.out.println("one argument constructor");	
	}

	
	public static void main(String[] args) {
		B b = new B(80);

	}
}
