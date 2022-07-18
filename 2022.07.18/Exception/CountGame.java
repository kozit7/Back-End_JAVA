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
			
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
						
			try {
				
				input = sc.nextInt();
				
			} catch(InputMismatchException ae) {
				
				sc = new Scanner(System.in);
				System.out.println("1�� 100������ "+"'����'"+"�� �Է����ּ���.");
				
				
			}
			
			if(answer < input) {
				
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			  
			} else {
								
				System.out.println( +count+ "�� ���� ���߼̽��ϴ�." );
			
			  break;
			}
				
		}

	}

}
