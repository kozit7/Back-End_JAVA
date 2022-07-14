package AccessModifier;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a = new Account(0);
		
		a.setBalance(1000);
		System.out.println(a.getBalance());
		
		a.setBalance(-1000);
		System.out.println(a.getBalance());
		
		a.setBalance(1000000);
		System.out.println(a.getBalance());
		
		a.setBalance(200000);
		System.out.println(a.getBalance());
	}

}
