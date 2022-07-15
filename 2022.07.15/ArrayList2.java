package array;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayList2 {

	public static void main(String[] args) {
		// 배열
		int[] score = new int[3];
		// 정적배열(객체배열)
		Student[] stu = new Student[3];
		Scanner s = new Scanner(System.in);
		
		/*
		stu[0] = new Student();
		stu[0].name="정자바";
		stu[0].sum=100;
		stu[1] = new Student();
		stu[1].name="홍길동";
		stu[1].sum=90;
		stu[2] = new Student();
		stu[2].name="백종영";
		stu[2].sum=80;
*/
	/*	for(int i=0;i<stu.length;i++) {
					
			stu[i] = new Student();
			stu[i].name=s.next();
			stu[i].sum=s.nextInt();
			
	}*/
		// 동적배열(ArrayList)
		//      제네릭(Generic)
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
		}
		
		ArrayList<Student> ala = new ArrayList<>();
		Student stu2 = new Student();
		
		stu2 = new Student();
		stu2.name="정자바";
		stu2.sum=100;
		ala.add(stu2);
		stu2 = new Student();
		stu2.name="홍길동";
		stu2.sum=90;
		ala.add(stu2);
		stu2 = new Student();
		stu2.name="최씨샵";
		stu2.sum=80;
		ala.add(stu2);
		
		for(int i=0;i<ala.size();i++) {
			
			System.out.println(ala.get(i).name);
			System.out.println(ala.get(i).sum);
			
			
		}
  }
	
	
}