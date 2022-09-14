package methods;

public class CallingNonStatic {
	
	public void personalInfo()
	{
		System.out.println("name is Daniel");
		System.out.println("age is 23");
		System.out.println("Heigt is 6.1");
	}
	
	public static void basicInformation()
	{
		CallingNonStatic cns = new CallingNonStatic();
		
		cns.personalInfo();
	}
	public void enterCredentials()
	{
		System.out.println("Entering credentials and click on login");
	}
	
	
	public void login()
	{
		enterCredentials();// calling of non static into non static of same class.
		C c = new C();
		c.m2();// calling of non static method into nonstatic which is from another class
	}
	
	public static void main(String[] args) {
		basicInformation();
		
		CallingNonStatic refvariable = new CallingNonStatic();
		refvariable.login();
		
		
	}

}
