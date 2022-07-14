package AccessModifier;

import variable.PublicvsDefault;

public class PublicvsDefaultTest {

	public static void main(String[] args) {
		PublicvsDefault pvd = new PublicvsDefault();
		
		pvd.Public=10;
		pvd.Default=20;
		
		pvd.pubadd();
		pvd.defadd();
		
		//AccessModifier 이라는 패키지 안에있어서 public랑default랑 접근이 가능
		//default 는 같은 패키지 내에서만 접근 가능
	}

}
