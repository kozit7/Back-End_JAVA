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
		System.out.println("���� : M / F");
		gender = scan.next().charAt(0);
		
		System.out.println("����(Cm) : ");
		tall = scan.nextDouble();
		
		System.out.println("ü��(Kg) : ");
		weight = scan.nextDouble();
		
	}
	void output1() {
		System.out.println("���� : M / F : " + gender);
		System.out.println("����(Cm) : "+ tall + "cm");
		System.out.println("ü��(kg) : "+ weight + "kg");
	}
	
}
