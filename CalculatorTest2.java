package Calculator;

import java.util.Scanner;

public class CalculatorTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator2 cal = new Calculator2();
	while(true) {	
		System.out.println("�����ϰ��� �ϴ� �� �������� �����ڸ� �Է��ϼ���.> ");
		
		cal.a = sc.nextInt();
		
		String eq = sc.next();	//������ ����
		
		cal.b = sc.nextInt();
		
	if(eq.equals("+")) { //String�� ��ü���� equals�� ���ؾ��Ѵ�.
		
		System.out.println("�������� "+ cal.getAdd() + "�Դϴ�");
	}
	else if(eq.equals("-")) {
		
		System.out.println("�������� "+ cal.getSub() + "�Դϴ�");
	}
	else if(eq.equals("*")) {
		
		System.out.println("�������� "+ cal.getMul() + "�Դϴ�");
	}
	else if(eq.equals("/")) {
		
		System.out.println("�������� "+ cal.getDiv() + "�Դϴ�");
	}
}}
}