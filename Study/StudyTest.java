package AccessModifier;

import java.util.Scanner;

public class StudyTest {

	private static Study[] accountArray = new Study[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean T = true;
		
		while(T) {
			System.out.println("1.�л������Է� 2.�л���� 3.ã����� �а��̸�");
			
			int Select = scan.nextInt();
				
			if(Select == 1) {
				information();
			}
			if(Select == 2) {
				StuList();
			}
			if(Select == 3) {
				StuDept();
			}
			System.out.println("����.");
		}
	
	}

	private static void information() {
		System.out.println("�л��̸�");
		String Sname = scan.next();
		
		System.out.println("�а�");
		String Department = scan.next();
		
		System.out.println("�г�");
		int Grade = scan.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
			   accountArray[i] = new Study(Sname,Department,Grade);
			   System.out.println("����Ǿ����ϴ�");
			   break;
			   
	}
}
}
	private static void StuList() {
		System.out.println("------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			System.out.println(
			accountArray[i].Sname() + "\t" + accountArray[i].getDepartment() + "\t" + accountArray[i].Grade());
		}
		
	}
	private static void StuDept() {
		System.out.println("�а� : ");
		String Department = scan.next();
						
	}

}
