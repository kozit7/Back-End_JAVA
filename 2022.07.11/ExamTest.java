package Calculator;

public class ExamTest {
	//	�ν��Ͻ� �޼ҵ�
	void solution(int a, int b) {
		int sum=0;
		int tmp=0;
		// a > b �̸�,
		if(a>b) {
		// a ���� tmp ������ �����ϰ�
			tmp=a;
		// b ���� a������ �����ϰ�
			a=b;
		// tmp ���� b������ �����Ѵ�.
			b=tmp;
		}
		
		
		
		for(int i=a; i<=b; i++) {
			sum+= i;
		}
		System.out.println(sum);
	}

}
