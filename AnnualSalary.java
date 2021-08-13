
import java.util.Scanner;

public class update {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salary; //연봉
		int grade; //등급
		int rate; //인상 비율
		double update; //연봉 인상액
		
		//1.직원의 연봉과 근무평가등급 입력 받기
		System.out.print("현 연봉을 입력하세요: ");
		salary = scan.nextDouble();
		System.out.print("근무 평가등급을 입력하세요: ");
		grade = scan.nextInt();
		
		//2.근무평가 등급 확인
		switch (grade) {
		case 1:
			rate = 6;
			break;
		case 2:
			rate = 4;
			break;
		default:
			rate = 2;
			break;
		}
		
		//3.연봉 계산
		update = salary*rate*1.0/100.0;
		salary += update;
		
		//4.출력
		System.out.println("연봉 인상액: "+update);
		System.out.println("새 연봉: "+salary);
	}

}