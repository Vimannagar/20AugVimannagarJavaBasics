package loops;

public class PrimeNumberBetween1To100 {
	
	public static void main(String[] args) {
		int number=1;
		int count = 0;
		for(number=1; number<=100; number++)
		{
		for(int i=2; i<number; i++)
		{
		
		if(number%i==0)
		{
			count = count+1;
		}
		}
		
		if(count==0)
		{
			System.out.println(number+" is a prime number");
		}
		
		else
		{
			count=0;
		}
		
		}
		
		
		
	}

}
