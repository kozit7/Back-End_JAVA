package inheritance;

public class SubHealth extends Health{
	double s_weight;
	double fat;
	String result;
	
	SubHealth() {
		this.s_weight = 0.0f;
		this.fat = 0.0;
		this.result = null;
	}
	
	void calculate() {
		if(gender == 'M') {
			s_weight = (tall-100)*0.9f;
			fat = weight/s_weight*100f;			
			} else {
				s_weight = (tall-100)*0.85f;
				fat = weight/s_weight*100f;
			}
		
		if(fat>150) {
			result = ("����");
		} else if(130<=fat && 150>=fat) {
			result =("�ߵ���");
		} else if(121<=fat && 130>=fat) {
			result =("�浵��");
		} else if(111<=fat && 120>=fat) {
			result =("�浵��");
		} else if(91<=fat && 110>=fat) {
			result =("����(ǥ��ü��)");
		} else if(90>=fat) {
			result =("��ü��");
		}
	}
	public void output2() {
		System.out.printf("����� �񸸵��� %.2f�̰�"+ result +"�Դϴ�.",fat,result);
	}
}
