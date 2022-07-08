package operator;

public class Operator {

	public static void main(String[] args) {
		// 산술 연산자(+ , - , * , / , %)
		
		// 비교 연산자(< , > , <= , >= , == , !=)
		
		// 논리 연산자(&&, || , ! , ^)
		
		// 대입 연산자(= , += , -= , *= , /= , %=)
		
		// 삼항 연산자(조건식?참:거짓)
		
		// 3 + 4 = 3,4는 피연산자 / +는 연산자
//		int x = 10;
//		int y = 20;
//		
//		boolean result = x + y > 10 && x * y < 20;
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(y >= 5 || x > 0 && x > 2);
		// && 연산자 '먼저'사용이므로 true ||(or)연산자 먼저사용하고싶으면 ( ) 를써야한다
		System.out.println(y += 10 - x++); // 15 - 2 = 13 x++은 저장후 증감
		System.out.println(x+=2); // 5 x++저장후 증감되어서 3 + 2 = 5
		System.out.println(	!('A' <= c && c <='Z')	); // && 연산자 사용으로 둘다같으므로 true를써야하지만 !(부정연산자)로인해 반대인 false가나온다.
		System.out.println('C'-c); // 아스키코드'C'=67 - 'A'65 =2
		System.out.println('5'-'0'); //아스키코드 '5'53 - '0'48 =5
		System.out.println(c+1); // 아스키코드 'A'65 + 1 =66 
		System.out.println(++c); //++'A'증감후 저장 = B
		System.out.println(c++); //'A'++저장후 증감 = B
		System.out.println(c); //위에서 저장후 증감 하엿기 때문에 = C
	}

}
