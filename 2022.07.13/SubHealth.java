package inheritance;

public class SubHealth extends Health{
	double s_weight;
	double fat;
	String result;
	
	SubHealth() {
		this.s_weight = 0.0f;
		this.fat = 0.0;
		this.result = null;
	}
	
	void calculate() {
		if(gender == 'M') {
			s_weight = (tall-100)*0.9f;
			fat = weight/s_weight*100f;			
			} else {
				s_weight = (tall-100)*0.85f;
				fat = weight/s_weight*100f;
			}
		
		if(fat>150) {
			result = ("고도비만");
		} else if(130<=fat && 150>=fat) {
			result =("중도비만");
		} else if(121<=fat && 130>=fat) {
			result =("경도비만");
		} else if(111<=fat && 120>=fat) {
			result =("경도비만");
		} else if(91<=fat && 110>=fat) {
			result =("정상(표준체중)");
		} else if(90>=fat) {
			result =("저체중");
		}
	}
	public void output2() {
		System.out.printf("당신은 비만도는 %.2f이고"+ result +"입니다.",fat,result);
	}
}
