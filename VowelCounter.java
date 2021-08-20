package vowel;

import java.util.Scanner;

public class counter {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String sentence; //문자열
		int length;      //길이
		int a_num=0,e_num=0,i_num=0,o_num=0,u_num=0; //각 모움의 수
		int cons_num=0; //자음의 수
		
		//1.문장을 입력 받는다
		System.out.print("문장을 입력해 주세요 : ");
		sentence = scan.nextLine();
		length = sentence.length(); //문장 길이 파악
		
		//2.각 글자를 검사하여 모음의 수를 구한다
		for(int i=0;i<length;i++) {
			if(sentence.charAt(i)=='a'||sentence.charAt(i)=='A') {
				a_num++;
			}else if(sentence.charAt(i)=='e'||sentence.charAt(i)=='E') {
				e_num++;
			}else if(sentence.charAt(i)=='i'||sentence.charAt(i)=='I') {
				i_num++;
			}else if(sentence.charAt(i)=='o'||sentence.charAt(i)=='O') {
				o_num++;
			}else if(sentence.charAt(i)=='u'||sentence.charAt(i)=='U') {
				u_num++;
			}else if(sentence.charAt(i)==' ') {
				
			}else {
				cons_num++;
			}
			
		}
			
		//3.출력한다
		System.out.println("'a'의 수 : "+a_num);
		System.out.println("'e'의 수 : "+e_num);
		System.out.println("'i'의 수 : "+i_num);
		System.out.println("'o'의 수 : "+o_num);
		System.out.println("'u'의 수 : "+u_num);
		System.out.println("자음의 수 : "+cons_num);
	}

}
