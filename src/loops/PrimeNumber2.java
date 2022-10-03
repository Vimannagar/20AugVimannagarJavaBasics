package loops;

public class PrimeNumber2 {
	
	public static void main(String[] args) {
		int number = 7;
		int count = 0;
		
		for(int i=1; i<=number; i++)
		{
		
		if(number%i==0)
		{
			count ++;
			if(count >2)
			{
				break;				
			}
		}
		
		if(count==2)
		{
			System.out.println("number is prime");
		}
		
		
	}
	}

}
