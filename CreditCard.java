
import java.util.Scanner;

public class Specification {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int balance; //이전 잔고
		int amount; //당월 사용금액
		double interest = 0; //연체이자
		double nbalance; //새 잔고
		double minimum; //최소 입금액
		
		
		//1.이전 잔고와 당월 사용금액 입력받기
		System.out.print("이전 잔고를 입력해주세요: ");
		balance = scan.nextInt();
		
		System.out.print("당월 사용금액을 입력해주세요: ");
		amount = scan.nextInt();
		
		//2.연체이자 계산하기
		if(balance>0) {
			interest = (balance+amount)*2.0/100.0;
		}
		
		//3. 새 잔고 계산하기
		nbalance = balance + amount +interest;
		
		//4.최소 임금액 계산하기
		if(nbalance > 300000) {
			minimum = nbalance*20.0/100.0;
		}else if(nbalance >= 100000 && nbalance <= 300000) {
			minimum = 100000;
		}else {
			minimum = nbalance;
		}
		
		//5.출력
		System.out.println();
		System.out.println("당월 카드 이용대금 명세서");
		System.out.println("미결제 금액: "+balance);
		System.out.println("당월 사용금액: "+amount);
		System.out.println("연체이자: "+interest);
		System.out.println();
		System.out.println("입금해야 할 총 금액: "+ nbalance);
		System.out.println("최소입금액: "+minimum);

	}

}
