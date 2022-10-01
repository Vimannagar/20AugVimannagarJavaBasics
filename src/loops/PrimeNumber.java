package loops;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		
		for(int i=1; i<=number; i++)
		{
		
		if(number%i==0)
		{
			count ++;
		}
		}
		
		if(count==2)
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not a prime number");
		}
		
	}

}
