package AccessModifier;


import variable.ProtectedvsDefault;

public class ProtectedvsDefaultTest extends ProtectedvsDefault{

	public static void main(String[] args) {
		ProtectedvsDefaultTest pvd = new ProtectedvsDefaultTest();
		
		pvd.Protected=10; 
		pvd.Default=10;
		pvd.proadd();
		pvd.defadd();
		
		
		
		// protected는 패키지가 변경되어도 상속시켜주면 접근이 가능하다.

	}

}
