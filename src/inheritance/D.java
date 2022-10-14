package inheritance;

public class D extends C {
	
	int i = 20;
	
	public void m1()
	{
		int i =40;
		System.out.println(this.i);//20
		
		System.out.println(super.i);//50
	}
	
	
	public void m2()
	{
		m1();
	}
	
	public static void m3()
	{
		
	}
	
	public static void main(String[] args) {
		
	}

}
