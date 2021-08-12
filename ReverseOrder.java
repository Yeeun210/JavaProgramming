
import java.util.Scanner;

public class order {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String words; //단어들
		int index; //지수
		String word1,word2,word3,word4; //단어1,2,3,4
		
		//1.4개의 단어를 입력받는다
		System.out.print("4개의 단어를 입력하시오: ");
		words = scan.nextLine();
		
		index = words.indexOf(" ");
		word1 = words.substring(0,index);
		words = words.substring(index+1);
		
		index = words.indexOf(" ");
		word2 = words.substring(0,index);
		words = words.substring(index+1);
		
		index = words.indexOf(" ");
		word3 = words.substring(0,index);
		words = words.substring(index+1);
		
		word4 = words;
		
		//2.역순으로 정렬한다
		words = word4+" "+word3+" "+word2+" "+word1;
		
		//3.출력
		System.out.print(words);
		
	}
}