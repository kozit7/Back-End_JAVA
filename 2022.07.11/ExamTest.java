package Calculator;

public class ExamTest {
	//	인스턴스 메소드
	void solution(int a, int b) {
		int sum=0;
		int tmp=0;
		// a > b 이면,
		if(a>b) {
		// a 값을 tmp 변수에 저장하고
			tmp=a;
		// b 값을 a변수에 저장하고
			a=b;
		// tmp 값을 b변수에 저장한다.
			b=tmp;
		}
		
		
		
		for(int i=a; i<=b; i++) {
			sum+= i;
		}
		System.out.println(sum);
	}

}
