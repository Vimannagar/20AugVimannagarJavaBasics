package accesstest;

public class D extends C

{
	public static void main(String[] args) {
		
		C c = new C();
		
//		c.m1();// since C is not the child class here hence we will not be able to access it.
		
		
		D d = new D();
		
		d.m1();
		
	}
	

}
