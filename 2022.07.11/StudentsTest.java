package Calculator;

public class StudentsTest {

	public static void main(String[] args) {
		Students st= new Students();
		st.kor=11;
		st.eng=25;
		st.math=37;
		
		System.out.println(st.getTotal());
		
		System.out.println(Math.round(st.getAverage()*10)/10.0); // Java
		//Math.round : �Ҽ� ù°�ڸ����� �ݿø�.
		
		// 24.6666 * 10
		
		//246.66666( �Ҽ� ù°�ڸ����� �ݿø�) ->247
		
		//247 / 10.0 -> 24.7
		
		System.out.printf("%.1f",st.getAverage()); // c���
		
		
	}

}
