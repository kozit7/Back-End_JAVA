package AccessModifier;

import java.util.Scanner;

public class BankApplicationTest {
	
	private static BankApplication[] accountArray = new  BankApplication[100];
	private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {

		
		
		boolean T = true;
				
		while(T) {

			System.out.println("------------------------------------------");
			System.out.println("1. 계좌생성|2. 계좌목록 |3. 예금 |4. 출금 |5. 종료 ");
			System.out.println("------------------------------------------");
			System.out.println("선택>");
				
			int SelectNum = scanner.nextInt();
			
			if(SelectNum ==1 ) {
				createAccount();
			}
			if(SelectNum ==2 ) {
				accountList();
			}
			if(SelectNum ==3 ) {
				deposit();
			}
			if(SelectNum ==4 ) {
				withdraw();
			}
			if(SelectNum ==5 ) {
				T = false;
			}
		} // while
		System.out.println("프로그램을 종료합니다.");
	} // main
    
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.println("계좌주 : ");
		String owner = scanner.next();
		
		System.out.println("초기입금액 : ");
		int balance = scanner.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
			   accountArray[i] = new BankApplication(ano,owner,balance);
			   System.out.println("결과: 계좌가 생성되었습니다.");
			   break;
			}
		}
	}
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
		
	}
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int dep = scanner.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
			System.out.println("결과: 입금이 성공되었습니다.");
		}
	}
	private static BankApplication findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int withd = scanner.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			if (withd > findAccount(ano).getBalance()) {
				System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - withd);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
		}
	}
	
	
}
