package example;

import java.util.Scanner;

public class Caesar2 {

	public static void main(String[] args) {
		
		
		      String pw ="";
		      String en_pw ="";
		      Scanner sc = new Scanner(System.in);
		      pw = sc.nextLine();
		   
		      for (int i = 0; i < pw.length(); i++) { 
		            char ch = pw.charAt(i);
		            
		            if(Character.isLowerCase(ch)) { 
		        // isLowerCase 입력받은 인자가 영문 소문자인지 여부를 판단해 true/false 값을 리턴한다.
		             //ch = (char)((ch-'a'+3)%26 +'a'); //암호화
		             ch = (char)((ch-'a'+3)%26 +'a'); //복호화
		            }
		            else if(Character.isUpperCase(ch)) {
		        // isUpperCase 입력받은 인자가 영문 대문자인지 여부를 판단해 true/false 값을 리턴한다.
		             //ch = (char)((ch-'A'+3)%26 +'A'); //암호화
		             ch = (char)((ch-'A'+3)%26 +'A'); //복호화
		            }
		            en_pw += ch;
		      
		      }
		      
		      System.out.println(en_pw);
		      
		      //다른 for문
		   /*   for (int i = 0; i < pw.length(); i++) {
					char ch = pw.charAt(i);
//					 65~90   대문자
					if(ch >=65 && ch <=90) {
						ch = (char)((ch-'A'+3)%26+'A');
					} 
					else if(ch >=97 && ch <=122) {
						ch = (char)((ch-'a'+3)%26+'a');
					}
					en_pw += ch*/
	
		
	}

}
