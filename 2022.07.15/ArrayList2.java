package array;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayList2 {

	public static void main(String[] args) {
		// �迭
		int[] score = new int[3];
		// �����迭(��ü�迭)
		Student[] stu = new Student[3];
		Scanner s = new Scanner(System.in);
		
		/*
		stu[0] = new Student();
		stu[0].name="���ڹ�";
		stu[0].sum=100;
		stu[1] = new Student();
		stu[1].name="ȫ�浿";
		stu[1].sum=90;
		stu[2] = new Student();
		stu[2].name="������";
		stu[2].sum=80;
*/
	/*	for(int i=0;i<stu.length;i++) {
					
			stu[i] = new Student();
			stu[i].name=s.next();
			stu[i].sum=s.nextInt();
			
	}*/
		// �����迭(ArrayList)
		//      ���׸�(Generic)
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
		stu2.name="���ڹ�";
		stu2.sum=100;
		ala.add(stu2);
		stu2 = new Student();
		stu2.name="ȫ�浿";
		stu2.sum=90;
		ala.add(stu2);
		stu2 = new Student();
		stu2.name="�־���";
		stu2.sum=80;
		ala.add(stu2);
		
		for(int i=0;i<ala.size();i++) {
			
			System.out.println(ala.get(i).name);
			System.out.println(ala.get(i).sum);
			
			
		}
  }
	
	
}