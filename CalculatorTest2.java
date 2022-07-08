package Calculator;

import java.util.Scanner;

public class CalculatorTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator2 cal = new Calculator2();
	while(true) {	
		System.out.println("연산하고자 하는 두 정수값과 연산자를 입력하세요.> ");
		
		cal.a = sc.nextInt();
		
		String eq = sc.next();	//연산자 저장
		
		cal.b = sc.nextInt();
		
	if(eq.equals("+")) { //String는 객체여서 equals로 비교해야한다.
		
		System.out.println("연산결과는 "+ cal.getAdd() + "입니다");
	}
	else if(eq.equals("-")) {
		
		System.out.println("연산결과는 "+ cal.getSub() + "입니다");
	}
	else if(eq.equals("*")) {
		
		System.out.println("연산결과는 "+ cal.getMul() + "입니다");
	}
	else if(eq.equals("/")) {
		
		System.out.println("연산결과는 "+ cal.getDiv() + "입니다");
	}
}}
}