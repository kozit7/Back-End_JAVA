package object;

public class Tire {

/*					

			속성(변수)		
			총폭(width):205
			림경(kyung):15
			편평비(ratio):75
										*/
			int width = 205;
			int kyung = 15;
			int ratio = 75;
/*
			메서드(함수)	
			하중(weight)을 지탱하는 기능
			진행방향을 전환(transform)하는 기능
			노면으로부터 충격을 완화(ease)하는 기능
											
										*/
			void weight(int a, int b) { // 함수(메서드)
				System.out.println("하중(weight)을 지탱하는 기능");
			}
			void transform(int c) { // 함수(메서드)
				System.out.println("진행방향을 전환(transform)하는 기능");
			}
			void ease(float d) { // 함수(메서드)
				System.out.println("노면으로부터 충격을 완화(ease)하는 기능");
			}
}

/* JavaScript							
       매개변수(a,b)가 있고, 리턴이 없는 경우		
 	function weight(a,b){
		실행할코드
	}
	매개변수(a,b)가 있고, 리턴이 있는 경우
	function weight(a,b){
		실행할코드
		return result;
	} 
	매개변수가 없고, 리턴이 없는 경우
	function weight(){
		실행할코드
	}
	매개변수가 없고, 리턴이 있는 경우
	function weight(){
		실행할코드
		return result;
	}
*/