package inheritance;
// 자식 클래스
public class Point3D extends Point2D {
	int z;
	
	Point3D(int x, int y,int z){
		super(x,y);// 부모클래스 반드시 첫번째 줄에 있어야 함.
		
		this.z=z;
	}
	
	String getLocation() { //오버라이딩
		return "x : " + x + ", y : " + y+", z : " + z;
	}
	// 생성자는 상속을 받지않는다.
}
