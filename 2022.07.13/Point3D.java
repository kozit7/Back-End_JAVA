package inheritance;
// �ڽ� Ŭ����
public class Point3D extends Point2D {
	int z;
	
	Point3D(int x, int y,int z){
		super(x,y);// �θ�Ŭ���� �ݵ�� ù��° �ٿ� �־�� ��.
		
		this.z=z;
	}
	
	String getLocation() { //�������̵�
		return "x : " + x + ", y : " + y+", z : " + z;
	}
	// �����ڴ� ����� �����ʴ´�.
}
