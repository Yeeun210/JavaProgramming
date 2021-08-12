
import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final double PI = 3.14159; //원주율
		
		double radius; //반지름
		double height; //높이
		double volume; //부피
		double area; //표면적
		
		//1.원의 반지름과 원의 높이 입력 받기
		System.out.print("원뿔의 반지름을 입력해주세요: ");
		radius = scan.nextInt();
		
		System.out.print("원뿔의 높이를 입력해주세요: ");
		height = scan.nextInt();
		
		//2.원뿔의 부피 계산
		volume = PI*radius*radius*height*1/3;
		
		//3.원뿔의 표면적 계산
		area = PI*radius*Math.sqrt(radius*radius+height*height)+PI*radius*radius;
		
		//4.원뿔 밑의 원의 반지름, 원뿔의 높이, 부피와 표면적 출력
		System.out.println("원뿔의 반지름: "+radius);
		System.out.println("원뿔의 높이: "+height);
		System.out.println("원뿔의 부피: "+volume);
		System.out.println("원뿔의 표면적: "+area);

	}

}
