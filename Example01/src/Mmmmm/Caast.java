package Mmmmm;

public class Caast {

	public static void main(String[] args) {
		
		byte b = 10; 
		char ch = 'A'; 
		int i = 100; 
		long l = 1000L;
		
		b = (byte)i;//int(4) -> byte(1)
		ch= (char)b;//byte(1) -> char(2) ĳ���ʹ� ���̳ʽ����� ǥ���Ҽ����⶧��
		short s = (short)ch;//char(2) -> short(2)
		float f = l; //long(8) -> float(4) ������ �Ǽ��� ������ �Ǽ��� ��ũ��. �׷��Ƿ� �ڵ� ����ȯ ���� byte ũ���� ���� �ȵȴ�.
		i= ch; // char(2) -> int(4)
		
		
		System.out.println(b);
		System.out.println(ch);
	
	}

}
