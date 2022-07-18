package Exception;

public class Exception {

	public static void main(String[] args) {
		/* int a = "정자바"; // 컴파일 에러
		int a=10;
		int b=0;
		
		System.out.println(a/b); // 런타임 에러
								 // 산술적인 예외
		*/
		int a=0;
		int b=0;
		System.out.println(1);
		
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(a/b);
			System.out.println(4);
		} catch(ArithmeticException ae) {
			System.out.println(5);

			if(a==0) {
				a=1;
			} 
			if(b==0) {
				b=1;
			}
			System.out.println(a/b);
		}finally {
			System.out.println(4);
		}
		System.out.println(6);
		}

}
