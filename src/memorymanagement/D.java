package memorymanagement;

public class D extends E
{
	
	public void m10()
	{
		a.m1();
		c.m7();
	}
	
	
	public void m11()
	{
		
		a.m1();
		
		b.m5();
		
	}
	
	public void m12()
	{
		c.m8();
		
		b.m5();
		
		a.m3();
	}
	
	public static void main(String[] args) {
		
		D d = new D();
		
		d.m10();
		
		d.m12();
		
		
	}

}
