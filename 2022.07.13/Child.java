package inheritance;
// 자식클래스
public class Child extends Parent {
	
	int x=20;
	
	void method() {
			
	   System.out.println("x="+x);//자식클래스
	   System.out.println("this.x="+this.x);//자식클래스
	   System.out.println("super.x="+super.x);//부모클래스
	}
}
