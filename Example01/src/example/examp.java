package example;

import java.util.Scanner;

public class examp {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의총합 :"+sum);
		
		
		
		while (true) {
			int diceNum1 = (int)(Math.random() *6) +1; 
			//소수점으로 나오기때문에 (int)로 강제 형변환
			int diceNum2 = (int)(Math.random() *6) +1;
			//소수점으로 0~1 사이를 출력하기 때문에 +1을 해야만 1~6의 숫자가 출력됨
			System.out.println("(" + diceNum1 +", " + diceNum2 +")");
			if (diceNum1 + diceNum2 == 5) {
				// 두수의 합이 5가 되면 break로 멈춤.
				break;
				}
			}
		
		Scanner sc = new Scanner(System.in);
		int money = 0;
		while(true) {
			System.out.print("총 금액 입력 : ");
			money = sc.nextInt();
			if(money > 50000) {
				System.out.print("5만원보다 적은금액을 입력하세요.");
			} else if(money < 100) {
				System.out.print("100원보다 많이 입력하세요. ");
			} else {
				break;
			}
		}
		System.out.println("잔돈 : "+money+"원");
		
		int[] arr = {10000, 5000, 1000, 500, 100};
		for(int i=0; i<arr.length; i++) {
			
		if(money/arr[i] > 0) {
			System.out.println(arr[i]+"원 : " +money/arr[i]+"개");
			money%=arr[i];
			
		}
	}
		Scanner scan = new Scanner(System.in);
			System.out.println("약수를 구할 숫자를 입력해주세요.");
			
		int divisor = scan.nextInt();
		int cnt =0;
		int a;
		for(a=1; a<=divisor; a++) {
			if((divisor%a)==0) {
				cnt++;
				System.out.println(a);
				
				}
		}
		System.out.println("약수 개수 : "+cnt);
		
		int s;
		int[] SS= {3, 4, 5, 6, 7};
		int[] SSS= {12, 16, 22, 24, 29};
		int[] SSSS= {41, 43, 45, 47, 49};
		int 홀수count = 0;
		int 짝수count = 0;
		for(s = 0; s < SS.length; s++);{
			if(SS[s]%2==0) { 
				짝수count++;
			}else {
				홀수count++;
			}
			System.out.println("짝수 개 :"+ 짝수count+"홀수 개:"+홀수count);
		}
	}
		
}
	
