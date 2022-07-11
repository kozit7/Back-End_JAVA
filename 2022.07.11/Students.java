package Calculator;

public class Students {
	String name; //학생이름
	int	   ban; //반
	int	   no; //번호
	int    kor; //국어점수
	int    eng; //영어점수
	int    math; //수학점수
	//static가 없기때문에 인스턴스 변수이다. 메인메소드에 new 라는 키워드 입력
		// 메서드 선언
	int getTotal() {
	//int 타입이라 return값을 무조건줘야한다.
		return kor+eng+math;
	}
	float getAverage()	{
		return (kor+eng+math)/3f;
		}
}
