package Calculator;

public class Students {
	String name; //�л��̸�
	int	   ban; //��
	int	   no; //��ȣ
	int    kor; //��������
	int    eng; //��������
	int    math; //��������
	//static�� ���⶧���� �ν��Ͻ� �����̴�. ���θ޼ҵ忡 new ��� Ű���� �Է�
		// �޼��� ����
	int getTotal() {
	//int Ÿ���̶� return���� ����������Ѵ�.
		return kor+eng+math;
	}
	float getAverage()	{
		return (kor+eng+math)/3f;
		}
}
