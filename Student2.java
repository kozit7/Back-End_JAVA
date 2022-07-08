package Calculator;

public class Student2 {

	class Student {
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		int getTotal() {
			
			return kor+eng+math;
		}
		float getAverage() {
			float avg = (kor+eng+math)/3f;
			return Math.round(avg*100)/100f;
		}
	}
}

