package Calculator;

import java.util.Scanner;

public class CalculateTest {

	public static void main(String[] args) {
		Calculate cal1 = new Calculate();
		
		Scanner scan = new Scanner(System.in);
		
				
		System.out.println("������ �� ������ �����ڸ� �Է����ּ���.");
		
		int num1 = scan.nextInt();
		
		String op = scan.next();
		
		int num2 = scan.nextInt();
		
				
		System.out.println("�������� "+cal1.cal(num1, op, num2)+"�Դϴ�");
		
		
		
		
		
	}
}
