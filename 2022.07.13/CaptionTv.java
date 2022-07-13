package inheritance;
// 자식 클래스	      자식 	       상속       부모 
public class CaptionTv extends Tv {
	// 자막을 볼건지(true), 안 볼건지(false)
	boolean caption;
	//자막을 보여주는 기능(메소드)
	void displayCaption(String text){
		// caption에 저장되어 있는 값이 true 이면 
		if(caption) {
			System.out.println(text);
		}
		//자막을 보여주세요
	}
	
	
	
}
