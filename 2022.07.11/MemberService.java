package Calculator;

public class MemberService {
	//String id;
	//String password;
	
	boolean login(String id, String password) {
		if("hong".equals(id) && "12345".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
}
