package Calculator;

public class Constructor {

	// �ν��Ͻ� ����
	int a;
	// �ν��Ͻ� ����
	int b;
	// �ν��Ͻ� ����
	int c;
	
	// Ŭ������(){} : ������ ����
	Constructor(){
		//this()�� ���� Ŭ�������� �ٸ� �����ڸ� ȣ���� �� ��� 
		this(10,20,30);
	}
	Constructor(int a, int b, int c){
		//�ν��Ͻ� ���� a = �Ű����� a
		//this.�� �ν��Ͻ� ������.
		//this.�� �ڽ��� �����ϴ� ��������
			this.a = a;
			this.b = b;
			this.c = c;
	
		
	}
	
}
