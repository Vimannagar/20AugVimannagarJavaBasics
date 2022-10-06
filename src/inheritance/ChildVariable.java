package inheritance;

public class ChildVariable extends ParentVariable {
	int i = 50;
	
	static String g = "def";
	
	
	public void m1()
	{
		int i = 60;
		System.out.println(i);//60
		
		System.out.println(this.i);//50
		
		System.out.println(super.i);//10
		
	}
	
	public static void main(String[] args) {
		
		ChildVariable cv = new ChildVariable();
		
		System.out.println(cv.i);// 50(Child class)
		
		ParentVariable pv = new ParentVariable();
		
		System.out.println(pv.i);//10 (Parent class)
		
		System.out.println(g);//def (child class)
		
		System.out.println(ParentVariable.g);//abc(parent class)
		
	}
	
	

}
