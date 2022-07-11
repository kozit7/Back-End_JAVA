package Calculator;

public class StudentsTest {

	public static void main(String[] args) {
		Students st= new Students();
		st.kor=11;
		st.eng=25;
		st.math=37;
		
		System.out.println(st.getTotal());
		
		System.out.println(Math.round(st.getAverage()*10)/10.0); // Java
		//Math.round : 소수 첫째자리에서 반올림.
		
		// 24.6666 * 10
		
		//246.66666( 소수 첫째자리에서 반올림) ->247
		
		//247 / 10.0 -> 24.7
		
		System.out.printf("%.1f",st.getAverage()); // c언어
		
		
	}

}
