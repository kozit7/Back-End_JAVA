package Calculator;

public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService MS = new MemberService();
		boolean result = MS.login("hong","12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			MS.logout("hong");
		} else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}

}
