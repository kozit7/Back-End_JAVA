package inheritance;
// �ڽ� Ŭ����	      �ڽ� 	       ���       �θ� 
public class CaptionTv extends Tv {
	// �ڸ��� ������(true), �� ������(false)
	boolean caption;
	//�ڸ��� �����ִ� ���(�޼ҵ�)
	void displayCaption(String text){
		// caption�� ����Ǿ� �ִ� ���� true �̸� 
		if(caption) {
			System.out.println(text);
		}
		//�ڸ��� �����ּ���
	}
	
	
	
}
