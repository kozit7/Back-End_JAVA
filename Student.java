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
	    
	    	//매개변수로 받은 두 수 중 뒤의 숫자가 더 크면
		if(a < b) {
	    	//뒷 숫자에서 앞 숫자를 뺀 만큼 반복
			for(int i = 0; i<=(b-a); i++) {
				sum += (a+i);
			}
		}
	   	//뒤의 숫자가 더 크면 
		else
	    	//앞 숫자에서 뒷 숫자를 뺀 만큼 반복
			for(int i = 0; i<=(a-b); i++) {
				sum += (b+i);
			}
		
		return sum;
	}
}