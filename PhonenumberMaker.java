
import java.util.Random;

public class maker {
	public static void main(String[] args) {
		
		Random rand = new Random();
		String pnumber; // 전화번호
		
		//1.번호는 010으로 시작한다
		pnumber = "010-";
		
		//2.랜덤으로 번호를 생성하며 나머지 8자리 숫자를 만든다
		for(int i = 0;i<4;i++) {
			pnumber += rand.nextInt(10);
		}
		
		pnumber += "-";
		
		for(int i = 0;i<4;i++) {
			pnumber += rand.nextInt(10);
		}
		//3.출력
		System.out.print(pnumber);
	}
}
