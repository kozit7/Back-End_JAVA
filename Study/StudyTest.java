package AccessModifier;

import java.util.Scanner;

public class StudyTest {

	private static Study[] accountArray = new Study[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean T = true;
		
		while(T) {
			System.out.println("1.학생정보입력 2.학생목록 3.찾고싶은 학과이름");
			
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
			System.out.println("종료.");
		}
	
	}

	private static void information() {
		System.out.println("학생이름");
		String Sname = scan.next();
		
		System.out.println("학과");
		String Department = scan.next();
		
		System.out.println("학년");
		int Grade = scan.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
			   accountArray[i] = new Study(Sname,Department,Grade);
			   System.out.println("저장되었습니다");
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
		System.out.println("학과 : ");
		String Department = scan.next();
						
	}

}
