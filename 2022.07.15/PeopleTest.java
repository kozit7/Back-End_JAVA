package People;

public class PeopleTest {

	public static void main(String[] args) {
		/*
		Woman w = new Woman();
		Man m = new Man();
		w.printInfo();
		m.printInfo();
		People p = new People();
		*/
		
		
// People����Ÿ������ ManŬ������ WomanŬ������
// ������ �� �ֱ� ������ �Ʒ��� ���⼺.
// People����Ÿ�� P�� Man Ŭ���� ����
		People p = new Man();
		p.printInfo();
		// enlist()�޼ҵ� ȣ�� �ȵ�.
		// (���������� p�� PeopleŸ���̰�,
		// PeopleŬ�������� enlist�޼ҵ带 ���� ���� �ʱ� ����)
		// �ε����ϰ� ����ؾ� �Ѵٸ� �� ������ Ÿ������ ����ȯ���־�� ��.
		((Man)p).enlist();
// People����Ÿ�� P�� Woman Ŭ���� ����
		p = new Woman();
		p.printInfo();
		// makeup()�޼ҵ� ȣ�� �ȵ�.
		// (���������� p�� PeopleŸ���̰�,
		// PeopleŬ�������� makeup�޼ҵ带 ���� ���� �ʱ� ����)
		// �ε����ϰ� ����ؾ� �Ѵٸ� �� ������ Ÿ������ ����ȯ���־�� ��.
		((Woman)p).makeup();
	}
}
