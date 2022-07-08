package array;

import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int [] score= {79, 88, 91, 33, 100, 55, 95, 60, 72, 57};
	int sum=0;
	float avg=0.0f;
	int max=score[0];
	int min=score[0];
	
	for(int i=0; i<score.length; i++) {
		score[i]=scan.nextInt();
		sum += score[i]; // sum= sum + score[i];
		
		if(score[i]>max) {
			max=score[i];
		}else if(score[i]<min) {
			min=score[i];
		}
	}
	avg=sum/(float)score.length;
	
	System.out.println(sum);
	System.out.println(avg);
	System.out.println(max);
	System.out.println(min);
	
	}

}
