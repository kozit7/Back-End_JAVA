package Calculator;

public class Constructor {

	// 인스턴스 변수
	int a;
	// 인스턴스 변수
	int b;
	// 인스턴스 변수
	int c;
	
	// 클래스명(){} : 생성자 선언
	Constructor(){
		//this()는 같은 클래스내의 다른 생성자를 호출할 때 사용 
		this(10,20,30);
	}
	Constructor(int a, int b, int c){
		//인스턴스 변수 a = 매개변수 a
		//this.는 인스턴스 변수다.
		//this.는 자신을 참조하는 참조변수
			this.a = a;
			this.b = b;
			this.c = c;
	
		
	}
	
}
