package Mmmmm;

public class Caast {

	public static void main(String[] args) {
		
		byte b = 10; 
		char ch = 'A'; 
		int i = 100; 
		long l = 1000L;
		
		b = (byte)i;//int(4) -> byte(1)
		ch= (char)b;//byte(1) -> char(2) 캐릭터는 마이너스값을 표현할수없기때문
		short s = (short)ch;//char(2) -> short(2)
		float f = l; //long(8) -> float(4) 정수와 실수가 있으면 실수가 더크다. 그러므로 자동 형변환 가능 byte 크리만 봐선 안된다.
		i= ch; // char(2) -> int(4)
		
		
		System.out.println(b);
		System.out.println(ch);
	
	}

}
