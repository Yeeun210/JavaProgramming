
import java.util.Scanner;

public class change {

	public static void main(String[] args) {
		
		int price,change;
		int coin500=0,coin100=0,coin50=0,coin10=0,coin5=0,coin1=0;
		Scanner scan = new Scanner(System.in);
		
		//1.가격 입력 받기
		System.out.print("물건의 가격(1,000원 이하)을 입력하세요:");
		price = scan.nextInt();
		
		System.out.println(price+"원 짜리 물건을 샀고 1,000원을 내셨습니다.");
		
		//2.거스름돈 계산
		change = 1000-price;
		System.out.println("거스름돈은 "+change+"원입니다.");
		
		//3.거스름돈 내역 계산
		while(change>0) {
			if(change>=500) {
				coin500++;
				change-=500;
			}else if(change>=100) {
				coin100++;
				change-=100;
			}else if(change>=50){
				coin50++;
				change -=50;
			}else if(change>=10){
				coin10++;
				change -=10;
			}else if(change>=5){
				coin5++;
				change -=5;
			}else{
				coin1++;
				change -=1;
			}
		}
		
		//4.결과 출력
		System.out.println("거스름돈의 내역은 다음과 같습니다:");
		System.out.println();
		System.out.println("500원 짜리 동전 갯수 = "+coin500);
		System.out.println("100원 짜리 동전 갯수 = "+coin100);
		System.out.println("50원 짜리 동전 갯수 = "+coin50);
		System.out.println("10원 짜리 동전 갯수 = "+coin10);
		System.out.println("5원 짜리 동전 갯수 = "+coin5);
		System.out.println("1원 짜리 동전 갯수 = "+coin1);

	}

}