package People;

public class PeopleTest {

	public static void main(String[] args) {
		/*
		Woman w = new Woman();
		Man m = new Man();
		w.printInfo();
		m.printInfo();
		People p = new People();
		*/
		
		
// People참조타입으로 Man클래스와 Woman클래스를
// 참조할 수 있기 때문에 아래는 다향성.
// People참조타입 P로 Man 클래스 참조
		People p = new Man();
		p.printInfo();
		// enlist()메소드 호출 안됨.
		// (참조형변수 p는 People타입이고,
		// People클레스에는 enlist메소드를 갖고 있지 않기 때문)
		// 부득이하게 사용해야 한다면 각 참조형 타입으로 형변환해주어야 함.
		((Man)p).enlist();
// People참조타입 P로 Woman 클래스 참조
		p = new Woman();
		p.printInfo();
		// makeup()메소드 호출 안됨.
		// (참조형변수 p는 People타입이고,
		// People클레스에는 makeup메소드를 갖고 있지 않기 때문)
		// 부득이하게 사용해야 한다면 각 참조형 타입으로 형변환해주어야 함.
		((Woman)p).makeup();
	}
}
