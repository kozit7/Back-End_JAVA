package inheritance;

public class TvTest {

	public static void main(String[] args) {
	// Tv클래스를 인스턴스로 생성 Tv t = new Tv();
	// new Tv()(Tv클래스의 주소를 생성)
	// Tv()는 생성자를 호출
		// 포함관계
		//Tv t = new Tv();
		CaptionTv t = new CaptionTv();
		// Tv 클래스에 있는 channel변수에 10을 초기화
		 t.channel=10;
		 t.channelUp();
		 System.out.println(t.channel);
		 
		 t.displayCaption("자막 봄1"); //기본값 false
		 t.caption=true;
		 t.displayCaption("자막 봄2");
	}

}
