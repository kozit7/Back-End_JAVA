package inheritance;
// �ڽ�Ŭ����
public class Child extends Parent {
	
	int x=20;
	
	void method() {
			
	   System.out.println("x="+x);//�ڽ�Ŭ����
	   System.out.println("this.x="+this.x);//�ڽ�Ŭ����
	   System.out.println("super.x="+super.x);//�θ�Ŭ����
	}
}
