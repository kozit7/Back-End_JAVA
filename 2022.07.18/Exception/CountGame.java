package Exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CountGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		
		while(true) {
			
			count++;
			
			System.out.print("1과 100사이의 값을 입력하세요 : ");
						
			try {
				
				input = sc.nextInt();
				
			} catch(InputMismatchException ae) {
				
				sc = new Scanner(System.in);
				System.out.println("1과 100사이의 "+"'숫자'"+"를 입력해주세요.");
				
				
			}
			
			if(answer < input) {
				
				System.out.println("더 작은 수를 입력하세요.");
			} else if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			  
			} else {
								
				System.out.println( +count+ "번 만에 맞추셨습니다." );
			
			  break;
			}
				
		}

	}

}
