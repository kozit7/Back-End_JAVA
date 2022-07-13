package inheritance;

import java.util.Scanner;

public class Health {
	
	Scanner scan = new Scanner(System.in);
	
	char gender;
	double tall;
	double weight;
	
	/*	
	Health(){}
	
	Health(char g, double t, double w){
		g = gender;
		t = tall;
		w = weight;
	}*/
	
	void input() {
		System.out.println("성별 : M / F");
		gender = scan.next().charAt(0);
		
		System.out.println("신장(Cm) : ");
		tall = scan.nextDouble();
		
		System.out.println("체중(Kg) : ");
		weight = scan.nextDouble();
		
	}
	void output1() {
		System.out.println("성별 : M / F : " + gender);
		System.out.println("신장(Cm) : "+ tall + "cm");
		System.out.println("체중(kg) : "+ weight + "kg");
	}
	
}
