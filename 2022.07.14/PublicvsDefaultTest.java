package AccessModifier;

import variable.PublicvsDefault;

public class PublicvsDefaultTest {

	public static void main(String[] args) {
		PublicvsDefault pvd = new PublicvsDefault();
		
		pvd.Public=10;
		pvd.Default=20;
		
		pvd.pubadd();
		pvd.defadd();
		
		//AccessModifier �̶�� ��Ű�� �ȿ��־ public��default�� ������ ����
		//default �� ���� ��Ű�� �������� ���� ����
	}

}
