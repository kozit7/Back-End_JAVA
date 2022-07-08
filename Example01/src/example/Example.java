package example;

public class Example {

	public static void main(String[] args) {
		int apples = 123;
		int bucket = 10;
		int Abucket = (apples/bucket + (apples%bucket > 0 ? 1 : 0));
		
		System.out.println(Abucket);
				
		int num =0;
		
		System.out.println(num > 0 ? "양수" :(num < 0 ? "음수" : "0"));
		
		char ch = 'c';
		boolean b = (ch >= 'a' && ch <= 'z') ||( ch >= 'A' && ch <= 'Z' ) ||( ch >= '0' && ch <= '9' );
		//자바가 이항연산자를 연산할때는 int보다 작은 데이터타입은 int타입으로 바꿔놓고 연산한다.
		System.out.println(b);
		
		
	}

}
