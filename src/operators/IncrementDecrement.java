package operators;

public class IncrementDecrement {
	
	
	public static void main(String[] args) {
		int x = 10;
		
		int y = ++x;
		
		System.out.println("x value is :"+x);//11
		
		System.out.println("y value is :"+y);//11
		
		int w =10;
		int v = w++;
		
		System.out.println("w value is :"+w);//11
		
		System.out.println("v value is :"+v);//10
		
		
		int t = 10;
		int u = --t;
		
		System.out.println("t value is :"+t);//9
		
		System.out.println("u value is :"+u);//9
		
		int r = 10;
		int s = r--;;
		
		System.out.println("r value is :"+r);//9
		
		System.out.println("s value is :"+s);//10
		
		
		s++;
		System.out.println(s);//11
		
	}

}
