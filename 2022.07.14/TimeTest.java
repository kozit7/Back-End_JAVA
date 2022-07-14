package AccessModifier;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time(1,10,10);//매개변수가 3개 인 생성자호출
		
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
	/*	System.out.println(t.hour);
		System.out.println(t.minute);
		System.out.println(t.second);  */
	}
	
}
