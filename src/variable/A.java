package variable;

public class A {
	
	int i = 10;
	int j = 20;
	
	
	static int k= 80;
	
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println("value of i from a1 obj is "+a1.i);//10
	
		a1.i = 30;
		
		A a2 = new A();
		
		System.out.println("value of i from a2 obj is "+a2.i);//10
	
		System.out.println("value of i from a1 obj is "+a1.i);//30
		
		a2.j= 100;
		
		System.out.println("value of j from a1 obj is "+a1.j);//20
		
		System.out.println(k);//80
		
		System.out.println(a1.k);//80
		
		a2.k= 60;
		
		System.out.println(k);
		
		System.out.println(a1.k);
		
		System.out.println(a2.k);
	}

}
