package loop;

public class For {

	public static void main(String[] args) {
		// 반복해서 실행.
		int i = 1;
		int sum = 0;
		// for(초기값;조건식;증감값){반복할 문장}
		for(i= 1; i <= 100; i++) {
			sum += i;
		}
		// 1~100까지 숫자를 더하라
		System.out.println(sum);
	}

}
