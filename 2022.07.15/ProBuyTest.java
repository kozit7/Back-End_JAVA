package People;

public class ProBuyTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		// Product p = new computer();
		b.buy(new Computer()); // ��ǻ�͸� ��ڴ�.
		// Product p = new Tv();
		b.buy(new Tv()); // Tv�� ��ڴ�.
		
		
		System.out.println("���� ������ �ݾ���"+b.money);
	}

}
