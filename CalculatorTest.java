package Calculator;

public class CalculatorTest {

	void add(int a, int b) { //static 가없으므로 인스턴스 메소드
		/* 1. return없이 출력
		System.out.println(a+b);
		*/
	
		//2. return이 있을 경우 출력
		System.out.println(a+b);
		//return a + b; // void가 아니면 리턴키워드가 있어야함
		}
}

