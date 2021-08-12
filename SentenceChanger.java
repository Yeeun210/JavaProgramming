
import java.util.Scanner;

public class changer {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sent; //문장
		int index; //지수
		String nextsent; //완성문장
		
		//1.문장 임력 받기('2020'을 포함해야 한다)
		System.out.print("한 줄의 문장을 입력하세요: ");
		sent = scan.nextLine();
		
		//2.바꾸고 싶은 부분 찾기
		index = sent.indexOf("2020");
		
		//3.문장 바꾸기
		nextsent = sent.substring(0,index)+"2021"+sent.substring(index+4);
		
		//4.출력
		System.out.print(nextsent);
	}
}
