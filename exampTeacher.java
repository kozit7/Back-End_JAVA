package example;

import java.util.Scanner;

public class exampTeacher {

	public static void main(String[] args) {
		// 총합을 저장하는 변수 1번 문제
		int sum=0;
		// for문을 이용하여 1~100까지의 정수
		for(int i=1;i<101;i++) {
			// 3의 배수
			if(i%3==0) {
				sum+= i; // sum = sum + i;
			}
		}// for문 끝
		System.out.println(sum);
		
		/*// 2번 알고리즘
		//0 ~ 0.9999999999999:임의의 값
		//0 ~ 0.9999999999999:임의의 값
		//x6 ~ x6
		//==========================
		//0 ~ 5.444444444444
		//Math.random() * 6;
		//(int)Math.random() * 6;
		//(int)(0 ~ 5.44444444444)
		//      0 ~ 5
		//(int)(Math.random() * 6) + 1;
		//      0 ~ 5
		//     +1 ~ +1
		// ==========================
		//      1 ~ 6*/
		
		
		int dice1 = 0;
		int dice2 = 0;
		while(dice1 + dice2 !=5) {
		// 첫번째 주사위에서 나온 결과를 dice1변수에 저장
		dice1 = (int)(Math.random() *6) +1;
		// 두번째 주사위에서 나온 결과를 dice2변수에 저장
		dice2 = (int)(Math.random() *6) +1;
		
		System.out.println("("+dice1+","+dice2+")");
		
		}
		
		// 3번
		// 금액을 저장하는 변수
		int money = 37210;
		// 지폐 또는 동전의 갯수를 저장하는 배열
		int[] coincnt= {50000,10000,5000,1000,500,100,50,10};
		
		for(int i=0;i<coincnt.length;i++) {
			System.out.println(coincnt[i]+"원:"+money/coincnt[i]);
			money%=coincnt[i];// money = money%coincnt[i];
		}
		
		
		// 4번
		// 약수를 구하고자 하는 숫자를 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("약수의갯수를 구할 숫자를입력하세요.>");
		int num = sc.nextInt();
		
		// 갯수를 저장하는 변수
		int cnt = 0;
		System.out.print("{");
		for(int i=1;i<=num;i++) {
			if(num%i==0) { // 약수 구하
			// num(24) 과 i(24)와 같으면
			if(num==i) {
			 System.out.print(i+"");
			}else { // 그렇지 않으면	
			System.out.print(i+",");
			}
			cnt++;
		  }
		}
		System.out.println("}");
		System.out.println("약수의 갯수는 :"+cnt);
		
		
		// 5번 문제
		int[] numarr = {3, 4, 5, 6, 7};
		int evencnt=0; // 짝수 갯수 저장
		int oddcnt=0;  // 홀수 갯수 저장
		for(int i=0;i<numarr.length;i++) {
			if(numarr[i]%2==0) { //짝수
				evencnt++;
			}else { 			 //홀수
				oddcnt++;
			}
		}
		System.out.println("홀수"+oddcnt+"개, 짝수"+ evencnt+"개");
		
		
		// 6번 문제
		Scanner s= new Scanner(System.in);
		//컴퓨터가 생각한 값(임의의값)
		int com = (int)(Math.random()*100) + 1;
		System.out.println(com);
		while(true) {
		// 사용자가 값을 입력
		System.out.println("1과100사이의 값을 입력하세요");
		int user=s.nextInt();
		
		if(com>user) {
			System.out.println("더 큰 수를 입력하세요.");
		}else if(com<user) {
			System.out.println("더 작은 수를 입력하세요.");
		}else if(com==user) {
			System.out.println("맞췃습니다.");
			break;
		    }
		}
	}

}
