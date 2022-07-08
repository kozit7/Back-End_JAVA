package object;

public class TireTest {

	public static void main(String[] args) {
		// 앞(front) 왼쪽(left) 타이어
		Tire fl = new Tire();
		fl.kyung=20;
		System.out.println(fl.kyung);
		// 앞(front) 오른쪽(right) 타이어
		Tire fr = new Tire();
		System.out.println(fr.kyung);
		// 뒤(back) 왼쪽(left) 타이어
		Tire bl = new Tire();
		// 뒤(back) 오른쪽(right) 타이어
		Tire br = new Tire();
		// 모든 new가 새로운 주소를 만듬
	}

}
