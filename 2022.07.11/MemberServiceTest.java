package Calculator;

public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService MS = new MemberService();
		boolean result = MS.login("hong","12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			MS.logout("hong");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
	}

}
