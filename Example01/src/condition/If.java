package condition;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// else가 없는 if문
		// 평균이 70점 이상이면 합격
		// 평균을 저장하는 변수(avg)
//		float avg=65.5f;
//		if(avg >= 70) {
//			//합격 이라는 문자열을 console 에 출력
//			System.out.println("합격");
//		}
		// if ~ else 문
		// 평균이 70점 이상이면 합격, 그렇지 않으면 불합격
		//평균을 저장하는 변수(avg)
//		float avg=69f;
//		if(avg >= 70) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
//		
		// if ~ else if ~ else 문
		// 평균이 70점 이상이면 합격,평균이 69.5이상 이면 보류, 그렇지 않으면 불합격
		//평균을 저장하는 변수(avg)
		Scanner s = new Scanner(System.in);
		System.out.println("평균값을 입력하세요.");
		float avg =s.nextFloat();
		
		if(avg >= 70) {
			
			System.out.println("합격");
			
		} else if(avg >= 69.5) {
			
			System.out.println("보류");
			
		} else {
			
			System.out.println("불합격");
			
		}

	}

}
