package inheritance;

public class TvTest {

	public static void main(String[] args) {
	// TvŬ������ �ν��Ͻ��� ���� Tv t = new Tv();
	// new Tv()(TvŬ������ �ּҸ� ����)
	// Tv()�� �����ڸ� ȣ��
		// ���԰���
		//Tv t = new Tv();
		CaptionTv t = new CaptionTv();
		// Tv Ŭ������ �ִ� channel������ 10�� �ʱ�ȭ
		 t.channel=10;
		 t.channelUp();
		 System.out.println(t.channel);
		 
		 t.displayCaption("�ڸ� ��1"); //�⺻�� false
		 t.caption=true;
		 t.displayCaption("�ڸ� ��2");
	}

}
