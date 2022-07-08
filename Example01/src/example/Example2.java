package example;

public class Example2 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		int c = a+b; 
			//  int + int => byte  
		//int 보다 작은타입들은 int로 바꿔놓고 계산해서 byte 를 int 로 고쳐줘야한다.
		
		char ch ='A';
		ch += 2 ;
		
		float f = 3/2f;
		long l = 3000 * 3000 * 3000l;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = d!=f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("reslut="+result);
		
		

	}

}
