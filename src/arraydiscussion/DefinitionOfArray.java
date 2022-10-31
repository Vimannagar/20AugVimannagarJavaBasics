package arraydiscussion;

public class DefinitionOfArray {
	
	public static void main(String[] args) {
		
//		Syntax: datatype [] variablename = new datatype[size];
		
		
		int [] a = new int[5];
		
		a[0] = 50;
		a[1] = 10;
		a[3] = 12;
		a[2] = 5; 
		a[4] = 9;
		
		
		for(int i=0; i<5; i++ )
		{
			System.out.println(a[i]);
		}
		
	}

}
