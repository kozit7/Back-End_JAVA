package Mmmmm;

public class Casting {

	public static void main(String[] args) {
		int a = 85 ;
		//     (Ÿ��) ������
		// int(4byte) -> byte(1byte)
		byte b = (byte) a ; // ���� ����ȯ : �����ͼս��� �Ͼ���ۿ�����
		// byte(1byte) -> int(4byte)
		b=10;
		a = b ; // �ڵ�����ȯ
		// int -> float
		float c = a;
		// float -> int
		a = (int) c; // �ڵ� ����ȯ : ǥ���� �����̵Ǵ����� ����
		
		
		
	}
	
}
