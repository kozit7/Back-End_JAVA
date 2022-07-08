package condition;

import java.util.Scanner;

public class Ex01 {
		int num = 0;
		int ntnum = (0);
		
	
	public static void main(String[] args) {
		// 사용자가 키보드로 데이터를 입력할 수 있게 하는 객체
		
		
		Scanner in = new Scanner(System.in);
		// 선택번호를 저장하는 변수
		
		System.out.println("--------------------------");
		System.out.println("|1.예금 |2.출금 |3.조회 |4.종료|");
		System.out.println("--------------------------");
		int num = 0;
		int WD = in.nextInt(); //예금
		int EX = in.nextInt(); //출금
	
		
		while(num<4) {
			num = in.nextInt();
		if(num == 1) {
			
			System.out.println("예금액을 입력해주세요.(최소 100원이상)");
			
			WD = in.nextInt();
			
			if( WD > 99) {
				
			System.out.println("예금액 :" +WD);
			
			} else {
				
				System.out.println("예금액이 0원보다 커야 합니다." );
				
			}
		
		}else if(num == 2) {
			
			System.out.println("출금액을 입력해주세요.(최소 2000원이상)");
			
			EX = in.nextInt();
			
			if( EX >= 2000) {
				
			System.out.println("출금액 :" +EX);
			
			} else {
				
				System.out.println("출금액이 1999원보다 커야 합니다." );
				
			}
			
		}else if(num == 3) {
			
			System.out.println("잔액  : 8000원");
		
		}else if(num == 4) {
			
			System.out.println("프로그램을 종료합니다.");
			
				}
			}
		}
	}
