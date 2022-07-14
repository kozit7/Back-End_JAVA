package AccessModifier;

import java.util.Scanner;

public class BankApplicationTest {
	
	private static BankApplication[] accountArray = new  BankApplication[100];
	private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {

		
		
		boolean T = true;
				
		while(T) {

			System.out.println("------------------------------------------");
			System.out.println("1. ���»���|2. ���¸�� |3. ���� |4. ��� |5. ���� ");
			System.out.println("------------------------------------------");
			System.out.println("����>");
				
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
		System.out.println("���α׷��� �����մϴ�.");
	} // main
    
	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		
		System.out.println("���¹�ȣ : ");
		String ano = scanner.next();
		
		System.out.println("������ : ");
		String owner = scanner.next();
		
		System.out.println("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
			   accountArray[i] = new BankApplication(ano,owner,balance);
			   System.out.println("���: ���°� �����Ǿ����ϴ�.");
			   break;
			}
		}
	}
	private static void accountList() {
		System.out.println("------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int dep = scanner.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
			System.out.println("���: �Ա��� �����Ǿ����ϴ�.");
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
		System.out.println("���");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int withd = scanner.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
		} else {
			if (withd > findAccount(ano).getBalance()) {
				System.out.println("�ܾ׺��� ū �׼��� �Է��ϼ̽��ϴ�.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - withd);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
			}
		}
	}
	
	
}
