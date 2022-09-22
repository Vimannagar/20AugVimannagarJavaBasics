package operators;

public class Comparative {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

//		greater than >

		boolean c = a > b;

		System.out.println(c);// false

// greater than or equal to  >=

		boolean d = b >= 20;

		System.out.println(d);// true

//		less than

		boolean e = a < b;

		System.out.println(e);// true

//		less than or equals <=

		boolean f = a <= b;

		System.out.println(f);// true

//		equals '=='

		boolean g = a == b;

		System.out.println(g);// false

//		Not equals '!='

		boolean h = a != b;

		System.out.println(h);// true

	}

}
