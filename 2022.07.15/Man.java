package People;

public class Man extends People {
	// �������̵�
	void printInfo() {
		// �θ�Ŭ������ �ִ� printInfo�޼ҵ� ȣ��
		super.printInfo();
		System.out.println("�׸��� �����Դϴ�.");
	}
	void enlist() {
		System.out.println("���밨.");
	}
}
