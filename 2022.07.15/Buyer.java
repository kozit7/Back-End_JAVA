package People;

public class Buyer {
	// �����ݾ�
	int money =1000;
	Product[] item = new Product[5];
	int i = 0; //item�� �ε��� ����  i������ ����
	//��ǰ�� ��� ���
	void buy(Product p) {
		// ���� ���� �ݾ�= ���� ���� �ݾ� - ��ǰ����
		// �����ݾ� = �����ݾ�(money) - ��ǰ ����
		//money = money - (p.price);
		money -= (p.price);
		System.out.println(p.toString()+"��ǰ�� �����ϼ̽��ϴ�.������"+p.price+"�Դϴ�.");
		item[i++]=p;
	}
}
