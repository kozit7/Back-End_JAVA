package example;

import java.util.Scanner;

public class Caesar4 {

	public static void main(String[] args) {
		
	      String pw ="";
	      String en_pw ="";
	      Scanner sc = new Scanner(System.in);
	      pw = sc.nextLine();
	   
	      for (int i = 0; i < pw.length(); i++) {
	            char ch = pw.charAt(i);
	            
	            if(Character.isLowerCase(ch)) {
	              // ch = (char)((ch-'a'+3)%26 +'a'); //암호화
	               ch = (char)((ch-'z'-3)%26 +'z'); //복호화
	            }
	            else if(Character.isUpperCase(ch)) {
	              // ch = (char)((ch-'A'+3)%26 +'A');	//암호화
	               ch = (char)((ch-'Z'-3)%26 +'Z'); //복호화
	            }
	            en_pw += ch;
	            
	      }
	      
	      System.out.println(en_pw);


	}

}
