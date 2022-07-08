package Calculator;

import java.util.Scanner;

public class CalculateTest {

	public static void main(String[] args) {
		Calculate cal1 = new Calculate();
		
		Scanner scan = new Scanner(System.in);
		
				
		System.out.println("연산할 두 정수와 연산자를 입력해주세요.");
		
		int num1 = scan.nextInt();
		
		String op = scan.next();
		
		int num2 = scan.nextInt();
		
				
		System.out.println("연산결과는 "+cal1.cal(num1, op, num2)+"입니다");
		
		
		
		
		
	}
}
