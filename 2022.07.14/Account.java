package AccessModifier;

public class Account {
	private int balance = 0;
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	
	Account(int balance){
		getBalance();
		//setBalance(balance);
	
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE)
			
		this.balance = balance;
		
	}
}
