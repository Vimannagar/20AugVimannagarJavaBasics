package encapsulation;

public class BankServer {
	
	
private	double customer1= 50000;
	
	
	
	public double getBalance(int pin)
	{
		double balance;
		if(pin==1234)
		{
			System.out.println("Your balance is :"+customer1);
			balance = customer1;
			
		}
		else
		{
			System.out.println("Invalid entry please try again");
			balance = 0;
		}
		
		return balance;
		
	}
	
	
	public void setBalance(int amount)
	{
		if(amount <=customer1)
		{
			customer1 = customer1 - amount;
			System.out.println("Please collect the cash");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		
	
		
	}
	
	

}
