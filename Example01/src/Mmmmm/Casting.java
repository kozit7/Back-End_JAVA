package Mmmmm;

public class Casting {

	public static void main(String[] args) {
		int a = 85 ;
		//     (타입) 변수명
		// int(4byte) -> byte(1byte)
		byte b = (byte) a ; // 강제 형변환 : 데이터손실이 일어날수밖에없음
		// byte(1byte) -> int(4byte)
		b=10;
		a = b ; // 자동형변환
		// int -> float
		float c = a;
		// float -> int
		a = (int) c; // 자동 형변환 : 표현이 더많이되는쪽이 높다
		
		
		
	}
	
}
