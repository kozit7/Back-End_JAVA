package array;

import java.util.Scanner;

// 배열에 대해서 알아보자.
public class Array {

	public static void main(String[] args) {
		// 배열 선언 및 초기화
		// 타입[ ] 배열명 ={값,값,값}
		//int[] array = {10,20,30}
		// 타입 배열명 [ ] ={값,값,값}
		//int array[] = {10,20,30}
		//int[] array = {100,88,100,93,71,51,21,54,8,23,8};
	// int 를 사용했기 때문에 정수만 사용가능.			   
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);
//		for(int i=0; i<=array.length; i++) {
//			System.out.println(array[i]);
//		}
//	}	
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 점수의 총합
		float average =0; // 평균
		int[] score = {79,88,91,33,100,55,95,60,72,57};
		int max = score[0]; //최대값
		int min = score[0]; //최소값
		
		
		
		for(int i = 0; i < score.length; i++) {
			
			sum += score[i]; // 배열값의 합계 sum = 배열값의 합
			
		if(max<score[i]) { // max의 값이 score 보다 크면 최대값
			
			max = score[i]; 
			
         } 
		
		else if(min>score[i]) { // min의 값이 score 보다 작으면 최소값
			
			min = score[i];
			
         } 
		
      } average = sum/(float)score.length; // 평균 = 배열값의합 나누기 배열의 길이(실수)

		
				System.out.println("평균 :" +average);
				System.out.println("최대값 :" +max);
				System.out.println("최소값 :" +min);
				
			//입력값을 받아 평균 처리하기
				int[] num = new int[4]; // 입력할 갯수 
				
				System.out.println("입력값의 평균 구하기");
				
				System.out.println("평균을 구할 숫자4개를 입력하세요 :");
				num[0] = sc.nextInt();
				num[1] = sc.nextInt();
				num[2] = sc.nextInt();
				num[3] = sc.nextInt();
				
				float total = num[0] + num[1] + num[2] + num[3];
				float result = total/4;
				System.out.println("합계 :" +result);
	} 
	
	
}

