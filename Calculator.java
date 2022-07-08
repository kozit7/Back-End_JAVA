package Calculator;

public class Calculator {

	public static void main(String[] args) {
	
		//1. return 없이 출력
		CalculatorTest cal = new CalculatorTest();
		cal.add(10,20);
		
		//2. return이 있을 경우 출력
		//System.out.println(cal.add(10,20));
		
	}

}


/* 
 
		메소드 오버로딩이 되기위한 조건
		1.메소드명이 같아야 한다.
		2.매개변수 타입 또는 갯수가 달라야한다.
		3.리턴타입이 다른경우는 오버로딩이 성립되지 않는다.

 													*/