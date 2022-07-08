package example;

import java.util.Scanner;

public class Caesar3 {

	public static void main(String[] args) {
		        // 1. 입력
		        Scanner in = new Scanner(System.in);

		        // 2. 방식 선택
		        String fst = "암호화";
		        String snd = "복호화";
		        String qui = "종료";

		        System.out.println("1. " + fst + " | 2. " + snd + " | 3. " + qui + "");
		        int choose = choose = in.nextInt();

		        if(choose == 3) return;
		        String ans = choose == 1 ? fst : snd;

		        System.out.println( ans + "를 선택하셨습니다. 문자를 입력하세요.");
		        String text = in.nextLine();
		        byte[] bt = text.getBytes();

		        // 3. 연산 시작
		        for (int i = 0; i < bt.length; i++) {

		            // 3-1. 암호화
		            if (choose == 1) {
		                if(65 <= bt[i] && bt[i] <= 90) {
		                    if(90 < (bt[i] + 3)) {
		                        bt[i] = (byte)(64 + (bt[i] + 3) - 90);
		                    } else {
		                        bt[i] += 3;
		                    }
		                }

		                if(97 <= bt[i] && bt[i] <= 122) {
		                    if(122 < (bt[i] + 3)) {
		                        bt[i] = (byte)(96 + (bt[i] + 3) - 122);
		                    } else {
		                        bt[i] += 3;
		                    }
		                }
		            }

		            // 3-2. 복호화
		            if (choose == 2) {
		                if(65 <= bt[i] && bt[i] <= 90) {
		                    if(90 < (bt[i] + 3)) {
		                        bt[i] = (byte)(64 + (bt[i] + 3) - 90);
		                    } else {
		                        bt[i] += 3;
		                    }
		                }

		                if(97 <= bt[i] && bt[i] <= 122) {
		                    if(122 < (bt[i] + 3)) {
		                        bt[i] = (byte)(96 + (bt[i] + 3) - 122);
		                    } else {
		                        bt[i] += 3;
		                    }
		                }
		            }

		            System.out.print((char) bt[i] + " : ");
		            System.out.print((bt[i]) + " \n");
		        }
		    }
		
    }


	


