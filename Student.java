package Calculator;

public class Student {
	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("a b return");
		System.out.println("----------------------");
		int a = 3;
		int b = 5;
		System.out.printf("%d %d %d%n", a, b, solution(a, b));
		a = 3;
		b = 3;
		System.out.printf("%d %d %d%n", a, b, solution(a, b));
		a = 5;
		b = 3;
		System.out.printf("%d %d %d%n", a, b, solution(a, b));
	}

	static int solution(int a, int b) {
		int sum = 0;
	    
	    	//�Ű������� ���� �� �� �� ���� ���ڰ� �� ũ��
		if(a < b) {
	    	//�� ���ڿ��� �� ���ڸ� �� ��ŭ �ݺ�
			for(int i = 0; i<=(b-a); i++) {
				sum += (a+i);
			}
		}
	   	//���� ���ڰ� �� ũ�� 
		else
	    	//�� ���ڿ��� �� ���ڸ� �� ��ŭ �ݺ�
			for(int i = 0; i<=(a-b); i++) {
				sum += (b+i);
			}
		
		return sum;
	}
}