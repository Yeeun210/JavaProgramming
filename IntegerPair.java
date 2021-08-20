package integer;

import java.util.Scanner;

public class pair {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num; //정수
		
		//1.정수를 입력받는다
		System.out.print("한 정수를 입력하세요: ");
		num = scan.nextInt();
		
		//2.조건을 만족하는지 확인하고 조건을 만족하는 정수 쌍을 출력한다.
		System.out.println("모든 나누어 떨어지는 정수들의 쌍은 다음과 같다.");
		
		for(int i =1 ; i <= num ; i++) {
			for(int j =1 ; j <= num ; j++) {
				//조건1 : i != j
				if(i==j) continue;
				//조건2 : i는 j로 나누어 떨어져야 한다
				if(i%j==0) {
					System.out.println("("+i+", "+j+")");
				}
			}
		}
		
	}

}
