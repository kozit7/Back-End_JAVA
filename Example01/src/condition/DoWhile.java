package condition;

public class DoWhile {

	public static void main(String[] args) {
		//do{반복할문장}while(조건식){반복할 문장}
		//1~100까지 숫자의 합이 100이될 동안 반복해라.
		int sum=0;
		int i=200;
		do {
			System.out.println("실행");
			sum+=i;//sum=sum+i;
			i++;
		}
		while(sum<100); {
		System.out.println(sum);
	}
		}


	}


