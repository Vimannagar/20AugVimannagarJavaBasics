package encapsulation;

public class ATMMachine {
	
	
	
	public static void main(String[] args) {
		
		BankServer server = new BankServer();
		
		server.getBalance(1234);
		
		server.setBalance(5000, 1233);
		
		server.getBalance(1234);
		
	}

}
