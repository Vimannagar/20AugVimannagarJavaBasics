package variable;

public class ThisKeyword {
	
	int a = 10;
	
	static String s = "abc";
	
	public void m1()
	{
		int a = 20;	
		
		String s = "def";
		
		System.out.println(a);//20 --> Local variable
		
		System.out.println(this.a);//10 --> non static variable
		
		System.out.println(s);//def
		
		System.out.println(this.s);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword tk = new ThisKeyword();
		
		tk.m1();
		
		
		
		
		
		
	}
	
	
	
	

}
