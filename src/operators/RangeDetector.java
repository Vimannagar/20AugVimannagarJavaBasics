package operators;

public class RangeDetector {
	
	public static void main(String[] args) {
		
		int i = 12;
		
		if(i>0 && i<21)
		{
			System.out.println(i+" is between 1 and 20");
		}
		
		else if(i>20 && i<41)
		{
			System.out.println(i+" is between 21 and 40");
		}
		
		else if(i>40 && i<61)
		{
			System.out.println(i+" is between 41 and 60");
		}
		else
		{
			System.out.println(i+" doesn't belongs to any range");
		}
		
	}

}
