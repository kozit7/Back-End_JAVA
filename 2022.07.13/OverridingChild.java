package inheritance;

public class OverridingChild extends Overriding {
	int z;
	// �������̵� 
	// �θ� Ŭ�������� �޼ҵ� ������ �߰��� �ٲٴ°�
	// 1. �޼ҵ� �̸��� ���ƾ� ��.
	// 2. �Ű������� ���ƾ� ��.
	// 3. ����Ÿ���� ���ƾ� ��.
	int add()	{
		return x+y+z;
	}
}
