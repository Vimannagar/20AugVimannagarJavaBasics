package operators;

public class LogicalOperators {
	
	
	public static void main(String[] args) {
		
//		Logical AND operator &&
		
		int a = 10;
		
		int b = 20;
		
	boolean	c = a==10 &&  b<=a;
	
	System.out.println(c);//false
	
	
//	Logical OR operator ||
	
	boolean d = a>=6 || b!=20;
	
	System.out.println(d);//true
	
	
	
//	logical NOT operator   !
	
	
	boolean e = !(a==10);
	
	System.out.println(e);//false
	
	
//	a, b, c, d check whether they are equal or not
	
	
int f = 10;
int g = 10;
int h = 5;
int i = 10;
	
if((f==g) && (h==i) && (i==g))
{
	System.out.println("all sides are equal");
}
else
{
	System.out.println("all sides are not equal");
}
	
	
	
	
	
		
	}

}
